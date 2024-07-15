package day0122;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class TimePackage3 {

	public TimePackage3() {
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt1 = LocalDateTime.of(2024,1,23,0,0);
		LocalDateTime ldt2 = LocalDateTime.now();
		ldt = ldt.withYear(2030);
		ldt = ldt.withMonth(5);
		
		System.out.println(ldt);
		System.out.println(ldt1);
		System.out.println(ldt2);
		System.out.println(ldt.isAfter(ldt2));
		
		LocalDate a = LocalDate.of(2022, 1,1);
		LocalDate b = LocalDate.of(2023, 1,22);
		
		Period p = Period.between(a,b);
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
	}
	
	public static void main(String[] args) {
		new TimePackage3();
	}
}
