package day0116;

public class WoongChan extends Person{
	
	public void bestjob2() {
		System.out.println("또한 제가 잘하는 일은 농구입니다.");
	}
	
	public WoongChan() {
		super.bestJob();
	}
	public static void main(String[] args) {
		WoongChan chan = new WoongChan();
		chan.bestjob2();
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eat(String menu, int price) {
		// TODO Auto-generated method stub
		return null;
	}
}
