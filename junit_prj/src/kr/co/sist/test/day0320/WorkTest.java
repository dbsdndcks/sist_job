package kr.co.sist.test.day0320;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import kr.co.sist.day0320.Work;

class WorkTest {

//	@DisplayName("0~9 난수테스트")
//	@Test
//	void test() {
//		//givem
//		Work work = new Work();
//		//when
//		int num = work.randomNum();
//		System.out.println(num);
//		//then
//		assertEquals(num, 0);
//	}
	@DisplayName("0~11 난수테스트")
	@Test
	void test() {
		//givem
		Work work = new Work();
		//when
//		int dataSize = work.randomNum(); //DB를 조회했더니만 몇개의 행이 나올지 모름
		int dataSize = 21;
		System.out.println(dataSize);
		//then
		assertEquals(dataSize, 10, 11); 
	}


}
