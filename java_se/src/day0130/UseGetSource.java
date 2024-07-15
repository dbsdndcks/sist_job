package day0130;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class UseGetSource extends JFrame implements ActionListener {

	private JButton jbtn1;
	private JButton jbtn2;
	private JTextField jtf;
	
	public UseGetSource() {
		super("ActionCommand사용");
		jbtn1 = new JButton("버튼1");
		jbtn2 = new JButton("버튼2");
		jtf = new JTextField(10);
		
		System.out.println(jbtn1);
		System.out.println(jbtn2);
		System.out.println(jtf);
		//컴포넌트를 이벤트에 등록
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		jtf.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(jbtn1);
		add(jbtn2);
		add(jtf);

		setBounds(100, 100, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
//		System.out.println(ae.getSource());	
//		getSource() 이벤트를 발생시킨 객체의 주소가 반환
		if(ae.getSource() == jbtn1) {
			System.out.println("버튼1");
		}
		if(ae.getSource() == jtf) {
			System.out.println("텍스트");
		}
		
	}//actionPerformed

			
	public static void main(String[] args) {
		new UseGetSource();
	}

}
