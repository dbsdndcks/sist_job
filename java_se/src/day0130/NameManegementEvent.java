package day0130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//이벤트를 모아 처리하기위해 작성
public class NameManegementEvent extends WindowAdapter implements ActionListener{

	private NameManagementDesign nmd;
	
	public NameManegementEvent(NameManagementDesign nmd) {
		this.nmd = nmd;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == nmd.getJbtnAdd()) {
			addName();
		}
		if(ae.getSource() == nmd.getJbtnRemove()) {
			removeName();
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {
			nmd.dispose();			
		}
	
	private void addName() {
		JTextField jtfName = nmd.getJtfName();
		String name = jtfName.getText().trim();
		
		if(!name.isEmpty()) {
			//Model객체에 값을 설정한다.
			nmd.getDlmName().addElement(name);
			jtfName.setText("");
			jtfName.requestFocus();
		}
	}
	private void removeName() {
		JTextField jtfName = nmd.getJtfName();
		//하나만삭제
//		nmd.getDlmName().removeElement(jtfName.getText().trim());
		//모두 삭제
	//	nmd.getDlmName().removeAllElements();		
		DefaultListModel<String>dlmName = nmd.getDlmName();
		
		List<String>list = new ArrayList<String>();
		String tempName="";
		for(int i=0 ; i < dlmName.size() ; i++) {
			tempName = dlmName.getElementAt(i);
			if(!jtfName.getText().equals(tempName)) {
				list.add(tempName);
			}
		}
		dlmName.removeAllElements();
		for(String name : list) {
			dlmName.addElement(name);
		}
	}
	
}

