package kr.co.sist.statement.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.statement.vo.EmployeeVO;

/*
 * DAO (Data Acess Object)
 */
public class StatementDAO {

	public void insertEmp(EmployeeVO eVO)throws SQLException{;
		//1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";
		
		Connection con = null;
		Statement stmt = null;
		try {
			//2. 커넥션 얻기
			con = DriverManager.getConnection(url,id,pass);
			//3. 쿼리문 생성객체 얻기			
			stmt = con.createStatement();
			//4. 쿼리문 수행후 결과 얻기
			StringBuilder insertEmployee = new StringBuilder();
			insertEmployee
			.append("insert into employee (empno,ename,job,sal) values(")
			.append(eVO.getEmpno()).append(",'").append(eVO.getEname())
			.append("','").append(eVO.getJob()).append("',")
			.append(eVO.getSal()).append(")");
			
			//insert는 1건 추가 아니면 예외
			stmt.executeUpdate(insertEmployee.toString());			
		}finally {
			//5. 연결 끊기
			if(stmt != null) {stmt.close();}
			if(con != null) {con.close();}
		}//end finally
		
	}
	
	public int updateEmp(EmployeeVO eVO)throws SQLException{
		int cnt = 0;
		//1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // end catch

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pass = "tiger";

		Connection con = null;
		Statement stmt = null;
		try {
			// 2. 커넥션 얻기
			con = DriverManager.getConnection(url, id, pass);
			// 3. 쿼리문 생성객체 얻기
			stmt = con.createStatement();
			// 4. 쿼리문 수행후 결과 얻기
			StringBuilder updateEmployee = new StringBuilder();
			updateEmployee.append("update employee ").append("set job='").append(eVO.getJob()).append("', sal=")
					.append(eVO.getSal()).append("where empno=").append(eVO.getEmpno());

			System.out.println(updateEmployee);

			// insert는 1건 추가 아니면 예외
			cnt = stmt.executeUpdate(updateEmployee.toString());
		} finally {
			//5. 연결 끊기
			if(stmt != null) {stmt.close();}
			if(con != null) {con.close();}
		} // end finally

		return cnt;
	}
	

	public int deletetEmp(int empno) throws SQLException {
		int cnt = 0;
		
		//1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String id="scott";
		String pass="tiger";
		
		Connection con = null;
		PreparedStatement psmt = null;
		try {
		//2. 커넥션 얻기
		con = DriverManager.getConnection(url,id,pass);
		//4. 쿼리문 수행 후 결과 얻기
		String deleteEmp = "delete from employee where empno=" + empno;
		//3. 쿼리문 생성객체 얻기
		psmt = con.prepareStatement(deleteEmp);
		cnt = psmt.executeUpdate();
		
		
		}finally {
		//5. 연결 끊기
			if(psmt != null) {psmt.close();}
			if(con != null) {con.close();}	
		}
		
		return cnt;
	}
	

	public List<EmployeeVO> selectAllEmp() throws SQLException {
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		
		//1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		String id="scott";
		String pass="tiger";
		
		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;
		
		try {
		//2. 커넥션얻기
			con = DriverManager.getConnection(url,id,pass);
		//3. 쿼리문 생성객체 얻기
			stmt = con.createStatement();
		//4. 쿼리문 수행 후 결과 얻기
			String selectEmp = "select empno, ename, job, sal, hiredate from employee";
			rs = stmt.executeQuery(selectEmp);
			
			EmployeeVO eVO = null;
			while(rs.next()) {
				eVO = new EmployeeVO(rs.getInt("empno"), rs.getString("ename"),rs.getString("job"),
						rs.getDouble("sal"),rs.getDate("hiredate"));
			list.add(eVO);
			}//end while
			
			
		}finally {
		//5. 연결 끊기
			if(rs != null) {rs.close();}
			if(stmt != null) {stmt.close();}
			if(con != null) {con.close();}			
		}//end finally
		return list;
	}

	
	public EmployeeVO selectOneEmp(int empno) throws SQLException {
		EmployeeVO eVO = null;

		// 1. 드라이버로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String pass = "tiger";
			
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
	
			try {
				
				// 2. 커넥션 얻기
				con = DriverManager.getConnection(url, id, pass);
				// 3. 쿼리문 생성객체얻기
				stmt = con.createStatement();
				// 4. 쿼리문 수행 후 결과 얻기
				StringBuilder selectEmp = new StringBuilder();
				selectEmp
				.append(" select ename, job, sal, hiredate ")
				.append(" from employee")
				.append(" where empno=").append(empno);
				
				rs = stmt.executeQuery(selectEmp.toString());
				
				//쿼리문이 실행되고 결과가 나왔을 때 레코드 포인터(cursor)다음에 레코드가 존재하는지?)
				String ename ="", job="";
				double sal =0.0;
				Date hiredate = null;
				if(rs.next()) {
					//레코드 포인터가 다음 행으로 이동하고 ,이동된 위치의 레코드의 컬럼값을 얻는다.
//					eVO = new EmployeeVO(empno, rs.getString("ename"), rs.getString("job"), rs.getDouble("sal"), rs.getDate("hiredate"));
					ename = rs.getString("ename");
					job = rs.getString("job");
					sal = rs.getDouble("sal");
					hiredate = rs.getDate("hiredate");
					eVO = new EmployeeVO(empno, ename, job, sal, hiredate);
				}
			}
			finally {
				//5. 연결 끊기
				if(stmt != null) {stmt.close();}
				if(con != null) {con.close();}	
				if(rs != null) {rs.close();}	
			}//end finally		
		return eVO;
	}
}
