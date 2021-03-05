package Swing_study.Component;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JListEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
	private ImageIcon[] icons = {
			new ImageIcon(imgPath + "icon1.png"),
			new ImageIcon(imgPath + "icon2.png"),
			new ImageIcon(imgPath + "icon3.png"),
			new ImageIcon(imgPath + "icon4.png")
			};
	private String[] fruits = new String[] {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
	private JButton pbtn;
	private JList<String> strList;
	
	public JListEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 0));
		
		
		strList = new JList<>();
		strList.setListData(fruits);
		contentPane.add(strList);
		
		JList<ImageIcon> list = new JList<>();
		list.setListData(icons);
		contentPane.add(list);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		pbtn = new JButton("첫리스트선택확인");
		pbtn.addActionListener(this);
		panel.add(pbtn);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pbtn) {
			actionPerformedPbtn(e);
		}
	}
	protected void actionPerformedPbtn(ActionEvent e) {
	int idx = strList.getSelectedIndex();
	String selStr = strList.getSelectedValue();
	List<String> selededList = strList.getSelectedValuesList();
	String message = String.format("index : %d%n SelectedValue %s%n SelectedList %s",
			idx, selStr,selededList);
	JOptionPane.showMessageDialog(null, message);
	}
}
