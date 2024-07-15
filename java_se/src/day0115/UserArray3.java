package day0115;

public class UserArray3 {
	public UserArray3() {
		//1.선언
		int[][][] arr3 = null;
		//2.셍상) 배열명 = new 데이터형[면][행][열];
		arr3 = new int[2][2][3];
		//3.값 할당) 배열명[면][행][열] = 값;
		arr3[0][1][1] =2024;
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				for(int k = 0; k < arr3[i][j].length; k++) {
					System.out.printf("arr[%d][%d][%d]=%d\t" , i,j,k,arr3[i][j][k]);		
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
		
		//기본형 형식의 사용
		
	}
	
	public void UserArray4() {
		int[][][]arr3 = new int [][][] {{{1,2,3},{4,5,6,}},
										{{7,8,9},{10,11,12}}};
		System.out.printf("%d면%d헹%d열",arr3.length,arr3[0].length,arr3[0][0].length);								
	
	
	//개선된 for
	//삼차원 배열의 한면은 이차원 배열로 이루어져 있다.
	for(int[][]arr2 : arr3) {
		
	//이차원 배열의 한행은 일차원 배열로 이루어져 있다
		for(int[]arr1 : arr2) {
			
	//일차원 열의 한 열을 단일형으로 이루어져 있다.
			for(int value : arr1) {
				System.out.printf("%d\t",value);
			}System.out.println();
		}}
	}
		
	
	public static void main(String[] args) {
		new UserArray3().UserArray4();
		
	}
}

