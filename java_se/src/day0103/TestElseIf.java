package day0103;
/**
 * 다중 if (else ~ if) : 연관된 여러 조건을 비교할 때 사용
 * 문법)
 * 
 * if(조건식)
 * 조건에 맞을 때 수행할 문장들
 * else if
 * 조건에 맞을 때 수 행할 문장 들
 * else
 * 모든 조건에 맞지 않을때 수행할 문장들
 * 
 */

public class TestElseIf {
	

	public static void main(String[] args) {
		int score = 80;
		if(score < 0) {
			System.out.println("0보다 작아서 실패");
		}else if(score > 100) {
			System.out.println("100보다 커서 실패");
		}else {
			System.out.println("성공");
		}
		
		char word ='}';
		if(64 < word && 97 > word) {
			System.out.println("대문자");
		}else if(48<= word && 57 >= word) {
			System.out.println("숫자");
		}else if(97 <= word && 122 >= word){
			System.out.println("소문자");			
		}else {
			System.out.println("영어나 숫자가 아닙니다");
		}
		
		
		
	}

	public String animal(int birthYear) {
		birthYear = birthYear%12;
		String animal = "";
		if(birthYear == Zodiac.MONKEY) {
			animal = "원숭이";
		}else if(birthYear == Zodiac.CHICKEN) {
			animal = "닭";
		}else if(birthYear == Zodiac.DOG) {
			animal = "개";
		}else if(birthYear == Zodiac.PIG) {
			animal = "돼지";
		}else if(birthYear == Zodiac.MOUSE) {
			animal = "쥐";
		}else if(birthYear == Zodiac.COW) {
			animal = "소";
		}else if(birthYear == Zodiac.TIGER) {
			animal = "호랑이";
		}else if(birthYear == Zodiac.RABBIT) {
			animal = "토끼";
		}else if(birthYear == Zodiac.DRAGON) {
			animal = "용";
		}else if(birthYear == Zodiac.SNAKE) {
			animal = "뱀";
		}else if(birthYear == Zodiac.HORSE) {
			animal = "말";
		}else {
			animal = "양";
		}
		return animal;
	}
}