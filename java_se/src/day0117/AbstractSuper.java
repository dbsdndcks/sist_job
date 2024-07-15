package day0117;

public abstract class AbstractSuper {
	
	public AbstractSuper() {
		super();
		System.out.println("부모의 기본 생성자");
	}
	
	public void test() {
		System.out.println("일반 메서드");
	}
	
	public abstract String msg();
	public abstract String msg(String msg);
//	public static void main(String[] args) {
//		new AbstractSuper(); //직접 객체화 될 수 없음
//	}
}
