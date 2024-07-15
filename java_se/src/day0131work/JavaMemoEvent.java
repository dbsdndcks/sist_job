package day0131work;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JavaMemoEvent extends WindowAdapter implements ActionListener{

	private JavaMemoDesign jmd;
	
	public JavaMemoEvent(JavaMemoDesign jmd) {
		this.jmd = jmd;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jmd.getJmiNewTest()) {
			newMemo();
		}
		if(ae.getSource() == jmd.getJmiOpen()) {
			openMemo();
		}
		if(ae.getSource() == jmd.getJmiSave()) {
			saveMemo();
		}
		if(ae.getSource() == jmd.getJmiExit()) {
			closeMemo();
		}
		if(ae.getSource() == jmd.getJmiFont()) {
			new MemoFontDesign(jmd);
		}
		if(ae.getSource() == jmd.getJmiMemoInfo()) {
			new MemoHelpDesign(jmd);
		}
	}//actionPerformed

	public void closeMemo() {
		jmd.dispose();
	}

	public void saveMemo() {
		FileDialog fdSave = new FileDialog(jmd,"저장",FileDialog.SAVE);
		fdSave.setVisible(true);
		String path = fdSave.getDirectory();
		String fName = fdSave.getFile();
		System.out.println(path + fName);
		if(path != null) {	
		jmd.getJta().setText("저장 " + path + fName);;
		}
	}//saveFile

	public void openMemo() {
		FileDialog fdOpen = new FileDialog(jmd,"열기",FileDialog.LOAD);
		fdOpen.setVisible(true);
		String path = fdOpen.getDirectory();
		String fName = fdOpen.getFile();
		System.out.println(path + fName);
		if(path != null) {
		jmd.getJta().setText("열기 " +path + fName);
		
		}
	}//fileOpen

	public void newMemo() {
		jmd.getJta().setText(null);
		jmd.requestFocus();
	}//formatText
	
	
}//class
