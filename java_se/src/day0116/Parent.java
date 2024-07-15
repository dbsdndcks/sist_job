package day0116;

public class Parent {
	private int age;
	 String msg;
	public Parent() {
		System.out.println("부모의생성자" +this);
		msg = "이편지는 영국에서부터 시작되어...";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printMsg() {
		System.out.println("부모 : " + msg);
	}
	
}
