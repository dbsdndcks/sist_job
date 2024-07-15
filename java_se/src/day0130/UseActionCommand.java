package day0130;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class UseActionCommand extends JFrame implements ActionListener {

	private JButton jbtn1;
	private JButton jbtn2;
	private JTextField jtf;
	
	public UseActionCommand() {
		super("ActionCommand사용");
		jbtn1 = new JButton("버튼1");
		jbtn2 = new JButton("버튼2");
		jtf = new JTextField(10);
		
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
//		System.out.println(" 이벤트를 발생시킨 컴포넌트의(객체의) 값" + ae.getActionCommand());
		
		//====================TextField에서 이벤트가 발생했을때 비교할 수 없다.
		String cmd = ae.getActionCommand();
		
		if("버튼1".equals(cmd)) {
			System.out.println("버튼1이 눌렸을 때 사용자에게 제공할 코드");
		}
		if("버튼2".equals(cmd)) {
			System.out.println("버튼2이 눌렸을 때 사용자에게 제공할 코드");
		}
		
		
	}//actionPerformed

			
	public static void main(String[] args) {
		new UseActionCommand();
	}

}
