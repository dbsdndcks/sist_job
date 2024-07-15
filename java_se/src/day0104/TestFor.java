package day0104;
/**
 * for 문 : 시작과 끝을 알때 사용하는 반복문
 */
public class TestFor {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		
	    System.out.println("==================================");

		
		int cnt = 0;
		for(int i = 1; i < 101; i+=2) {
			cnt++;
			System.out.print(i + " ");			
		}
		System.out.println("반복횟수 : " + cnt);
		
		for(int i = 100; i > 0 ; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("==================================");

		
		for(int i = 1; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("==================================");
		int num = Integer.parseInt(args[0]);
		if(num > 1 && num < 10) {
			for(int i = 1; i < 10; i++) {
				System.out.println(num + " X " + i + " = " + (num*i));
			}
		}
		
		System.out.println("==================================");
		
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
	
		
	}

}
