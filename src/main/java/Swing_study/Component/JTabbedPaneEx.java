package Swing_study.Component;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import Swing_study.panel.Department;
import Swing_study.panel.DeptPanel;
import Swing_study.panel.Employee;
import Swing_study.panel.EmployeePanel;
import Swing_study.panel.Title;
import Swing_study.panel.TitlePanel;

@SuppressWarnings("serial")
public class JTabbedPaneEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnConfirm;
	private JTabbedPane tabbedPane;
	private DeptPanel pDept;
	private TitlePanel pTitle;
	private EmployeePanel pEmp;

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
		
		pDept = new DeptPanel();
		tabbedPane.addTab("부서", null, pDept, "부서관리");
		
		pTitle = new TitlePanel();
		tabbedPane.addTab("직책", null, pTitle, "직책관리");
		
		pEmp = new EmployeePanel();
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
		
		if(comp == pDept) {
			DeptPanel deptpanel = (DeptPanel) comp;
			Department department = deptpanel.getDepartment();
			JOptionPane.showMessageDialog(null, department);
		}else if(comp == pTitle){
			TitlePanel titlepanel = (TitlePanel) comp;
			Title title = titlepanel.getTitle();
			JOptionPane.showMessageDialog(null, title);
		}else if(comp == pEmp) {
			EmployeePanel employeepanel = (EmployeePanel) comp;
			Employee employee = employeepanel.getEmployee();
			JOptionPane.showMessageDialog(null, employee);	
		}
		
			
		
		
		
		
		
		
		/*
		String text = comp.getClass().getName();
		switch(text) {
		case "Swing_study.panel.DeptPanel":
			DeptPanel deptpanel = (DeptPanel) comp;
			Department department = deptpanel.getDepartment();
			JOptionPane.showMessageDialog(null, department);
			break;
		case "Swing_study.panel.TitlePanel":
			TitlePanel titlepanel = (TitlePanel) comp;
			Title title = titlepanel.getTitle();
			JOptionPane.showMessageDialog(null, title);
			break;
		case "Swing_study.panel.EmployeePanel":
			EmployeePanel employeepanel = (EmployeePanel) comp;
			Employee employee = employeepanel.getEmployee();
			JOptionPane.showMessageDialog(null, employee);	
			break;			
		}		
		*/
		
		
		
		
	}
	
}
