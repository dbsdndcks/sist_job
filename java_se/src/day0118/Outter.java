package day0118;

import java.awt.im.spi.InputMethod;

/**
 * inner class : 디자인 클래스 안에서 이벤트를 처리할 때 사용
 */
public class Outter {
	int outI;
	
	public Outter() {
		System.out.println("바깥 클래스의 생성자");
	}
	
	public void outMethod() {
//		intI = 안쪽클래스의 자원 사용 불가
//		inMethod();
		System.out.println("바깥 클래스의 메서드");
		Outter.Inner in = this.new Inner();
		Outter.Inner in2 = new Inner(); // this생략가능
		in.inI = 11;
		in2.inMethod();
		in.inMethod();
	}
	///////////////////////////////////////Inner 클래스 시작////////////////////////////////
	
	public class Inner{
		int inI;
		public Inner() {
			System.out.println("안쪽 클래스의 생성자");
		}
		
		public void inMethod() {
			System.out.println("안쪽 클래스의 메서드");
		}
	}
	

	public static void main(String[] args) {
		//바깥 클래스의 객체화
		Outter outter = new Outter();
		//안쪽 클래스의 객체화 : 바깥클래스명.아쪽클래스명 객체명 = 바깥클래스객체명.new 안쪽생성자();
		Outter.Inner in = outter.new Inner();
		outter.outI = 12;
		outter.outMethod();
		in.inMethod();
		
		System.out.println(outter.outI);
		System.out.println(in.inI);
		
	}
}
