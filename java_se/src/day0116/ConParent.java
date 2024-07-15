package day0116;

import day0116sub.ConChild;

public class ConParent {
	
	int i = 0;
	public ConParent() {
		
		System.out.println("부모의 기본생성자");
	}
	public ConParent(int i) {
		this();
		System.out.println("부모의 인자 생성자 " + i);
		
	}
}
