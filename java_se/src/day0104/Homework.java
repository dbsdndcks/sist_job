package day0104;

public class Homework {
	public static void main(String[] args) {
		
		for(int i=1 ; i<10 ; i++) {
			for(int j=2 ; j<10 ; j++) {
				System.out.print(j + "X" + i + "=" + (i*j) + " ");
			}
			System.out.println();
		}
		System.out.println("====================");
		int num = 0;
		for(int i=0 ; i<6 ; i++) {
			for(int j=0 ; j<=i ; j++) {
				System.out.print(" ");
			}
			System.out.print(num);
			num++;
			System.out.println();
		}
		
		System.out.println("====================");
		int sum = 0;
		for(int i=1 ; i<101 ; i++) {
			if(i % 3 == 0) {
				sum += i;
			}			
		}
		System.out.println(sum);
	}		
	
}
