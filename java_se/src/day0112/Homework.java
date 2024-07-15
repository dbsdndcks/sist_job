package day0112;

import day0103.TestElseIf;

public class Homework {
	private String jumin;
	String str = "";
	char ch;
	
	//constructor
	public Homework(String jumin) {
		this.jumin = jumin;
	}
	
	//getter
	public String getJumin() {
		return jumin;
	}
	//setter
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
	//14자리 검사
	public boolean checkCount() {
		if(jumin.length() == 14) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//7번쨰 자리하이픈인지
	public boolean checkIndex() {
		if(jumin.indexOf("-") == 6) {
			return true;
		}else {
			return false;
		}
	}
	
	//생년월일 반환
	public String birthDay() {
		str = jumin.substring(0,6);
		String birthStr = jumin.substring(0,2);
		ch = jumin.charAt(7);
		int birth = Integer.parseInt(birthStr);
		int year = 0;
		if(ch == '1' || ch == '2' || ch == '5' || ch == '6') {
			year = 1900;
		}else if(ch == '3' || ch == '4' || ch == '7' || ch == '8') {
			year = 2000;
		}else {
			year = 1800;
		}
		
		str = (birth+year) + "년 " + str.substring(2,4) + "월 " + str.substring(4,6)+"일" ;
		return str;
	}
	//성별 메소드
	public String checkSex() {
		str = jumin.substring(7);
		if(str.equals("2")) {
			return "WOMEN";			
		}else {
			return "MEN";
		}
	}
	
	//나이반환 메소드
	public int checkAge() {
		str = jumin.substring(0,2);
		int birth = 0;
		if(jumin.charAt(0) == '0'){
			birth = Integer.parseInt(str)+2000;
		}else {
			birth = Integer.parseInt(str)+1900;
		}
		int age = 2024-birth+1;
		return age;
	}
	
	public String checkAnimal() {
		TestElseIf zodiac = new TestElseIf();
		str = jumin.substring(0,2);
		int birthYear = Integer.parseInt(str)+1900;
		return zodiac.animal(birthYear);
		
	}
	

	public static void main(String[] args) {
		String ssn = "980513-1411112";
		Homework homework = new Homework(ssn);
		if(homework.checkCount()) {
			if(homework.checkIndex()) {
				System.out.println(homework.birthDay());
				System.out.println(homework.checkAge());
				System.out.println(homework.checkSex());
				System.out.println(homework.checkAnimal());
			}else{
				System.out.println("7번쨰 자리가 올바르지않음");
			}
		}else {
			System.out.println("주민번호 자릿수가 잘못되었음");
		}
	}
 

}

