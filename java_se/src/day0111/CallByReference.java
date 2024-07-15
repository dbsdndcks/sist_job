package day0111;

/**
 * method의 매개변수로 클래스가 정의되면 주소가 넘어간다. 
 */
public class CallByReference {
	
	int i = 1;
	int j = 2024;
	
	public void swap(CallByReference cbr) {
		int temp = 0;
		temp = cbr.i;
		cbr.i = cbr.j;
		cbr.j = temp;
		System.out.println(cbr.i + cbr.j);
	}
	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		cbr.i = 2024;
		cbr.j = cbr.i;
				
	}

}
