package SwingProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuriHome extends JFrame{
	
	public NuriHome() {
		super("컴포넌트 연습");
		setTitle("Nuri HOME");
		setBounds(100, 100, 561, 537);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblHome = new JLabel("누리도서관 관리시스템 HOME");
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setFont(new Font("굴림", Font.BOLD, 25));
		lblHome.setBounds(86, 10, 372, 54);
		getContentPane().add(lblHome);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.menu);
		panel.setBounds(87, 246, 171, 184);
		getContentPane().add(panel);
		
		JButton btnBooks = new JButton("도서 관리");
		btnBooks.setFont(new Font("굴림", Font.BOLD, 14));
		btnBooks.setBackground(new Color(255, 222, 173));
		btnBooks.setBounds(27, 25, 100, 27);
		panel.add(btnBooks);
		
		JButton btnCustomer = new JButton("회원 관리");
		btnCustomer.setFont(new Font("굴림", Font.BOLD, 14));
		btnCustomer.setBackground(new Color(255, 222, 173));
		btnCustomer.setBounds(27, 77, 100, 27);
		panel.add(btnCustomer);
		
		JButton btnLend = new JButton("대여 관리");
		btnLend.setFont(new Font("굴림", Font.BOLD, 14));
		btnLend.setBackground(new Color(255, 222, 173));
		btnLend.setBounds(27, 129, 100, 27);
		panel.add(btnLend);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(287, 246, 171, 184);
		getContentPane().add(panel_1);
		
		JButton btnRootInput = new JButton("관리자 계정 생성");
		btnRootInput.setFont(new Font("굴림", Font.BOLD, 14));
		btnRootInput.setBackground(new Color(135, 206, 235));
		btnRootInput.setBounds(0, 77, 149, 27);
		panel_1.add(btnRootInput);
		
		JButton btnRoot = new JButton("관리자 계정 관리");
		btnRoot.setFont(new Font("굴림", Font.BOLD, 14));
		btnRoot.setBackground(new Color(135, 206, 235));
		btnRoot.setBounds(0, 25, 149, 27);
		panel_1.add(btnRoot);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(87, 435, 370, 53);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnLogout = new JButton("로그아웃");
		btnLogout.setFont(new Font("굴림", Font.BOLD, 15));
		btnLogout.setBackground(SystemColor.controlHighlight);
		btnLogout.setBounds(51, 12, 108, 27);
		panel_2.add(btnLogout);
		
		JButton btnExit = new JButton("종 료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 15));
		btnExit.setBackground(SystemColor.controlHighlight);
		btnExit.setBounds(210, 12, 108, 27);
		panel_2.add(btnExit);
		
		JLabel lblImg = new JLabel("");
		lblImg.setBounds(112, 74, 321, 157);
		URL imgUrl = this.getClass().getClassLoader().getResource("6.jpg");
		lblImg.setIcon(new ImageIcon(imgUrl));
		getContentPane().add(lblImg);
		
		
		setVisible(true);
		
		/* 아래부터 메소드 영역 */
		
		// 종료버튼 메소드
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// 로그아웃버튼 메소드
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//관리자계정 정보 제거? 필요한가?
				
				//창닫기
				dispose();
				//관리자 로그인으로 이동
				new NuriManageLogin();
			}
		});
	}
	
	public static void main(String[] args) {
		new NuriHome();
	}
}
