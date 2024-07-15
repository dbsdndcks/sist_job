package day0102;

public class Work0102 {

	public static void main(String[] args) {
		//문제 1.
		//1-1. 두정수를 저장 할 수 있는 변수를 만들고, 임의의 값을 할당한다.
		int num1 = 10;
		int num2 = 5;
		//1-2. 위의 변수 중의 큰 값을 반환하는 삼항 연산자를 만들어보세요.
		System.out.println(num1 > num2 ? num1 : num2);
		
		//문제 2.
		//1-1. 세걔의 정수를 저장할 수 있는 변수를 만들고, 각각의 변수의 임의의 값을 할당한다.
		int i = 10;
		int j = 10;
		int k = 5;
		System.out.println((i <= j)&&(i <= k) ? i 
				: (j <= i )&&(j <= k) ? j 
				: k 
				);
		//1-2. 세걔의 숫자중 가장 작은 값을 찾아서 출력하는 코드를 만들어 보세요.
		
		//문제 3.
		//int temp1 = 10, tem2 = 20이 할당된 변수를 선언하고 아래 코드를 작성했을 때 어떤 값이 출력
		//되는지 예상해보고 어떻게 그런 결과가 나왔는지 주석을 열고 간단히 작성
		
		int temp1 = 10, temp2 = 20;
		System.out.println(++temp1 + temp2--); //31
		System.out.println("temp1 : " + temp1 + " temp2 : " + temp2); //11,19
		
		//문제4.
//		Integer.MAX_VALUE Constant를 사용하여 integer의 하위 2Byte값이 출력되도록 비트논리 연산자를 사용하여 출력해보세요 결과(65535가나와야함)
		System.out.println(Integer.MAX_VALUE & 65535);
		System.out.println(Integer.MAX_VALUE ^ 2147418112);
	}

}
