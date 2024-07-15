package day0111;

/**
 * this를 사용한 클래스내 다른 생성자호출.
 */

public class ThisConstructor {
	
	public ThisConstructor() {
//		this(11);
		System.out.println("기본생성자");
	}
	public ThisConstructor(int i) {
		this();//생성자의 첫번째 줄에서만 사용할 수 있다.
		System.out.println("매개변수있는 생성자 " + i);
	}

	public static void main(String[] args) {
		new ThisConstructor();
	}

}
