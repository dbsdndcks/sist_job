package day0112;

public class Homework2 {

	public static void main(String[] args) {
		int[]scoreArr = {94,96,75,83,100};
		int temp = 0;
		for(int i=0; i<scoreArr.length-1; i++) {
			for(int j=i+1; j<scoreArr.length; j++) {
				if(scoreArr[i] < scoreArr[j]) {
					temp = scoreArr[i];
					scoreArr[i] = scoreArr[j];
					scoreArr[j] = temp;
				}
			}
			
		}
		for(int i=0; i<scoreArr.length; i++) {
			System.out.println(scoreArr[i]);
		}
	}

}
