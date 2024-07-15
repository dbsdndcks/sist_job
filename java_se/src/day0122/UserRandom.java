package day0122;

import java.util.Random;

public class UserRandom {
	public UserRandom() {
		Random random = new Random();
		Random random2 = new Random(random.nextLong());
		System.out.println(random.nextInt());
		System.out.println(random2.nextInt());
		System.out.println(random.nextDouble());
		System.out.println(random.nextDouble()*10);
		System.out.println((int)(random.nextDouble()*10));
		System.out.println(random.nextBoolean());
		
	}
	public static void main(String[] args) {
		new UserRandom();
	}
}
