package day0124;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

public class HomeWork {	
	Map<Integer, MemberVO>map = new HashMap<Integer, MemberVO>();
	private final int INPUTDATA = 1;
	private final int SEARCHDATA = 2;
	private final int ENDPROGRAM = 3;
	
	String[]inputArr = null;
	

	
	public void inputMenu() {
		boolean exitFlag = false;
		
		do {
			String inputData = JOptionPane.showInputDialog("1.입력 2.검색 3.종료");;
			int choiceNum = parseInt(inputData);
			
		switch(choiceNum) {
		case INPUTDATA : saveData();
		break;
		case SEARCHDATA : printData();
		break;
		case ENDPROGRAM :  exitFlag = true; // 프로그램 종료를 위해 exitFlag를 true로 설정
        break;
		}
		}while(!exitFlag);
	}
	public void saveData() {
		String inputInfo = JOptionPane.showInputDialog("학생번호,이름,자바점수,오라클점수 입력\n출력을 입력하면 출력됩니다.");
		inputArr = inputInfo.split(",");
		inputData(inputArr);
	}

	public void printData() {
	    System.out.println("번호\t이름\t자바\t오라클\t총점\t평균");
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		MemberVO voValue;
		
		while(iter.hasNext()) {
			voValue = map.get(iter.next());
			System.out.println(voValue);
			
		}		
	}

	public void inputData(String[] inputArr) {
		int studentNum = parseInt(inputArr[0]);
		String name = inputArr[1];
		int java = parseInt(inputArr[2]);
		int oracle = parseInt(inputArr[3]);
		
		if(map.containsKey(studentNum)) {
			JOptionPane.showConfirmDialog(null,"이미 존재하는 번호입니다"); 
		}else {
			MemberVO VO = new MemberVO(studentNum, name, java, oracle);
			map.put(studentNum, VO);
		}
	}
	public static void main(String[] args) {
		HomeWork hm = new HomeWork();
		hm.inputMenu();
	}
}