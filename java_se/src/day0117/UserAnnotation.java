package day0117;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAnnotation {
	
	
	@Deprecated
	public void test() {
		System.out.println("오늘은 수요일입니다");
		Date date = new Date();
		System.out.println(date.getYear()+1900);
	}
	
	@SuppressWarnings({"unused","rawtypes"})
	public void test2() {
		int day;
		int j;
		int k;
		
		List list = new ArrayList();
	}
	
	public String toString() {
		return "생성된 객체의 주소가 아닌 메세지";
	}
	
	public static void main(String[] args) {
		UserAnnotation annotation = new UserAnnotation();
		annotation.test();
		Date d = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		
		System.out.println(dateFormat);
		System.out.println(annotation);//tostring을 오버라이드 하면 내가원하는 메서드 가됨
		System.out.println(d);
	}
}
