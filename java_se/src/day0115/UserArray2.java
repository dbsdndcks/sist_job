package day0115;
/**
 * 이차원 배열의 사용
 * -행과 열로 구성된 배열
 * -이차원 배열의 한 행은 일차원 배열로 이루어져 있다.
 */
public class UserArray2 {

	public UserArray2() {
		int[][]arr2 = null;
		arr2 = new int[3][4];
		System.out.println(arr2.length + "행");
		System.out.println(arr2[0].length + "열");
		for(int i = 0; i < arr2.length ; i++) {
			for(int j = 0; j < arr2[i].length ; j++) {
				System.out.printf("arr2[%d][%d] = %d\t" , i , j ,arr2[i][j]);
			}
			System.out.println();
		}
		
		String[][] gugu = new String[10][9];
		for(int i = 2 ; i < gugu.length; i++ ) {
			for(int j = 1; j <gugu.length ; j++) {
				System.out.print(i + " x " + j + " = " + (i*j)+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------");
	}
	
	//기본형 형식의 사용. new를 사용하지 않음.
	public void useArray2() {
		int[][]arr = {{10,20,30,40},{50,60,70},{80,90,100}};
		System.out.printf("%d행 %d열\n", arr.length,arr[0].length);
		arr[0][2] = 300;
		arr[1][3] = 800;
		arr[2][0] = 900;
	}
	public static void main(String[] args) {
		new UserArray2().useArray2();;
	}
}
