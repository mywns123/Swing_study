package Swing_study.LIstener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MouseAdapterEx extends JFrame {

	private JPanel contentPane;
	private JLabel lblmo;
	
	public MouseAdapterEx() {
		initialize();
	}
	private void initialize() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblmo = new JLabel("Hello");
		lblmo.setBounds(20, 30, 50, 20);
		contentPane.add(lblmo);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				lblmo.setLocation(x,y);			
			}
		});
		
		
		
	}

	
	
	
	
	
	
}
