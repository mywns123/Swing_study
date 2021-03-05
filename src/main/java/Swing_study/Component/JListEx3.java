package Swing_study.Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Swing_study.panel.Department;
import Swing_study.panel.DeptPanel;

@SuppressWarnings("serial")
public class JListEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnAdd;
	private DeptPanel pLeftCenter;
	private JList<Department> deptList;
	private DefaultListModel<Department> model;
	private JPanel pBtn;
	private JButton btnConfirm;
	private JButton btnUpdate;
	private JButton btnDelete;
	
	public JListEx3() {
		initialize();		
		model.addElement(new Department(1, "기획",8));
		model.addElement(new Department(2, "영업",18));
		model.addElement(new Department(3, "개발",28));
	}
	private void initialize() {
		setTitle("JList응용");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 679, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 20, 0));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));
		
		pLeftCenter = new DeptPanel();
		pLeft.add(pLeftCenter, BorderLayout.CENTER);
		
		JPanel pLeftSouth = new JPanel();
		pLeft.add(pLeftSouth, BorderLayout.SOUTH);
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pLeftSouth.add(btnAdd);
		
		JPanel pRight = new JPanel();
		pRight.setBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "\uBD80\uC11C\uBAA9\uB85D", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pRight);
		
		deptList = new JList<>();
		deptList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		model = new DefaultListModel<Department>();
		pRight.setLayout(new BorderLayout(0, 0));
		deptList.setModel(model);
		pRight.add(deptList);
		
		pBtn = new JPanel();
		pRight.add(pBtn, BorderLayout.SOUTH);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		pBtn.add(btnConfirm);
		
		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(this);
		pBtn.add(btnUpdate);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(this);
		pBtn.add(btnDelete);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnDelete) {
			actionPerformedBtnDelete(e);
		}
		if (e.getSource() == btnUpdate) {
			actionPerformedBtnUpdate(e);
		}
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
	}
	
	protected void actionPerformedBtnAdd(ActionEvent e) {
		String text = btnAdd.getText();
		Department dept = pLeftCenter.getDepartment();		
		switch(text) {
		case "추가" :
			pLeftCenter.clearTf();		
			model.addElement(dept);
			JOptionPane.showMessageDialog(null,"추가되었습니다.");
			break;
		case "수정" :
			Department dept1 = deptList.getSelectedValue();
			int idx = deptList.getSelectedIndex();			
			model.removeElement(dept1);
			model.add(idx, dept);	
//			model.setElementAt(dept, idx);
			pLeftCenter.clearTf();
			JOptionPane.showMessageDialog(null,"수정되었습니다.");
			btnAdd.setText("추가");	
			break;
		}
	}
	protected void actionPerformedBtnConfirm(ActionEvent e) {
//		int idx = deptList.getSelectedIndex();
//		Department selDpet = model.get(idx);
//		String message1 = String.format("%d %s %d", selDpet.getDeptno(), selDpet.getDeptName(), selDpet.getFloor());
			Department dept = deptList.getSelectedValue();
			String message2 = String.format("%d %s %d", dept.getDeptno(), dept.getDeptName(), dept.getFloor());
			JOptionPane.showMessageDialog(null, message2 /* + "\n "+message1 */);
	}
	
	protected void actionPerformedBtnUpdate(ActionEvent e) {
		Department dept = deptList.getSelectedValue();
		pLeftCenter.setDepartment(dept);		
		btnAdd.setText("수정");		
	}
	protected void actionPerformedBtnDelete(ActionEvent e) {
		Department dept = deptList.getSelectedValue();
		model.removeElement(dept);
	}
}
