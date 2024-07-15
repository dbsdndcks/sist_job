package kr.co.sist.prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;
import kr.co.sist.statement.vo.EmployeeVO;


public class PreparedStatementDao {
	
	private static PreparedStatementDao psDao;
	
	private PreparedStatementDao() {
		
	}//PreparedStatementDao
	
	
	public static PreparedStatementDao getInstance() {
		if(psDao == null) {
			psDao = new PreparedStatementDao();
		}
		return psDao;
	}//getInstance
	
	public void insertEmp(EmployeeVO eVO) throws SQLException{
		DbConnection dbCon = DbConnection.getInstance();
		
		//1.드라이버로딩
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//2. 커넥션얻기
			String id = "scott";
			String pass = "tiger";
			con = dbCon.getConnection(id, pass);
			
			//3. 쿼리문생성객체 얻기(값이 들어가는 위치는 바인드변수(?)를 사용한다.)
			String insertEmp = "insert into employee(empno,ename,job,sal)values(?,?,?,?)";
			pstmt = con.prepareStatement(insertEmp);
			
			//4. 바인드 변수에 값 설정
			pstmt.setInt(1, eVO.getEmpno());
			pstmt.setString(2, eVO.getEname());
			pstmt.setString(3, eVO.getJob());
			pstmt.setDouble(4, eVO.getSal());
			//5. 쿼리문 수행 후 결과 얻기(주의 : Statement의 excuteXxx(sql문)은 절대 사용하지 않는다)
			pstmt.executeUpdate();
			
		}finally {
			//6.연결끊기
			dbCon.dbClose(null, pstmt, con);
		}//end finally
	}//insertEmp
	
	/**
	 * 사원번호에 해당하는 레코드를 찾아서 직무와 연봉을 변경
	 * @param eVO
	 * @return
	 * @throws SQLException
	 */
	public int updateEmp(EmployeeVO eVO)throws SQLException {
		int cnt = 0;
		
		DbConnection dbCon = DbConnection.getInstance();
		//1. 드라이버 로딩
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
		//2. 커넥션 얻기
			String id = "scott";
			String pass = "tiger";
			con = dbCon.getConnection(id, pass);
			
		//3. 쿼리문 생성 객체 얻기
			String updateEmp="update employee set job=?,sal=? where empno=?";
			pstmt = con.prepareStatement(updateEmp);
		//4. 바인드 변수에 값 설정
			pstmt.setString(1, eVO.getJob());
			pstmt.setDouble(2, eVO.getSal());
			pstmt.setInt(3, eVO.getEmpno());
		//5. 쿼리문 수행후 결과 얻기
			cnt = pstmt.executeUpdate();
			
		}finally {
			//6. 연결 끊기
			dbCon.dbClose(null, pstmt, con);
		}//end finally
		
		return cnt;
	}//updateEmp
	
	public int deleteEmp(int empno)throws SQLException{
		int cnt = 0;
		
		DbConnection dbCon = DbConnection.getInstance();
		//1. 드라이버 로딩
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
		//2. 커넥션 얻기
			String id = "scott";
			String pass = "tiger";
			con = dbCon.getConnection(id, pass);
			
		//3. 쿼리문 생성 객체 얻기
			String deleteEmp = "delete from employee where empno=?";
			pstmt = con.prepareStatement(deleteEmp);
		//4. 바인드 변수에 값 설정
			pstmt.setInt(1, empno);
		//5. 쿼리문 수행후 결과 얻기
			cnt = pstmt.executeUpdate();
			
		}finally {
			//6. 연결 끊기
			dbCon.dbClose(null, pstmt, con);
		}//end finally
		
		return cnt;
	}//deleteEmp
	
	public EmployeeVO selectOneEmp(int empno)throws SQLException{
		EmployeeVO eVO = null;
		
		DbConnection dbCon = DbConnection.getInstance();
		
		//1. 드라이버 로딩
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		//2. 커넥션 얻기
			String id = "scott";
			String pass = "tiger";
			con = dbCon.getConnection(id, pass);
		//3. 쿼리문 생성 객체 얻기
			StringBuilder selectOneEmp = new StringBuilder();
					selectOneEmp
					.append(" select ename, job, sal, hiredate, to_char(hiredate,'yyyy-mm-dd')hiredate2")
					.append(" from employee")
					.append(" where empno=?");
			pstmt = con.prepareStatement(selectOneEmp.toString());
		//4. 바인드 변수에 값 설정
			pstmt.setInt(1, empno);
		//5. 쿼리문 수행후 결과 얻기
			rs = pstmt.executeQuery(); // 조회된 결과를 움직일 수 있는 커서의 제어권 받는다.
			//쿼리문 실행 했을 때 조회결과가 있다면
			if(rs.next()) { //조회 결과 있음
				eVO = new EmployeeVO(empno, rs.getString("ename"),rs.getString("job"),
						rs.getDouble("sal"), rs.getDate("hiredate"),rs.getString("hiredate2"));
			}
			
		}finally {
		//6. 연결 끊기
			dbCon.dbClose(rs, pstmt, con);
		}
		
		return eVO;
	}
	
	public List<EmployeeVO> selectAllEmp()throws SQLException{
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		
		DbConnection dbCon = DbConnection.getInstance();
		//1. 드라이버 로딩
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		//2. 커넥션 얻기
			String id = "scott";
			String pass = "tiger";
			con = dbCon.getConnection(id, pass);

		//3. 쿼리문 생성 객체 얻기
			String selectAllEmp = 
					"select empno, ename, job, sal, to_char(hiredate, 'yyyy-mm-dd q\"분기\"')hiredate2 from employee";
			pstmt = con.prepareStatement(selectAllEmp);
		//4. 바인드 변수에 값 설정
		//5. 쿼리문 수행 후 결과 얻기
			rs = pstmt.executeQuery();
			
			EmployeeVO eVO = null;
			while (rs.next()) { //조회된 레코드가 존재하면
				//VO에 검색결과를 저장하고
				eVO = new EmployeeVO(rs.getInt("empno"), rs.getString("ename"), rs.getString("job"),
						rs.getDouble("sal"), null, rs.getString("hiredate2"));
				
				list.add(eVO);
			}
		} finally {
			// 6. 연결 끊기
			dbCon.dbClose(rs, pstmt, con);
		}

		return list;
	}
	

	
	
	
	
}//class
