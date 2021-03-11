package Swing_study.Menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

public class JPopupMenuEx extends JFrame {

	private JPanel contentPane;
	private JLabel lblimg = new JLabel();
	
	public JPopupMenuEx() {
		setTitle("JPopupMenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.setComponentPopupMenu(createPopMenu());
		
		contentPane.add(lblimg,BorderLayout.SOUTH);
		
		
	}

	private JPopupMenu createPopMenu() {
		JPopupMenu popupmenu = new JPopupMenu();
		JMenuItem screen = new JMenuItem("Screen");
		popupmenu.add(screen);
		
		screen.addActionListener(listener);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		mntmLoad.addActionListener(listener);
		popupmenu.add(mntmLoad);
		
		JMenuItem mntmHide = new JMenuItem("Hide");
		mntmHide.addActionListener(listener);
		popupmenu.add(mntmHide);
		
		JMenuItem mntmReShow = new JMenuItem("ReShow");
		popupmenu.add(mntmReShow);
		
		JSeparator separator = new JSeparator();
		popupmenu.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(listener);
		popupmenu.add(mntmExit);
		
		return popupmenu;
	}	
	
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Load")) {
				
				String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;

				ImageIcon icon = new ImageIcon(imgPath + "flower.jpg");				
				Image imgchange = icon.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);				
				lblimg.setIcon(new ImageIcon(imgchange));				
				
				JPopupMenuEx.this.invalidate();
			}
			if(e.getActionCommand().equals("Hide")) {
				
				lblimg.setVisible(false);
			}
			if(e.getActionCommand().equals("ReShow")) {
				
				lblimg.setVisible(true);
			}
			
			if(e.getActionCommand().equals("Exit")) {
				System.exit(0);
			}			
		}
	};

}
