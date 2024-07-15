package day0123;

import java.util.ArrayList;
import java.util.List;

/**
 * 모든 jdk버전에서는 generic 없이 list를 생성하고 사용할 수 있다.
 */
public class UserList {

	@SuppressWarnings("unchecked")
	public UserList() {
		@SuppressWarnings("rawtypes")
		List l1 = new ArrayList();
		l1.add(10);
		l1.add("수원");
//		for(int i=0 ; i<l1.size() ; i++) {
//			//사용하는 쪽에서 에러가 발생가능
//			System.out.println((int)l1.get(i)*10);
//		}
//		
		System.out.println("==============================");
		
		//제네릭의 사용 : 입력 데이터형을 제한
		//기본형 데이터를 사용 불가 
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.add(new Integer(1));
		int i1 = l2.get(0); //언박싱
		int i2 = l2.get(1); //언박싱
		int i3 = l2.get(2).intValue(); // 언박싱아님
		for(int i : l2) {
			System.out.println(i*10);
		}
	}
	public static void main(String[] args) {
		new UserList();
	}
}
