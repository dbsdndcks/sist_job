package day0110;

/**
 * polymorphsim
 * method overloading :  하나의 클래스 안에서 같은 이름의 method를 여러개 정의 하는 것. 
 * 접근 지정자와 반환형은 달라도 된다.
 */
public class TestOverloading {
	
	public static void star() {
		System.out.println("*");
	}
	public static void star(int num) {
		for(int i=0 ; i<num ; i++) {
			System.out.print("*");
		}
	}
	
	
	

	public static void main(String[] args) {
		star();
		star(20);
	}

}
