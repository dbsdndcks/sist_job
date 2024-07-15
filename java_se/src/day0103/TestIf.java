package day0103;
/**
 *  단일 if) 조건이 맞을 때에만 코드를 실행해야 하는 경우
 *  문법)
 *  if(조건식){ 조건에 맞을 때 수행할 문장들...}
 */
public class TestIf {

	public static void main(String[] args) {
		//임의의 수의 절대값을 구하여 출력.
		int num = -12;
		int abs = num;
		
		if(num < 0) {
			//임의의 수가 0보다 작으면 음수 이므로 true발생하고 if 탄다
			abs = -num;
		}System.out.println(num + "의 절대값 : " + abs);
		
		//문자열의 비교는 같은지만 비교할 수 있고, 관계연산자를 사용하는 것이 아닌 equals 메소드를 이용한다.
		System.out.println("equlas 문자열 비교 : " + args[0].equals("-48"));
		
		//main method에 두번째 입력된 argument는 성별(여자,남자)이다.
		//프로그램의 출력은 출입문 입장 > 여자인 경우  "수건 2장 지급" > 목욕탕입실의 
		//순서로 출력되도록 만들어라
		System.out.println("출입문 입장");
		if(args[1].equals("여자")) {
			System.out.println("수건 2장 지급");
		}else if(args[1].equals("남자")) {
			System.out.println("수건 1장 지급");		
		}else {
			System.out.println("ERROR");
		}
		System.out.println("목욕탕 입실");
		
		//실수 비교
		//사람이 활동하기 좋은 날씨는 25.0~30.0도 이다. 이온도일때만 "출력하자"
		double tem = 26.0;
		if(25.0 < tem && tem <= 30.0) {
			System.out.println("좋은 날씨 입니다~ ~(^^~)(~^^)~");
		}
		
		//문자 비교
		//char의 변수에는 임의의 문자가 드러있다 해당 문자가 대문자일때만 출력해보자
		char temp = 'a';
		if(temp < 97 && temp > 64) {
			System.out.println(temp);
		}
		
	}

}
