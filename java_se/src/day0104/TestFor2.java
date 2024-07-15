package day0104;
/**
 * 다중 for : 인덱스를 두개 사용하여 반복해야할때
 * 문법
 * for(초기값 ; 조건식; 증.감소식){
 * 		반복수행문장
 * 	for(초기값 ; 조건식; 증.감소식)
 * 		반복수행문장
 * }
 * 	
 */

public class TestFor2 {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			System.out.println("---------");
			System.out.println("   "+ i + "단");
			System.out.println("---------");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j) );
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(i + " " + j + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = i+1; j <= 5; j++) {
				System.out.print(i + " " + j + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		int num = 1;
		for(int i = 1; i < 5; i++) {
			for(int j = 0; j <i+1; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

}
