package day0103;
/*
 * 제시된 요금표를 사용하여 아래 출력 코드를 작성.
 * - 대중 교통수단과 이동거리를 입력받아 처리하는 프로그램을 제작.
 * 출력형식)
 * 
 * 입력한 대중 교통 수단이 마을버스,버스,지하철인 경우에만 아래의 출력형식으로 출력하고
 * 그렇지 않다면 대중교통 수단이아닙니다를 출력한다
 *
 * 입력하신 교통수단은 [XX]이고 , 이동거리는 [XX KM]입니다
 * 교통수단의 기본요금: [XX]원
 * 편도요금 [XX]원 - 10KM까지는 기본요금으로 처리, 그 이후부터는 5KM당 100원이 가산됨
 * 왕복요금 [XX]원
 * 한달 20일 기준 총 교통 요금은 [XX]원 입니다.
 * 
 * 
 *  --------요금표--------
 *  |   마을버스 : 1200	|
 *  |  	 버스 :1500		|
 *  |	지하철 : 1400		|
 * 	---------------------
 */

public class Homework {

	public static final int inCityBus = 1200;
	public static final int outCityBuse = 1500;
	public static final int substation = 1400;

	public static void main(String[] args) {

		String transfer = args[0];
		int distance = Integer.parseInt(args[1]);

		int onceMoney = 0;
		int monthTax = 0;
		int plusMoney = (distance - 10) / 5 * 100;

		if (transfer.equals("inCityBus")) {
			if (distance <= 10) {
				onceMoney = inCityBus;
				monthTax = (inCityBus * 2) * 30;
			}else {

				onceMoney = plusMoney + inCityBus;
				monthTax = onceMoney * 30;
			}

		} else if (transfer.equals("outCityBuse")) {
			if (distance <= 10) {
				onceMoney = inCityBus;
				monthTax = (inCityBus * 2) * 30;
			}else {
				onceMoney = plusMoney + outCityBuse;
				monthTax = onceMoney * 30;
			}

		} else if (transfer.equals("substation")) {
			if (distance <= 10) {
				onceMoney = inCityBus;
				monthTax = (inCityBus * 2) * 30;
			}else {
				onceMoney = plusMoney + substation;
				monthTax = onceMoney * 30;
			}
		}

	
		
		
		if (transfer.equals("inCityBus")) {
			System.out.println("입력하신 교통수단은 inCityBus 이고 이동거리는 " + distance + "KM입니다");
			System.out.println("기본요금 : " + inCityBus);
		} else if (transfer.equals("outCityBuse")) {
			System.out.println("입력하신 교통수단은 outCityBuse 이고 이동거리는 " + distance + "KM입니다");
			System.out.println("기본요금 : " + outCityBuse);
		} else if (transfer.equals("substation")) {
			System.out.println("입력하신 교통수단은 substation 이고 이동거리는 " + distance + "KM입니다");
			System.out.println("기본요금 : " + substation);
		}
		System.out.println("편도 요금 : " + onceMoney);
		System.out.println("왕복 요금 : " + onceMoney * 2);
		System.out.println("한달 기준 교통 요금은 " + monthTax + "입니다");
	}

}
