package Windowbuilder.Test;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class Test3 extends JFrame{
	private JTextField txtMid;
	private JPasswordField txtPwd;
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	private JTable tblContent;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Test3() {
		super("컴포넌트 연습");
		setSize(600, 590);
		setLocationRelativeTo(null);
		setResizable(false);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(SystemColor.activeCaptionBorder);
		pn1.setBounds(0, 53, 584, 55);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel.setBounds(12, 10, 75, 35);
		pn1.add(lblNewLabel);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.PLAIN, 16));
		txtMid.setBounds(78, 13, 122, 29);
		pn1.add(txtMid);
		txtMid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(212, 10, 75, 35);
		pn1.add(lblNewLabel_1);
		
		txtPwd = new JPasswordField();
		txtPwd.setFont(new Font("굴림", Font.PLAIN, 16));
		txtPwd.setBounds(291, 13, 148, 29);
		pn1.add(txtPwd);
		
		JButton btnMidPwd = new JButton("아이디출력");
		btnMidPwd.setFont(new Font("굴림", Font.PLAIN, 16));
		btnMidPwd.setBounds(451, 13, 121, 29);
		pn1.add(btnMidPwd);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 0, 584, 55);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblDisplay = new JLabel("출력창");
		lblDisplay.setForeground(new Color(255, 0, 0));
		lblDisplay.setBackground(UIManager.getColor("CheckBox.light"));
		lblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisplay.setFont(new Font("굴림", Font.PLAIN, 16));
		lblDisplay.setBounds(12, 10, 433, 35);
		pn2.add(lblDisplay);
		
		// '종료' 버튼 디자인
		JButton btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 16));
		btnExit.setBounds(457, 13, 97, 29);
		pn2.add(btnExit);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 108, 584, 46);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JRadioButton rdMale = new JRadioButton("남자");
		btnGroupGender.add(rdMale);
		rdMale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdMale.setBounds(145, 6, 65, 34);
		pn3.add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setSelected(true);
		btnGroupGender.add(rdFemale);
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdFemale.setBounds(236, 6, 65, 34);
		pn3.add(rdFemale);
		
		JButton btnGender = new JButton("성별출력");
		btnGender.setFont(new Font("굴림", Font.PLAIN, 16));
		btnGender.setBounds(309, 9, 105, 29);
		pn3.add(btnGender);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 153, 584, 208);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboJob = new JComboBox();
		comboJob.setFont(new Font("굴림", Font.PLAIN, 16));
		comboJob.setModel(new DefaultComboBoxModel(new String[] {"학생", "회사원", "군인", "의사", "변호사", "기타"}));
		comboJob.setBounds(12, 10, 148, 23);
		panel.add(comboJob);
		
		JButton btnJob = new JButton("직업출력");
		btnJob.setFont(new Font("굴림", Font.PLAIN, 16));
		btnJob.setBounds(12, 43, 148, 23);
		panel.add(btnJob);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 76, 148, 122);
		panel.add(scrollPane);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "회사원", "공무원", "변호사", "의사", "판사", "세무사", "회계사", "개인사업자", "주부", "프리랜서", "무직"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(172, 43, 132, 155);
		panel.add(scrollPane_1);
		
		JTextArea txtaContent = new JTextArea();
		scrollPane_1.setViewportView(txtaContent);
		
		JButton btnJob2 = new JButton("직업출력2");
		btnJob2.setFont(new Font("굴림", Font.PLAIN, 16));
		btnJob2.setBounds(172, 11, 132, 23);
		panel.add(btnJob2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(311, 0, 273, 208);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chkCard1 = new JCheckBox("국민카드");
		chkCard1.setFont(new Font("굴림", Font.PLAIN, 16));
		chkCard1.setBounds(8, 7, 115, 23);
		panel_1.add(chkCard1);
		
		JCheckBox chkCard2 = new JCheckBox("농협카드");
		chkCard2.setFont(new Font("굴림", Font.PLAIN, 16));
		chkCard2.setBounds(150, 6, 115, 23);
		panel_1.add(chkCard2);
		
		JCheckBox chkCard4 = new JCheckBox("삼성카드");
		chkCard4.setFont(new Font("굴림", Font.PLAIN, 16));
		chkCard4.setBounds(150, 58, 115, 23);
		panel_1.add(chkCard4);
		
		JCheckBox chkCard3 = new JCheckBox("신한카드");
		chkCard3.setFont(new Font("굴림", Font.PLAIN, 16));
		chkCard3.setBounds(8, 59, 115, 23);
		panel_1.add(chkCard3);
		
		JCheckBox chkCard5 = new JCheckBox("카카오카드");
		chkCard5.setFont(new Font("굴림", Font.PLAIN, 16));
		chkCard5.setBounds(8, 115, 115, 23);
		panel_1.add(chkCard5);
		
		JCheckBox chkCard6 = new JCheckBox("우리카드");
		chkCard6.setFont(new Font("굴림", Font.PLAIN, 16));
		chkCard6.setBounds(150, 114, 115, 23);
		panel_1.add(chkCard6);
		
		JButton btnCard = new JButton("선택카드출력");
		btnCard.setFont(new Font("굴림", Font.PLAIN, 16));
		btnCard.setBounds(54, 155, 164, 29);
		panel_1.add(btnCard);
		
		JPanel pn4 = new JPanel();
		pn4.setBounds(0, 359, 584, 192);
		getContentPane().add(pn4);
		pn4.setLayout(null);
		
		/* *JTable을 디자인탭에 올리는 순서?
			1. Panel를 만들고, Absolute Layout을 패널에 찍어준다.
			2. JScrollPane을 Panel의 크기에 맞게 그린다.
			3. JTable을 JScrollPane의 ViewPort에 클릭해준다.
			4. 데이터베이스에 연결을 위해 DefaultTableModel객체를 준비해준다.
				DefaultTableModel객체는 Vector형식의 자료를 사용한다. 따라서 '제목'과 '내용물'을 모두 벡터로 준비시켜준다.
			5. 준비된 Vector형식의 자료를 DefaultTableModel객체에 올린다.
			6. DefaultTableModel객체를 JTable에 올려준다.
			7. JTable을 JScrollPane에 올려준다.
			8. JScrollPane을 '패널'에 올려준다.
		*/
		
		//4.타이틀을 벡터로 처리해둔다.
		Vector title = new Vector();
		title.add("번호");
		title.add("성명");
		title.add("나이");
		title.add("성별");
		title.add("입사일");
		
		//4.데이터를 벡터로 준비해둔다.
		Test3DAO dao = new Test3DAO();
		Vector vData = dao.getList();
//		System.out.println("vData : " + vData);
		
		
		//5.DefaultTableModel에 준비한 벡터 자료를 담는다.
		DefaultTableModel defaultTableModel = new DefaultTableModel(vData, title); // (데이터,타이틀)
		
		
		// 6.DefaultTableModel를 JTable에 올린다.
		tblContent = new JTable(defaultTableModel);
		
		//7. JTable을 JScrollPane에 올려준다.
		JScrollPane spContent = new JScrollPane(tblContent);		//스크롤팬 생성시에 j테이블을 올린다.
		spContent.setBounds(0, 0, 584, 192);
		
		//8. JScrollPane을 패널에 올려준다.
		pn4.add(spContent);
		
//		spContent.setViewportView(tblContent);
		
		setVisible(true);
		

		/* 아래로 메소드 처리 */

		// 아이디와 비밀번호 출력버튼 처리
		btnMidPwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mid = txtMid.getText();
				String pwd	= txtPwd.getText();
				if(mid.equals("") || pwd.equals("")) {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 입력하세요.");
					if(mid.equals("")) txtMid.requestFocus();
					else txtPwd.requestFocus();
				}
				else {
					lblDisplay.setText("아이디 : " + mid + " , 비밀번호 : " + pwd);
				}
			}
		});
		
		// 성별 출력버튼 처리
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdMale.isSelected()) {
					lblDisplay.setText("남자 선택");
				}
				else {
					lblDisplay.setText("여자 선택");
				}
			}
		});
		
		// 직업출력 버튼 처리
		btnJob.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText(comboJob.getSelectedItem().toString() + "을(를) 선택하셨습니다.");
			}
		});
		
		//선택된 직업을 textArea에 출력하기
		btnJob2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				txtaContent.setText(comboJob.getSelectedItem().toString());
//				txtaContent.append(comboJob.getSelectedItem().toString() + "\n"); //append : 누적하기
				txtaContent.append(list.getSelectedValue().toString() + "\n");
			}
		});
		
		//선택된 카드를 모두 레이블(출력창)에 처리하는 버튼 메소드
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String card = "";
				if(chkCard1.isSelected()) card += chkCard1.getText() + "/";
				if(chkCard2.isSelected()) card += chkCard2.getText() + "/";
				if(chkCard3.isSelected()) card += chkCard3.getText() + "/";
				if(chkCard4.isSelected()) card += chkCard4.getText() + "/";
				if(chkCard5.isSelected()) card += chkCard5.getText() + "/";
				if(chkCard6.isSelected()) card += chkCard6.getText() + "/";
				lblDisplay.setText("선택카드 : " + card);
			}
		});
		
		// '종료'버튼 처리
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Test3();
	}
}
