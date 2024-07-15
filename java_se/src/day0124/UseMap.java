package day0124;

import java.util.HashMap;
import java.util.Map;

/**
 * 키의 값 쌍으로 이루어진 데이터
 */
public class UseMap {
	
	/**
	 * 기본 생성자를 사용하여 생성하면 11개의 행이 생성되는 Hashtable의 사용.
	 * 속도느림
	 */
	public void useHashtable() {
		//1.Map생성
		Map<String, String>map = new HashMap<String, String>();
		//2,Map 값 설정 )map.put(키,값) - 순서대로 입력되지 않는다.
		map.put("A", "세심하다,친절하다 ^0^b");
		map.put("B", "성질더럽다. -..-");
		map.put("AB", "싸이코 @.@"); 
		map.put("O", "우유부단~(^^~)");
		
		//키가 중복되면 같은 키에 덮어 쓴다.
		map.put("A", "소심하다 (>0<)");
		//키가 다르면 중복값 혀용
		map.put("a", "소심하다 (>0<)");
		System.out.println(map);
		
		//검색
		String key = "A";
		String value = map.get(key);
		System.out.println(key +"의 특징: "+value);
		
		//맵에 키가 존재하는지?
		System.out.println(map.containsKey("ab"));
		
		 key = "B";
		if(map.containsKey(key)) {
			value = map.get(key);
			System.out.println(key + value);
		}else {
			System.out.println(key + "준비 x");
		}
		
		//삭제
		map.remove("a");
		System.out.println(map);
	}
	/**
	 * 기본 생성자를 사용하여 생성하면 16개의 행이 생성되는 HashMap의 사용
	 * 속도빠름
	 * 
	 */
	public void useHashMap() {
		//1.Map생성
		Map<String, String>map = new HashMap<String, String>();
		//2,Map 값 설정 )map.put(키,값) - 순서대로 입력되지 않는다.
		map.put("A", "세심하다,친절하다 ^0^b");
		map.put("B", "성질더럽다. -..-");
		map.put("AB", "싸이코 @.@"); 
		map.put("O", "우유부단~(^^~)");
		
		//키가 중복되면 같은 키에 덮어 쓴다.
		map.put("A", "소심하다 (>0<)");
		//키가 다르면 중복값 혀용
		map.put("a", "소심하다 (>0<)");
		System.out.println(map);
		
		//검색
		String key = "A";
		String value = map.get(key);
		System.out.println(key +"의 특징: "+value);
		
		//맵에 키가 존재하는지?
		System.out.println(map.containsKey("ab"));
		
		 key = "B";
		if(map.containsKey(key)) {
			value = map.get(key);
			System.out.println(key + value);
		}else {
			System.out.println(key + "준비 x");
		}
		
		//삭제
		map.remove("a");
		System.out.println(map);
	}
	public static void main(String[] args) {
		UseMap um = new UseMap();
		System.out.println("-------------Hashtable---------------");
		um.useHashtable();
		System.out.println("-------------HashMap---------------");
		um.useHashMap();
	}
}
