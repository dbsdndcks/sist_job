package day0125;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class UseGridLayout extends JFrame{

	public UseGridLayout() {
		super("격차 레이아웃");
		//2.컴포넌트 생성
		JRadioButton jrdPublic = new JRadioButton("public");
		JRadioButton jrdProtected = new JRadioButton("protected");
		JRadioButton jrdPackage = new JRadioButton("package");
		JRadioButton jrdPrivate = new JRadioButton("private");
		JRadioButton jrdNone = new JRadioButton("none");
		JRadioButton jrdSearled = new JRadioButton("searled");
		JRadioButton jrdNonSearled = new JRadioButton("non-searled");
		JRadioButton jrdFinal= new JRadioButton("final");

		//버튼 그룹으로 라디오 버튼을묶어야 여러개중 하나만선택 가능.
		ButtonGroup bg =new ButtonGroup();
		bg.add(jrdPublic);
		bg.add(jrdProtected);
		bg.add(jrdPackage);
		bg.add(jrdPrivate);
		
		//체크 박스는 여러개가 선택되어야 하기 떄문에그룹으로 묶지 않는다
//		ButtonGroup bg2 =new ButtonGroup();
//		bg2.add(jrdNone);
//		bg2.add(jrdSearled);
//		bg2.add(jrdNonSearled);
//		bg2.add(jrdFinal);
		//3.배치관리자 생성 설정
		setLayout(new GridLayout(2,4));

		//4.컴포넌트 배치
		add(jrdPublic);
		add(jrdProtected);
		add(jrdPackage);
		add(jrdPrivate);
		add(jrdNone);
		add(jrdSearled);
		add(jrdNonSearled);
		add(jrdFinal);
		
		//5.윈도우 크기 설정
		setSize(400,200);
		
		//6.가시화
		setVisible(true);
		//7.윈도우 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	public static void main(String[] args) {
		new UseGridLayout();
	}

}
