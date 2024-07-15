package day0122;

//@Enum
public enum Week {
	
	MON("월요일",10),TUE("화요일", 20),WEN("수요일", 30),THU("목요일", 40),
	FRI("금요일", 50),SAT("토요일", 60),SUN("일요일", 70);

	private String name;
	private int value;
	
	Week(String name, int value) {
		this.name = name;
		this.value = value;
	}

	
	//요소로 할당된 이넘 객체에 저장값의 이름을 얻는 일을한다.
	//Week w = Week.MON; w.getName() => 월요
	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	

}

