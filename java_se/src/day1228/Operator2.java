package day1228;
/*
산술 연산자 : +, -, *, /, %
정수 / 정수 = 정수

*/

class Operator2{
	public static void main(String[] args) 	{
		int i = 10;
		System.out.println(i + "를 2로 나눈 나머지 : " + (i % 2)); //0또는 1나옴
		System.out.println("\n");
		i = 11;
		System.out.println(i + "를 2로 나눈 나머지 : " + (i % 2)); //0또는 1나옴

		int birth = 1998;
		System.out.println(birth + "를 12로 나눈 나머지 : " + (birth % 12));


		int num1 = 10;
		int num2 = 3;
		System.out.println(num1 / num2);
		
		
		System.out.println(num1 / (double)num2);

		i <<= 4;

		System.out.println(i);
	}
}

