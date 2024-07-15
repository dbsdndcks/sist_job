package day0426;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CounterVO {
	private int cnt;
	
	public CounterVO() {
		System.out.println("CounterVO 기본 생성자");
	}

	public void setCnt(int cnt) {
		this.cnt += cnt;
	}
	
	
	
}
