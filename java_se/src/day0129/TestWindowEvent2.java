package day0129;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class TestWindowEvent2 extends Frame{
	
	public TestWindowEvent2() {
		super("윈도우 이벤트 연습");
		//has a 관계의 이벤트 처리
		
		
		//Window Component를 이벤트에 등록
//		WindowAdapterSub was = new WindowAdapterSub(this);
//		addWindowListener(was);
		
		//annoymous inner class 로 처리 
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				//안쪽 클래스에서는 외부 클래스의 자원을 마음대로 사용할 수 있다.
				dispose();
			}		
		});
		
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestWindowEvent2();
	}
}
