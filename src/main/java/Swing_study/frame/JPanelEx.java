package Swing_study.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Swing_study.panel.Department;
import Swing_study.panel.DeptPanel;

@SuppressWarnings("serial")
public class JPanelEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnGetDept;
	private JButton btnSetDept;
	private DeptPanel pDept;
	private JButton btnClear;
	

	public JPanelEx() {
		
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(550, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pDept = new DeptPanel();
		contentPane.add(pDept, BorderLayout.CENTER);
		
		JPanel pBtn = new JPanel();
		contentPane.add(pBtn, BorderLayout.SOUTH);
		
		btnSetDept = new JButton("부서 설정");
		btnSetDept.addActionListener(this);
		pBtn.add(btnSetDept);
		
		btnGetDept = new JButton("부서 가져오기");
		btnGetDept.addActionListener(this);
		pBtn.add(btnGetDept);
		
		btnClear = new JButton("초기화");
		btnClear.addActionListener(this);
		pBtn.add(btnClear);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClear) {
			actionPerformedBtnClear(e);
		}
		if (e.getSource() == btnSetDept) {
			actionPerformedBtnSetDept(e);
		}
		if (e.getSource() == btnGetDept) {
			actionPerformedBtnGetDept(e);
		}
	}
	
	protected void actionPerformedBtnGetDept(ActionEvent e) {
		Department dept = pDept.getDepartment();
		JOptionPane.showMessageDialog(null, dept);
	}
	protected void actionPerformedBtnSetDept(ActionEvent e) {
		Department dept = new Department(1, "기획", 9);
		pDept.setDepartment(dept);
	}
	protected void actionPerformedBtnClear(ActionEvent e) {
		pDept.clearTf();
	}
}
