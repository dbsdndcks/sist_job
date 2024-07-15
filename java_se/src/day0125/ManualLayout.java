package day0125;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class ManualLayout extends JFrame {
	
	public ManualLayout() {
		super("수동배치");
		
		
		//2. 컴포넌트 생성
		JButton jbtn = new JButton("버튼");
		String[]dataArr = {"자장면","김밥","백반","해장국","순대국밥","돈가스"};
		JList<String> jl = new JList<String>(dataArr);
		
		JPasswordField jpf = new JPasswordField();
		
		//배치관리자 해제
		setLayout(null);
		
		//컴포넌트의 크기설정
		jbtn.setSize(80,30);
		jbtn.setLocation(50,130);
		
		jl.setSize(100,50);
		jl.setLocation(180, 190);
		
		//컴포넌트의 크기와 위치를 한번에 설정하는 method: setBounds(x,y,w,j)
		jpf.setBounds(360, 30, 200, 50);
		
		//배치
		add(jbtn);
		add(jl);
		add(jpf);
		
		//컴포넌트 설정
		setSize(600,600);
		setVisible(true);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ManualLayout();
	}
//	안에 내용만 봍붙으로주셍
	
}
