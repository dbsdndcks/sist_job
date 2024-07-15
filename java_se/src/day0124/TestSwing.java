package day0124;

import java.awt.Frame;
import java.awt.Window;

import javax.swing.JFrame;
/**
 * 1.윈도우 컴포넌트(JWindwo,JFrame)을 상속
 */
@SuppressWarnings("serial")
public class TestSwing extends Window{
	
	public TestSwing(Frame f) {
		super(f);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestSwing(new Frame());
	}

}
