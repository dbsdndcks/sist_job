package day1227;
/*
자동형변환 (promotion, demotion)
JVMd이 상황에 따라 크기를변경해 주는 것.
*/

class Promotion 
{
	public static void main(String[] args) 
	{
		byte num1 = 10; //-128~127
		byte num2 = 20;
		int result = 0; //byte 와 byte가 연산되어 저장될 공간은 promotion을 고려하여 int로 변수를 선언한다.  

		result = num1 + num2;

		System.out.println("num1 + num2 : " + result);


	}
}
