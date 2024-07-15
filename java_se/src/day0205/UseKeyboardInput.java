package day0205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 키보드의 입력값 받기
 */
public class UseKeyboardInput {

	public UseKeyboardInput() throws IOException {
		System.out.println("아무키나 누르고 엔터");
		int readData = 0;

//		int readData = System.in.read();	
//		System.out.println("입력 값: " + readData);
//		while((readData = System.in.read()) != 13) {
//			System.out.println("입력 값: " + readData);
//			
//		}
		// 입력된 문자열이 그대로 출력되는 코드르 작성해 보세요.(한글을 출력할수 없다)
//		while((readData = System.in.read()) != 13) {
//		System.out.println((char)readData);
//		
//	}
		// 한글을 줄단위로 읽어서 보여줄 수 잇는 16비트 스트림의 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println(br.readLine());
		} finally {
			if (br != null) {
				br.close();
			}
		}//end finally

	}// UseKeyboardInput

	public static void main(String[] args) {
		try {
			new UseKeyboardInput();
		} catch (IOException e) {
			// 예외를 묶어서 처리 할 수 있다.
			e.printStackTrace();
		}

	}

}
