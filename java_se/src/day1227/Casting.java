
package day1227;


class Casting {
	public static void main(String[] args) {
		
		double d = 2023.12;
		
		//int i = d; 크기와 값의 종류가 다르므로 error발생
		//casting 문법 : (변환할 데이터형)값;
		int i = (int)d;
		System.out.println("원본 값 " + d + ", 바뀐 값 " + i);
	 
		float f = (float)1.2342342234; //리터럴으 ㅣ값을 4byte로 변화하여 할당
		System.out.println(f);

		byte num1 = 10; 
		byte num2 = 20;
		byte result = 0;   

		result = (byte)(num1 + num2);

		System.out.println("num1 + num2 : " + result);

		char c = 'A';
		System.out.println(c + " 의 유니코드는 " + (int)c);

		//boolean은 boolean으로만 캐스팅이 가능하다.
		boolean b = true;
		boolean b1 = (boolean)b; //아무 의미가 없다.
		System.out.println(b +" ," + b1);
	
		//기본형을 참조형으로, 참조형을 기본형으로는 casting 불가.
		/*int toDay = 27; -기본형
		String strToday = (int)toDay - 참조형
		*/
		/*
		String strToday = "27"; -참조형
		int intToday = (String)strToday - 기본형
		*/

	
	}
}

