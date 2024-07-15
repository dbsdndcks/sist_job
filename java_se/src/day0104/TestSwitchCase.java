package day0104;

public class TestSwitchCase {
/**
 * switch case : 일치하는 정수를 비교할 때 사용
 * 문법)
 * switch 변수명 
 * case 상수 : 변수가 상수와 일치 할 떄 수행문장을 수행
 * default : 변수가 일치하는 상수가 없을때 실행
 * 
 */
	
	public static void main(String[] args) {
		int i = 4;
		switch(i) {
		case 0: System.out.println("영");
		break;
		case 1: System.out.println("일");
		break;
		case 2: System.out.println("이");
		break;
		case 3: System.out.println("삼");
		break;
		default : System.out.println("변수와 일치하는 상수 없음");
		}
		
		int score = 95;
		char grade = '\u0000';
		
		switch(score/10) {
		case 10 :	
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default: grade = 'F'; 
		
			
		}
	}

}
