package day0304homework;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TableView extends JFrame{

	private JButton jbtn;
	
	public TableView() {
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		
		jbtn = new JButton("SCOTT의 보유 테이블 확인");
		jp.add(jbtn);
		
        getContentPane().add(BorderLayout.CENTER, jp);

		TableViewEvt tve = new TableViewEvt(this);
		jbtn.addActionListener(tve);
		
		setSize(400,400);
        setLocationRelativeTo(null); // 프레임을 화면 중앙에 위치시키기
		setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 변경된 부ltCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 변경된 부분
	}
	


	public JButton getJbtn() {
		return jbtn;
	}

	public void setJbtn(JButton jbtn) {
		this.jbtn = jbtn;
	}

	public static void main(String[] args) {
		new TableView();
	}
}
