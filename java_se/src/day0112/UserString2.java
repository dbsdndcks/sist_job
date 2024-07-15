package day0112;

/**
 * 문자열 클래스의 사용
 */
public class UserString2 {

	public static void main(String[] args) {
		String filName = "Test.bat";
		System.out.println("파일명 : " + filName.substring(0,filName.indexOf(".")));
		System.out.println("확장자 : " + filName.substring(5,8));
		
		String str = ""; //초기화 => string클래스에서 제공하는 인스턴스 메소드 사용가능
		String str1 = null; //인스턴스 메소드 사용 불가
		
		System.out.println(filName.isEmpty());
		System.out.println(str.isEmpty());
//		System.out.println(str1.isEmpty()); 에러발생 
		
		str = "    adf   ";
		String temp = " sdfs ";
		System.out.println(str.trim());
		System.out.printf("[%s][%s]\n",str,temp);
		
		str = "Java Oracle JDBC JSON";
		System.out.println(str.replace('a','b'));
		System.out.println(str.replace('J','j'));
		
		temp = "나 지금 피씨방인데 넌 어디니 씨방아";
		System.out.println(temp.replaceAll("씨방", "**"));
		
		temp = temp.concat("데헷").replaceAll("씨", "10").toUpperCase();
		System.out.println(temp);
		
		String msg = "내 전화번호는 010-1234-5678 / 내 친구 전번은 010-2222-3333 내 나이는 20살";
		temp = msg.replaceAll("\\d","*");
		System.out.println(temp);
		
		msg = msg + "내 나이는 20살 이전 전화번호는 011-123-4567 태어난 해는 1995년" + "집 전화번호는 02-123-4567 아! 듀얼번호는 010-3345-7788";
		temp = msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})", "xxx-xxxx-xxxx");
		System.out.println(temp);

		temp = msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})", "$1-xxxx-$3"); //replaceAll에서만 제공하는 기능으로 그룹의 값을 참조할 때 사용
		System.out.println(temp);

		msg = "전화번호는 010-1234-5678";
		temp = msg.replaceAll("(\\d{3}-)\\d{1}(\\d{3}-\\d{4})", "$1x$2"); //replaceAll에서만 제공하는 기능으로 그룹의 값을 참조할 때 사용
		System.out.println(temp);
		
		msg = "hello 내 이메일은 test@sist.com";
		System.out.println(msg.replaceAll("(\\s{4}@)(\\s{4}).(\\s{3})", "x"));

		msg = "이메일주소는 test@daum.net 과 hello Java";
		temp = msg.replaceAll("[a-z]", ""); //소문자
		System.out.println(temp);
		temp = msg.replaceAll("[A-Z]", ""); //대문자
		System.out.println(temp);
		temp = msg.replaceAll("[0-9]", ""); //숫자
		System.out.println(temp);
		temp = msg.replaceAll("[r-힣]", ""); //한글
		System.out.println(temp);
		temp = msg.replaceAll("[da]", "");//범위가 아ㅣ면 각각의 문자가 된다.
		System.out.println(temp);

		temp = msg.replaceAll("[a-zA-z0-9._%+-]+@[a-zA-Z0-9.-]+\\.", "xxx@xxx.xxx");//범위가 아ㅣ면 각각의 문자가 된다.
		System.out.println(temp);
		
		String csvData = "Java,Oracle,JDBC,HTML,CSS,JavaScript";
		String[]arr = csvData.split(",");
		
		for(String data : arr) {
			System.out.println(data);
		}
		
		String[]arr2 = "어,저,뇌,안,안,개".split(",");
		
	}
	
}
// 
