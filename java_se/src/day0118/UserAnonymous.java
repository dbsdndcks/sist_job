package day0118;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import day0116.Clark;

public class UserAnonymous{

	public void testFly(Fly fly) {
		System.out.println("추력 : " + fly.drivingForce());
		System.out.println("양력 : " +fly.lift());
	}
	
	public static void main(String[] args) {
		UserAnonymous anonymous = new UserAnonymous();
		
		
		anonymous.testFly(new FlyImpl());
		anonymous.testFly(new Clark());
		
		
		//클래스 파일(소스코드)를 별도로 만들지 않고, 객체를 생성하여 arguments값을 할당할 때
		Fly fly = new Fly() {
			
			@Override
			public String lift() {
				// TODO Auto-generated method stub
				return "허벅지에 힘을줘서";
			}
			
			@Override
			public String drivingForce() {
				// TODO Auto-generated method stub
				return "땅을 박차서";
			}
		};
		
		anonymous.testFly(fly);

	}

}
