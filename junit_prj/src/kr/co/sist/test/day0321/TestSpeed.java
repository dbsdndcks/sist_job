package kr.co.sist.test.day0321;

public class TestSpeed {

	public int work() {
		int sum = 0;
		long st = System.currentTimeMillis();
		for(int i=0 ; i<500 ; i++) {
			System.out.println(i); // 프로그램의 실행 속도 영향을 주는 디버그코드
			sum += i;
		}
		long et = System.currentTimeMillis();
		System.out.println((et-st)+"ms");
		return sum;
	}
	
	public static void main(String[] args) {
		TestSpeed ts = new TestSpeed();
		System.out.println(ts.work());
	}

}
