package SwingProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class NuriCreateGrant extends JFrame{
	private JTextField txtName;
	private JTextField txtMid;
	private JTextField txtHint;
	private JPasswordField txtPwd;
	private JPasswordField txtPwd2;
	
	public NuriCreateGrant() {
		super("Nuri 관리자 계정 생성");
		setBounds(100, 100, 503, 458);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(46, 71, 396, 282);
		getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("관리자 이름");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1.setBounds(24, 23, 73, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("아이디");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(24, 65, 73, 32);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(24, 107, 73, 32);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1_1_1.setBounds(12, 148, 85, 32);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("찾기 힌트");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1_1_1_1.setBounds(12, 196, 85, 32);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.PLAIN, 16));
		txtName.setColumns(10);
		txtName.setBounds(122, 23, 137, 27);
		panel.add(txtName);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.PLAIN, 16));
		txtMid.setColumns(10);
		txtMid.setBounds(122, 65, 159, 27);
		panel.add(txtMid);
		
		txtHint = new JTextField();
		txtHint.setColumns(10);
		txtHint.setBounds(122, 230, 179, 27);
		panel.add(txtHint);
		
		JButton btnOverLap = new JButton("중복확인");
		btnOverLap.setBackground(SystemColor.menu);
		btnOverLap.setBounds(293, 65, 85, 27);
		panel.add(btnOverLap);
		
		JComboBox comboHint = new JComboBox();
		comboHint.setModel(new DefaultComboBoxModel(new String[] {"나의 보물은?", "출신 초등학교는?", "가장 친한 친구는?", "가장 좋아하는 음식은?", "가장 싫어하는 음식은?"}));
		comboHint.setFont(new Font("굴림", Font.PLAIN, 13));
		comboHint.setBackground(new Color(250, 240, 230));
		comboHint.setBounds(122, 201, 179, 23);
		panel.add(comboHint);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(122, 110, 159, 27);
		panel.add(txtPwd);
		
		txtPwd2 = new JPasswordField();
		txtPwd2.setBounds(122, 151, 159, 27);
		panel.add(txtPwd2);
		
		JLabel lblCheck = new JLabel("불일치");
		lblCheck.setForeground(Color.RED);
		lblCheck.setFont(new Font("굴림", Font.BOLD, 13));
		lblCheck.setBounds(293, 153, 67, 23);
		panel.add(lblCheck);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("힌트 정답");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 13));
		lblNewLabel_1_1_1_1_1_1.setBounds(0, 227, 97, 32);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(46, 363, 396, 48);
		getContentPane().add(panel_1);
		
		JButton btnDispose = new JButton("취소");
		btnDispose.setFont(new Font("굴림", Font.BOLD, 15));
		btnDispose.setBackground(SystemColor.activeCaption);
		btnDispose.setBounds(71, 10, 91, 29);
		panel_1.add(btnDispose);
		
		JButton btnCreate = new JButton("생성");
		btnCreate.setFont(new Font("굴림", Font.BOLD, 15));
		btnCreate.setBackground(SystemColor.activeCaption);
		btnCreate.setBounds(233, 10, 91, 29);
		panel_1.add(btnCreate);
		
		JLabel lblNewLabel = new JLabel("관리자 계정 생성");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(46, 27, 278, 41);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("누리도서관");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2.setBounds(46, 10, 85, 29);
		getContentPane().add(lblNewLabel_2);
		
		
		
		setVisible(true);
		
		/* 아래는 메소드 영역 */
		
		//생성하기
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String mid = txtMid.getText();
				String pwd = txtPwd.getText();
				String hint = comboHint.getSelectedItem().toString();
				String hintAns = txtHint.getText();
				
				if(name.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "관리자 이름을 입력하세요.");
					txtName.requestFocus();
				}
				else if(mid.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
					txtMid.requestFocus();
				}
				else if(pwd.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.");
					txtPwd.requestFocus();
				}
				else if(!Pattern.matches("^[0-9]*$", pwd)) {
					JOptionPane.showMessageDialog(null, "비밀번호는 숫자만 입력 가능합니다.");
					txtPwd.setText("");
					txtPwd.requestFocus();
				}
			}
		});
		
		//취소하기
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		
	}
	
	public static void main(String[] args) {
		new NuriCreateGrant();
	}
}
