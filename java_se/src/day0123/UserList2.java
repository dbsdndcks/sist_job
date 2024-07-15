package day0123;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class UserList2 {
	/**
	 * Vector보다 속도 빠름
	 */
	public void useArrayList() {
		//1.생성
		List<String>list = new ArrayList<String>();
		
		//2.값 할당
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java");
		list.add("Html");
		list.add("Css");
		
		
		//2번째 방 위치(JDBC)에 "자바를: 추가 (기존 요소 사이에 추가)
		list.add(2,"자바");
		//3)크기
		System.out.println(list.size());
		
		//4)배열로 복사
		//1.리스트의 크기대로 빈 배열 생성
		String[]arr = new String[list.size()];
		//2.값 복사
		list.toArray(arr);
		for(String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//5 값 각제) remove(인덱스) ,remove(요소의값)
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list);
		list.remove("Java");
		System.out.println(list.size());
		
		System.out.println(list);
		
		//6.모두 삭제 clear
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
	}
	
	/**
	 * ArrayList보다 속도 느림. 동기화가 되기 때문에 여러 객체가 동시 접근 불가.
	 */
	public void useVector() {
		//1.생성
		List<String>list = new Vector<String>();
		
		//2.값 할당
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java");
		list.add("Html");
		list.add("Css");
		
		//3)크기
		System.out.println(list.size());
		
		//4)배열로 복사
		//1.리스트의 크기대로 빈 배열 생성
		String[]arr = new String[list.size()];
		//2.값 복사
		list.toArray(arr);
		for(String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//5 값 각제) remove(인덱스) ,remove(요소의값)
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list);
		list.remove("Java");
		System.out.println(list.size());
		
		System.out.println(list);
		
		//6.모두 삭제 clear
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
	}
	
	public void linkedList() {
		//1.생성
		List<String>list = new LinkedList<String>();
		
		//2.값 할당
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java");
		list.add("Html");
		list.add("Css");
		
		list.add(1,"자바"); //기존데이터에 값을 넣어야할떄 링크드리스트사용하자 
		//3)크기
		System.out.println(list.size());
		
		//4)배열로 복사
		//1.리스트의 크기대로 빈 배열 생성
		String[]arr = new String[list.size()];
		//2.값 복사
		list.toArray(arr);
		for(String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//5 값 각제) remove(인덱스) ,remove(요소의값)
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list);
		list.remove("Java");
		System.out.println(list.size());
		
		System.out.println(list);
		
		//6.모두 삭제 clear
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
	}
	
	public static void main(String[] args) {
		UserList2 ul = new UserList2();
		
		System.out.println("==========ArrayList============");
		ul.useArrayList();
		System.out.println("==========Vector============");
		ul.useVector();
		System.out.println("=================LinkedList================");
		ul.linkedList();
	}
}
