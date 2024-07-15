package day0116;


public class UserPerson{
	
	private void usePerson() {
		HongGildDong dong = new HongGildDong();
		dong.setName("홍동길");
		System.out.printf("%d,%d,%d,%s\n",dong.getEye(),dong.getMouth(),dong.getNose(),dong.getName());
		System.out.println(dong.fight(5));
		System.out.println(dong.fight(6));
		System.out.println(dong.fight(8));
		System.out.println(dong.fight(9));
		System.out.println(dong.getLevel());
		System.out.println("======================");
		Clark clark = new Clark();
		clark.setName("클락");
		System.out.printf("%d,%d,%d,%s\n",clark.getEye(),clark.getMouth(),clark.getNose(),clark.getName());
		System.out.println(clark.power("다이아"));
		System.out.println(clark.power("크립토나이트"));
		System.out.println(clark.power("루비"));
		
		System.out.println(dong); //tostring 메서드가 호출됫음
		System.out.println(clark);
		
		System.out.println(dong.eat());
		
		System.out.println(clark.drivingForce());
		System.out.println(clark.lift());
	}
	
	public static void main(String[] args) {
		new UserPerson().usePerson();
	}
}
