package day0207;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class FileCopy extends JFrame implements ActionListener{

	private JLabel jlOutput;
	
	public FileCopy() {
		super("파일 복사");
		
		JButton jbtnCopy = new JButton("복사할 파일 선택");
		jlOutput = new JLabel("복사할 파일을 선택해주세요.");
		JPanel jpCenter =new JPanel();
		jpCenter.add(jbtnCopy);
		jpCenter.add(jlOutput);
		jlOutput.setBorder(new TitledBorder("출력"));
		
		add("Center",jpCenter);
		add("South",jlOutput);
		
		jbtnCopy.addActionListener(this);
		
		setBounds(100,100,300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//FileCopy
	
	public void fileCopy() throws IOException {
		//원본파일명 얻기
		FileDialog fdOpen = new FileDialog(this,"복사할 파일 선택",FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		if(fdOpen.getDirectory() == null) {
			return;
		}
		
		File fileOrigin = new File(fdOpen.getDirectory()+fdOpen.getFile());
		if(!fileOrigin.exists()) {
			JOptionPane.showMessageDialog(this, "파일이 존재하지 않습니다");
			return;
		}//end if
		
		//복사할 파일명을 생성 : 원본파일명_bak.확장자 => a.txt => a_bak.txt
		StringBuilder tempFile = new StringBuilder(fileOrigin.getAbsolutePath());
		tempFile.insert(tempFile.lastIndexOf("."),"_bak");
		File fileCopy = new File(tempFile.toString());
		
		//16비트 스트림연결
		//읽기 - 단순txt,html,xml,json.java... 
		//읽기 불가능 : 그외
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br=new BufferedReader(new FileReader(fileOrigin));
			bw=new BufferedWriter(new FileWriter(fileCopy));
			
			String temp="";
			//줄단위로 읽어들여 (\n 전까지 읽어 들인다
			while((temp=br.readLine())!=null) {
				bw.write(temp); //읽어들인 내용을 스트림에 기록
			}
			bw.flush();
			
			jlOutput.setText(fileCopy.getName() + "파일명으로 복사됨");
		}finally {
			if(br != null) {br.close();}
			if(bw != null) {bw.close();}
		}
	}		
		//N-I/O를 사용한 파일복사(====================
//		Path originPath = Paths.get(fileOrigin.getAbsolutePath());
//		Path copyPath = Path.of(fileCopy.getAbsolutePath());
//		
//		Files.copy(originPath, copyPath, StandardCopyOption.REPLACE_EXISTING);
//		
//		//============================================================           
//		BufferedWriter bw = new BufferedWriter(new FileWriter(fileCopy));
//		
//		//스트림 연결
//		//읽기
//		FileInputStream fis =null;
//		//쓰기
//		FileOutputStream fos = null;
//		
//		try {
//			fis = new FileInputStream(fileOrigin);
//			fos = new FileOutputStream(fileCopy);
			
			//<하드디스크(HDD)의 특성을 무시한 코드>
//			//파일에서 읽어들여
//			int data = 0;
//			while( (data = fis.read()) != -1) {
//				//복사할 파일에 연결된 스트림에 쓰고
//				fos.write(data);
//			}
//			//스트림에 남아있는 내용을 목적지 파일에 분출한다
//			fos.flush();
			
			//<하드디스크(HDD)의 특성을 고려한 코드>
			//1. HDD 한번에 512byte를 읽어 들여옴으로 그값을 저장할 빈 배열을 생성
//			byte[]data = new byte[512];
//			//2. HDD에서 읽어들인 내용을 빈 배열에 저장하고 크기를 변수에 저장
//			int dataSize = 0;
//			while((dataSize = fis.read(data)) != -1) {
//				//3. 배열에 값을 존재하는크기까지만 출력
//				fos.write(data, 0 , dataSize);
//			}//end while
//			//4. 스트림에 남은 내용을 목적지로 분출
//			fos.flush();
//			
//			jlOutput.setText(fileCopy.getName()+ "파일명으로 복사가 되었습니다");
//		}finally {
//			//연결을 끊는다
//			if(fis != null) {fis.close();}
//			if(fos != null) {fos.close();}
//		}
//	}//FileCopy()
	
	
	
	public static void main(String[] args) {
		new FileCopy();
		
	}//main



	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			fileCopy();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "문제발생");
			e.printStackTrace();
		}
	}

}//class
