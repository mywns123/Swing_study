package Swing_study.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;

public class EmployeePanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
		
	public EmployeePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "사원 정보", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel pTop = new JPanel();
		add(pTop, BorderLayout.NORTH);
		pTop.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel pImg = new JPanel();
		pImg.setBorder(new EmptyBorder(0, 0, 0, 0));
		pTop.add(pImg);
		pImg.setLayout(new BorderLayout(0, 0));
		
		ImageIcon icon = new ImageIcon(imgPath + "1.jpg");
		Image img = icon.getImage();
		Image img1 = img.getScaledInstance(100, 120, Image.SCALE_SMOOTH);
		ImageIcon icon1 = new ImageIcon(img1);
		JLabel lblImg = new JLabel(icon1);		
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblImg.setPreferredSize(new Dimension(100, 120));
		pImg.add(lblImg, BorderLayout.CENTER);
		
		JPanel pAdd = new JPanel();
		pImg.add(pAdd, BorderLayout.SOUTH);
		pAdd.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAdd = new JButton("사진 추가");
		pAdd.add(btnAdd);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("사원정보");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("사원번호");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_1.add(textField_1);
		
		JLabel label_1 = new JLabel("사원명");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		JLabel label_2 = new JLabel("직책");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		panel_1.add(comboBox);
		
		JLabel label_4 = new JLabel("직속상사");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(label_4);
		
		JComboBox comboBox_1 = new JComboBox();
		panel_1.add(comboBox_1);
		
		JLabel label_3 = new JLabel("급여");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(label_3);
		
		JSpinner spinner = new JSpinner();
		panel_1.add(spinner);
		
		JLabel label_5 = new JLabel("부서");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(label_5);
		
		JComboBox comboBox_2 = new JComboBox();
		panel_1.add(comboBox_2);
		
		JLabel label_6 = new JLabel("입사일");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(label_6);
		
		JDateChooser dateChooser = new JDateChooser();
		panel_1.add(dateChooser);
		
		JLabel label_7 = new JLabel("비밀번호");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(label_7);
		
		passwordField = new JPasswordField();
		panel_1.add(passwordField);
		
		JLabel label_8 = new JLabel("");
		panel_1.add(label_8);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(Color.RED);
		panel_1.add(lblNewLabel_1);
	}

	public void setEmployee(Employee employee) {

	}

	public Employee getEmployee() {
		return null;
	}

	public void clearTf() {
	}
}
