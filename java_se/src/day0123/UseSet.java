package day0123;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UseSet {

	public UseSet() {
		//1.생성
		Set<String>set = new HashSet<String>();
		//2.값 할당 - 입력되는값은 순차적으로 입력되지 않는다
		set.add("루피");
		set.add("윤웅찬");
		set.add("쵸파");
		set.add("조로");
		set.add("나미");
		set.add("에이스");
		set.add("김병년");
		
		//중복값은 입력되지 않는다.
		set.add("루피");
		
		//크기
		System.out.println(set + " " + set.size());
		
		//삭제
		set.remove("김병년"); //d일치하는 객체가 존재하면 삭제

		//비엇는지
		set.isEmpty();
		
		//set의 값 얻기 (검색의 기능이 없다)
		//1.Iterator에 제어권 이양
		//2.반복문을 사용하여 요소가 존재하는지 판단
		Iterator<String>is = set.iterator();
		while(is.hasNext()) {
		System.out.println(is.next());
		}
		
		//배열의 복사
		//1.set의 크기만큼 빈배열 생성
		Iterator<String>is2 = set.iterator();
		int i = 0;
		String[]arr = new String[set.size()];
		while(is2.hasNext()) {
			arr[i] = is2.next();
			i++;
		}
		for(String s : arr) {
			System.out.print(s + " ");
		}
	}
	public static void main(String[] args) {
		new UseSet();
	}
}
