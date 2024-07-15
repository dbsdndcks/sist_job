package day0110;

public abstract class Dog {
	
	private String name;
	private int age;
	
	
	
	public abstract String job();
	public abstract String intro();
	
	public static void info(Dog dog) {
		System.out.println("강아지 이름은 " + dog.name + " 이고 나이는 " + dog.age + "살이며 특기는 " + dog.job());

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	


}
