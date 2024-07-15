package day0304homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;

public class TableDAO {
	
	private static TableDAO tbDAO;
	
	private TableDAO() {
	}
	
	public static TableDAO getInstance() {
		if(tbDAO == null) {
			tbDAO = new TableDAO();
		}
		return tbDAO;
	}
	
	public List<String> selectAllTable()throws SQLException{
		List<String>list = new ArrayList<String>();
		
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
					"select tname from tab ";
			pstmt = con.prepareStatement(selectAllEmp);
		//4. 바인드 변수에 값 설정
		//5. 쿼리문 수행 후 결과 얻기
			rs = pstmt.executeQuery();
			
			while (rs.next()) { //조회된 레코드가 존재하면
				
				list.add(rs.getString("tname"));
			}
		} finally {
			// 6. 연결 끊기
			dbCon.dbClose(rs, pstmt, con);
		}
		
		return list;
	}
}
