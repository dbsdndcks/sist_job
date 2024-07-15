package day0131work;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextArea;

public class MemoHelpDesign extends JDialog{
	private JTextArea jta;
	private JButton jbtn;
	
	public MemoHelpDesign(JavaMemoDesign jmd) {
		super(jmd, "메모장정보", false);
		
		String str = "어저구저저구";
		jta = new JTextArea(str);
		jbtn = new JButton("닫기");
		
		add("Center",jta);
		add("South",jbtn);
		
		MemoHelpEvent mhe = new MemoHelpEvent(this);
		jbtn.addActionListener(mhe);
		
		setSize(200,200);
		setVisible(true);
	}

	public JButton getJbtn() {
		return jbtn;
	}
	

}
