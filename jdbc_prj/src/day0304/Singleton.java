package day0304;

/**
 * Singleton pattern이 도입된 클래스
 */
public class Singleton {
	
	private static Singleton singleton;
	
	//1. 클래스 외부에서 객체생성을 막기위해 생성자를 priavte으로 설정
	private Singleton(){
		
	}// Singleton
	
	// 2.instatnce 를 반환하는 method 작성
	public static Singleton getinstance() {
		//객체를 하나로 유지하면서 생성하는 코드 작성
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;		
	}//getinstance
}//class
