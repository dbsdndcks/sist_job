
package day1227;
/*
기본형 데이터 형 : 변수에 상수값을 저장하는 데이터 형.
*/

class PrimitiveDataType {
	public static void main(String[] args) 
	{
	 //정수 상수를 저장할 수 있는 데이터형//
	 byte a = 10; //byte = -128 ~ 127 
	 short b = 10;
	 int c = 10;
	 long d = 10;

	 //자신이 평생 모으고 싶은 현실적인 자산을 변수에 할당
	 long allMyMoney = 2147483648L;



	 System.out.println("내 돈은 " + allMyMoney + "만원 입니다.");

	 System.out.println("byte : " + a + ", short : " + b + "\nint : " + c + ", long : " + d);

	 //char형//
	 char e = 65;
	 char f = '0';
	 char g = '가';
	 char h = '\u0000'; //unucide 0
	 System.out.println("char : " + e + " " + f + " " + g + " " + h);
	 System.out.println("adfafasfadfa");

	//실수형//
	//float fl = 12.27; //실수의 리터럴은 8byte이고 float형은 4byte이기 때문에 크기가 같지않아서 값이 할당될 수 없다.
	float fo = 12.27F;
	double k = 2023.12d;

	System.out.println("float fo : " + fo + ", double k : " + k);
	
	//boolean//
	boolean yes = true;
	boolean no = false;

	System.out.println("boolean : " + yes + "|" + no);

	}//main
}//class
