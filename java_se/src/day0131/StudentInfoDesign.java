package day0131;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import kr.co.sist.memo.StudentManagementEvent;

@SuppressWarnings("serial")
public class StudentInfoDesign extends JFrame{
		
	private JTextField jtfName,jtfPhoneNumber;
	private DefaultComboBoxModel<String> dcbm; 
	private JRadioButton jrbMen,jrbWomen;
	private DefaultListModel<String>dlm;
	private JButton jbtAdd,jbtEdit,jbtRemove,jbtExit;
	String[]btn = {"추가","변경","삭제","종료"};
	JList<String>jl;
		
	public StudentInfoDesign() {
		super("숙제");
		jtfName = new JTextField(10);
		jtfPhoneNumber = new JTextField(15);
		jrbMen = new JRadioButton("남자");
		jrbWomen = new JRadioButton("여자");
		dlm = new DefaultListModel<String>();
		dcbm = new DefaultComboBoxModel<String>();
	
		StudentManagementEvent sme = new StudentManagementEvent(this);
		setLayout(null);
		addInfo();
		addText();
		addComboBox();
		addRadioButton();
		addList(sme);
		addButton();
		
		addWindowListener(sme);
		jbtAdd.addActionListener(sme);
		jbtEdit.addActionListener(sme);
		jbtRemove.addActionListener(sme);
		jbtExit.addActionListener(sme);
		
		//컴포넌트 설정
		setSize(400,250);
		setVisible(true);  
	}
	public void addInfo() {
		String[] userInfo = {"이름", "나이", "성별", "전화번호"};
		JLabel[] jlArr = new JLabel[4];
		for(int i = 0; i < jlArr.length; i++) {
			jlArr[i] = new JLabel(userInfo[i]);
			jlArr[i].setBounds(20, (i)*40, 180, 50);
			add(jlArr[i]);
		}	// end for
	}
	
	
	public void addText() {
			jtfName = new JTextField(10);
			jtfPhoneNumber = new JTextField(15);
			jtfName.setBounds(60, 13, 150, 30);
			jtfPhoneNumber.setBounds(75, 130, 150, 30);
			add(jtfName);
			add(jtfPhoneNumber);
	}
	
	public void addComboBox() {
		// 콤보박스 Model 객체 생성
		dcbm = new DefaultComboBoxModel<String>();	
		//  콤보박스 Model 객체와 has a 관계 View 객체 생성
		JComboBox<String>jcb = new JComboBox<String>(dcbm);
		for(int i=20 ; i<=40 ; i++) {
			dcbm.addElement(String.valueOf(i));
		}
		jcb.setBounds(60, 56, 100, 20);
		
		add(jcb);
	}
	
	public void addRadioButton() {
		jrbMen = new JRadioButton("남자");
		jrbWomen = new JRadioButton("여자");
		ButtonGroup jrb = new ButtonGroup();
		jrb.add(jrbMen);
		jrb.add(jrbWomen);
		jrbMen.setBounds(60, 90, 60, 30);
		jrbWomen.setBounds(120, 90, 80, 30);
		add(jrbMen);
		add(jrbWomen);
	}
	
	
	public void addList(StudentManagementEvent sme) {		
		
		// 리스트 모델 객체 생성
		dlm = new DefaultListModel<String>();
		//  View생성 => 리스트 Model과 has a 관계
		jl = new JList<String>(dlm);
		dlm.addElement("진수현,20,남,010-1234-5678");
		dlm.addElement("김동섭,21,남,010-2345-6789");
		//리스트에 값넣기
		jl.addMouseListener(sme);
		jl.setBounds(250, 20, 120, 120);
		add(jl,BorderLayout.EAST);
	}
	
	public void addButton() {
		jbtAdd = new JButton("추가");
		jbtEdit = new JButton("변경");
		jbtRemove = new JButton("삭제");
		jbtExit = new JButton("종료");
		jbtAdd.setBounds(20,180,60,30);
		jbtEdit.setBounds(90,180,60,30);
		jbtRemove.setBounds(160,180,60,30);
		jbtExit.setBounds(230,180,60,30);
		add(jbtAdd);
		add(jbtEdit);
		add(jbtRemove);
		add(jbtExit);
	
	}
	
	
	
	public JTextField getJtfName() {
		return jtfName;
	}
	public JTextField getJtfPhoneNumber() {
		return jtfPhoneNumber;
	}
	public JRadioButton getJrbMen() {
		return jrbMen;
	}
	public JRadioButton getJrbWomen() {
		return jrbWomen;
	}

	public DefaultComboBoxModel<String> getDcbm() {
		return dcbm;
	}
	public DefaultListModel<String> getDlm() {
		return dlm;
	}
	public JList<String> getJl() {
		return jl;
	}
	

	public void setJtfName(JTextField jtfName) {
		this.jtfName = jtfName;
	}
	public JButton getJbtAdd() {
		return jbtAdd;
	}
	public JButton getJbtEdit() {
		return jbtEdit;
	}
	public JButton getJbtRemove() {
		return jbtRemove;
	}
	public JButton getJbtExit() {
		return jbtExit;
	}
	public static void main(String[] args) {
		new StudentInfoDesign();
	}

}