package day0122;

public class UserDayEnum {
	
	public static void main(String[] args) {
		//Day enum의 모든 값
		for(Day day : Day.values()) {
			System.out.println(day);
		}
		System.out.println("============================");
		System.out.println(Day.MON);
		System.out.println(Day.MON.ordinal());
	}

}
