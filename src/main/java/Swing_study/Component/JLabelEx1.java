package Swing_study.Component;

import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JLabelEx1 extends JFrame {

	private JPanel contentPane;

	public JLabelEx1() {
		initialize();
	}
	private void initialize() {
		setTitle("이미지불러오기");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 1000);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		String imgPath = System.getProperty("user.dir") + File.separator + "image" + File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "flower.jpg");
		JLabel lblimg1 = new JLabel(icon);
		contentPane.add(lblimg1);
		
		
		//레이블의 사이즈에 맞춰 이미지 변경		
		Image img = icon.getImage();
		Image img1 = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon icon1 = new ImageIcon(img1);		
		JLabel lblimg2 = new JLabel(icon1);
		contentPane.add(lblimg2);
	}

}
