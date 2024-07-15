package day1227;
class Exam1227_1 {
	
	public static final int MONTH_MOENY = 500000;
	public static final int ONCE_TRANSPORTATION_PRICE = 3000;

	public static void main(String[] args) {
		

		//출력1
		int lunchPrice = 5000;

		System.out.println("한달 용돈은 " + MONTH_MOENY + "원 하루 용돈은 20일 기준으로 " + (MONTH_MOENY/20) + "원 입니다.\n하루 지출은 편도 교통비 " + ONCE_TRANSPORTATION_PRICE + "원 왕복교통비 "
		+ (ONCE_TRANSPORTATION_PRICE*2) + "원 점심 식대 " + lunchPrice + "원으로 총 " + ((ONCE_TRANSPORTATION_PRICE*2)+lunchPrice) + "원이 지출됩니다.\n");

		System.out.println("한달이 지나면 잔액은 " + (MONTH_MOENY - (((ONCE_TRANSPORTATION_PRICE*2)+lunchPrice)*20)) + "원 입니다.\n");

		//출력 2
		System.out.println("Byte 최소값: " + Byte.MIN_VALUE + " 최대값 : " + Byte.MAX_VALUE);
		System.out.println("Short 최소값: " + Short.MIN_VALUE + " 최대값 : " + Short.MAX_VALUE);
		System.out.println("Integer 최소값: " + Integer.MIN_VALUE + " 최대값 : " + Integer.MAX_VALUE);
		System.out.println("Long 최소값: " + Long.MIN_VALUE + " 최대값 : " + Long.MAX_VALUE);
		System.out.println("Float 최소값: " + Float.MIN_VALUE + " 최대값 : " + Float.MAX_VALUE);
		System.out.println("Double 최소값: " + Double.MIN_VALUE + " 최대값 : " + Double.MAX_VALUE);
		
		
		
	}
}
