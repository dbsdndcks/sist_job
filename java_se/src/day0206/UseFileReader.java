package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 16비트 vkdl
 */
public class UseFileReader {

	public UseFileReader() throws IOException {
		// 1. 파일 생성
		File readFile = new File("c:/E/dev/temp/java_read.txt");
		if (!readFile.exists()) {
			System.out.println(readFile.getAbsolutePath() + "는 존재하지 않습니다");
		}
		
		BufferedReader br = null;
		try {
			// 2. 스트림 설정
			br = new BufferedReader(new FileReader(readFile));

			// 3. 스트림에 연결되어있는 파일을 읽어들인다.
			String str = "";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} finally {
			if (br != null) {br.close();}
		}
	}

	public static void main(String[] args) {
		try {
			new UseFileReader();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
