package day0118;

/**
 * 구현 클래스가 반드시 구현해야할 일의 목록을 정의할 때 사용
 * 상수, 추상메서드 
 */
public interface SuperInter {
//	int i; 인스턴스 변수는 선언할 수 없다.
//	public superinter() 생성자를 가질 수 없다. => 객체화 될 수 없다.
//	pubic void test() 일반 메서드를 가질 수 없다
	public static final int MAX = 100; //객체 크기에 영향을 주지 않는다
	public abstract String toDay();
}
