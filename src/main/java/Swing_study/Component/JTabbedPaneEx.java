package Swing_study.Component;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import Swing_study.panel.Department;
import Swing_study.panel.DeptPanel;
import Swing_study.panel.Title;
import Swing_study.panel.TitlePanel;
import Swing_study.panel.EmployeePanel;

public class JTabbedPaneEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnConfirm;
	private JTabbedPane tabbedPane;

	public JTabbedPaneEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JTabbedPane예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		DeptPanel pDept = new DeptPanel();
		tabbedPane.addTab("부서", null, pDept, "부서관리");
		
		TitlePanel pTitle = new TitlePanel();
		tabbedPane.addTab("직책", null, pTitle, "직책관리");
		
		EmployeePanel pEmp = new EmployeePanel();
		tabbedPane.addTab("사원", null, pEmp, "사원관리");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		panel.add(btnConfirm);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
	}
	protected void actionPerformedBtnConfirm(ActionEvent e) {
		//선택되 탭 가져와서
		Component comp = tabbedPane.getSelectedComponent();
		//System.out.println(comp);
		// get XX()
		String text = comp.getName();
		System.out.println(text);
		switch(text) {
		case "부서":
			DeptPanel deptpanel = (DeptPanel) comp;
			Department department = deptpanel.getDepartment();
		case "직책":
			TitlePanel titlepanel = (TitlePanel) comp;
			Title title = titlepanel.getTitle();
		}
		
		
		
		
		
		
	}
	
}
