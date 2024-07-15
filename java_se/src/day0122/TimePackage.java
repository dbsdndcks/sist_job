package day0122;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * jdk1.8에서 지원하는 날짜 관련 클래스
 */
public class TimePackage {
	
	public TimePackage() {
		StringBuilder sb = new StringBuilder();
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.of(2024,3,14,15, 1);
		
		sb.append(ld).append(" ").append(lt).append(" ").append(ldt);
		
		System.out.println(sb);
	}

	public static void main(String[] args) {
		new TimePackage();
	}

}
