package day0131Homework;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class JavaMemoEvent extends WindowAdapter implements ActionListener {
	
	private JavaMemoDesign jmd;
	private MemoFontDesign mfd;
	private JMenuItem jmiNew, jmiOpen, jmiSave, jmiClose, jmiFont, jmiHelp, jmiNewSave;
	private JTextArea jtaNote;
	private FileDialog fdSave;
	private boolean opend = false;
	private String agoData;
	private String nowData;
	private String fileName;
	public JavaMemoEvent(JavaMemoDesign jmd,MemoFontDesign mfd) {
		this.jmd = jmd;
		this.mfd = mfd;
	}
	public JavaMemoEvent(JavaMemoDesign jmd) {
		this.jmd = jmd;
		
		this.jmiNew = jmd.getJmiNewTest();
		this.jmiOpen = jmd.getJmiOpen();
		this.jmiNewSave = jmd.getJmiNewSave();
		this.jmiSave = jmd.getJmiSave();
		this.jmiClose = jmd.getJmiExit();
		this.jmiFont = jmd.getJmiFont();
		this.jmiHelp = jmd.getJmiMemoInfo();
		this.jtaNote = jmd.getJta();

		
		
		
	} // JavaMemoEvent

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jmiNew) {	// 새글
			try {
				newMemo();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // end if
		if(ae.getSource() == jmiOpen) {	// 열기
			try {
				openMemo();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // end if
		if(ae.getSource() == jmiNewSave) {
			try {
				newSaveMemo();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(ae.getSource() == jmiSave) {	// 저장
				try {
					saveMemo();
				} catch (IOException e) {
					e.printStackTrace();
				}
		} // end if
		if(ae.getSource() == jmiClose) {// 종료
			try {
				saveMemoAndFont();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // end if
		if(ae.getSource() == jmiFont) {	// 글꼴
			fontDialog();
		} // end if
		if(ae.getSource() == jmiHelp) {	// 메모장 정보
			helpDialog();
		} // end if
	} // actionPerformed
	
	private void newSaveMemo() throws IOException {
		openFile();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		jmd.dispose();
	} // windowClosing
	
	/**
	 * 새글
	 * JTA를 초기화한다
	 * @throws IOException 
	 */
	private void newMemo() throws IOException {
		//메모장의 내용이 없다면
		if(jtaNote.getText().isEmpty()) {
			jmd.setTitle("메모장 - 새글");
		}else if(opend == false){
			if(!jtaNote.getText().isEmpty()) {
			//저장여부 묻기
			switch(JOptionPane.showConfirmDialog(null, "저장하시겠습니까?")) {
			case JOptionPane.OK_OPTION : 
				saveMemo();
				jmd.getJta().setText("");
			}	
		}
	}else if(opend == true) {
		if(jmd.getJta().getText().equals(agoData)) {
			jmd.getJta().setText("");
		}else {
			switch(JOptionPane.showConfirmDialog(null, "저장하시겠습니까?")) {
			case JOptionPane.OK_OPTION :
				saveMemo();
				jmd.getJta().setText("");
			}
		}
	}
		
	} // newMemo


	/**
	 * 열기
	 * 만약 J.T.A에 내용이 없는 상태에서 열기를 누르면 파일다이얼고르를 통해 열기를 수행
	 * 열기를 하지 않는 상태에서 J.T.A에 내용이 있다면 저장여부를 묻고 저장후 열기를 수행
	 * @throws IOException 
	 */
	
	private void openMemo() throws IOException {
		
		
		if(jmd.getJta().getText().isEmpty()) {
			openFile();
			return;
		}//end if
		if(!opend) {
			if(!jmd.getJta().getText().isEmpty())
			switch(JOptionPane.showConfirmDialog(null, "저장하시겠습니까?")) {
			case JOptionPane.OK_OPTION :
				saveMemo();
				openFile();
				return;
			}
		}//end if
		if (opend) {
			nowData = jmd.getJta().getText();
			System.out.println(nowData);
			openFile();
			System.out.println(agoData);
			if (!nowData.equals(agoData)) {
					switch (JOptionPane.showConfirmDialog(null, "저장하시겠습니까?")) {
					case JOptionPane.OK_OPTION:		
						saveMemo(nowData);
						openFile();
						break;
					case JOptionPane.NO_OPTION:
						
					}
				}

			
		}
	} // openMemo
	/**
	 * 저장
	 * FileDialog를 “저장모드”로 생성하고
	  선택한 파일의 “경로와 파일명”을 저장을 앞에 붙여 
	  “타이틀 바”에 설정한다. =>저장 경로/파일명
	 * @throws IOException 
	 */
	private void saveMemo() throws IOException {
		FileDialog fdSave = new FileDialog(jmd, "저장", FileDialog.SAVE);
		fdSave.setVisible(true);
		String path = fdSave.getDirectory();
		String fName = fdSave.getFile();
		if (path == null) {
			return;
		} // end if
		File file = new File(path);
		BufferedWriter bw = null;
		//새로운 파일이면
		
			try {
				bw = new BufferedWriter(new FileWriter(file + "/" + fName));
				bw.write((jmd.getJta().getText()));
			} finally {
				if (bw != null) {
					bw.close();
				}
			}
	

	} // saveMemo
	
	//savememo 오버라이드
	private void saveMemo(String nowData) throws IOException {
		FileDialog fdSave = new FileDialog(jmd, "저장", FileDialog.SAVE);
		fdSave.setVisible(true);
		String path = fdSave.getDirectory();
		String fName = fdSave.getFile();
		if (path == null) {
			return;
		} // end if
		File file = new File(path);
		BufferedWriter bw = null;
		//새로운 파일이면
		
			try {
				bw = new BufferedWriter(new FileWriter(file + "/" + fName));
				bw.write(nowData);
			} finally {
				if (bw != null) {
					bw.close();
				}
			}
	

	} // saveMemo
	
	/**
	 * 종료
	 * 메모장을 종료한다 
	 */

	private void saveMemoAndFont() throws IOException {
		FileDialog fdSave = new FileDialog(jmd, "저장", FileDialog.SAVE);
		fdSave.setVisible(true);
		String path = fdSave.getDirectory();
		String fName = fdSave.getFile();
		if (path == null) {
			return;
		} // end if
		File file = new File(path);
		BufferedWriter bw = null;
		// 새로운 파일이면

		try {
			bw = new BufferedWriter(new FileWriter(file + "/" + fName));
			bw.write((jmd.getJta().getText()));
		} finally {
			if (bw != null) {
				bw.close();
			}
		}
		
		jmd.dispose();

	} // saveMemo

	
	/**
	 * 글꼴
	 * 다이얼로그를 현재 JTextArea의 
   	글꼴 적용상태로 설정하여 보여준다
	 */
	private void fontDialog() {
		new MemoFontDesign(jmd);
	} // fontDialog
	
	/**
	 * 메모장 정보
 	Dialog를 보여준다.
	 */
	private void helpDialog() {
		new MemoHelpDesign(jmd);
	} // helpDialog
	
	/**
	 * 파일 저장 메서드
	 * @throws IOException 
	 */
	
	public void openFile() throws IOException {
		FileDialog fdOpen = new FileDialog(jmd, "열기", FileDialog.LOAD);
		fdOpen.setVisible(true);
		String path = fdOpen.getDirectory();
		String fName = fdOpen.getFile();
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		try {
			File readFile = new File(path);
			br = new BufferedReader( new FileReader(readFile +"/" + fName));
			
			String lineData = "";
			while ((lineData = br.readLine()) != null) {
				sb.append(lineData+"\n");
			}//end while				
		}finally {
			if(br != null) { br.close(); } //end if
		}//end finally
		opend = true;			
		jmd.getJta().setText(sb.toString());
		agoData = jmd.getJta().getText();
	}

	
	

} // class