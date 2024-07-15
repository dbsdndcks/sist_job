package day0117;
/**
 * 추상 클래스를 구현한 클래스
 * 부모 클래스의 모든 abstract method를 override해야한다.
 */
public class AbstractSub extends AbstractSuper{

	public AbstractSub() {
		System.out.println("자식의 생성자");
	}
	
	@Override
	public String msg() {
		return "Override한 method!!";
	}

	@Override
	public String msg(String msg) {
		return msg+" 입니다";
	}
	
	public static void main(String[] args) {
		AbstractSub sub = new AbstractSub();
		System.out.println(sub.msg());
		System.out.println(sub.msg("기울어진 마라탕")); 
	}

}
