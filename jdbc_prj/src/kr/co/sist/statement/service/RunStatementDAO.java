package kr.co.sist.statement.service;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import kr.co.sist.statement.dao.StatementDAO;
import kr.co.sist.statement.vo.EmployeeVO;

import static java.lang.Integer.parseInt;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import static java.lang.Double.parseDouble;;

public class RunStatementDAO {

	/**
	 * CRUD 사용하는 클래스
	 */
	public void addEmp() {
		String inputDate = JOptionPane.showInputDialog("추가할 사원정보를 입력해주세요.\n사원번호,사원명,직무,연봉");
		if (inputDate != null) {
			String[] tempDate = inputDate.split(",");
			if (tempDate.length != 4) {
				JOptionPane.showMessageDialog(null, "올바른 형식을 입력해주세요");
				return;
			}//end if
			
			//입력된 데이터를 하나로 묶어서 관리
			try {
			EmployeeVO eVO = new EmployeeVO(parseInt(tempDate[0]),tempDate[1],tempDate[2],parseDouble(tempDate[3]), null);
			//DB에 추가하면 된다
			StatementDAO sDAO = new StatementDAO();
			try {
				sDAO.insertEmp(eVO);
				JOptionPane.showMessageDialog(null, tempDate[0] + "번 사원정보가 추가되되었습니다");
			}catch (SQLException se) {
				se.printStackTrace();
				String errMsg="";
				switch(se.getErrorCode()) {
				case 1 : errMsg = "사원번호가 중복되었습니다."; break;
				case 12899 : errMsg = "사원명과 직무는 한글 3자까지만 가능합니다."; break;				
				case 1438 : errMsg = "연봉은 정수5자리 실수 2자리로 입력가능합니다."; break;	
				default : errMsg = "문제가 발생했습니다 .";
				}
				JOptionPane.showMessageDialog(null, errMsg);
			}
		
			}
			catch(NumberFormatException nfe) {
				nfe.printStackTrace();
			}
		}//end if
	}// addEmp

	public void modifyEmp() {
		String inputData = JOptionPane.showInputDialog
				("사원정보 변경\n사원번호,직무,연봉을 입력하면 사원번호에 해당하는 사원의 직무와 연봉을 변경합니다.");
		if(inputData != null) {
			String[] tempData = inputData.split(",");
			if(tempData.length != 3) {
				JOptionPane.showMessageDialog(null, "입력은 사원번호,직무,연봉의 형식입니다");
				return;
			}//end if
			
			try {
			EmployeeVO eVo = new EmployeeVO(parseInt(tempData[0]), null, tempData[1], parseDouble(tempData[2]), null);
			
			//DBMS의 update작업을 수행
			StatementDAO sDAO = new StatementDAO();
			int cnt = sDAO.updateEmp(eVo);  //0~n건 변경
			
			String msg =  tempData[0] + "번 사원은 존재하지 않습니다. 사원번호를 확인해주세요";
			if(cnt != 0) {
				msg = tempData[0] + "번으로 " + cnt + "건 변경 되었습니다";
			}
			
			JOptionPane.showMessageDialog(null, msg);
			
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null, "사원번호와 연봉은 숫자형태 입니다");
			}catch(SQLException se){
				se.printStackTrace();
				
				String errMsg="";
				switch(se.getErrorCode()) {
				case 12899 : errMsg = "직무는 한글 3자까지만 가능합니다."; break;				
				case 1438 : errMsg = "연봉은 정수5자리 실수 2자리로 입력가능합니다."; break;	
				default : errMsg = "문제가 발생했습니다 .";
				}
				JOptionPane.showMessageDialog(null, errMsg);
			}//end catch
		}//end if
		
		
	}// modifyEmp

	public void removeEmp() {
		String inputData = JOptionPane.showInputDialog("삭제할 사원의 사원번호를 입력하세요");
		if(inputData == null) {
			JOptionPane.showMessageDialog(null, "입력값이 없습니다 초기화면으로 돌아갑니다");
			return;
		}
		//유효성검증 (사원번호는 숫자 4자리)
		if(inputData.length() > 4) {
			JOptionPane.showMessageDialog(null, "사원번호는 4자리입니다");
			return;
		}
		
		try {
			StatementDAO sDAO = new StatementDAO();
			int empno = parseInt(inputData);
			int isNull = sDAO.deletetEmp(empno);
			if(isNull == 0) {
				JOptionPane.showMessageDialog(null, "존재하지 않는 사원입니다");
			}else if(isNull == 1){
				JOptionPane.showMessageDialog(null,inputData+"회원내용 삭제완료");
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// removeEmp

	public void searchAllEmp() {
		//DBMS에서 저회된 결과를 받아서 사용자에게 보여준다.
		StatementDAO sDAO = new StatementDAO();
		try {
		List<EmployeeVO> listAllEmp = sDAO.selectAllEmp();
		StringBuilder output = new StringBuilder();
		output.append("사원번호\t사원명\t직무\t연봉\t입사일\t\n");
		if(listAllEmp.isEmpty()) {
			output.append("데이터가 없습니다");
		}else {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
			for(EmployeeVO eVO : listAllEmp) {
				output
				.append(eVO.getEmpno()).append("\t")
				.append(eVO.getEname()).append("\t")
				.append(eVO.getJob()).append("\t")
				.append(eVO.getSal()).append("\t")
				.append(sdf.format( eVO.getHiredate())).append("\n");
			}//end for
		}//end else
		
		JTextArea jta = new JTextArea(output.toString(),10,80);
		JScrollPane jsp = new JScrollPane(jta);
		JOptionPane.showMessageDialog(null, jsp);
		
		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}// searchAllEmp

	
	public void searchOneEmp() {
		String inputData = JOptionPane.showInputDialog("사원검색\n사원번호를 입력해주세요");
		if (inputData == null) {
			JOptionPane.showMessageDialog(null, "사원번호를 입력해주세요");
			return;
		}
		try {
			int empno = parseInt(inputData);
			// DBMS에서 조회된 결과를 받아서 사용자에게 보여준다.
			StatementDAO sDAO = new StatementDAO();

			EmployeeVO eVO = sDAO.selectOneEmp(empno);
			
			StringBuilder output = new StringBuilder();
			output.append(empno).append("번 사원번호 검색 결과\n");
			if(eVO == null){
				output.append("사원번호를 확인하세요.");
			}else {
				output.append("사원명 : ").append(eVO.getEname()).append("\n");				
				output.append("직무 : ").append(eVO.getJob()).append("\n");				
				output.append("연봉 : ").append(eVO.getSal()).append("\n");				
				SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
				output.append("입사일 : ").append(sdf.format(eVO.getHiredate()));				
			}
			
			JTextArea jta = new JTextArea(output.toString(),10,80);
			JScrollPane jsp = new JScrollPane(jta);
			JOptionPane.showMessageDialog(null, jsp);
			
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "사원번호는 숫자형태 이어야합니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// searchOneEmp
	
	
	
	public void menu() {
		boolean exitFlag = false;
		String inputMenu = "";

		do {
			inputMenu = JOptionPane.showInputDialog("메뉴 선택\n1.사원정보추가 2.사원정보변경 3.사원정보삭제 4.전체사원검색 5.특정사원검색 6.나가기");
			if (inputMenu != null) {
				switch (inputMenu) {
				case "1":addEmp();break;
				case "2":modifyEmp();break;
				case "3":removeEmp();break;
				case "4":searchAllEmp();break;
				case "5":searchOneEmp();break;
				case "6": exitFlag = true; break;
				default:JOptionPane.showMessageDialog(null, "메뉴는 1,2,3,4,5,6번중 하나만 입력해주세요");
				}
			}
		} while (!exitFlag);
	}// menu

	public static void main(String[] args) {
		RunStatementDAO rsDAO = new RunStatementDAO();
		rsDAO.menu();

	}// main
}// class
