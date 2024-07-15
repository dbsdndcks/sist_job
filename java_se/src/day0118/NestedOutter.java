package day0118;

/**
 * nested class
 * 안쪽 클래스를 static 변수처럼 사용할 때 (객체화 없이 직접 사용할 때)
 */
public class NestedOutter {
	
	int outI;
	static int outJ;

	public NestedOutter() {
		System.out.println("바깥 클래스 생성자");
	}
	public void outInsMethod() {
		System.out.println("바깥 클래스 인스턴트 메서드");
	}
	public static void outStaMethod() {
		System.out.println("바깥 클래스 인스턴트 메서드");
	}
	/////////nested 클래스 시작///////////////
	static class Inner{
		//변수나 메서드는 static으로 만들어 객체없이 사용하도록한다.
		static int inI;
		
		static public void inMehtod() {
			System.out.println("안쪽 클래스 메서드");
//			outi = 10; 인스턴스 영억의 변수는 사용할 수 없다.
			outJ = 10;
		}
	}
	/////////nested 클래스 끝///////////////
	
	public static void main(String[] args) {
		Inner.inMehtod();
		outJ = 100000;
		System.out.println(outJ);
		
		
//		System.out.println(outi); 객체생성안해서 불가
		Outter outter = new Outter();
		outter.outI = 303003;
		System.out.println(outter.outI); //객체생성후 사용가능
	}

}
