package kr.co.sist.memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import day0131.StudentInfoDesign;

public class StudentManagementEvent extends WindowAdapter implements ActionListener,MouseListener{

	
	
	private StudentInfoDesign sid;
	
	public StudentManagementEvent(StudentInfoDesign sid) {
		this.sid = sid;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == sid.getJbtAdd()) {	
			addInfo();
		}
		if(ae.getSource() ==sid.getJbtEdit()) {
			changeInfo();
		}
		if(ae.getSource() == sid.getJbtRemove()) {
			deleteSelectedInfo();
		}
		if(ae.getSource() == sid.getJbtExit()) {
			exitProgram();
		}
	}

	public void exitProgram() {
		sid.dispose();
	}

	public void deleteSelectedInfo() {
		String name = sid.getJtfName().getText().trim();
		DefaultListModel<String>dlm = sid.getDlm();
		for(int i=0 ; i < dlm.getSize() ; i++) {
			if(dlm.getElementAt(i).startsWith(name)) {
				dlm.remove(i);
			}

		}
	}
	public void changeInfo() {
		String name = sid.getJtfName().getText().trim();
		String age = (String) sid.getDcbm().getSelectedItem();
		String phoneNum = sid.getJtfPhoneNumber().getText().trim();
		String gender = sid.getJrbMen().isSelected()?"남자":"여자";
		String str = name + "," + age + "," + gender + "," + phoneNum;			
		DefaultListModel<String>dlm = sid.getDlm();
		for(int i=0 ; i < dlm.getSize() ; i++) {
			if(dlm.getElementAt(i).startsWith(name)) {
				dlm.setElementAt(str, i);
			}
		}
		//컴포넌트 초기화

		sid.getJtfName().setText("");
		sid.getJtfPhoneNumber().setText("");
		sid.getDcbm().setSelectedItem(20);
		sid.getJrbMen().setSelected(true);
		sid.getJtfName().requestFocus();

	}
	public void addInfo() {
		String name = sid.getJtfName().getText().trim();
		String age = (String) sid.getDcbm().getSelectedItem();
		String phoneNum = sid.getJtfPhoneNumber().getText().trim();
		String gender = sid.getJrbMen().isSelected()?"남자":"여자";
		String str = name + "," + age + "," + gender + "," + phoneNum;
		DefaultListModel<String>dlm = sid.getDlm();
		if(name.isEmpty()) {
			JOptionPane.showMessageDialog(sid, "이름은 필수 입력입니다");
			sid.getJtfName().requestFocus();
			return;
		}
		dlm.addElement(str);
		//컴포넌트 초기화
		sid.getJtfName().setText("");
		sid.getJtfPhoneNumber().setText("");
		sid.getDcbm().setSelectedItem(20);
		sid.getJrbMen().setSelected(true);
		sid.getJtfName().requestFocus();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		DefaultListModel<String>dlm = sid.getDlm();
		JList<String> jl=sid.getJl();
		String value=dlm.getElementAt(jl.getSelectedIndex());
		dlm.remove(jl.getSelectedIndex());
		System.out.println( value);
	}


	@Override
	public void mousePressed(MouseEvent e) {
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		sid.getJtfName().requestFocus();
	}
	
	
	

	
	
}

