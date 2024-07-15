package day0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class UseJOptionPan extends JFrame implements ActionListener,WindowListener{

	private JMenuItem jmiInput,jmiMeseeage,jmiConfirm;
	
	public UseJOptionPan() {
		super("JOptionPane 사용");
		
		JMenuBar jmb = new JMenuBar();
		JMenu jm =new JMenu("사용");
		//메뉴아이템 생성
		jmiInput = new JMenuItem("input dialog");
		jmiMeseeage = new JMenuItem("message dialog");
		jmiConfirm = new JMenuItem("confirm dialog");
		
		//ㄱ 무조건 가야지
		//메뉴아이템 > 메뉴 배치
		jm.add(jmiInput);
		jm.add(jmiMeseeage);
		jm.add(jmiConfirm);
		
		
		//메뉴 > 메뉴바 배치
		jmb.add(jm);
		
		//메뉴비 > Frame 설정
		setJMenuBar(jmb);
		
		//이벤트 등록
		jmiInput.addActionListener(this);
		jmiMeseeage.addActionListener(this);
		jmiConfirm.addActionListener(this);
		
		setSize(400,400);
		setVisible(true);
		
		addWindowListener(this);
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jmiInput) {
			useInput();
		}
		if(ae.getSource() == jmiMeseeage) {
			useMessage();
		}
		if(ae.getSource() == jmiConfirm) {
			useConfirm();
		}
	}
	private void useConfirm() {
		int flag = 
				JOptionPane.showConfirmDialog(this, "오늘 수업은여기까지 하겠습니다");
		System.out.println(flag);
		switch(flag) {
		case JOptionPane.OK_OPTION:
			JOptionPane.showMessageDialog(this, "감사.");
			break;
		case JOptionPane.NO_OPTION:			
			JOptionPane.showMessageDialog(this, "분노.");
			break;
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(this, "제발.");
			break;
		}
	}
	private void useMessage() {
		JOptionPane.showMessageDialog(this, "오늘은 울고싶은 날","정말로 울고싶은",JOptionPane.QUESTION_MESSAGE);
	}
	private void useInput() {
		String data = JOptionPane.showInputDialog("이름을 입력해주세요.","홍길동");
		if(data != null) {
			System.out.println(data);
		}
	}

	public static void main(String[] args) {
		new UseJOptionPan();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * window에 x버튼을누르면 windowClosing이 된다
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		int flag = JOptionPane.showConfirmDialog(this, "정말 종료할거야?");
		//예가 눌려지면 프로그램이 종료되어야하지만
		//아니오나 취소가 눌려지면 종료되지 말아야한다
		switch(flag) {
		case JOptionPane.OK_OPTION : dispose();
		}
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
