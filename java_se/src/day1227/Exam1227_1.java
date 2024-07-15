package day1227;
class Exam1227 {
	public static void main(String[] args) {
		
		//출력 1
		char enitial1 = 'H';
		char enitial2 = 'G';
		char enitial3 = 'D';

		int birthYear = 1998;
		
		System.out.println("내 이름은 홍길동 이고 이니셜은 " + enitial1 + ", " + enitial2 + ", " + enitial3 + "입니다.\n태어난 해는 " + birthYear + "년으로\n나이는 " + ((2023 - birthYear)+1) + "살 입니다" );
		System.out.println();
		
		//출력 2
		double leftEye = 0.4;
		double rightEye = 0.3;

		System.out.println("외눈 시력 " + leftEye + " 오른 눈 시력 " + rightEye + " 이고 양안 시력 " + ((leftEye + rightEye)/2) + " 입니다" );
		System.out.println();	

		//출력 3	
		int onecPrice = 6000;
		int twicePrice = onecPrice * 2;
		System.out.println("편도차비 " + onecPrice + "원 왕복차비는 " + twicePrice + "원, 한달 20일 출근하면 월 교통비는 총 " + (twicePrice * 20) + " 원 입니다.");
		System.out.println();

		//출력 4
		char bigA = 'A';
		System.out.println("대문자 '" + bigA + "'의 Unicode 값은 65입니다. A에 32 더하면 소문자 '" + (char)(bigA + 32) + "'를 만들 수 있다." );
	}
}
