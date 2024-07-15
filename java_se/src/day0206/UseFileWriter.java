package day0206;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 16비트 스트림을 사용한 문자열 출력
 */
public class UseFileWriter {

	public UseFileWriter() throws IOException{
		File file = new File("c:/E/dev/temp/java_write2.txt");
	
		FileWriter fw =null;
		try {
			String st = "DON GGA SSE";
			fw = new FileWriter(file);
			//스트림에 데이터 기록
			fw.write(st);
			
			//스트림의 내용을 목적지로 분출
			fw.flush();
		}finally {
			//연결끊기
			if(fw != null) {fw.close();}
		}
		
	}
	
	public static void main(String[] args) {
		try {
			new UseFileWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
