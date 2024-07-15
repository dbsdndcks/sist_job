package day0117;

public class OverriderSuper {

	int i = 0;

	public OverriderSuper() {
		System.out.println("부모의 생성자");
	}
	
	public void test() {
		System.out.println("부모의 메서드");
	}
	
	/**
	 * final이 정의 method는 override를 막을 수 있다.
	 * 자식 클래스에서 부모클래스의 제공기능을 변경없이 그대로 사용해야할때.
	 */
	protected /*final*/ void printI() {
		System.out.println("부모의 printI" + i);
	}
}
// +/A-B C*D+E F
// (+(/A(-BC))(*D(+EF)))