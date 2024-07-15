package day0116;
/**
 * 가변 배열. 행마다 열의 개수가 다른 배열
 * 사용법 
 * 1.선언
 * 데이터형 [][] 배열명 = null;
 * 2.생성 ) 주의: 행만 설정한다. 
 * 배열명 = new 데이터형[행의번호][];
 * 3.행마다 열을 생성) - 일차원 배열을 생성 
 * 4. 값할당
 */
public class UserVariableArray {

	public UserVariableArray() {
		//선언
		int[][] arr2= null;
		//생성
		arr2 = new int[5][];
		//행마다 열을 생성
		arr2[0] = new int[5];
		arr2[1] = new int[2];
		arr2[2] = new int[]{1,2,3,4,5,6,7};	
	}
	
	public static void main(String[] args) {
		new UserVariableArray();
	}

}
