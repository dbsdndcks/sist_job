package day0129;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class HomeWork extends JFrame{
		private JTextField jtfId;
		private JPasswordField jtfPassword;
		private JLabel jtfResult;
		private Map<String, String>login;
		
	public HomeWork() {
		super("숙제");
		addComponent();
		keyBoardIdAction();
		keyBoardPasswordAction();
		
		login = new HashMap<String, String>();
		login.put("root", "1234");
		login.put("admin", "password");
		login.put("temp", "q1w2e3r4");
		
		//종료
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				//안쪽 클래스에서는 외부 클래스의 자원을 마음대로 사용할 수 있다.
				dispose();
			}		
		});

	}
	
	//컴포넌트 추가,설정
	public void addComponent() {
		jtfId = new JTextField();
		jtfPassword = new JPasswordField();
		jtfResult = new JLabel();
		
		jtfId.setBorder(new TitledBorder("아이디"));
		jtfPassword.setBorder(new TitledBorder("비밀번호"));
		jtfResult.setBorder(new TitledBorder("결과"));
		
		
		jtfId.setBounds(20,20,340,80);
		jtfPassword.setBounds(20,140,340,80);
		jtfResult.setBounds(20,260,340,80);
		

		
		add(jtfId);
		add(jtfPassword);
		add(jtfResult);	
		
		
		setLayout(null);
		setSize(400,400);
		setVisible(true);
				
	}
	
	public void keyBoardIdAction() {
		jtfId.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent ke) {				
				int code = ke.getKeyCode();	
				if(code == KeyEvent.VK_ENTER && !jtfId.getText().isEmpty()) {
                        jtfPassword.requestFocus();
				}
			}

		});
	}
	public void keyBoardPasswordAction() {
	        jtfPassword.addKeyListener(new KeyAdapter() {
	            @Override
	            public void keyPressed(KeyEvent ke) {
	                int code = ke.getKeyCode();
	                String id = jtfId.getText().trim();
	                if (code == KeyEvent.VK_ENTER && !id.isEmpty()) {
	                	if(login.containsKey(id) && login.get(id).equals( String.valueOf(jtfPassword.getPassword()))) {
	                		jtfResult.setForeground(Color.blue);
	                		jtfResult.setText(id+"님 로그인 성공");
	                	}else {
	                		jtfResult.setForeground(Color.red);
	                		jtfResult.setText("로그인 실패");

	                	}
	                }
	            }
	        });
	    }
	 public static void main(String[] args) {
		new HomeWork();
	}
}