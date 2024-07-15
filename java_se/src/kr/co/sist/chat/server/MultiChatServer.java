package kr.co.sist.chat.server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class MultiChatServer extends JFrame implements ActionListener, Runnable{
	private JButton jbtnStartServer, jbtnclose;
	private DefaultListModel<String> dlmConnect;
	private JScrollPane jspConnectList;
	
	private Thread threadServer;
	
	private ServerSocket server;
	
	public static List<ChatHelper> listConnect;
	
	public MultiChatServer() {
		super("채팅서버");
		
		listConnect = new ArrayList<ChatHelper>(); //ChatHelper 객체가 동시접근 o
//		listConnect = new Vector<ChatHelper>(); //ChatHelper 객체가 동시접근x
		
		jbtnStartServer=new JButton("서버가동");
		jbtnclose=new JButton("서버종료");
		dlmConnect=new DefaultListModel<String>();
		JList<String> jlConnect=new JList<String>( dlmConnect );
		jspConnectList=new JScrollPane(jlConnect);
		
		jspConnectList.setBorder(new TitledBorder("접속자 리스트"));
		JPanel jpSouth=new JPanel();
		jpSouth.add(jbtnStartServer);
		jpSouth.add(jbtnclose);

		add("Center", jspConnectList);
		add("South", jpSouth);

		jbtnStartServer.addActionListener(this);
		jbtnclose.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				try {
					closeWin();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}// windowClosing
		});// addWindowListener

		setBounds(100, 100, 400, 700);
		setVisible(true);
	}// MultiChatServer

	public void closeWin() throws IOException {
		try {
			if (server != null) {
				server.close();
			} // end if
		} finally {
			dispose();
		} // end finally
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jbtnStartServer) {
			if(threadServer != null) {
				JOptionPane.showMessageDialog(this, "서버가 이미 가동 중입니다");
				return;
			}//end if
			
			threadServer = new Thread(this);
			threadServer.start(); // run()호출                                                        
			
		}// end if
		if(ae.getSource() == jbtnclose) {
			
		}//end if
	}//actionPerformed

	@Override
	public void run() {
		//윈도우 디자인과 소켓의 접속을 동시에 사용할 수 있게 된다.
		try {
			server = new ServerSocket(2024);
			dlmConnect.addElement("서버가 정상적으로 실행 되었습니다");
			Socket tempClient = null;
			ChatHelper tempCh = null;
			for(int cnt = 0 ; ;cnt++) {
				tempClient = server.accept();
				tempCh = new ChatHelper(tempClient, cnt, dlmConnect); //Thread
				listConnect.add(tempCh);
				tempCh.start(); //접속자가 보내오는 메시지를 무한루프로 읽는다. => run호출
				//서버창에 접속자 현황을 보여준다.
				dlmConnect.addElement(cnt + "번째로 접속자가 접속[" +tempClient.getInetAddress()+"]");
				//모든 접속자에게도 접속자 현황을 보여준다.
				tempCh.broadcast(cnt + "번째로 접속자가 접속");
			}
		}catch(IOException e){
			JOptionPane.showMessageDialog(this, "서버가동중 문제 발생");
			e.printStackTrace();
		}
	}//run
	
	
	
}
