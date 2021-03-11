package Swing_study.Dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

public class JOptionPanelComfirmEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblRes;

	
	public JOptionPanelComfirmEx() {
		initialize();
	}
	private void initialize() {
		setTitle("Confirm Dialog 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);	
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(this);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		contentPane.add(btnNewButton);
		
		lblRes = new JLabel("New label");
		lblRes.setFont(new Font("굴림", Font.BOLD, 18));
		contentPane.add(lblRes);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {		
		/*
		 * public static int showConfirmDialog(Component parentComponent,
                                    Object message,
                                    String title,
                                    int optionType,
                                    int messageType,
                                    Icon icon)
                             throws HeadlessException
           
           optiontype = YES_NO_OPTION, YES_NO_CANCEL_OPTION,or OK_CANCEL_OPTION
           
		 */
		String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "icon2.jpg");
		
		int res = JOptionPane.showConfirmDialog(
				null,
				"계속할 것입니까?",
				"Confirm",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.WARNING_MESSAGE,
				icon);
		if (res == JOptionPane.YES_OPTION) {
			lblRes.setText("YES");
		}
		if (res == JOptionPane.NO_OPTION) {
			lblRes.setText("NO");
		}
		if (res == JOptionPane.CANCEL_OPTION) {
			lblRes.setText("CANCEL");
		}
		if (res == -1) {
			lblRes.setText("선택하지 않음");
		}
	}
}
