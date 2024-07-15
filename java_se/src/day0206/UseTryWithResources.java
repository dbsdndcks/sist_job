package day0206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTryWithResources {

	public UseTryWithResources() {
		//키보드의 입력값을 줄단위로 읽
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			System.out.println("아무키나누르고 엔터");
			String readData = br.readLine();
			System.out.println(readData);
		} catch(IOException ie) {
			ie.printStackTrace();
			}
		
	}
	//try ~ with ~resources 는  static 인 stream(INT,OUT.ERR)을 사용하지 않는다.	
	
	
	public static void main(String[] args) {
			new UseTryWithResources();
	}

}
