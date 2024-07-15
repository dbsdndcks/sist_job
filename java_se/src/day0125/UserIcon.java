package day0125;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class UserIcon extends JFrame{
	public UserIcon() {
		super("이미지 연습");
		
		ImageIcon ii = new ImageIcon("E:/dev/workspace/java_se/src/images/img1.png");
		ImageIcon ii2 = new ImageIcon("E:/dev/workspace/java_se/src/images/img4.png");
		ImageIcon ii3 = new ImageIcon("E:/dev/workspace/java_se/src/images/img4.png");
		
		JLabel jl = new JLabel(ii);
		JButton jbtn = new JButton("로끼아악",ii2);
		JButton click = new JButton("클릭");
		JButton click1 = new JButton("클릭");
		JButton click2 = new JButton("차차",ii3);
		
		setLayout(null); // 수동배치
		
		jl.setBounds(100, 100, 300, 200);
		jbtn.setBounds(420, 100, 400, 220);
		click.setBounds(200,30,100,50);
		click1.setBounds(100,30,100,50);
		click2.setBounds(840,200,420,420);
		
		//버튼제어
		//풍선 도움말
		click2.setToolTipText("지림");
		jbtn.setToolTipText("자자ㄴㅇㄹㄴㅇㄹㄴㅇㄹ");
		
		//특정위치 보내기
		click2.setVerticalTextPosition(JButton.CENTER);
		click2.setHorizontalTextPosition(JButton.CENTER);
		
		//Rollover
		click2.setRolloverIcon(ii);
		
		add(jl);
		add(jbtn);
		add(click);
		add(click1);
		add(click2);
		
		setBounds(100, 100, 800, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new UserIcon();
	}
}
