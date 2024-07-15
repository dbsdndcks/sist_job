package kr.co.sist.user.car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;

public class CarDAO {
	
	private static CarDAO cDAO;
	
	private CarDAO() {
		
	}
	
	public static CarDAO getInstance() {
		if(cDAO == null) {
			cDAO = new CarDAO();
		}
		return cDAO;
	}
	
	
	
	public List<String>selectMaker(String country) throws SQLException{
		List<String> list = new ArrayList<String>();	

		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		DbConnection db = DbConnection.getInstance();
		
		try {
			
		//1. JNDI 사용객체 생성
		//2. DATASOURCE 얻기
		//3. Connection 얻기
			con = db.getCon("jdbc/dbcp");
		//4. 쿼리문 생성객체 얻기(Dynamic Query)
			StringBuilder selectBoard = new StringBuilder();
			selectBoard.
			append("select maker from car country ")
			.append("WHERE country=? ");
			
			
			pstmt = con.prepareStatement( selectBoard.toString());
		//5. 바인드변수에 값 설정
			pstmt.setString(1, country);
		//6. 쿼리문 수행 후 결과얻기
			rs= pstmt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString("maker"));
			}
			
		}finally {
			//7. 연결 끊기
			db.closeCon(rs, pstmt, con);
		}
		return list;
	}
	
}//class
