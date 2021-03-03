package Swing_study.Component;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JCheckBoxEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox checkBoxApple;
	private JLabel lblRes;
	private int sum;
	private String resStr = "현재 0원 입니다.";
	private JCheckBox checkBoxPear;
	private JCheckBox checkBoxCherry;

	public JCheckBoxEx() {
		initialize();
		checkBoxCherry.setSelected(true);
	}

	private void initialize() {
		setTitle("체크박스 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 112);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel pNorth = new JPanel();
		contentPane.add(pNorth, BorderLayout.NORTH);
		pNorth.setLayout(new BorderLayout(0, 0));

		JLabel lblTitle = new JLabel("사과 100원, 배 500원, 체리 20000원");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		pNorth.add(lblTitle, BorderLayout.NORTH);

		JPanel pItem = new JPanel();
		pNorth.add(pItem);

		checkBoxApple = new JCheckBox("사과");
		checkBoxApple.addItemListener(this);
		pItem.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		pItem.add(checkBoxApple);

		checkBoxPear = new JCheckBox("배");
		checkBoxPear.addItemListener(this);
		pItem.add(checkBoxPear);

		checkBoxCherry = new JCheckBox("체리");
		checkBoxCherry.addItemListener(this);
		pItem.add(checkBoxCherry);

		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		pSouth.setLayout(new BorderLayout(0, 0));

		lblRes = new JLabel(resStr);
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		pSouth.add(lblRes);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == checkBoxCherry) {
			itemStateChangedCheckBox_2(e);
		}
		if (e.getSource() == checkBoxPear) {
			itemStateChangedCheckBox_1(e);
		}
		if (e.getSource() == checkBoxApple) {
			itemStateChangedCheckBox(e);
		}
		resStr = String.format("현재 %d 원 입니다.", sum);
		lblRes.setText(resStr);
	}

	protected void itemStateChangedCheckBox(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 100;
		} else {
			sum -= 100;
		}

	}

	protected void itemStateChangedCheckBox_1(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 500;
		} else {
			sum -= 500;
		}
	}

	protected void itemStateChangedCheckBox_2(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 20000;
		} else {
			sum -= 20000;
		}
	}

}// main
