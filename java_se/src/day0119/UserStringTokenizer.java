package day0119;

import java.util.StringTokenizer;

public class UserStringTokenizer {

	public UserStringTokenizer() {
	}

	int num = 0;

	public String[] csvData() {
		String data = "오늘은,불금.입니다.주말엔 역시 자바공부죠! 그쵸? 아닌가? 데헷";
		// 위의 문자열을 , 공백, . ! 로 구분하여 배열과 총 토큰수를 반환해봐라

		String del = " ,.!";
		int i = 0;

		StringTokenizer st = new StringTokenizer(data, del);
		num = st.countTokens();
		String[] arr = new String[num];
		while (st.hasMoreTokens()) {
			arr[i] = st.nextToken();
			i++;
		}
		return arr;
	}
	

	public void useCsvData() {

		for (String str : csvData()) {
			System.out.print(str + " ");
		}
		System.out.println("\n" + num);
	}


	// 메인
	public static void main(String[] args) {
		UserStringTokenizer ust = new UserStringTokenizer();
		ust.useCsvData();
	}

}
