package day0116;
/**
 * 사람을 추상화하여 구현하는 클래스 => 사람의 공통 특징만 정의 => 추상클래스로 변환(추상클래스 => 상속관계에서 부모클래스를 만들 때 사용)
 * 명사적 특징) 눈,코,입
 * 동사적 특징) 사람은 먹는 일 => (자식클래스가 부모에 정의한 먹는 일을 사용하지 않지만 사람은 먹는 일을 반드시 해야한다 )

 * 객체생성을 하여 사용하는 일반 클래스 이다
 * 사용법)
 * Person 객체명 =new Person();
 * 객체명.method()를 호출하여 사용
 */

public abstract class Person {
	
	private int eye,nose,mouth;
	private String name;
	public String nick;
	
	public Person() {
		eye = 2;
		nose = 1;
		mouth = 1;
	}
	
	public Person(int eye, int nose, int mouth, String name) {
		this.eye = eye;
		this.nose = nose;
		this.mouth = mouth;
		this.name = name;
	}
	/**
	 * @param 눈 개수 설정
	 */
	public void setEye(int eye) {
		this.eye = eye;
	}
	
	/**
	 * @param 코 개수 설정
	 */
	public void setNose(int nose) {
		this.nose = nose;
	}
	
	/**
	 * @param 입 개수 설정
	 */
	public void setMouth(int mouth) {
		this.mouth = mouth;
	}
	
	/**
	 * @param 이름 설정
	 */
	public void setName(String name) {
  		this.name = name;
	}
	
	/**
	 * @return 눈 개수 반환
	 */
	public int getEye() {
		return eye;
	}
	
	/**
	 * @return 코 개수 반환
	 */
	public int getNose() {
		 return nose;
	}
	/**
	 * @return 입 개수 반환
	 */
	public int getMouth() {
		return mouth;
	}
	/**
	 * @return 이름 반환
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return 사람의 동사적인 특징을 구현한 method
	 */
	public abstract String eat();
	
	
	public abstract String eat(String menu, int price);
	public void bestJob() {
		System.out.println("제가 잘하는 일은 공부입니다.");
	}
	@Override
	public String toString() {
		return "닝겐";
	}

}
