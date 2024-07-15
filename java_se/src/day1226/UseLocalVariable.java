package day1226;
class UseLocalVariable{

	int i; //instance variable


	//main method: 클래스를 단독으로 실행 시켜야 할 때 정의하는 method
	//단독으로 실행가능한 프로그램 : java application
	
	public static void main(String[] args){

	int i;// Local variable
	
	//<지역변수>
	//1.선언:  데이터형 변수명;
		
		int maxScore ;
		int minScore ;
		String a;
		

	//2.값할당: 변수명 = 값;
 		maxScore = 100;		
		a = "abc";
		minScore = 80;
			
	//3.값사용: 출력
	
		System.out.println(maxScore);
		System.out.println(a);
		System.out.println(minScore);
		System.out.println("최고점수 : " + maxScore + " 최소점수 : " + minScore);
		System.out.println("점수차이 : " + (maxScore - minScore));
		System.out.println("\n===========================\n");

	//2.값할당: 변수명 = 값;

		maxScore = 200;			
		a = "abc";
		minScore = 150;
			
	//3.값사용: 출력
	
		System.out.println(maxScore);
		System.out.println(a);
		System.out.println(minScore);
		System.out.println("최고점수 : " + maxScore + " 최소점수 : " + minScore);
		System.out.println("점수차이 : " + (maxScore - minScore));
		System.out.println("\n===========================\n");

	//1.올해를 저장할 수 있는 변수를 선언하고 초기값으로 올해를 할당.
		int nowYear = 2023;
	//2.자신의 나이를 저장할 수 있는 변수를 선언하세요.
		int myAge;
	//3. 2번의 변수에 자신의 나이를 할당하세요.
		myAge = 26;
	//4. 두개의 변수를 사용하여 자신이 태어난 해를 출력.	
		int birthday = nowYear - myAge;
		System.out.println("제가 태어난 해는 "+ (birthday+1) + "입니다.");
	}
}