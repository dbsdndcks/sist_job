package day0104;
/**
 * 다양한 for의 형태
 * 
 * - 무한루프
 * for(초기값; ; 증.감소식)
 * for(; ;)
 */

public class TestFor3 {
	public static void main(String[] args) {
		
//		for(int i = 0; ; i++) {
//			if(i == 49) {
//				break;
//			}
//			System.out.print("김병년");
//		}

		
		for(int i=1 ; i<101 ; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
	}
}
