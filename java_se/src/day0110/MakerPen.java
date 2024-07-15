package day0110;

/**
 * 마카펜을 대상으로하여 추상화한 후 작성하는 클래스입니다.
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
public class MakerPen {
	private int cap;
	private int body;
	private String color;
	
	/**
	 * 생성된 마카펜 객체 뚜껑의 개수를 설정하는 일.<br>
	 * 마카펜의 뚜껑은 1개만 설정된다.
	 * @param cap 뚜껑의 개수
	 */
	public void setCap(int cap) {
		
		if(cap != 1) {
			cap = 1;
		}//end if
		
		this.cap = cap;
	}//setCap
	/**
	 * 생성된 마카펜 객체 뚜껑의 개수를 반환 하는 일
	 * @return 마카펜 객체의 뚜껑 개수
	 */
	public int getCap() {
		return cap;
	}
	/**
	 * 생성된 마카펜 객체의 몸체 개수를 설정하는 일.<br>
	 * @param body
	 */
	public void setBody(int body) {
		
		this.body = body;
	
	}
	/**
	 * 생성된 마카펜 객체 몸체 개수를 반환 하는 일
	 * @return 마카펜 객체의 몸체 개수
	 */
	public int getBody() {
		return body;
	}
	/**생성된 마카펜 객체 뚜껑의 색상을 설정하는 일.<br>
	 * 색은 "검은", "파란", "빨간" 만 설정할 수 있다.
	 * 그 의외의 색이 입력되면 "검은" 색으로 instance variable 설정한다.
	 * @param color 설정할 색상
	 */
	public void setColor(String color) {
		if(color.equals("검은")||color.equals("검정")) {
			color = "검은";
		}else if(color.equals("파란")||color.equals("파랑")) {
			color = "파란";
		}else if(color.equals("빨간")||color.equals("빨강")){
			color = "빨간";
		}else {
			color = "검은";
		}
		this.color = color;
	}
	/**
	 * 생성된 마카펜 객체 색상을 반환 하는 일
	 * @return 마카펜의 색상
	 */
	public String getColor() {
		return color;
	}
	/**
	 * 마카펜 객체의 칠판에 쓰는 일을 (동사적인) 특징을 구현
	 * @param msg 쓰고싶은 메시지
	 * @return 쓰는 일
	 */
	public String write(String msg) {
		return "\""+msg+"\" 을 " + color + "색으로 칠판에 쓴다.";
	}//write
	
	public MakerPen(int cap, int body, String color) {
		this.cap = cap;
		this.body = body;
		this.color = color;
	}
	
	public MakerPen() {}
	
}
