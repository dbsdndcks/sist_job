package day0208;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class TestURLEncoder {
	//TCP Protocal을 사용하면 영어,숫자,특수문자인 1byte charset에 대해서는
	//packet의 segment에 실려 전송되지만,  한글2~3byte 인
	
	
	public static void main(String[] args) {
		
		String str = "즐거운 설명절 되세요.";
		System.out.println("원본 : " + str);
		try {
			//3byte 의 한글을 Network로 내보내기 위해서
			String encode = URLEncoder.encode(str, "UTF-8");
			System.out.println("인코딩된 : " + encode);
			
			//알아 볼 수 없는 encdoe된 한글을 알아볼수 있게 재조합
			String decode = URLDecoder.decode(encode,"UTF-8");
			System.out.println("디코딩 : " + decode);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}//main

}//class
