package day0207;

import java.io.Serializable;


public class UserData implements Serializable{
	
	/**
	 * 식별할 아이디
	 */
	 private static final long serialVersionUID = -23479827491827398L;
	
	/**
	 * java.lang.Object
		java.lang.String
		All Implemented Interfaces:
		Serializable, CharSequence, Comparable
	 */
	private String name; //참조형 데이터형은 직렬화가 되지않는다 하지만 implements Serializable를 수행한 클래스는 직렬화 가능
	private double height,weigth; // 기본형 데이터 형은 직렬화가 지원됨
//	private transient  직렬화때 밖으로 나가면 안될 중요한 데이터는 transient를 붙힌다. (직렬화불가능 -> 외부로 노출안됨)
	public UserData() {
	}

	
	
	public UserData(String name, double height, double weigth) {
		super();
		this.name = name;
		this.height = height;
		this.weigth = weigth;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	@Override
	public String toString() {
		return "UserData [name=" + name + ", height=" + height + ", weigth=" + weigth + "]";
	}
	
	
	

}//class
