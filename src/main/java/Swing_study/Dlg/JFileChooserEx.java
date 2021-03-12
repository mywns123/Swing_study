package Swing_study.Dlg;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class JFileChooserEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblImg;
	private JButton btnOpen;
	private JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
	

	public JFileChooserEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JFileChooser 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblImg = new JLabel("");
		contentPane.add(lblImg, BorderLayout.CENTER);
		
		btnOpen = new JButton("불러오기");
		btnOpen.addActionListener(this);
		contentPane.add(btnOpen, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOpen) {
			if(e.getActionCommand().equals("불러오기")) {
			actionPerformedBtnOpen(e);
			}else {
				try {
					actionPerformedBtnSave(e);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	private void actionPerformedBtnSave(ActionEvent e) throws IOException {
		//다운로더 폴더에 저장, 없으면 생성 후 저장	
		String path = System.getProperty("user.dir") + File.separator + "download";
		if(path.equals("download")) {
			File img = new File(path,"img.jpg");
			img.createNewFile();
			img = (File) lblImg.getIcon();
		}else {
//			download.mkdir();
			File img1 = new File(path,"img.jpg");
			img1.createNewFile();
			img1 = (File) lblImg.getIcon();
			}
				
		
		
		
		
	}
	protected void actionPerformedBtnOpen(ActionEvent e) {
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"jpg & png images", "jpg", "png", "gif");
		chooser.setFileFilter(filter);
		
		int res = chooser.showOpenDialog(null);
		if(res != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고",JOptionPane.WARNING_MESSAGE);
			return;			
		}
		
		String chooseFilePath = chooser.getSelectedFile().getPath();		
		lblImg.setIcon(new ImageIcon(chooseFilePath));
		
		if(btnOpen.getText().equals("불러오기")) {
			btnOpen.setText("저장하기");
		}
	}
	
}
