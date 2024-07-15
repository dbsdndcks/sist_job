package day0122;

import java.text.DecimalFormat;

public class UserDecimalFormat {

	public UserDecimalFormat() {
		int i = 9_750_000; //jdk1.7부터는 숫자의 가독성을 향상시키기 위해서 숫자에 _ 를 넣게 허용해줌
		System.out.println(i); //_는 출력이 되지 않는다.
	
		DecimalFormat df = new DecimalFormat("0,000,000");
		System.out.println(df.format(2024));
		DecimalFormat df1 = new DecimalFormat("#,###,###");
		System.out.println(df1.format(2024));
		DecimalFormat df2 = new DecimalFormat("#,###,###.00");
		System.out.println(df2.format(2024.0122));
		DecimalFormat df3 = new DecimalFormat("#,###");
		System.out.println(df3.format(2147483647));
	}
	public static void main(String[] args) {
		new UserDecimalFormat();
	}
}
