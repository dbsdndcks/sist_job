package day0205;

import java.io.File;

import javax.swing.JOptionPane;

public class HomeWork {

	public HomeWork() {
		JOptionPane jsp = new JOptionPane();
		String fileName = jsp.showInputDialog("삭제할 파일의 경로와 파일명");
		File file = new File(fileName);
		if(file.exists()) {
			switch(JOptionPane.showConfirmDialog(null,"파일을삭제하시겠습니까?")) {
			case JOptionPane.OK_OPTION : file.delete();
			}
			
			file.delete();
		}else {
			JOptionPane.showMessageDialog(null, fileName +"은 존재하지않습니다");
		}
	}
	
	public static void main(String[] args) {
		new HomeWork();
	}

}
