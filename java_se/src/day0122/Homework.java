package day0122;

import java.time.LocalDate;
import java.time.YearMonth;

/**
 * Calendar 클래스를 사용하여 1월의 달력을 출력해보세요
 * 
 * 2.매개변수로 년월을 입력받아 해당 년월에 대한 마지막일 까지를 일차원 배열ㅇ ㅔ할당하여 바환하는 일을 하는 method를 작성해 보세요.
 * (마지막 일을 하는 method를 찾아볼것. -LocalDate 클래스를 사용해볼것
 */

import java.util.Calendar;

public class Homework {
	
	Calendar calendar = Calendar.getInstance();
	//1월의 첫번째 일 = 1
	//-1을 해줘야지 정확한 요일이 나온다
	int startWeek = calendar.get(calendar.DAY_OF_WEEK)-1;
	StringBuilder sb = new StringBuilder();
	StringBuilder sb1 = new StringBuilder();
	
	
	public Homework() {
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//만약 그달의 시작이 일요일부터면 붙혀서 출력하고 아니라면 하나의 요일당(" \t")를 붙혀서 출력
		switch (startWeek) {
		case 7: sb.append(" \t");
		case 6: sb.append(" \t");
		case 5: sb.append(" \t");
		case 4: sb.append(" \t");
		case 3: sb.append(" \t");
		case 2: sb.append(" \t");
		
		}
		
		int countDay = startWeek;
		for(int i=1; i<=31; i++) {
			sb.append(i + "\t");
			if(countDay%7 == 0) {
				sb.append("\n");
			}
			countDay++;
		}
		System.out.println(sb);
		
	}
	
    public void lastDay(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);

        int lastDay = firstDayOfMonth.lengthOfMonth();

        int[] result = new int[lastDay];
        for (int i = 0; i < lastDay; i++) {
            result[i] = i + 1;
        }

        sb1.append(year +"년도의 " + month + "월의 일수 : ");
        for(int r: result) {
        	sb1.append(r + " ");
        }
        System.out.println(sb1);
    }
	

	public static void main(String[] args) {
		Homework home = new Homework();
		System.out.println();
		home.lastDay(2024, 2);
	}

}
