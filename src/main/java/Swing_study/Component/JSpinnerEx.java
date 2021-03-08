package Swing_study.Component;

import java.awt.GridLayout;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JSpinnerEx extends JFrame {

	private JPanel contentPane;
	
	public JSpinnerEx() {
		initialize();
	}
	private void initialize() {
		setTitle("스피너");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JSpinner sp1 = new JSpinner();
		sp1.setModel(new SpinnerListModel(new String[] {"소설", "잡지", "전공서적", "취미"}));
		panel.add(sp1);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JSpinner sp2 = new JSpinner();
		sp2.setModel(new SpinnerNumberModel(1500000, 0, 4000000, 1));
		panel_2.add(sp2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);		
		
				
		
		Calendar cal = Calendar.getInstance();
		Date value = cal.getTime();		
		cal.add(Calendar.YEAR, -50);
		Date start = cal.getTime();		
		cal.add(Calendar.YEAR, 100);
		Date end = cal.getTime();
		SpinnerDateModel dateModel = new SpinnerDateModel(value, start, end, Calendar.YEAR);
		JSpinner sp3 = new JSpinner(dateModel);
		panel_1.add(sp3);
		sp3.setEditor(new JSpinner.DateEditor(sp3, "yyyy/MM/dd"));
		
		System.out.println(value + "\n" + start+ "\n" +end);
		
		
		
		
		
	}

}
