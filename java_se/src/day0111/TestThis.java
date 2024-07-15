package day0111;

public class TestThis {

	int i;
	int j;
	public void setI(int i, TestThis test) {
		test.i = i;
	}
	public void setJ(int j) {
		System.out.println(this +"번지에서 호출");
		this.j = j;
	}
	
	public static void main(String[] args) {
		TestThis test = new TestThis();
		test.setI(2024,test);
		System.out.println(test.i);
		
		test.setJ(2036);
		System.out.println(test.j);
		System.out.println("================================");
		
		TestThis test2 = new TestThis();
		System.out.println(test2 +"의 주소");
		test2.setJ(1);
	}

}
