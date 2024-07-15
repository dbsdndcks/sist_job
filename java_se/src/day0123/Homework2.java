package day0123;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
//		String inputData = JOptionPane.showInputDialog("이름을 입력해 주세요");
//		StringBuilder sb = new StringBuilder();
//		public static void main(String[] args) {
//		if("윤웅찬".equals(inputData)) {
//			sb.append("조원동의 자랑 ");
//		}
//		sb.append(inputData).append("님");
//		System.out.println(sb);


public class Homework2 {

	private List<WorkVO> list;
	public static final int CSV_DATA = 3;
	
	
	public Homework2() {
		list = new ArrayList<WorkVO>();
	}//HomeWork2
	
	int cnt = 0;
	
	
	/**
	 * 메뉴를 입력 받아서 CSV데이터인지, 출력, 종료 인지를 판단하여
	 * 해당 method를 호출하는 일
	 */
	public void inputMenu() {
		
		boolean exitFlag = false;
		String inputData = "";
		String[] inputArr = null; //CSV데이터를 저장할 배열
		
		
		
		
		do{ //반드시 한번은 돌아야하기 때문에
			
			inputData = JOptionPane.showInputDialog("이름,자바점수,오라클점수 입력\n출력을 입력하면 출력됩니다.\n중료하실려면 Y,y를 눌러주세요");
			
			if(inputData != null) {
			inputArr = inputData.split(",");
			
			switch(inputArr.length) {
			case CSV_DATA:
				inputData(inputArr);
			default:
				if("출력".equals(inputData)) {
					printData();
				}//end if
				
				exitFlag = "Y".equals(inputData) || "y".equals(inputData);
				
			}//end switch
			
			}//end if
		}while(!exitFlag);
	}//inputMenu	
	
	
	
	
	public void inputData(String[] inputArr) {
		String name = inputArr[0];
		int java = Integer.parseInt(inputArr[1]);
		int oracle = Integer.parseInt(inputArr[2]);
		
		WorkVO vo = new WorkVO(name, java, oracle);
		
		list.add(vo);
	}
	
	
	
	/**
	 * 출력 메서드
	 */
	public void printData() {
		System.out.println("번호\t이름\t자바\t오라클\t총점");
		WorkVO wVO = null;
		
		for(int i=0 ; i<list.size() ; i++) {
			wVO = list.get(i);
			System.out.print((i+1) + "\t" + wVO.getName() + "\t" + wVO.getJava() + "\t"
		+ wVO.getOracle() + "\t" + (wVO.getOracle()+wVO.getJava()) +"\n");
		}//end for
	}//end printData
	
	
	
	/**
	 * 종료 메서드
	 */
	public boolean exitProgram(char key) {
		return key == 'Y' || key == 'y';	
	}//exitProgram



	public static void main(String[] args) {
		
		Homework2 hm = new Homework2();
		hm.inputMenu();
	}
}