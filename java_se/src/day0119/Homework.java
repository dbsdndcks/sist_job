package day0119;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

/*
 * 숙제 1 파일명을 받을 수 있는 매개변수를 가진 method를 작성하여 입력된 파일명의 백업 파일명을 반환하는 일을하는 
 * method를 작성하고 호출하세요
 * 만약.이 없다면 뒤에 _bak을 붙여서 반환할것
 * 예)test.txt가 입력되면 -> test_bak.txt가 되어 반환 될것
 * test가 입력되면 test_bak이 반환될것
 * 
 * 숙제2
 * 아래의 csv데이터를 매개변수로 입력받아 배열로 반환하는 일을하는 emthod를 작성후 호출
 * String csvData = "고한별,김도원.김동섭.김무영~김현종 박시현, 손지민,김병년.김일신";
 * -김씨는 성을 제외하고 이름만 넣어 반환할 것
 * 
 * 숙제3
 * 0,1,2,3을 입력받는 method를 작성하고 문자열로 날짜를 반환해보세요
 * 반환되는 날짜형식을 "년-월-일 시:분:초 요일"
 * 입력되는 0,1,2,3은 아래의 국가 날짜로 설정되어 반환되어야한다
 * 0- 한국
 * 1 - 미국
 * 2 - 일본
 * 3 - 캐나다 
 * 
 * 입력되는 값이 0,1,2,3,이 아니면 0으로 설정후 반환할것 
 * 
 */
public class Homework {
	

	private static final Locale Locale = null;

	public void backUpFilfe(String file) {
		if(!file.contains(".")) {
			System.out.println(file + "_bak");
		}else {
			StringTokenizer st = new StringTokenizer(file,".");
			System.out.print(st.nextToken() + "_bak.");
			System.out.print(st.nextToken());
			System.out.println();
		}
	}
	
	public void arrayName(String csv) {
		String csvData = "고한별,김도원.김동섭.김무영~김현종 박시현, 손지민,김병년.김일신";

		StringTokenizer st = new StringTokenizer(csvData," ,.~");
		String[]arr = new String[st.countTokens()];
		
		for(int i=0 ; i < arr.length ; i++) {
			String str = st.nextToken();
			if(str.charAt(0)=='김') {
				arr[i] = str.substring(1,3);
			}else {
				arr[i] = str;
			}
		}
		
		for(String s : arr) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	public void printDay(int num) {
		
	
	String time = "y년-M월-d일 HH시:mm분:s초 EEEE";
	Locale country = Locale;
		switch (num) {
		case 0 : country =java.util.Locale.KOREA;
		break;
		case 1 : country =java.util.Locale.US;
		break;
		case 2 : country =java.util.Locale.JAPAN;
		break;
		case 3 : country =java.util.Locale.CANADA;
		break;
		default :  country =java.util.Locale.KOREA;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(time,country);
		System.out.println(sdf.format(new Date()));
	}
	public static void main(String[] args) {
		String csvData = "고한별,김도원.김동섭.김무영~김현종 박시현, 손지민,김병년.김일신";
		Homework homework = new Homework();
		homework.backUpFilfe("test.txt");
		homework.arrayName(csvData);
		homework.printDay(0);
		homework.printDay(1);
		homework.printDay(2);
		homework.printDay(3);
		homework.printDay(4 );
	}
}

