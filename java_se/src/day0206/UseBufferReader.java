package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferReader를 사용한 줄 단위 읽기
 */
public class UseBufferReader {

	public UseBufferReader() throws IOException {
		//1. File 생성
		File readFile = new File("c:/E/dev/temp/java_read.txt");
		 if (!readFile.exists()) {
			System.out.println(readFile.getAbsolutePath() + "존재하지 않습니다");
			return;
		}
//		//2. 스트림 생성
//		FileInputStream fis = new FileInputStream(readFile);
//		// 8비트 스트림과 16비트 스트림을 연결
//		InputStreamReader isp = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isp); //연결된 파일에서 줄단위로 읽는다
		 
		 BufferedReader br = null;
		 try {
		 br = new BufferedReader(new InputStreamReader(new FileInputStream(readFile)));
		 
		 //3.스트림에 연결된 파일의 내용읽기
		 String str="";
		 while((str = br.readLine()) != null) {
			 System.out.println(str);
		 }//end while
		 } finally {
			 if(br != null) {
				 br.close();
			 }
		 }
		 br.close();
	
	}//UseBufferReader
		
	public static void main(String[] args) {
		
		try {
			new UseBufferReader();
		} catch (IOException e) {
			System.err.println("파일을 읽어들이는 동안 문제가 발생하였습니다");
			e.printStackTrace();
		}
		
	}//main

}//class
