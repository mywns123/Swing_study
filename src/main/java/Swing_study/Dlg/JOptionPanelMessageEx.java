package Swing_study.Dlg;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JOptionPanelMessageEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnmsg;

	public JOptionPanelMessageEx() {
		initialize();
	}
	private void initialize() {
		setTitle("Message Dialog 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 177);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		btnmsg = new JButton("클릭");
		btnmsg.addActionListener(this);
		contentPane.add(btnmsg, BorderLayout.EAST);
		
		JLabel lblmsg = new JLabel("JOptionPane.showInternalMessageDialog(parentComponent, message, title, messageType, icon)");
		contentPane.add(lblmsg, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnmsg) {
			actionPerformedBtnmsg(e);
		}
	}
	protected void actionPerformedBtnmsg(ActionEvent e) {

		String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "icon2.jpg");
		
		JOptionPane.showInternalMessageDialog(
				null,
				"조심하세요",
				"조심",
				JOptionPane.WARNING_MESSAGE,
				icon);
	}
}
