package Swing_study.Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Swing_study.Component.table.DeptTablePanel;
import Swing_study.Component.table.EmpTablePanel;
import Swing_study.Component.table.MytablePanel;
import Swing_study.Component.table.Student;
import Swing_study.Component.table.TitleTablePanel;
import Swing_study.panel.Department;
import Swing_study.panel.Employee;
import Swing_study.panel.Title;

public class JTableEx extends JFrame {

	private JPanel contentPane;
	private JTable table1;
	private List<Student> stdList =new ArrayList<>();
	private List<Department> deptList = new ArrayList<>();
	private List<Title> titleList = new ArrayList<>();
	private List<Employee> empList = new ArrayList<>();
	
	
	public JTableEx() {
		stdList.add(new Student(1, "김인환",50,60,60));
		stdList.add(new Student(2, "이태훈",70,71,70));
		stdList.add(new Student(3, "김상건",90,92,100));
		stdList.add(new Student(4, "전수린",60,63,67));
		
		deptList.add(new Department(1,"개발",8));
		deptList.add(new Department(2,"인사",11));
		deptList.add(new Department(3,"총무",13));
		
		titleList.add(new Title(1,"사장"));
		titleList.add(new Title(2,"부장"));
		titleList.add(new Title(3,"과장"));
		titleList.add(new Title(4,"대리"));
		
		empList.add(new Employee(1, "김상건", titleList.get(1), null, 4500000, deptList.get(0)));
		empList.add(new Employee(2, "이성래", titleList.get(0), new Employee(1,"김상건"), 1500000,deptList.get(0)));
		empList.add(new Employee(3, "이태훈", titleList.get(1), new Employee(1,"김상건"), 2000000,deptList.get(0)));
		
		initialize();
	}
	private void initialize() {
		setTitle("JTable 예");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 905, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));
		
		JPanel pTable1 = new JPanel();
		pTable1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "기본테이블 생성", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pTable1);
		pTable1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane1 = new JScrollPane();
		pTable1.add(scrollPane1, BorderLayout.CENTER);
		
		table1 = new JTable();
		table1.setModel(getModel());
		scrollPane1.setViewportView(table1);
		
		JPanel pTable2 = new JPanel();
		contentPane.add(pTable2);
		pTable2.setLayout(new BorderLayout(0, 0));
		
		///////////////////////////////////////////// list 추가
		MytablePanel pCustomTable2 = new MytablePanel();
		pCustomTable2.setList(stdList);
		pCustomTable2.setBorder(new TitledBorder(null, "CustomTable", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pTable2.add(pCustomTable2, BorderLayout.CENTER);
		
		JPanel pTable3 = new JPanel();
		contentPane.add(pTable3);
		pTable3.setLayout(new BorderLayout(0, 0));
		
		DeptTablePanel pDeptRable3 = new DeptTablePanel();
		pDeptRable3.setList(deptList);
		pTable3.add(pDeptRable3);
		
		
		JPanel pTable4 = new JPanel();
		contentPane.add(pTable4);
		pTable4.setLayout(new BorderLayout(0, 0));
		
		
		TitleTablePanel pTitleTable4 = new TitleTablePanel();
		pTitleTable4.setList(titleList);
		pTable4.add(pTitleTable4);
		
		JPanel pTable5 = new JPanel();
		contentPane.add(pTable5);
		pTable5.setLayout(new BorderLayout(0, 0));
		
		EmpTablePanel pEmpTable = new EmpTablePanel();
		
		pTable5.add(pEmpTable, BorderLayout.CENTER);
		pEmpTable.setList(empList);
		JPanel pTable6 = new JPanel();
		contentPane.add(pTable6);
		pTable6.setLayout(new BorderLayout(0, 0));
	}
	public DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(), getColumnNames());
		return model;
	}
	class CustomTableModel extends DefaultTableModel{

		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}
		
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	}
	
	
	public Object[][] getData() {
		return new Object[][] {
			{1, "박유진", 10, "여자"},
			{2, "이태훈", 11, "남자"},
		};
	}
	
	public String[] getColumnNames() {
		return new String[] {
			"학생번호", "학생명", "나이", "성별"
		};
	}

}
