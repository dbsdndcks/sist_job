package day0110;
/**
 * method의 매개변수가 기본형 데이터 형을 사옹하면 입력되는 값은 복사되어 들어간다.
 */
public class CallByValue {
	
	public CallByValue() {
		System.out.println("sdjflsjfklsjfkls");
	}
	
	public void swap(int i, int j) {
		int temp = 0;
		temp = i;
		i = j;
		j = temp;
		System.out.println("i = " + i + " j = " + j);
	}

	public static void main(String[] args) {
		CallByValue cv = new CallByValue();
		cv.swap(9, 10);
	}

}
