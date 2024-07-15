package day0118;

import java.util.Arrays;
import java.util.Random;

/**
 * 숙제 1.
 * 8자리의 영문자 숫자로 구성된 임의의 비밀번호를 생성하여 반환하는 일을 하는 메서드를 작성하여 사용해라
 * 
 * 2.
 * 로또번호의(1~45)의 수중 하나를 뽑고 6자리의 세트로 구하여 반환하는 메서드를 작성하고 사용(중복x,오름차순정렬)출력
 * 3.
 * 아래의 데이터로 배열을 만들고, 임의의 방하나의 값을 출력
 * "어쩔티비,저쩔티비,뇌절티비,안물티비,안궁티비,때리고싶쥬,못떄리쥬,개킹받쥬
 */
public class Homework {
	
	Random random = new Random();

	
	//임의의 비밀번호 반환
	public String password() {
		
		String str ="";		
		int num2 = 0;
		
		for(int i=0 ; i<8 ; i++) {
			int num1 = random.nextInt(3);
			if(num1 == 0) {
				num2 = (char)random.nextInt(10)+48;
			}else if(num1 == 1) {
				num2 = (char)random.nextInt(26)+65;
			}else if(num1 == 2) {
				num2 = (char)random.nextInt(26)+97;
			}
			str += (char)num2;
		}

		return str;		
	}
	
	//로또 뽑기
	public int[] lotto() {
		int[]lotto = new int[6];
	    for (int i = 0; i < lotto.length; i++) {
            int randomNumber = random.nextInt(45) + 1;

            boolean Duplicate = false;
            for (int j = 0; j < i; j++) {
                if (lotto[j] == randomNumber) {
                    Duplicate = true;
                    break;
                }
            }
           if (Duplicate) {
                i--; 
            } else {
                lotto[i] = randomNumber;
            }
        }
		Arrays.sort(lotto);
		
		return lotto;
		
	}
	
	public static void main(String[] args) {
		//객체생성
		Homework homework = new Homework();

		
		//어쩔티비
		String[] str = "어쩔티비,저쩔티비,뇌절티비,안물티비,안궁티비,때리고싶쥬,못떄리쥬,개킹받쥬".replace(" ", "").split(",");
	
		//패스워드 메서드
		System.out.println(homework.password());
		
		//로또 메서드
		for(int lottoNum : homework.lotto()) {
			System.out.print(lottoNum +" ");
			
		}
		System.out.println();
		
		//배열 출력
		int num = homework.random.nextInt(str.length);
		System.out.println(str[num]);
	}
}