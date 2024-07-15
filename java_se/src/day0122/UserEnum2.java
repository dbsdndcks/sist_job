package day0122;

public class UserEnum2 {

	public static void main(String[] args) {
		//생성자를 가진 enum은 요소에 할당된 method를 통해 이름과 값을 얻을 수 있다.
		for(Week w : Week.values()) {
			System.out.println(w.getName()+ " " + w.getValue()+ " " +w.ordinal());
		}
		
//		if비교 == 으로 비교
		Week key = Week.MON;
		if(key == Week.MON) {
			System.out.println("월요병 오지는 월요일!!");
		}else if(key == Week.TUE) {
			System.out.println("화요병 오지는 월요일!!");
		}else {
			System.out.println("괜찮은날");
		}
	}

}
