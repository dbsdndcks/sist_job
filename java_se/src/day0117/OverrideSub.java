package day0117;

public class OverrideSub extends OverriderSuper {
	
	int j;
	
	public OverrideSub() {
		System.out.println("자식 클래스의 생성자");
	}
	public void temp() {
		System.out.println("자식의 메서드");
	}
	
	/**
	 * 오버라이드 규칙 : 접근지정자는 광의의 접근 지정자(protected - > public)로 달라도 되고, 반환형,메서드형,매개변수는 동일하게 만든다.
	 */
	@Override
	protected void printI() {
//		super.printI();
		System.out.println("자식 : " + j +" "+ i);
	}
	
	public static void main(String[] args) {
		//자식 클래스로 객체화 : 부모의 모든 자원과 자식의 모든 자원을 사용할 수 있다.
		//자식 클래스로 객체화
		OverrideSub os = new OverrideSub();
		os.i = 2024;
		os.j = 2012;
		os.test();
		os.printI();
		os.temp();
		
		System.out.println("===================================");
		//is a관계의 객체화 :
		OverriderSuper osp = new OverrideSub();
		osp.i = 12;
		osp.test();
		osp.printI();
	}
}
