package Swing_study.Component;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;

import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class JRadioButtonEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;

	private ImageIcon[] icons = {
			new ImageIcon(imgPath + "사과.jpg"),
			new ImageIcon(imgPath + "배.jpg"),
			new ImageIcon(imgPath + "체리.jpg") };
	private JLabel lblimg;

	public JRadioButtonEx() {
		initialize();
	}

	private void initialize() {
		setTitle("라디오 버튼 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 521, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 10, 0));

		JPanel pLEFT = new JPanel();
		pLEFT.setBorder(new TitledBorder(null, "간단한 라디오버튼", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLEFT);
		pLEFT.setLayout(new BorderLayout(0, 0));

		CustomRadioButton pRadio = new CustomRadioButton();
		pLEFT.add(pRadio);

		JPanel pRIGHT = new JPanel();
		pRIGHT.setBorder(new TitledBorder(null, "응용예제", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pRIGHT);
		pRIGHT.setLayout(new BorderLayout(0, 0));

		CustomRadioButton panel = new CustomRadioButton();
		pRIGHT.add(panel, BorderLayout.NORTH);

		lblimg = new JLabel();
		lblimg.setHorizontalAlignment(SwingConstants.CENTER);
		pRIGHT.add(lblimg, BorderLayout.CENTER);

		for (JRadioButton r : panel.getRdBtns()) {
			r.addItemListener(this);
		}

		panel.getRdbtnApple().setSelected(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton rd = (JRadioButton) e.getSource();
		
		if (e.getStateChange() == ItemEvent.SELECTED) {
//			JOptionPane.showMessageDialog(null, rd.getText());
		String text = rd.getText();
		switch(text) {
		case "사과" :
			lblimg.setIcon(icons[0]);
			break;
		case "배" :
			lblimg.setIcon(icons[1]);
			break;	
		default :	
			lblimg.setIcon(icons[2]);
		}
			
		
		}

	}

}
