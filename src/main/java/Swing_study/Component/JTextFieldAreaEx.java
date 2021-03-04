package Swing_study.Component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.toedter.calendar.JDateChooser;

@SuppressWarnings("serial")
public class JTextFieldAreaEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfName;
	private JPasswordField pfPass1;
	private JPasswordField pfPass2;
	private JLabel lblConfirm;
	private JTextArea ta;
	private JDateChooser dateChooser;
	private JButton btnAdd;
	private JButton btnCancel;

	public JTextFieldAreaEx() {
		initialize();
	}

	private void initialize() {
		setTitle("텍스트 필드");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 511, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pCENTER = new JPanel();
		contentPane.add(pCENTER, BorderLayout.CENTER);
		pCENTER.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		pCENTER.add(scrollPane, BorderLayout.CENTER);

		ta = new JTextArea();
		ta.setEditable(false);
		scrollPane.setViewportView(ta);

		JPanel pNORTH = new JPanel();
		pNORTH.setPreferredSize(new Dimension(250, 300));
		pNORTH.setBorder(new EmptyBorder(10, 20, 10, 20));
		contentPane.add(pNORTH, BorderLayout.NORTH);
		pNORTH.setLayout(new GridLayout(0, 2, 10, 10));

		JLabel lblName = new JLabel("성명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pNORTH.add(lblName);

		tfName = new JTextField();
		tfName.addActionListener(this);
		pNORTH.add(tfName);
		tfName.setColumns(10);

		JLabel lblPass1 = new JLabel("비밀번호");
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pNORTH.add(lblPass1);

		pfPass1 = new JPasswordField();
		pfPass1.getDocument().addDocumentListener(listener);
		pNORTH.add(pfPass1);

		JLabel lblPass2 = new JLabel("비밀번호확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pNORTH.add(lblPass2);

		pfPass2 = new JPasswordField();
		pfPass2.getDocument().addDocumentListener(listener);
		pNORTH.add(pfPass2);

		JPanel panel = new JPanel();
		pNORTH.add(panel);

		lblConfirm = new JLabel("");
		lblConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm.setForeground(Color.RED);
		lblConfirm.setFont(new Font("굴림", Font.BOLD, 12));
		pNORTH.add(lblConfirm);

		JLabel lblBIRTh = new JLabel("생년월일");
		lblBIRTh.setHorizontalAlignment(SwingConstants.RIGHT);
		pNORTH.add(lblBIRTh);

		dateChooser = new JDateChooser(new Date());
		pNORTH.add(dateChooser);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pNORTH.add(btnAdd);

		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		pNORTH.add(btnCancel);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			actionPerformedBtnCancel(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}

	}

	protected void actionPerformedBtnAdd(ActionEvent e) {
		/*
		 * String pw1 = new String(pfPass1.getPassword()); String pw2 =
		 * String.valueOf(pfPass2.getPassword()); if (pw1.equals(pw2)) { Date d =
		 * dateChooser.getDate(); String msg = String.format("%s - %tF%n",
		 * tfName.getText(), d); ta.append(msg); } else {
		 * JOptionPane.showMessageDialog(null, "비밀번호가 다릅니다."); }
		 */
		if (lblConfirm.getText().equals("일치")) {
			Date d = dateChooser.getDate();
			String msg = String.format("%s - %tF%n", tfName.getText(), d);
			ta.append(msg);
			cleartf();
		} else {
			pfPass2.setText("");
			pfPass1.requestFocus();
			pfPass1.selectAll();
		}
	}

	protected void actionPerformedBtnCancel(ActionEvent e) {
		cleartf();
	}

	public void cleartf() {
		tfName.setText("");
		pfPass1.setText("");
		pfPass2.setText("");
		dateChooser.setDate(new Date());
		lblConfirm.setText("");
		tfName.requestFocus();
	}

	DocumentListener listener = new DocumentListener() {

		@Override
		public void removeUpdate(DocumentEvent e) {
			getMessage();
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			getMessage();
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			getMessage();
		}

		private void getMessage() {
			String pw1 = new String(pfPass1.getPassword());
			String pw2 = String.valueOf(pfPass2.getPassword());
			if (pw1.equals(pw2)) {
				lblConfirm.setText("일치");
			} else {
				lblConfirm.setText("불일치");

			}
		}
	};

}
