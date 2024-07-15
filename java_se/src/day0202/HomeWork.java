package day0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {
	
	
	
	public static void main(String[] args) throws home, NumberFormatException, IOException {
		HomeWork hm = new HomeWork();
		
		//bufferReader 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		if(number < 2 || number > 9 ) { 
		
		hm.gugudan(number);					
		
			throw new home();
		}
	}
	
	//구구단메서드
	public void gugudan(int number) {
		for(int i = 1; i < 10 ; i++) {
			System.out.println(number + " x " + i + " = " + (i*number));
		}
	}

}
