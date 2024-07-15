package day0119;


public class UseStringBuilder {

	public void useStringBuffer() {
		//1.객체화
		StringBuffer sb = new StringBuffer();
		//2.객체가 제공하는 메서드 사용 값을 sb객체 참조하는 공간에 추가
		sb.append("안녕");
		sb.append(true);
		sb.append(202020);
		sb.insert(6, " 수원시의 자랑 윤웅찬 ");
		sb.delete(11, 14);
		sb.delete(0, sb.length());
		sb.append("hello");
		
		//sb가 참조하는 메모리에는 hello가 들어있는지 비교하는 코드를 작성하시오 
		//hello와 같으면 true
		
		if(sb.toString().equals("hello")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		//sb에는 소문자가 들어가있다. 대문자로 출력
		System.out.println(sb.toString().toUpperCase());
		
		
	}
	public void useStringBuilder() {
		//1.객체화
		StringBuilder sb = new StringBuilder
				();
		//2.객체가 제공하는 메서드 사용 값을 sb객체 참조하는 공간에 추가
		sb.append("안녕");
		sb.append(true);
		sb.append(202020);
		sb.insert(6, " 수원시의 자랑 윤웅찬 ");
		sb.delete(11, 14);
		sb.delete(0, sb.length());
		sb.append("hello");
		
		//sb가 참조하는 메모리에는 hello가 들어있는지 비교하는 코드를 작성하시오 
		//hello와 같으면 true
		
		if(sb.toString().equals("hello")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		//sb에는 소문자가 들어가있다. 대문자로 출력
		System.out.println(sb.toString().toUpperCase());
		
	}

	
	public static void main(String[] args) {
		UseStringBuilder builder = new UseStringBuilder();
		builder.useStringBuffer();
		builder.useStringBuilder();
		
	}

}
