package day0110;


public class UserPerson{
	

	
	
	
	public static void main(String[] args) {
		Person person = new Person(2,4,4,"윤병장");
		person.nick = "윤";
		
		System.out.println(person.eat());
		System.out.println("성 : " + person.nick + "\n이름 : " + person.getName() + "\n눈 개수 : " + person.getEye() + "\n입 개수 : " + person.getMouth()
				+ "\n코 개수 : " + person.getNose());
		System.out.println(person.eat("제육덮밥", 7000));
		System.out.println("============================================");
		
		Person woongChan = new Person(2,1,1,"woongchan");
		woongChan.nick = "윤";
		System.out.println("성 : " + woongChan.nick + "\n이름 : " + woongChan.getName() + "\n눈 개수 : " + woongChan.getEye() + "\n입 개수 : " + woongChan.getMouth()
		+ "\n코 개수 : " + woongChan.getNose());
		
		System.out.println(woongChan.getName() + "은 점심에 " + woongChan.eat("돈까스", 5000
				));
		System.out.println("============================================");
		
		Person jinban = new Person();
		jinban.setName("천진반");
		
		System.out.printf("눈 %d개 코 %d개 입 %d개 이름 %s \n",
				jinban.getEye(),jinban.getNose(),jinban.getMouth(),jinban.getName());
	}
}
