package day0214;

import java.util.Random;

import javax.swing.plaf.synth.SynthScrollPaneUI;

//1. Runnable Interface를 구현
public class UseSleep implements Runnable {

	// 2. run method를 Override
	public void run() {
		// 3. Thread로 처리할 코드 정의 (동시에 실행 되어야할 코드)
		System.out.print("loading");
		try {
			Random r = new Random();
			for (int i = 0; i < 15; i++) {
				System.out.print(" . ");
				Thread.sleep(r.nextInt(10)*100);
			} // end for
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//end catch
		System.out.println(" finish");
	}// run

	public static void main(String[] args) {
		// 4. 자식클래스를 객체화
		UseSleep us = new UseSleep();
		// 5. Thread와 has a
		Thread t = new Thread(us);
		// 6. start() 호출
		t.start();
	}// main

}// class
