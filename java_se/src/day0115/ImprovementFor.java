package day0115;
/**
 * 개선된 for
 * -배열.collection의 처음 방부터 끝방까지 순차적으로 출력해야할때
 * for(방의 값을 저장할 변수 : 대상)
 * 변수명
 */
public class ImprovementFor {

	public static void main(String[] args) {
		int[]arr = {2024,1,15,12,19};
		for(int value : arr) {
			System.out.println(value);
		}
	}

}
