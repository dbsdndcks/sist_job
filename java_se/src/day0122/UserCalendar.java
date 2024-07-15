package day0122;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 단편적인 날짜 정보를 얻을때 사용
 */
public class UserCalendar {
	
	public UserCalendar() {
		//1.객체생성)
		//Calendar cal = new Calendar() : 추상클래스 이므로 직접 객체화 불가
		//static method인 getInstance()를 사용
		Calendar cal = Calendar.getInstance();
		//자식 클래스를 사용
		Calendar cal2 =new GregorianCalendar();
		
		//2.method사용
		//년 월 일등의 정보를 사용하려면 get() constant를 할당하여 얻는다
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("dd" + day);
		int day2 = cal.get(Calendar.DAY_OF_YEAR);
		int day3 = cal.get(Calendar.DAY_OF_WEEK);
		String[]arr = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일",};
		int amPm = cal.get(Calendar.AM_PM);	
		cal.set(Calendar.YEAR, 1998);
		cal.set(Calendar.MONTH, 5);
		//현재 월에 없는 일이 설정되면 다음 달 1일로 변경된다.
		cal.set(Calendar.DAY_OF_MONTH, 13);
		
		StringBuilder sb = new StringBuilder();
		sb.append(year).append("년 ");
		sb.append(month).append("월 ");
		sb.append(day).append("일 ");
		sb.append(day2).append("일 ");
		sb.append(arr[day3-1]);
		sb.append(amPm);
		System.out.println(sb);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
	public static void main(String[] args) {
		UserCalendar uc = new UserCalendar();
		
	
	}
}