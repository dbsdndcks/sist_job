package day0520;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;

public class DeptDAO {
	
	private static DeptDAO bDAO;
	
	
	private DeptDAO() {
	}
	
	public static DeptDAO getInstance() {
		if(bDAO == null) {
			bDAO=new DeptDAO();
		}//end if
		return bDAO;
	}//getInstance

	
	public List<DeptDomain> selectAllDept()throws SQLException{
		List<DeptDomain> list=new ArrayList<DeptDomain>();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		DbConnection db=DbConnection.getInstance();
		
		try {
		//1. JNDI 사용객체 생성
		//2. DataSource 얻기
		//3. Connection 얻기
			con=db.getCon("jdbc/dbcp");
		//4. 쿼리문 생성객체 얻기(Dynamic Query)
			StringBuilder selectDept=new StringBuilder();
			selectDept
			.append("	select deptno, dname, loc from dept2 ");
			
				
			pstmt=con.prepareStatement(selectDept.toString());
			
			rs=pstmt.executeQuery();
			
			DeptDomain dd=null;
			while(rs.next()) {
				dd=new DeptDomain(rs.getInt("deptno"),rs.getString("dname"), rs.getString("loc")); 
				
				list.add(dd);
			}//end while
			
		}finally {
		//7. 연결 끊기
			db.closeCon(rs, pstmt, con);
		}//end finally
		return list;
	}//selectBoard
	
	
	
	
	
}//class











