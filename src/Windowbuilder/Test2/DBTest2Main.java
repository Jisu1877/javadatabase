package Windowbuilder.Test2;

import java.awt.Font;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class DBTest2Main extends JFrame {
	
	public DBTest2Main() {
		super("회원관리 메인화면");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원관리프로그램(v1.0)");
		lblNewLabel.setBounds(35, 25, 712, 54);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		URL imgUrl = this.getClass().getClassLoader().getResource("4.jpg");
		lblNewLabel_1.setIcon(new ImageIcon(imgUrl));
		
		lblNewLabel_1.setBounds(67, 80, 650, 325);
		panel.add(lblNewLabel_1);
		
		JButton btnInput = new JButton("회원등록");
		btnInput.setFont(new Font("굴림", Font.PLAIN, 18));
		btnInput.setBounds(63, 437, 117, 54);
		panel.add(btnInput);
		
		JButton btnSearch = new JButton("개별조회");
		btnSearch.setFont(new Font("굴림", Font.PLAIN, 18));
		btnSearch.setBounds(243, 437, 117, 54);
		panel.add(btnSearch);
		
		JButton btnList = new JButton("전체조회");
		btnList.setFont(new Font("굴림", Font.PLAIN, 18));
		btnList.setBounds(423, 437, 117, 54);
		panel.add(btnList);
		
		JButton btnExit = new JButton("종  료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 18));
		btnExit.setBounds(603, 437, 117, 54);
		panel.add(btnExit);
		
		
		
		setVisible(true);
		
		/* 아래로 메소드 처리부*/
		
		// 회원등록(버튼을 클릭했을 때 수행)
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DBTest2Input();
			}
		});
		
		// 회원등록(버튼에서 엔터키를 눌렀을 때 수행)
		btnInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					new DBTest2Input();
				}
			}
		});
		
		// 개별조회
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DBTest2Search();
			}
		});
		
		// 전체조회
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DBTest2List();
			}
		});
		
		// 종료버튼 클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// 종료버튼에서 엔터키를 누르면 종료
		btnExit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.exit(0);
			}
		});

	}
	
	public static void main(String[] args) {
		new DBTest2Main();
	}
}
