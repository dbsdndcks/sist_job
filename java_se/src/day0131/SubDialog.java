package day0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/*
 * 부가적인 기능을 제공하기 위해 제작하느 창 : dialog
 */
@SuppressWarnings("serial")
public class SubDialog extends JDialog implements ActionListener {

	public SubDialog(ParentFrame pf) {
//		super(pf,"부가적인 기능",true); // modal
		super(pf,"부가적인 기능",true); // non - modal
		
		ImageIcon ii = new ImageIcon("E:/dev/workspace/java_se/src/images/img3.png");
		JLabel jlblBack = new JLabel("자식창에서 제공하는 이미지",ii,JLabel.CENTER);
		
		JButton jbtn = new JButton("닫기");
		JPanel jp = new JPanel();
		jp.add(jbtn);
		
		add("Center",jlblBack);
		add("South",jp);
		
		//setvisivle 아래로 내리면 오류발생, 그전에 이벤트 등록 코드를 정의해야한다
		jbtn.addActionListener(this);
		
		setBounds(pf.getX()+150,pf.getY()+150,200,200);
		setVisible(true); // 사용자에게 보여지는 일.
		
		//JDialog의 종료 : DISPOSE_ON_CLOSE사용
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}//SubDialog
	
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}//actionPerformed

}//class
