package Swing_study.Component;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MyButton extends JButton {

	private String imgPath = System.getProperty("user.dir")
							+ File.separator 
							+ "image" 
							+ File.separator;

	public MyButton() {
		setIcon(new ImageIcon(imgPath + "Nomal.gif"));
		setRolloverIcon(new ImageIcon(imgPath + "roll.gif"));
		setPressedIcon(new ImageIcon(imgPath + "Press.gif"));
	}

}
