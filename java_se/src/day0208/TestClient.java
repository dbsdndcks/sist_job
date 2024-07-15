package day0208;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 소켓을 생성하여 서버에 연결 하는일 
 */
public class TestClient {
	
	public TestClient() throws UnknownHostException, IOException {
		Socket client = new Socket("192.168.10.232",36000);
		System.out.println("서버 연결에 성공");
	}
	
	public static void main(String[] args) {
		try {
			new TestClient();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
