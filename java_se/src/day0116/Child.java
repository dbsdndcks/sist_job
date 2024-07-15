package day0116;

public class Child extends Parent{
	public Child() {
		System.out.println("자식의생성자" + this
				);
		msg = "아프리카";
	}
	private String name;
	private String msg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printMsg() {
//		System.out.println("자식 : " + super.msg);
		System.out.println("자식 : " + msg);
		super.printMsg();
	}
	public static void main(String[] args) {
		Child child = new Child();
		child.setAge(10);
		child.setName("시래기");
		System.out.println(child.getAge());
		System.out.println(child.getName());
		child.printMsg();
	}
}
