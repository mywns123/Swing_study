package Swing_study.Component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JComboBoxEx2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
	private ImageIcon[] icons = {
			new ImageIcon(imgPath + "사과.jpg"),
			new ImageIcon(imgPath + "배.jpg"),
			new ImageIcon(imgPath + "체리.jpg") };
	private String[] fruits = {"apple", "pear", "cherry"};
	private JPanel panel;
	private JComboBox<String> comboBox;
	private JLabel label;
	
	private Map<String, ImageIcon> map = new HashMap<String, ImageIcon>();
	public JComboBoxEx2() {
		for(int i=0; i<icons.length; i++) {
			map.put(fruits[i], icons[i]);
		}
		initialize();
	}
	private void initialize() {
		setTitle("JComboBox 이벤트예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<String>(fruits));
		comboBox.setSelectedIndex(-1);
		comboBox.addActionListener(this);
		panel.add(comboBox);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			actionPerformedCmb(e);
		}
	}
	protected void actionPerformedCmb(ActionEvent e) {
		Object obj = comboBox.getSelectedItem();
		
		label.setIcon(map.get(obj));
	}
}
