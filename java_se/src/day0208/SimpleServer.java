package day0208;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public void msgServer() throws IOException {
		//1. 서버소켓 생성
		ServerSocket server = null;
		Socket client = null;
		DataOutputStream dos = null;
		try {
			server = new ServerSocket(7770);
			String msg = "안녕하세요 소림마라 서버입니다.마라샹궈 소고기 푸주 건두부 추가";
			while(true) {
			//3. 접속자 소켓을 받는다.
			client = server.accept();
			
			//4. 메시지를 보내기 위한 스트림 소켓에서 얻는다.
			dos = new DataOutputStream(client.getOutputStream());
			//5. 스트림에 메시지 쓰기
			dos.writeUTF(msg);
			//6. 목적지(socket)로 스트림의 내용을 분출
			dos.flush();
			}
		}
		finally {
			//7. 연결 끊기
			if(dos != null) {dos.close();}
			if(client != null) {client.close();}
			if(server != null) {server.close();}
		}//end finally
	}//msgServer
	
	public static void main(String[] args) {
		SimpleServer ss = new SimpleServer();
		try {
			ss.msgServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
