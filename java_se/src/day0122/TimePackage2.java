package day0122;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimePackage2 {
	
	//formatter 클래스 생성
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a EEEE",Locale.KOREA);

	public void useDate() {
		LocalDate ld = LocalDate.now();
		System.out.println(ld.getYear() + " " + ld.getMonth() + " " + ld.getDayOfWeek() + " " + ld.getDayOfWeek().getValue());
	}
	public void useTime() {
		LocalTime lt = LocalTime.now();		
		System.out.println(lt.getHour() + " " + lt.getMinute() + " " + lt.getSecond());

	}
	public void useDateTime() {		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.getYear() + " " + ldt.format(dtf) + " " + ldt.getDayOfMonth());

	}
	
	public static void main(String[] args) {
		TimePackage2 tp = new TimePackage2();
		System.out.println("------------LocalDate-------------"); 
		tp.useDate();
		System.out.println("------------LocalTime-------------"); 
		tp.useTime();
		System.out.println("------------LocalDateTime-------------"); 
		tp.useDateTime();
	}

}
