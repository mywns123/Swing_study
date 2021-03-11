package Swing_study.Dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class JOptionPanelInputEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn1;
	private JLabel lblRes;
	private JButton btn2;
	private JLabel lblRes2;
	private JLabel lbl3;
	private JButton btn3;
	private JLabel lblRes3;
	private JLabel lbl4;
	private JButton btn4;
	private JLabel lblRes4;

	
	public JOptionPanelInputEx() {
		initialize();
	}
	private void initialize() {
		setTitle("Input Dialog 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1332, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lbl1 = new JLabel("OptionPane.showInputDialog(Object message)");
		contentPane.add(lbl1);
		
		btn1 = new JButton("InputBtn01");
		btn1.addActionListener(this);
		contentPane.add(btn1);
		
		lblRes = new JLabel("");
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes.setFont(new Font("굴림", Font.BOLD, 20));
		contentPane.add(lblRes);
		
		JLabel lbl2 = new JLabel("JOptionPane.showInputDialog(Component Component, Object message)");
		contentPane.add(lbl2);
		
		btn2 = new JButton("InputBtn02");
		btn2.addActionListener(this);
		contentPane.add(btn2);
		
		lblRes2 = new JLabel("");
		lblRes2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes2.setFont(new Font("굴림", Font.BOLD, 20));
		contentPane.add(lblRes2);
		
		lbl3 = new JLabel("JOptionPane.showInputDialog(Component Component, Object message)");
		contentPane.add(lbl3);
		
		btn3 = new JButton("InputBtn03");
		btn3.addActionListener(this);
		contentPane.add(btn3);
		
		lblRes3 = new JLabel("");
		lblRes3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes3.setFont(new Font("굴림", Font.BOLD, 20));
		contentPane.add(lblRes3);
		
		lbl4 = new JLabel("showInputDialog"
				+ "(null,"
				+ "Object message,"
				+ "String title,"
				+ "JOptionPane.QUESTION_MESSAGE,"
				+ "Icon icon,"
				+ "Object[] SelectionValues,"
				+ "Object initialSelectionValue)");
		contentPane.add(lbl4);
		
		btn4 = new JButton("InputBtn04");
		btn4.addActionListener(this);
		contentPane.add(btn4);
		
		lblRes4 = new JLabel("");
		lblRes4.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes4.setFont(new Font("굴림", Font.BOLD, 20));
		contentPane.add(lblRes4);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn4) {
			actionPerformedBtn4(e);
		}
		if (e.getSource() == btn3) {
			actionPerformedBtn3(e);
		}
		try {
		if (e.getSource() == btn2) {
			actionPerformedBtn2(e);
		}
		if (e.getSource() == btn1) {
			actionPerformedBtn1(e);
		}
		}catch(NullPointerException e1)
		{System.err.println(e1.getMessage());
				e1.printStackTrace();
			}	
		}
	
	protected void actionPerformedBtn1(ActionEvent e) {
		
		String res = JOptionPane.showInputDialog("이름을 입력");
		if(res.length() == 0) {
			lblRes.setText("입력 값은 없음 ");
		}else{
			lblRes.setText("입력 값은: " +res);
		}
	}
	protected void actionPerformedBtn2(ActionEvent e) {
		String res = JOptionPane.showInputDialog("이름을 입력", "유한솔");		
			lblRes2.setText("입력 값은: " +res);
		
	}
	protected void actionPerformedBtn3(ActionEvent e) {
		/*
		 •ERROR_MESSAGE 
		 •INFORMATION_MESSAGE 
		 •WARNING_MESSAGE 
		 •QUESTION_MESSAGE 
		 •PLAIN_MESSAGE 		 
		*/		
		
		String res = JOptionPane.showInputDialog(null, "이름을 입력1", "제목", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showInputDialog(null, "이름을 입력2", "제목", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInputDialog(null, "이름을 입력3", "제목", JOptionPane.WARNING_MESSAGE );
		JOptionPane.showInputDialog(null, "이름을 입력4", "제목", JOptionPane.QUESTION_MESSAGE );
		JOptionPane.showInputDialog(null, "이름을 입력5", "제목", JOptionPane.PLAIN_MESSAGE 	);		
		lblRes3.setText("입력 값은: " +res);
	}
	
	
	protected void actionPerformedBtn4(ActionEvent e) {
		/*public static Object showInputDialog(Component parentComponent,
        Object message,
        String title,
        int messageType,
        Icon icon,
        Object[] selectionValues,
        Object initialSelectionValue)
		 */
		String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "icon1.jpg");
		String[] selectionValues = {"박유진", "유한솔", "송명훈", "이나연", "우정아"};
		String initialSelectionValue = "박유진";
		
		
		Object res = JOptionPane.showInputDialog(
				null, 
				"이름을 선택하세요", 
				"이름 선택", 
				JOptionPane.QUESTION_MESSAGE, 
				icon, 
				selectionValues, 
				initialSelectionValue);
		lblRes4.setText("선택한 입력은 " + res);
		
		
	}
}
