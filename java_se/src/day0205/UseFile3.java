package day0205;

import java.io.File;

public class UseFile3 {

	/**
	 * 파일 삭제 
	 */
	public static void main(String[] args) {
//		//1. 삭제할 파일명을 가진 File 객체를 생성
//		File file = new File("c:/E/dev/temp/java_read2.txt");
//		//2. 삭제
//		System.out.println(file.delete());
		
		
		//3. 파일명
		//이전파일을 저장한 객체 생성
		File renameFile = new File("c:/E/dev/temp/java_read2.txt");
		//새로운 이름을 저장한 객체 생성
		File renameFile2 = new File("c:/E/dev/temp/ywc.txt");
		System.out.println(renameFile.renameTo(renameFile2));
		
	}

}
