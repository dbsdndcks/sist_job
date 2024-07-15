package day0119;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 날짜 관련 클래스 :
 * 자바에서 유일하게 날짜 정보를 얻을 수 있는 클래스는 System 클래스하고 
 * curretntimeliilos를 사용하여 시간을 반환
 */
public class UserDate {
	
	public UserDate() {
		//1.생성
		Date d = new Date();
		System.out.println(d);
		
	}

	
	public static void main(String[] args) {
//		long l = System.currentTimeMillis();
//		System.out.println(l);
//		Date date = new Date(l);
//		System.out.println(date);
		new UserDate();
		SimpleDateFormat format = new SimpleDateFormat();
		System.out.println(format.format(new Date()));
	}
}
