package day0117;

public class Homework {

	public static void main(String[] args) {
		Chiwawa chiwawa = new Chiwawa("뽀삐",4);
		Mute mute = new Mute("부끄",2);
		System.out.println(chiwawa.intro());
		System.out.println(chiwawa.job());
		System.out.println(mute.intro());
		System.out.println(mute.job());
	}

}
