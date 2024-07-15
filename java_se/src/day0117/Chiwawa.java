package day0117;

import day0110.Dog;

public class Chiwawa extends Dog{
	

	public Chiwawa(String name, int age) {
		setName(name);
		setAge(age);;
	}


	@Override
	public String job() {
		return "집을 지키자 " + getName();
	}


	@Override
	public String intro() {
		return "이름은 " + getName() + " 나이는 " + getAge();
	}

	

}
