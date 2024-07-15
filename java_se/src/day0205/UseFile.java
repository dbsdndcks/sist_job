package day0205;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File  클래스를사용한 파일 접근
 */
public class UseFile {

	public static void main(String[] args) throws IOException {
		//1. 생성
		File file = new File("c:/e/dev/temp/java_read.txt");
		System.out.println(file);
		
		if(!file.exists()) {
			System.out.println("파일이 ㅇㅅㅇ");
			return;
		}
		System.out.println(file.isFile()?"파일":"디렉토리");
		System.out.println(file.isDirectory()?"디렉토리":"파일");
		System.out.println(file.canRead()?"읽은 수 있음":"읽을 수 없음");
		System.out.println(file.canWrite()?"쓸 수 있음":"쓸 수 없음");
		System.out.println(file.isHidden()?"숨긴 파일":"숨긴 파일 x");
		System.out.println(file.length()+"byte");
		System.out.println("절대경로" +file.getAbsolutePath());
		System.out.println("규범경로" +file.getCanonicalPath());
		System.out.println(file.canExecute());
		System.out.println("파일의 부모경로" +file.getParent());
		System.out.println("파일 이름" +file.getName());
		System.out.println(file.getParentFile());
		
		//날짜1
		System.out.println("파일이 마지막으로 수정된 날짜" + new Date(file.lastModified()));
		//날짜2
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date(file.lastModified())));
	}

}
