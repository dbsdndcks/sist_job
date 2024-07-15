package day0119;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UserSimpleDateFormat {
	public UserSimpleDateFormat() {
		//1.객체생성
		SimpleDateFormat sdf = new SimpleDateFormat("y-MMM-dd a HH(KK,kk,hh):mm:s EEEE",Locale.JAPAN);
		//2.method호출
		System.out.println(sdf.format(new Date()));
	}
	
	
	
	public static void main(String[] args) {
		new UserSimpleDateFormat();
		
	}
	
}
