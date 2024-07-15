package day0214;

import java.util.Calendar;

public class UseLamda extends Thread{
	
	
	
	@Override
	public void run() {
		for(int i = 1; i <11 ; i++) {
			System.out.println(i);
		}//end for
	}//run

	public static void main(String[] args) {
		
		//람다식을 사용하면 class파일을 생성하지 않고, 인터페이스를 쉽게 사용할수있다
		
		//반환형 없고, 매개변수 없는 형
		Test t = () -> {
			int day = 14;
			System.out.println("반환형 없고, 매개변수 없는 형");
			System.out.println(day + "일");
			};
			
		//호출
		t.temp();
		
		System.out.println("------------------------------------------");
		//반환형 없고, 매개변수 있는 형
		Test2 t2= (int age, String name) -> {
			int nowYear = Calendar.getInstance().get(Calendar.YEAR);
			System.out.println(name + "님 나이 : " + age + "살 " + (nowYear - age));
		};
		t2.temp(20, "윤웅찬");
		
		System.out.println("------------------------------------------");
		//반환형 있고, 매개변수 없는 형
		Test3 t3 = () -> {
			String name = "김병년";
			return name;
		};
		String name = t3.temp();
		System.out.println(name);
		
		System.out.println("------------------------------------------");
		//반환형 있고, 매개변수 있는 형
		Test4 t4 = (int age2 ,String name2) ->{
			String grade = "평민";
			if(name2.equals("윤웅찬")) {
				grade = "반장";
			}//end if
			
			
			return grade + " " + name2 + "님 나이는 " + age2 +"살";
		};
		//호출
		String result = t4.temp( 20,"윤웅찬");
		System.out.println(result);
		
		String result2 = t4.temp( 20,"김병년");
		System.out.println(result2);
		
		//1~10까지 Thread를 사용해서 출력하는 코드를 람다식으로 작성해보시오
		Runnable r = () -> {
			for(int i=0 ; i < 500 ; i++) {
				System.out.println("run :  " +i);
			}
		};

		Thread tr = new Thread(r);
		tr.start();
		
		for(int i=0 ; i < 500; i++) {
			System.out.println(i);
		}
		
	}//main

}//class
