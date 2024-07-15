package day0115;

public class UserArray2Work {

	public void scoreProcess() {
		String[]namesArr = {"루피","썅디","쵸파","나미","로빈"};
		int[][] socreArr = {{89,91,90},{82,94,90},{67,34,77},{88,99,93},{41,22,33}};
		int sum = 0;
		int num = 0;
		int num1 = 0;
		String name = "";
		System.out.printf("시험 응시 인원 [%d]명\n" , namesArr.length);
		System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\n");
		
		for(int i=0 ; i < socreArr.length ; i++) {
			System.out.printf("%d\t%s\t", i+1,namesArr[i]);
			
			for(int j=0 ; j < socreArr[i].length ; j++) {				
				System.out.printf("%d\t",socreArr[i][j]);
				sum += socreArr[i][j];
				
			}
		
			System.out.println(totalScore(socreArr[i]));
			if(totalScore(socreArr[i]) > num) {
				num = totalScore(socreArr[i]);
				name = namesArr[i];
				num1 = i+1;
			}
			
		}
		System.out.println("===========================================");
		System.out.print("총점:\t");
		subScore(socreArr); //각과목의 총점
		System.out.printf("\n국어평균 : %.2f\n", avgKorean(socreArr)); //국어의 평균 
		System.out.printf("1등학생: 번호[%d]이름[%s]", num1,name); // 1등학생의번호[],이름[]
	}
	
	public int totalScore(int[]subjectScore) {
		int total = 0;
		for(int score : subjectScore) {
			total += score;
			
		}
		return total;
	}
	
	public void subScore(int[][]socreArr) {
		int total = 0;
		for(int i =0; i < 3 ; i++) {
			for(int j = 0; j < 5; j++) {
				total += socreArr[j][i];
				
			}
			System.out.print("\t" +total);
			total = 0;
		}
	}
	
	public double avgKorean(int[][]socreArr) {
		double avg = 0;
		for(int i=0 ; i<socreArr.length; i++) {
			avg += socreArr[i][0];
		}
		avg /= socreArr.length;
		return avg;
	}
	

	
	public static void main(String[] args) {
		UserArray2Work array2Work = new UserArray2Work();
		array2Work.scoreProcess();
	}

}
