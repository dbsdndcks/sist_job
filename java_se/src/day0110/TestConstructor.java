package day0110;
/**
 * 생성자 연습
 * 생성자는 직접 호출 불가능하고, new로만 가능
 */
public class TestConstructor {
	
	/**
	 * 기본 생성자 (매개변수없다)
	 */
	public TestConstructor() {
		System.out.println("Hellow World");
	}
	
	public TestConstructor(int num) {
		System.out.println("오버로딩된 생성자"); //생성자의 다형성
	}
	
	public void test() {
		System.out.println("test");
	}
	public void temp() {
		System.out.println("temp");
		test();
	}

	public static void main(String[] args) {
		TestConstructor constructor = new TestConstructor(); 
		constructor.temp();
		TestConstructor constructor2 = new TestConstructor(2024); 
		constructor2.temp();
	}

}
