package Swing_study.Menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class JMenuEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntmLoad;
	private JMenuItem mntmHide;
	private JMenuItem mntmExit;
	private String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
	private JLabel lblimg;

	public JMenuEx() {
		initialize();
	}
	private void initialize() {
		setTitle("MenuBar");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnScreen = new JMenu("Screen");
		menuBar.add(mnScreen);
		
		mntmLoad = new JMenuItem("Load");
		mntmLoad.addActionListener(this);
		mnScreen.add(mntmLoad);
		
		mntmHide = new JMenuItem("Hide");
		mntmHide.addActionListener(this);
		mnScreen.add(mntmHide);
		
		JMenuItem mntmReShow = new JMenuItem("ReShow");
		mnScreen.add(mntmReShow);
		
		JSeparator separator = new JSeparator();
		mnScreen.add(separator);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(this);
		mnScreen.add(mntmExit);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblimg = new JLabel();
		contentPane.add(lblimg, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmExit) {
			actionPerformedMntmExit(e);
		}
		if (e.getSource() == mntmHide) {
			actionPerformedMntmHide(e);
		}
		if (e.getSource() == mntmLoad) {
			actionPerformedMntmLoad(e);
		}
	}
	protected void actionPerformedMntmLoad(ActionEvent e) {
		ImageIcon icon = new ImageIcon(imgPath + "flower.jpg");
		Image img = icon.getImage();
		Image imgchange = img.getScaledInstance(lblimg.getWidth(), lblimg.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon icon1 = new ImageIcon(imgchange);
		lblimg.setIcon(icon1);
	}
	protected void actionPerformedMntmHide(ActionEvent e) {
		if(lblimg.getIcon() == null)
			return;
		lblimg.setVisible(false);
		
	}
	protected void actionPerformedMntmExit(ActionEvent e) {
		System.exit(0);
	}
}
