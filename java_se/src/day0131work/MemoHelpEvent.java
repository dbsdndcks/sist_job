package day0131work;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class MemoHelpEvent extends WindowAdapter implements ActionListener{

	private MemoHelpDesign mhd;
	
	public MemoHelpEvent(MemoHelpDesign mhd) {
		this.mhd = mhd;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == mhd.getJbtn()) {
			mhd.dispose();
		}
	}

}
