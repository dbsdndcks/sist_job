package day0112;
/**
 * 1차원 배열 ) 열로만 구성된 배열 <br>
 * 1.선언)
 * 데이터[]배열명 =null;
 * 2.생성)
 * 배멸명 = new 데이터형[방의크기];
 * 데이터형[]배열명=new데이터형
 * 3.값 할당)
 * 존재하지 않는 배열 인덱스를 사용하면 error발생
 * 4.값 사용
 * 배열명[방의번호]
 * for(int i=0; i < arr.length; i++)
 * 배열명[i];
 */
public class UserArray1 {
	public UserArray1() {
		//1.선언
		int[]arr = null;
		//2.생성 heap생성후 모든 방의 값은 0으로 초기화
		arr = new int[5];
		
		System.out.println(arr + " " + arr.length);
		
		//5.일괄처리
		for(int i=0 ; i < arr.length ; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
	}
	
	public void scoreProcess() {
		System.out.println("-------------");
		System.out.println("번호\t이름\t점수\t주소");
		String[]nameArr = {"루피","샹크스","나미","조로","쵸파","로빈"};
		String[]addrArr = {"서울","진주","서울","경주","부산","진해"};
		int[]score = {94,96,75,83,100,84};
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0 ; i<nameArr.length ; i++) {
			System.out.println((i+1)+"\t"+nameArr[i]+"\t"+ score[i]+"\t"+addrArr[i]);
			sum += score[i];
		}
		System.out.println("-------------");
		System.out.printf("총점 : %d 평균 : %.2f\n", sum ,sum/6.0);
		
		for(int i=0; i < nameArr.length ; i++) {
			if(addrArr[i].startsWith("서울")) {
				sum1 += score[i];
				System.out.println(nameArr[i]);
			}		
			
		}
		System.out.println("서울사는애들 총합 : " + sum1);
		System.out.println("-------------");
		for(int i=score.length-1 ; i >= 0 ; i--) {
			System.out.println(score[i]);
		}
		int[]scoreArr= {94,96,75,83,100};
		int top = scoreArr[0];
		System.out.println("-------------");
		for(int i=0 ; i<scoreArr.length ; i++) {
			if(top < scoreArr[i]) {
				top = scoreArr[i];
			}
		}
		System.out.println(top);
		System.out.println("-------------");
		int min = scoreArr[0];
		for(int i=0 ; i<scoreArr.length ; i++) {
			if(min > scoreArr[i]) {
				min = scoreArr[i];
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		UserArray1 array1 = new UserArray1();
		array1.scoreProcess();
		
	}
}
