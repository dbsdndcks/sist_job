package day0208;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class reSimpleClient {
	
	public void msgClient() throws IOException {
		DataOutputStream dos = null;
		Socket client = null;
			
		try {
			String str = "hi";
			client = new Socket("192.168.10.231" , 7771);
			dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF(str);
			dos.flush();
		}
		//8. 연결 끊기
		finally {
			if(dos != null) {dos.close();}
			if(client != null) {client.close();}
		}
	}
	
	public static void main(String[] args) {
		reSimpleClient sc = new reSimpleClient();
		try {
			sc.msgClient();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main
}
