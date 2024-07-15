package day0202;

import java.util.Random;

/**
 * thorw : 사용자정의 예외처리 클래스와 함께사용.
 * -사용자 정의 예외처리 클래스 제작하는 때 
 * java api에서 제공하는 예외처리 클래스가 내가 구현하는 업무의 성격과
 * 같은 이름으로 존재하지 않을 때 정의하여 만든다.
 * 
 */
public class MuYeong {
	
	public String walk() throws Exception{
		String msg="";
		int flag = new Random().nextInt(4); // 0-초 1-중 2- 고 3-대
		
		String[] title = {"초딩","중딩","고딩","대딩"};
		
		msg = title[flag] + "님 흡연 중 모른척 지나갑니다.('' )( '')";
		if(flag == 0) { //초딩이 흡연중ㅇ이면 예외를 강제로 발생 시킨다.
			throw new Exception(title + "님 지나친 흡연은 탈모를 유발해요");	
	}
		return msg;
	}	
	
	
	public String walk2() throws TabaccoException{
		String msg="";
		int flag = new Random().nextInt(4); // 0-초 1-중 2- 고 3-대
		
		String[] title = {"초딩","중딩","고딩","대딩"};
		
		msg = title[flag] + "님 흡연 중 모른척 지나갑니다.('' )( '')";
		if(flag == 0) { //초딩이 흡연중ㅇ이면 예외를 강제로 발생 시킨다.
			throw new TabaccoException();	
	}
		//예외가 발생하지 않았을때만 반환 메세지를 생성한다.
		msg = title[flag] + "님 흡연 중 모른척 지나간다.";
		return msg;
	}
	
	public static void main(String[] args){
		MuYeong my = new MuYeong();
		try {
		
		System.out.println(my.walk2());
		}
		catch(TabaccoException e) {
			e.printStackTrace();
		}
	}//main
}//class
