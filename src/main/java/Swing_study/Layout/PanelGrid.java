package Swing_study.Layout;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelGrid extends JPanel {
	private JTextField tfName;
	private JTextField tfNO;
	private JTextField tfClass;
	private JTextField tfSubject;

	public PanelGrid() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblName);
		
		tfName = new JTextField();
		add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNO = new JLabel("학번");
		lblNO.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNO);
		
		tfNO = new JTextField();
		tfNO.setColumns(10);
		add(tfNO);
		
		JLabel lblClass = new JLabel("학과");
		lblClass.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblClass);
		
		tfClass = new JTextField();
		tfClass.setColumns(10);
		add(tfClass);
		
		JLabel lblSubject = new JLabel("과목");
		lblSubject.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblSubject);
		
		tfSubject = new JTextField();
		tfSubject.setColumns(10);
		add(tfSubject);
	}

}
