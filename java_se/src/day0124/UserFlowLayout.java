package day0124;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class UserFlowLayout extends JFrame{

	public UserFlowLayout() {
		super("FlowLayout 연습");
		//2.컴포넌트 생성
		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(10);
		JCheckBox jbcSave = new JCheckBox("저장");
		JButton jbtnInput = new JButton("입력");
		
		//3.배치관리자 생성 (Non - visual Component)
		setLayout( new FlowLayout());
		//4.컴포넌트 배치
		add(jlblName);
		add(jtfName);
		add(jbcSave);
		add(jbtnInput);
		//5.윈도우 크기설정
		setSize(500,400);
		
		//6.사용자에게 보여주기
		setVisible(true);
		
		//7.종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new UserFlowLayout();
	}

}
