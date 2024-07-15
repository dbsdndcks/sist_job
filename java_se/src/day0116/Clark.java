package day0116;

import day0118.Fly;

public class Clark extends Person implements Fly{
	public int power;
	public Clark() {
		power = 10;
	}
	public String power(String stone) {
		String result="";
		if(stone.equals("다이아")) {
			result = "감사합니다";
			power = 10;
		}else if(stone.equals("크립토나이트")) {
			result = "힘빠짐...";
			power = 0;
		}else {
			result = "감사합니다";
			power = 12;
		}
		
		return result;
	}

	@Override
	public String eat() {
		return null;
	}
	@Override
	public String eat(String menu, int price) {
		return menu + price;
	}
	/**
	 * 슈퍼맨 객체가 날기위해 추진력을얻는 방법
	 */
	@Override
	public String drivingForce() {
		return "무릎을 꿇어서";
	}
	/**
	 * 슈퍼맨 객체가 날기위해 양력을 얻는 방법
	 */
	@Override
	public String lift() {
		return "망토를 사용하여";
	}
	
}
