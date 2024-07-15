package day0111;


/**
 * 문자열의 사용
 * 문자열 저장소에 저장된 시작주소를 저장하고 사용하기 위한 데이터형으로 java.lang.String
 * 클래스를 제공한다. (유일하게NEW안하기 사용가능)
 */
public class UseString {
	
	
	//mail주소를 입력받아 유효한 메일인지, 무효한 메일인지 판단하는 method작성
	//유효한 메일은 5자이상 이상이면서 @과 .이 포함되어야한다.
	// 유효메일 출력 그렇지 않으면 무효메일 출력
	public static void mailCheck(String mail) {
		if(mail.length() >= 7 && mail.contains("@") && mail.contains(".")) {
			System.out.println("유효메일");
		}else {
			System.out.println("무효메일");
		}
	
	}
	
	public static void main(String[] args) {
		//기본형 형식의 사용
		String str1 = "abc";
		//참조형 형식의 사용
		String str2 = new String("def");
		System.out.println(str1);
		System.out.println(str2);
		// == 비교, 기본형 형식고 ㅏ참조형 형식이 다른 겨로가를 반환한다.
		System.out.println("기본형 : " + (str1 == "abc") );
		System.out.println("참조형 : " + (str2 == "def") );
		//equals비교 : 기본형 형식과 참조형 형식이 같은 결과를 반환한다.
		System.out.println("기본형 : " + (str1.equals("abc")));
		System.out.println("참조형 : " + (str2.equals("def")));
		
		str1 = "ywcsuwon@naver.com";
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.charAt(2));
		
		//자신의 메일 주소에서 @을 변수에 저장하여 출력
		char snail = str1.charAt(8);
		System.out.println(snail);
		
		//문자열안에서 특정 문자열의 시작인덱스를 얻기
		str1 = "Java Oracle";
		System.out.println(str1 + " 에서 r의 인덱스" + str1.indexOf('r'));
		//존재하지 않는 문자열은 -1이 나옴
		//같은 문자열이 있다면 처음 문자열의 인덱스만 나온다.
		
		String mail1 = "test@test.com";
		String mail2 = "testtest.com";
		String mail3 = "test@test.com";
		
		mailCheck(mail1);
		mailCheck(mail2);
		mailCheck(mail3);
		
		//문자열 안에서 특정 문자열의 인덱스 얻기 (R -> L)
		System.out.println(str1.lastIndexOf('e'));
		
		str2 = str2.concat("Html"); //문자열 합치기
		System.out.println(str2);
		
		
		//str1 = "ywcsuwon@naver.com";
		//str1에서 메일 주소(로컬파트)를 잘라내어 출력
		//str1에서 도메인 파트를 얻기
		
		str1 = "ywcsuwon@naver.com";
		String local = str1.substring(0,8);
		String domain = str1.substring(9,18);
		System.out.println("local : " + local + " //  domain : " + domain);
		
		String addr = "서울시 강남구 역삼동";
		if(addr.endsWith("동")) {
			System.out.println("도시");
		}else {
			System.out.println("시골");
		}}
	
	}

