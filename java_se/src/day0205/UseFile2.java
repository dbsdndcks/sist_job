package day0205;

import java.io.File;

/**
 *  디렉토리 생성
 */
public class UseFile2 {
	public static void main(String[] args) {
		//1. File 생성
		File file = new File("c:/E/dev/ywc");
		
		//2. 생성
		//부모 디렉토리가 (dev)가 존재하면 mkdir()이나 mkdirs()모두 하위 디렉토리를 잘 생성해준다
//		System.out.println(file.mkdir());
		System.out.println(file.mkdirs());
		
		File file2 = new File("c:/temp/test");
		//부모 디렉토리가 (temp)가 존재하지 않으면 mkdir()는  하위 디렉토리를 생성하지 않는다.
//		System.out.println(file2.mkdir());
		//부모 디렉토리가 (temp)가 존재하지 않으면 mkdirs()는 부모 디렉터리를 생성해준다.
		System.out.println(file2.mkdirs());
	}
}
