package day0116;
/**
 * 사람의 공통 특징은 부모클래스인 person에 정의도어있고, 자식 클래스인
 * HongGilDong은 자신의 특별한 기능만 정의
 * 싸움 레벨은 1~10까지 존재
 */
public class HongGildDong extends Person{
	private int level;
	
	/*
	 * 홍길동의 기본 생성자, 눈 2개 코 1개 , 입 1개인 사람이 태어남
	 * 홍길동은 싸움을 평민보다 잘한다.
	 * 
	 */
	public HongGildDong() {
		super();
		level = 6;
	}
	/**
	 * @param yourLevel 상대방의 레벨
	 * @return  싸움의 결과
	 */
	public String fight(int yourLevel) {
		String result="";
		if(level < yourLevel) {
			result = "싸움에서 졋음";
			level--;
			if(level < 1) {
				level = 1;
			}
		}else if(level > yourLevel) {
			result = "싸움에서 이겼음";
			level++;
			if(level > 10) {
				level = 10;
			}
		}else {
			result = "무승부";
		}
		return result;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
//	@Override
//	public String toString() {
//		return "나는 홍길동이다";
//	}
//	
	@Override
	public String eat() {
		return getName() + "이 집에서 밥먹는다";
	}
	@Override
	public String eat(String menu, int price) {
		// TODO Auto-generated method stub
		return null;
	}

}
