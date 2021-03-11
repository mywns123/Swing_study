package Swing_study;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Swing_study.Component.FrameComponentEx;
import Swing_study.Component.Fruit;
import Swing_study.Component.JButtonEx;
import Swing_study.Component.JCheckBoxEx;
import Swing_study.Component.JCheckCustomeEx;
import Swing_study.Component.JComboBoxEx1;
import Swing_study.Component.JComboBoxEx2;
import Swing_study.Component.JComboBoxEx3;
import Swing_study.Component.JLabelEx;
import Swing_study.Component.JLabelEx1;
import Swing_study.Component.JListEx;
import Swing_study.Component.JListEx2;
import Swing_study.Component.JListEx3;
import Swing_study.Component.JRadioButtonEx;
import Swing_study.Component.JSliderEx;
import Swing_study.Component.JSpinnerEx;
import Swing_study.Component.JTabbedPaneEx;
import Swing_study.Component.JTableEx;
import Swing_study.Component.JTextFieldAreaEx;
import Swing_study.Dlg.JFileChooserEx;
import Swing_study.Dlg.JOptionPanelComfirmEx;
import Swing_study.Dlg.JOptionPanelInputEx;
import Swing_study.Dlg.JOptionPanelMessageEx;
import Swing_study.LIstener.AnonymousClassListener;
import Swing_study.LIstener.IndepClassListener;
import Swing_study.LIstener.InnerClassListener;
import Swing_study.LIstener.MouseAdapterEx;
import Swing_study.LIstener.MouseListenerEx;
import Swing_study.Layout.FrameLayout;
import Swing_study.Layout.LayoutGuBun;
import Swing_study.Menu.JMenuEx;
import Swing_study.Menu.JPopupMenuEx;
import Swing_study.frame.ContentPaneEx;
import Swing_study.frame.JPanelEx;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class SwingMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn01;
	private JButton btn02;
	private JPanel pLayout;
	private JButton btnFlowLayout;
	private JButton btnBorderLayout;
	private JButton btnGridLayout;
	private JButton btnAbsoluteLayout;
	private JButton btn03;
	private JPanel pComponent1;
	private JButton btn04;
	private JButton btn05;
	private JPanel pJCheckRadio;
	private JButton btn06;
	private JButton btn07;
	private JPanel pTEXT;
	private JButton btn08;
	private JPanel pList;
	private JButton btn09;
	private JButton btn10;
	private JButton btn11;
	private JPanel JComboBox;
	private JButton btn12;
	private JButton btn14;
	private JButton btn13;
	private JPanel pSliderSpinner;
	private JPanel pSlider;
	private JPanel pSpinner;
	private JButton btn15;
	private JButton btn16;
	private JPanel JTabbedPane;
	private JButton btn17;
	private JButton btn0402;
	private JButton btn18;
	private JPanel panel;
	private JButton btn19;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	private JButton btn23;
	private JPanel panel_1;
	private JButton btn25;
	private JButton btn24;
	private JPanel panel_2;
	private JButton btn26;
	private JButton btn27;
	private JButton btn28;
	private JPanel panel_3;
	private JButton btn29;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SwingMain() {
		initialize();
	}

	private void initialize() {
		setTitle("스윙 스터디");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 700, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 10, 10));

		btn01 = new JButton("Jfram 예");
		btn01.addActionListener(this);
		contentPane.add(btn01);

		btn02 = new JButton("JPanel 예");
		btn02.addActionListener(this);
		contentPane.add(btn02);

		pLayout = new JPanel();
		pLayout.setBorder(new TitledBorder(null, "레이아웃", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLayout);
		pLayout.setLayout(new GridLayout(0, 1, 0, 0));

		btnFlowLayout = new JButton("플로우레이아웃");
		btnFlowLayout.addActionListener(this);
//		btnFlowLayout.addActionListener( e-> new FrameLayout(LayoutGuBun.FLOW));
//		btnFlowLayout.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				FrameLayout flow = new FrameLayout(LayoutGuBun.FLOW);
//						
//			}
//		});		
		pLayout.add(btnFlowLayout);

		btnBorderLayout = new JButton("보더레이아웃");
		btnBorderLayout.addActionListener(this);
		pLayout.add(btnBorderLayout);

		btnGridLayout = new JButton("그리드레이아웃");
		btnGridLayout.addActionListener(this);
		pLayout.add(btnGridLayout);

		btnAbsoluteLayout = new JButton("절대 레이아웃");
		btnAbsoluteLayout.addActionListener(this);
		pLayout.add(btnAbsoluteLayout);

		btn03 = new JButton("JComponent 공통 속성");
		btn03.addActionListener(this);
		contentPane.add(btn03);

		pComponent1 = new JPanel();
		pComponent1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"JLabel &JButton & JToggleButton", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pComponent1);
		pComponent1.setLayout(new GridLayout(0, 1, 0, 0));

		btn04 = new JButton("JLabel");
		btn04.addActionListener(this);
		pComponent1.add(btn04);

		btn05 = new JButton("JButton & JToggleButton");
		btn05.addActionListener(this);

		btn0402 = new JButton("JLabelsize");
		btn0402.addActionListener(this);
		pComponent1.add(btn0402);
		pComponent1.add(btn05);

		pJCheckRadio = new JPanel();
		pJCheckRadio.setBorder(
				new TitledBorder(null, "JCheck & Radio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pJCheckRadio);
		pJCheckRadio.setLayout(new GridLayout(0, 1, 0, 0));

		btn06 = new JButton("CheckBox");
		btn06.addActionListener(this);
		btn06.setToolTipText("");
		pJCheckRadio.add(btn06);

		btn07 = new JButton("JRadio");
		btn07.addActionListener(this);
		pJCheckRadio.add(btn07);

		pTEXT = new JPanel();
		pTEXT.setBorder(new TitledBorder(null, "텍스트 필드", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pTEXT);

		btn08 = new JButton("JTextField 예제");
		btn08.addActionListener(this);
		pTEXT.add(btn08);

		pList = new JPanel();
		pList.setBorder(new TitledBorder(null, "JList", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pList);
		pList.setLayout(new GridLayout(0, 1, 0, 0));

		btn09 = new JButton("JLIst예1");
		btn09.addActionListener(this);
		pList.add(btn09);

		btn10 = new JButton("JLIst예2");
		btn10.addActionListener(this);
		pList.add(btn10);

		btn11 = new JButton("JLIst예3");
		btn11.addActionListener(this);
		pList.add(btn11);

		JComboBox = new JPanel();
		JComboBox.setBorder(new TitledBorder(null, "JComboBox", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(JComboBox);
		JComboBox.setLayout(new GridLayout(0, 1, 0, 0));

		btn12 = new JButton("JComboBox예1");
		btn12.addActionListener(this);
		JComboBox.add(btn12);

		btn13 = new JButton("JComboBox예2");
		btn13.addActionListener(e -> {
			JComboBoxEx2 frame = new JComboBoxEx2();
			frame.setVisible(true);
		});

		JComboBox.add(btn13);

		btn14 = new JButton("JComboBox예3");
//		btn14.addActionListener(this);
		btn14.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked()");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				JComboBoxEx3 frame = new JComboBoxEx3();
				frame.setVisible(true);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseReleased()");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered()");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseExited()");
			}

		});
		JComboBox.add(btn14);

		pSliderSpinner = new JPanel();
		contentPane.add(pSliderSpinner);
		pSliderSpinner.setLayout(new GridLayout(0, 1, 0, 0));

		pSlider = new JPanel();
		pSlider.setBorder(new TitledBorder(null, "JSlider", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pSliderSpinner.add(pSlider);
		pSlider.setLayout(new BorderLayout(0, 0));

		pSpinner = new JPanel();
		pSpinner.setBorder(new TitledBorder(null, "JSpinner", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pSliderSpinner.add(pSpinner);
		pSpinner.setLayout(new BorderLayout(0, 0));

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn17) {
					JTabbedPaneEx frame = new JTabbedPaneEx();
					frame.setVisible(true);
				}
				if (e.getSource() == btn16) {
					JSpinnerEx frame = new JSpinnerEx();
					frame.setVisible(true);
				}
			}
		};

		btn16 = new JButton("JSpinner예");
		btn16.addActionListener(listener);
		pSpinner.add(btn16, BorderLayout.CENTER);

		JTabbedPane = new JPanel();
		JTabbedPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JTabbed&JTable",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(JTabbedPane);

		btn17 = new JButton("JTabbed");
		btn17.addActionListener(listener);
		JTabbedPane.setLayout(new GridLayout(0, 1, 0, 0));
		JTabbedPane.add(btn17);

		class MyActionListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				JSliderEx frame = new JSliderEx();
				frame.setVisible(true);
			}
		}

		btn15 = new JButton("JSlider예");
		btn15.addActionListener(new MyActionListener());
		pSlider.add(btn15, BorderLayout.CENTER);

		btn18 = new JButton("JTable");
		btn18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, e.getPoint());
			}
		});
		btn18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTableEx frame = new JTableEx();
				frame.setVisible(true);
			}
		});
		JTabbedPane.add(btn18);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uC774\uBCA4\uD2B8 \uB9AC\uC2A4\uB108", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		btn19 = new JButton("독립 클래스");
		btn19.addActionListener(this);
		panel.add(btn19);

		btn20 = new JButton("내부 클래스");
		btn20.addActionListener(this);
		panel.add(btn20);

		btn21 = new JButton("익명클래스");
		btn21.addActionListener(this);
		panel.add(btn21);

		btn22 = new JButton("마우스 리스너");
		btn22.addActionListener(this);
		btn22.setToolTipText("");
		panel.add(btn22);

		btn23 = new JButton("마우스 어댑터");
		btn23.addActionListener(this);
		panel.add(btn23);

		panel_1 = new JPanel();
		panel_1.setBorder(
				new TitledBorder(null, "JMenu & JPopupMenu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		btn24 = new JButton("메뉴바");
		btn24.addActionListener(this);
		panel_1.add(btn24);

		btn25 = new JButton("팝업메뉴");
		btn25.addActionListener(this);
		panel_1.add(btn25);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "JOptionPane", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn26 = new JButton("InputDig");
		btn26.addActionListener(this);
		panel_2.add(btn26);
		
		btn27 = new JButton("ConfirmDig");
		btn27.addActionListener(this);
		panel_2.add(btn27);
		
		btn28 = new JButton("MessageDig");
		btn28.addActionListener(this);
		panel_2.add(btn28);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "JFileChooser", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_3);
		
		btn29 = new JButton("JFileChooser");
		btn29.addActionListener(this);
		panel_3.add(btn29);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn29) {
			actionPerformedBtn29(e);
		}
		if (e.getSource() == btn28) {
			actionPerformedBtn28(e);
		}
		if (e.getSource() == btn27) {
			actionPerformedBtn27(e);
		}
		if (e.getSource() == btn26) {
			actionPerformedBtn26(e);
		}
		if (e.getSource() == btn25) {
			actionPerformedBtn25(e);
		}
		if (e.getSource() == btn24) {
			actionPerformedBtn24(e);
		}
		if (e.getSource() == btn23) {
			actionPerformedBtn23(e);
		}
		if (e.getSource() == btn22) {
			actionPerformedBtn22(e);
		}
		if (e.getSource() == btn21) {
			actionPerformedBtn21(e);
		}
		if (e.getSource() == btn20) {
			actionPerformedBtn20(e);
		}
		if (e.getSource() == btn19) {
			actionPerformedBtn19(e);
		}

		if (e.getSource() == btn0402) {
			actionPerformedBtn0402(e);
		}
		if (e.getSource() == btn12) {
			actionPerformedBtn12(e);
		}
		if (e.getSource() == btn11) {
			actionPerformedBtn11(e);
		}
		if (e.getSource() == btn10) {
			actionPerformedBtn10(e);
		}
		if (e.getSource() == btn09) {
			actionPerformedBtn09(e);
		}
		if (e.getSource() == btn08) {
			actionPerformedBtn08(e);
		}
		if (e.getSource() == btn07) {
			actionPerformedBtn07(e);
		}
		if (e.getSource() == btn06) {
			actionPerformedBtn06(e);
		}
		if (e.getSource() == btn05) {
			actionPerformedBtn05(e);
		}
		if (e.getSource() == btn04) {
			actionPerformedBtn04(e);
		}
		if (e.getSource() == btn03) {
			actionPerformedBtn03(e);
		}
		if (e.getSource() == btnAbsoluteLayout) {
			actionPerformedBtnAbsoluteLayout(e);
		}
		if (e.getSource() == btnGridLayout) {
			actionPerformedBtnGridLayout(e);
		}
		if (e.getSource() == btnBorderLayout) {
			actionPerformedBtnBorderLayout(e);
		}
		if (e.getSource() == btnFlowLayout) {
			actionPerformedBtnFlowLayout(e);
		}
		if (e.getSource() == btn02) {
			actionPerformedBtnNewButton(e);
		}
		if (e.getSource() == btn01) {
			actionPerformedBtn01(e);
		}
	}

	protected void actionPerformedBtn01(ActionEvent e) {
		ContentPaneEx frame = new ContentPaneEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
		JPanelEx frame = new JPanelEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtnFlowLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.FLOW);
		frame.setVisible(true);
	}
	protected void actionPerformedBtnBorderLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.BORDER);
		frame.setVisible(true);
	}
	protected void actionPerformedBtnGridLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.GRID);
		frame.setVisible(true);
	}
	protected void actionPerformedBtnAbsoluteLayout(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.ABSOLUTE);
		frame.setVisible(true);
	}
	protected void actionPerformedBtn03(ActionEvent e) {
		FrameComponentEx frame = new FrameComponentEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn04(ActionEvent e) {
		JLabelEx frame = new JLabelEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn05(ActionEvent e) {
		JButtonEx frame = new JButtonEx();
		frame.setVisible(true);
	}

	protected void actionPerformedBtn06(ActionEvent e) {
		JCheckBoxEx frame = new JCheckBoxEx();
		frame.setVisible(true);

		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과", 100));
		list.add(new Fruit("배", 500));
		list.add(new Fruit("체리", 20000));
		list.add(new Fruit("바나나", 1000));
		JCheckCustomeEx frame1 = new JCheckCustomeEx(list);

		frame1.setVisible(true);
	}
	
	protected void actionPerformedBtn07(ActionEvent e) {
		JRadioButtonEx frame = new JRadioButtonEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn08(ActionEvent e) {
		JTextFieldAreaEx frame = new JTextFieldAreaEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn09(ActionEvent e) {
		JListEx frame = new JListEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn10(ActionEvent e) {
		JListEx2 frame = new JListEx2();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn11(ActionEvent e) {
		JListEx3 frame = new JListEx3();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn12(ActionEvent e) {
		JComboBoxEx1 frame = new JComboBoxEx1();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn0402(ActionEvent e) {
		JLabelEx1 frame = new JLabelEx1();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn19(ActionEvent e) {
		IndepClassListener frame = new IndepClassListener();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn20(ActionEvent e) {
		InnerClassListener frame = new InnerClassListener();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn21(ActionEvent e) {
		AnonymousClassListener frame = new AnonymousClassListener();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn22(ActionEvent e) {
		MouseListenerEx frame = new MouseListenerEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn23(ActionEvent e) {
		MouseAdapterEx frame = new MouseAdapterEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn24(ActionEvent e) {
		JMenuEx frame = new JMenuEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn25(ActionEvent e) {
		JPopupMenuEx frame = new JPopupMenuEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn26(ActionEvent e) {
		JOptionPanelInputEx frame = new JOptionPanelInputEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn27(ActionEvent e) {
		JOptionPanelComfirmEx frame = new JOptionPanelComfirmEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn28(ActionEvent e) {
		JOptionPanelMessageEx frame = new JOptionPanelMessageEx();
		frame.setVisible(true);
	}
	protected void actionPerformedBtn29(ActionEvent e) {
		JFileChooserEx frame = new JFileChooserEx();
		frame.setVisible(true);
	}
}
