package Swing_study.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

@SuppressWarnings("serial")
public class EmployeePanelttttttt extends JPanel {
	private JTextField tfNo;
	private JTextField tfName;
	private JComboBox cmbTitle;
	private JComboBox cmbManager;
	private JSpinner spinSalary;
	private JComboBox cmbDept;
	private JDateChooser dateHire;
	private JPasswordField pfPass1;
	private JTextField pfPass2;

	public EmployeePanelttttttt() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "사원 정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pItem = new JPanel();
		add(pItem);
		pItem.setLayout(new GridLayout(0, 2, 10, 0));
		
		JLabel lblNo = new JLabel("사원번호");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblNo);
		
		tfNo = new JTextField();
		tfNo.setColumns(10);
		pItem.add(tfNo);
		
		JLabel lblName = new JLabel("사원명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblName);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		pItem.add(tfName);
		
		JLabel lblTitle = new JLabel("직책");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblTitle);
		
		cmbTitle = new JComboBox();
		pItem.add(cmbTitle);
		
		JLabel lblManager = new JLabel("직속상사");
		lblManager.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblManager);
		
		cmbManager = new JComboBox();
		pItem.add(cmbManager);
		
		JLabel lblSalary = new JLabel("급여");
		lblSalary.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblSalary);
		
		spinSalary = new JSpinner();
		pItem.add(spinSalary);
		
		JLabel lblDept = new JLabel("부서");
		lblDept.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblDept);
		
		cmbDept = new JComboBox();
		pItem.add(cmbDept);
		
		JLabel lblHireDate = new JLabel("입사일");
		lblHireDate.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblHireDate);
		
		dateHire = new JDateChooser();
		pItem.add(dateHire);
		
		JLabel lblPass1 = new JLabel("비밀번호");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass1);
		
		pfPass1 = new JPasswordField();
		pfPass1.setColumns(10);
		pItem.add(pfPass1);
		
		JLabel lblPass2 = new JLabel("비밀번호 확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pItem.add(lblPass2);
		
		pfPass2 = new JTextField();
		pfPass2.setColumns(10);
		pItem.add(pfPass2);
		
		JPanel spacePanel = new JPanel();
		pItem.add(spacePanel);
		
		JPanel lblResultPanel = new JPanel();
		pItem.add(lblResultPanel);
		lblResultPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblResult = new JLabel("New label");
		lblResult.setFont(new Font("굴림", Font.BOLD, 20));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setForeground(Color.RED);
		lblResultPanel.add(lblResult);
		
		JPanel pTop = new JPanel();
		add(pTop, BorderLayout.NORTH);
		pTop.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel pPic = new JPanel();
		pTop.add(pPic);
		pPic.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPIc = new JLabel("");
		lblPIc.setHorizontalAlignment(SwingConstants.CENTER);
		lblPIc.setIcon(new ImageIcon("C:\\workspace_java\\swing_study\\images\\suji.jpg"));
		lblPIc.setPreferredSize(new Dimension(100, 120));
		pPic.add(lblPIc, BorderLayout.CENTER);
		
		JPanel pBtnPic = new JPanel();
		pPic.add(pBtnPic, BorderLayout.SOUTH);
		
		JButton btnAddPic = new JButton("사진 추가");
		pBtnPic.add(btnAddPic);
	}

	public void setEmployee(Employee employee) {
		
	}
	
	public Employee getEmployee() {
		return null;
	}
	
	public void clearTf() {
		
	}
}
