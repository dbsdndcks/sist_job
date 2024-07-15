
package day1227;
/*
Constant : 변수를 상수처럼 사용할 때 사용.
*/
class ConstantTest {
	
	//Constant의 정의 : constant는 값을 변경할 수 없다.
	public static final int MAX_SCORE = 100;
	
	public static void main(String[] args) {


		int myScore = 80;
		
		System.out.println("최고점수와 획득 점수간의 차 : " + (MAX_SCORE - myScore));
	}
}
