package Swing_study.LIstener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MouseListenerEx extends JFrame {

	private JPanel contentPane;
	private JLabel lblmo;
	
	public MouseListenerEx() {
		initialize();
	}
	
	private void initialize() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addMouseListener(new MyMouseListener());
			
		lblmo = new JLabel("Hello");
		lblmo.setBounds(20, 30, 50, 20);
		contentPane.add(lblmo);
	}
	
	class MyMouseListener implements MouseListener{		
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			lblmo.setLocation(x,y);			
		}
		@Override
		public void mouseClicked(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}		
	}
	
	public static void main(String[] arg) {
		new MouseListenerEx();
	}
	
	
}




