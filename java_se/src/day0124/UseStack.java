package day0124;

import java.util.Stack;

public class UseStack {
	
	public UseStack() {
		//1.생성
		Stack<String>stk = new Stack<String>();
		//2.값 할당
		stk.push("로아 골드 쌀먹");
		stk.push("오늘은");
		stk.push("쌀먹하는");
		stk.push("날입니다");
		
		//3.값 얻기 ) - 얻어낸 item은 사라진다
//		while(!stk.empty()) {
//			System.out.println(stk.pop());
//		}
		
		for(String value : stk) {
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		new UseStack();
	}
	
}
