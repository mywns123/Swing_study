package Swing_study.Layout;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelBorder extends JPanel {
	
	public PanelBorder() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(10, 10));
		
		JLabel lblNorth = new JLabel("North");
		lblNorth.setOpaque(true); //jlabel은 투명 -> 불투명
		lblNorth.setBackground(Color.ORANGE);
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNorth, BorderLayout.NORTH);
		
		JLabel lblCenter = new JLabel("Center");
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblCenter.setBackground(Color.GREEN);
		lblCenter.setOpaque(true);
		add(lblCenter, BorderLayout.CENTER);
		
		JLabel lblWest = new JLabel("West");
		lblWest.setOpaque(true);
		lblWest.setBackground(Color.MAGENTA);
		add(lblWest, BorderLayout.WEST);
		
		JLabel lblEast = new JLabel("East");
		lblEast.setBackground(Color.CYAN);
		lblEast.setOpaque(true);
		add(lblEast, BorderLayout.EAST);
		
		JLabel lblSouth = new JLabel("South");
		lblSouth.setOpaque(true);
		lblSouth.setBackground(Color.GRAY);
		add(lblSouth, BorderLayout.SOUTH);
	}

}
