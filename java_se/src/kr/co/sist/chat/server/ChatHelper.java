package kr.co.sist.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * 1. 서버에서 소켓을 전달바아
 * 2. 대화를 읽고, 쓰기위한 스트림을 연결하고 
 * 3. 대화를 무한루프로 읽어 들여
 * 4. 모든 접속자에게 출력하는 일
 */
public class ChatHelper extends Thread {
	private Socket someClient;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;
	private int cnt;
	private DefaultListModel<String>dlmConnect;
	private String connIp;
	
	public ChatHelper(Socket someClient, int cnt, DefaultListModel<String> dlmConnect) throws IOException {
		this.someClient = someClient;
		this.cnt = cnt;
		this.dlmConnect = dlmConnect;
		connIp = someClient.getInetAddress().toString();// 접속자 ip를 저장
		//소켓에서 읽기 스트림 연결
		disReadStream = new DataInputStream(someClient.getInputStream());
		//소켓에서 쓰기 스트림 연결
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());
		
	}//ChatHelper
	
	@Override
	public void run() {
		//대화를 읽어 들여 모든 접속자에게 출력하는 일
		String revMsg;
		try {
		while(true) {
			revMsg = disReadStream.readUTF();
			broadcast(revMsg);
		}//end while
		}catch(IOException ie){ //메시지를 읽다가 못 읽는 상태 => 접속자가 종료 했음
			dlmConnect.addElement(cnt + "번 째 접속자가 접속을 종료하였습니다");
			try {
				if(someClient != null) {
					someClient.close();
				}
				//나를 제외한
				MultiChatServer.listConnect.remove(this); 
				//모든 접속자에게 메시지 보내자
				broadcast(cnt + "번 째 접속자가 접속을 종료하였습니다");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}//run
	
	/**
	 * 모든 접속자에게 메시지를 보내는 method
	 * @param msg
	 * @throws IOException 
	 */
	public void broadcast(String msg) throws IOException {
		for(ChatHelper ch : MultiChatServer.listConnect) {
			ch.dosWriteStream.writeUTF(msg);
			ch.dosWriteStream.flush();
		}
	}//broadcast
}//class
