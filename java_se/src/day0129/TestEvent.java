package day0129;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import day0131.StudentInfoDesign;


//1. Window Component상속, 이벤트 처리 Listner를 구현
@SuppressWarnings("serial")
public class TestEvent  extends JFrame implements ActionListener{
	
	public TestEvent() {
		super("이벤트 연습");
		JButton jbtn = new JButton("버튼");
		JPanel jp = new JPanel();
		
		jp.add(jbtn);
		setSize(300, 300);
		add("Center",jp);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3. 컴포넌트를 이벤트에 등록
		jbtn.addActionListener(this);
	}
	
	//2. Listener에 abstract method를 Override 한다.
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
//		JOptionPane.showMessageDialog(this, "버튼을 눌렀습니다");
		new StudentInfoDesign();
	}//actionPerformed
	
	public static void main(String[] args) {
		new TestEvent();
	}//main
}//class

