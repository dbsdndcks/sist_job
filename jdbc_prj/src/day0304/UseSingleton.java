package day0304;

public class UseSingleton {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getinstance();
		Singleton singleton2 = Singleton.getinstance();		
		Singleton singleton3 = Singleton.getinstance();		
	}

}
