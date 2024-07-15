package day0117;

import day0110.Dog;

public class Mute extends Dog{

	public Mute(String name, int age) {
		setName(name);
		setAge(age);;
	}


	@Override
	public String job() {
		return "썰매를 끌자 " + getName();
	}


	@Override
	public String intro() {
		return "이름은 " + getName() + " 나이는 " + getAge();
	}
}