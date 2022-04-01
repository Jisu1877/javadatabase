package Windowbuilder.Test2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class DBTest2Input extends JFrame{
	private JTextField txtName;
	private JTextField txtAge;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	DBTest2DAO dao = new DBTest2DAO();
	DBTest2VO vo = new DBTest2VO();
	
	public DBTest2Input() {
		super("회원 등록");
		setSize(600, 480);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 584, 441);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 32, 440, 49);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("성명");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(112, 117, 85, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("나이");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(112, 171, 85, 30);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("성별");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(112, 224, 85, 30);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("입사일");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(112, 280, 85, 30);
		panel.add(lblNewLabel_1_1_1_1);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.PLAIN, 16));
		txtName.setBounds(223, 117, 222, 30);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("굴림", Font.PLAIN, 16));
		txtAge.setColumns(10);
		txtAge.setBounds(223, 171, 222, 30);
		panel.add(txtAge);
		
		JRadioButton radioMale = new JRadioButton("남자");
		radioMale.setSelected(true);
		buttonGroup.add(radioMale);
		radioMale.setBounds(223, 224, 62, 23);
		panel.add(radioMale);
		
		JRadioButton radioFemale = new JRadioButton("여자");
		buttonGroup.add(radioFemale);
		radioFemale.setBounds(301, 224, 71, 23);
		panel.add(radioFemale);
		
		String[] yy = new String[23];
		String[] mm = new String[12];
		String[] dd = new String[31];
		
		int imsi;
		for(int i=0; i<=22; i++) {
			imsi = i + 2000;
			yy[i] = imsi + "";
		}
		for(int i=1; i<=12; i++) {
			mm[i-1] = i + "";
		}
		for(int i=1; i<=31; i++) {
			dd[i-1] = i + "";
		}
		
		JComboBox comboY = new JComboBox(yy);
		comboY.setFont(new Font("굴림", Font.PLAIN, 16));
		comboY.setBounds(223, 283, 71, 25);
		panel.add(comboY);
		
		JComboBox comboM = new JComboBox(mm);
		comboM.setFont(new Font("굴림", Font.PLAIN, 16));
		comboM.setBounds(306, 283, 71, 25);
		panel.add(comboM);
		
		JComboBox comboD = new JComboBox(dd);
		comboD.setFont(new Font("굴림", Font.PLAIN, 16));
		comboD.setBounds(388, 283, 71, 25);
		panel.add(comboD);
		
		JButton btnInput = new JButton("가입하기");
		btnInput.setFont(new Font("굴림", Font.BOLD, 16));
		btnInput.setBounds(60, 352, 114, 37);
		panel.add(btnInput);
		
		JButton btnInput_1 = new JButton("취소하기");
		btnInput_1.setFont(new Font("굴림", Font.BOLD, 16));
		btnInput_1.setBounds(234, 352, 114, 37);
		panel.add(btnInput_1);
		
		JButton btnInput_1_1 = new JButton("창닫기");
		btnInput_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		btnInput_1_1.setBounds(408, 352, 114, 37);
		panel.add(btnInput_1_1);
		
		setVisible(true);
		
		/* 아래로 메소드 처리 */
		
		// 가입하기
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String name = txtName.getText();
					String age = txtAge.getText();
					String gender;
					String joinday = comboY.getSelectedItem()+"-"+comboM.getSelectedItem()+"-"+comboD.getSelectedItem();

					if(name.trim().equals("")) {
						JOptionPane.showMessageDialog(null, "성명을 입력하세요");
						txtName.requestFocus();
					}
					else if(age.trim().equals("")) {
						JOptionPane.showMessageDialog(null, "나이를 입력하세요");
						txtAge.requestFocus();
					}
					else {
						if(!Pattern.matches("^[0-9]*$", age)) {
							JOptionPane.showMessageDialog(null, "나이는 숫자로 입력하세요");
							txtAge.requestFocus();
						}
						else {
							if(radioMale.isSelected()) gender = "남자";
							else gender = "여자";

							//  가입처리(DB처리)
							vo.setName(name);
							vo.setAge(Integer.parseInt(age));
							vo.setGender(gender);
							vo.setJoinday(joinday);

							dao.DBTestInput(vo);
							JOptionPane.showMessageDialog(null, "회원 가입 되었습니다.");

							// 다음자료 준비....
							txtName.setText("");
							txtAge.setText("");
							txtName.requestFocus();
						}
					}
			}
		});
		
		//취소하기
		btnInput_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAge.setText("");
				txtName.requestFocus();
			}
		});
		
		
		//창닫기
		btnInput_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
				dispose();
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new DBTest2Input();
	}
}
