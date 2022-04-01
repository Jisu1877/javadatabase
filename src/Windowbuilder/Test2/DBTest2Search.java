package Windowbuilder.Test2;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class DBTest2Search extends JFrame {
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtGender;
	private JTextField txtJoinday;
	private JTextField txtSearch;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	DBTest2DAO dao = new DBTest2DAO();
	DBTest2VO vo = new DBTest2VO();
	
	public DBTest2Search() {
		super("개별 회원 검색");
		setSize(600, 480);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 584, 441);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회 원 조 회");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(72, 10, 440, 49);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("성명");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(111, 82, 85, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("나이");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(111, 136, 85, 30);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("성별");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(111, 189, 85, 30);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("입사일");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(111, 245, 85, 30);
		panel.add(lblNewLabel_1_1_1_1);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setFont(new Font("굴림", Font.PLAIN, 16));
		txtName.setBounds(222, 82, 222, 30);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setEditable(false);
		txtAge.setFont(new Font("굴림", Font.PLAIN, 16));
		txtAge.setColumns(10);
		txtAge.setBounds(222, 136, 222, 30);
		panel.add(txtAge);
		
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
		
		JButton btnSearch = new JButton("조회하기");
		btnSearch.setFont(new Font("굴림", Font.BOLD, 16));
		btnSearch.setBounds(409, 325, 114, 37);
		panel.add(btnSearch);
		
		JButton btnDispose = new JButton("창닫기");
		btnDispose.setFont(new Font("굴림", Font.BOLD, 16));
		btnDispose.setBounds(409, 372, 114, 37);
		panel.add(btnDispose);
		
		txtGender = new JTextField();
		txtGender.setFont(new Font("굴림", Font.PLAIN, 16));
		txtGender.setEditable(false);
		txtGender.setColumns(10);
		txtGender.setBounds(222, 189, 222, 30);
		panel.add(txtGender);
		
		txtJoinday = new JTextField();
		txtJoinday.setFont(new Font("굴림", Font.PLAIN, 16));
		txtJoinday.setEditable(false);
		txtJoinday.setColumns(10);
		txtJoinday.setBounds(222, 245, 222, 30);
		panel.add(txtJoinday);
		
		JLabel lblNewLabel_2 = new JLabel("조회할 고유번호를 입력  :");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(49, 329, 222, 30);
		panel.add(lblNewLabel_2);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(270, 330, 116, 30);
		panel.add(txtSearch);
		txtSearch.setColumns(10);
		
		setVisible(true);
		
		/* 아래로 메소드 처리 */
		
		//조회하기 버튼 클릭시 수행
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search =	txtSearch.getText();
				if(search.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "고유번호를 입력하세요.");
					txtSearch.requestFocus();
				}
				else {
					if(!Pattern.matches("^[0-9]*$", search)) {
						JOptionPane.showMessageDialog(null, "고유번호는 숫자로 입력하세요.");
						txtSearch.setText("");
						txtSearch.requestFocus();
					}
					else {
						DBTest2VO vo = dao.getSearch(Integer.parseInt(search));	//데이터를 받아와야하기에 리턴타입 필요!! VO 객체를 가지고 데이터를 이동시킨다..
						if(vo.getIdx() == 0) {
							JOptionPane.showMessageDialog(null, "검색한 고유번호가 없습니다. 다시 검색하세요.");
							txtSearch.requestFocus();
						}
						else {
							txtName.setText(vo.getName());
							txtAge.setText(String.valueOf(vo.getAge()));
							txtGender.setText(vo.getGender());
							txtJoinday.setText(vo.getJoinday());
						}
					}
				}
			}
		});
		
		
		//창닫기
		btnDispose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new DBTest2Search();
	}
}
