package day0131work;


import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemoDesign extends JFrame{
	private JMenuItem jmiNewTest,jmiOpen,jmiSave,jmiExit,jmiFont,jmiMemoInfo;
	private JTextArea jta;
	
	
	
	
	public JavaMemoDesign() {
		super("메모장");
		setMenu();		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}//HomeWork
	
	
	
	
	
	public void setMenu() {
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("파일");
		JMenu jm2 = new JMenu("서식");
		JMenu jm3 = new JMenu("도움말");
		
		//메뉴아이템 생성
		jmiNewTest = new JMenuItem("새글");
		jmiOpen = new JMenuItem("열기");
		jmiSave = new JMenuItem("저장");
		jmiExit = new JMenuItem("종료");
		jmiFont = new JMenuItem("글꼴");
		jmiMemoInfo = new JMenuItem("메모장 정보");
		
		jm1.add(jmiNewTest);
		jm1.add(jmiOpen);
		jm1.add(jmiSave);
		jm1.add(jmiExit);
		jm2.add(jmiFont);
		jm3.add(jmiMemoInfo);

		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		setJMenuBar(jmb);
		
		jta =new JTextArea();
		jta.setFont(new Font("궁서", Font.BOLD, 12));
		add(jta);
		
		//has a이벤트등록
		JavaMemoEvent jme = new JavaMemoEvent(this);
		jmiNewTest.addActionListener(jme);
		jmiOpen.addActionListener(jme);
		jmiSave.addActionListener(jme);
		jmiExit.addActionListener(jme);
		jmiFont.addActionListener(jme);
		jmiMemoInfo.addActionListener(jme);
	}//setMenu

	public JTextArea getJta() {
		return jta;
	}

	public JMenuItem getJmiNewTest() {
		return jmiNewTest;
	}

	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}

	public JMenuItem getJmiSave() {
		return jmiSave;
	}

	public JMenuItem getJmiExit() {
		return jmiExit;
	}

	public JMenuItem getJmiFont() {
		return jmiFont;
	}

	public JMenuItem getJmiMemoInfo() {
		return jmiMemoInfo;
	}





	public static void main(String[] args) {
		new JavaMemoDesign();
	}//main
	
}
