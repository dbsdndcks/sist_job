package day0213;


/**
 * Runnable interface를 구현
 */
public class implementsRunnable implements Runnable{
	
	//2. run method를 오버라이드
	@Override
	public void run() {
		for(int i = 0; i <500 ; i++) {
			System.out.println("runt i  --->" + i );
		}//end for		
	}
	public void test() {
		for(int i = 0; i <500 ; i++) {
			System.out.println("test i  --->" + i );
		}//end for
	}//test

	public static void main(String[] args) {
		//4. 자식클래스 객체화
		implementsRunnable ir = new implementsRunnable();
		//5. Thread와 has a 관계로 객체화
		Thread t = new Thread(ir);
		//6, Thread의 start()를 호출하여 동시에 실행되어야할 코드를 정의
		t.start();
		ir.test();
	}
	
	
}
