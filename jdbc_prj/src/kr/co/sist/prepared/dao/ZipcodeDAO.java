package kr.co.sist.prepared.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;
import kr.co.sist.vo.ZipcodeVO;

public class ZipcodeDAO {
	private static ZipcodeDAO zDAO;
	
	private ZipcodeDAO() {
		
	}
	
	public static ZipcodeDAO getInstance() {
		if(zDAO == null) {
			zDAO = new ZipcodeDAO();
		}//end if
		return zDAO;
	}//getInstance
	
	public List<ZipcodeVO> selectZipcode(String dong) throws SQLException {
		List<ZipcodeVO> list = new ArrayList<ZipcodeVO>();

		DbConnection dbCon = DbConnection.getInstance();
		// 1. 드라이버 로딩
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
		
			// 2. 커넥션 얻기
			String id = "scott";
			String pass = "tiger";
			con = dbCon.getConnection(id, pass);
		
			// 3. 쿼리문 생성 객체
			StringBuilder selectZipcode = new StringBuilder();
			selectZipcode
			.append("	select zipcode,sido,gugun,dong,nvl(bunji,' ' )bunji	")
			.append("	from	zipcode							")
			.append("	where	dong like ?||'%'					");
			
			pstmt = con.prepareStatement(selectZipcode.toString());
			
			// 4. 바인등 변수 값 설정
			pstmt.setString(1, dong);
		
			// 5. 쿼리문 실행 후 결과 얻기
			rs = pstmt.executeQuery();
			
			ZipcodeVO zVO = null;
			while(rs.next()) {//조회된 결과에 다음 레코드가 존재?
				zVO = new ZipcodeVO(rs.getString("zipcode"), rs.getString("sido")
						, rs.getString("gugun"),rs.getString("dong")
						,rs.getString("bunji"));
				
				list.add(zVO);
			}
		} finally {
		// 6. 연결 끊기
			dbCon.dbClose(rs, pstmt, con);
		}//end finally
		
		return list;
	}//selectZipcode
	
	public List<ZipcodeVO> selectStatementZipcode(String dong) throws SQLException {
		List<ZipcodeVO> list = new ArrayList<ZipcodeVO>();

		DbConnection dbCon = DbConnection.getInstance();
		// 1. 드라이버 로딩
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
		
			// 2. 커넥션 얻기
			String id = "scott";
			String pass = "tiger";
			con = dbCon.getConnection(id, pass);
		
			// 3. 쿼리문 생성 객체
			
			stmt = con.createStatement();
			
			// 4. 바인등 변수 값 설정
			StringBuilder selectZipcode = new StringBuilder();
			selectZipcode
			.append("	select zipcode,sido,gugun,dong,nvl(bunji,' ' )bunji	")
			.append("	from	zipcode							")
			.append("	where	dong like '"+dong+"%'					");
			
		
			// 5. 쿼리문 실행 후 결과 얻기
			rs = stmt.executeQuery(selectZipcode.toString());
			
			ZipcodeVO zVO = null;
			while(rs.next()) {//조회된 결과에 다음 레코드가 존재?
				zVO = new ZipcodeVO(rs.getString("zipcode"), rs.getString("sido")
						, rs.getString("gugun"),rs.getString("dong")
						,rs.getString("bunji"));
				
				list.add(zVO);
			}
		} finally {
		// 6. 연결 끊기
			dbCon.dbClose(rs, stmt, con);
		}//end finally
		
		return list;
	}//selectZipcode
	
	
	
}//class
