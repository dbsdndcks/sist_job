package day0125;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class UseScrollPane extends JFrame{
	
	public UseScrollPane() {
		super("스크롤 바 연습");
		
		JTextArea jta = new JTextArea("ajdlfdlkklvnwnnsodinjnsck");
		String[]dataARR = "자바,오라클,JDBC,HTML,CSS,JAVASCRIPT LIBRARY, SERVLET/JSP,JSON,XML,AJAX".split(",");
		JList<String>jl = new JList<String>(dataARR);
		
		//BorderLayout -> GridLayout 으로 배치관리자 변경
		setLayout(new GridLayout());

		//스크롤바가 필요한 컴포넌트를 위해 jscrollPane생성
		JScrollPane jsp = new JScrollPane(jl);
		JScrollPane jsp2 = new JScrollPane(jl);
		JTextArea area = new JTextArea();
		
		
		add(area);
		add(jsp);
		add(jsp2);
		
		setBounds(100,100,300,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new UseScrollPane();
	}
}
