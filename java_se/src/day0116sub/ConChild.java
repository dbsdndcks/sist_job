package day0116sub;

import day0116.ConParent;

public class ConChild extends ConParent{
	
	int i = 0;
	
	public ConChild() {
		this(100);
		System.out.println("자식의 기본생성자");
		
	}
	
	public ConChild(int i) {
		super(100);
		System.out.println("자식의 인자 생성자 " + i);
	}
	
	//생성자에 this와 super를 적절하게 사용하여 아래와 같이 출력되도록 만들어보자
//	부모의 인자 생성자 2024 > 부모의 기본 생성자 > 자식의 기본생성자 > 자식의 인자 생성자 10
//	부모의 기본 생성자 > 부모인자 100 > 자식인자 100 > 자식기본
	public static void main(String[] args) {
		new ConChild();
		
	}
}
