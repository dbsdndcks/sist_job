package day0208;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class reSimpleServer {
	
		public void msgServer() throws IOException {
			//1. 서버소켓 생성
			ServerSocket server = null;
			Socket client = null;
			DataInputStream dis = null;
			try {
				server = new ServerSocket(7771);
				while(true) {
				//3. 접속자 소켓을 받는다.
				client = server.accept();
				
				dis = new DataInputStream(client.getInputStream());
				String msg = dis.readUTF();
				JOptionPane.showMessageDialog(null, "친구가 너에게 해주은 말" + msg);
				}
			}
			finally {
				//7. 연결 끊기
				if(dis != null) {dis.close();}
				if(client != null) {client.close();}
				if(server != null) {server.close();}
			}//end finally
		}//msgServer
		
		public static void main(String[] args) {
			reSimpleServer ss = new reSimpleServer();
			try {
				ss.msgServer();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//main
}
