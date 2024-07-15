package day0118;

import java.util.Random;

/**
 * java.lang.Math 클래스 사용
 * 객체사용을하지않고 제공되는 기능을 사용하는 클래스
 */
public class UseMath {
	
	public UseMath() {
		double num = Math.random();
		System.out.println((int)(num*10));
		System.out.println((int)(num*10+1));
		System.out.println(num);
		char[] randomUpperCase = new char[8];
		for(int i=0 ; i<randomUpperCase.length ; i++) {
			randomUpperCase[i] = (char)(Math.random()*26+65);
		}
		System.out.println(randomUpperCase);
	
	}
 
	public static void main(String[] args) {
		new UseMath();
	}
}
