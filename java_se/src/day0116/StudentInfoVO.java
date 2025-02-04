package day0116;


public class StudentInfoVO {

	private int classNumber;
	private String name;
	private int age;
	private double height;
	private double weight;
	private String email;
	
	public StudentInfoVO() {
	}
	
	
	public StudentInfoVO(int classNumber, String name, int age, double height, double weight, String email) {
		this.classNumber = classNumber;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.email = email;
	}


	public int getClassNumber() {
		return classNumber;
	}


	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
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


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}