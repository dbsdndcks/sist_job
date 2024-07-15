package day0118;

public class LocalOutter {

	public LocalOutter() {
		System.out.println("바깥 클래스의 생성자");
	}
	
	public void test() {
		System.out.println("바깥 클래스의 method");
	}
	
	public void method(int paramI, final int paramJ) {
		int locI = 2;
		final int locJ = 15;
		
		class Local{
			int i;
			
			public Local() {
				System.out.println("지역클래스의 생성자");
			}
			public void inMethod() {
				System.out.println("지역클래스의 메서드");
				i = 18;
				System.out.println(i);
				test();
			}
			
		}
		Local local = new Local();
		local.inMethod();
		local.i = 10;
		System.out.println(local.i);
		
	}
	
	public static void main(String[] args) {
		LocalOutter outter = new LocalOutter();
		outter.method(2, 4);
	}

}
