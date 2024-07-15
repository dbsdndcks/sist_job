package kr.co.sist.user.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;

public class BoardDAO {
	
	private static BoardDAO bDAO;
	
	private BoardDAO() {
		
	}
	
	public static BoardDAO getInstance() {
		if(bDAO == null) {
			bDAO = new BoardDAO();
		}
		return bDAO;
	}
	
	
	public int selectTotalCount(SearchVO sVO) throws SQLException{
		int totalCnt = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		DbConnection dbCon = DbConnection.getInstance();
		
		try {		
		//1. JNDI 사용객체 생성
		//2. DATASOURCE 얻기
		//3. Connection 얻기
			con = dbCon.getCon("jdbc/dbcp");
			System.out.println(con);
		//4. 쿼리문 생성객체 얻기(Dynamic Query)
			StringBuilder selectCnt = new StringBuilder();
			selectCnt.append("select count(*) cnt from board");
			pstmt=con.prepareStatement(selectCnt.toString());
		//5. 바인드변수에 값 설정
		//6. 쿼리문 수행 후 결과얻기
			rs = pstmt.executeQuery();
			if(rs.next()) {
				totalCnt = rs.getInt("cnt");
			}//end if
		}finally {
			//7. 연결 끊기			
			dbCon.closeCon(rs, pstmt, con);
		}
		
		return totalCnt;
	}
	
	public List<BoardDomain>selectBoard(SearchVO sVO) throws SQLException{
		List<BoardDomain> list = new ArrayList<BoardDomain>();	

		
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
			append("select NUM, TITLE, CONTENT, ID, INPUT_DATE, CNT,rnum ")
			.append("from (select NUM, TITLE, CONTENT, ID, INPUT_DATE, CNT, ")
			.append("row_number()over(order by input_date desc) rnum ")
			.append("from board) ")
			.append("WHERE rnum BETWEEN ? AND ?");
			
			
			pstmt = con.prepareStatement( selectBoard.toString());
		//5. 바인드변수에 값 설정
			pstmt.setInt(1, sVO.getStartNum());
			pstmt.setInt(2, sVO.getEndNum());
		//6. 쿼리문 수행 후 결과얻기
			rs= pstmt.executeQuery();
			System.out.println( sVO );
			BoardDomain bVO = null;
			while(rs.next()) {
				bVO = new BoardDomain(rs.getInt("num"), rs.getInt("cnt"),rs.getInt("rnum")
						,rs.getString("title"),"",rs.getString("id"),
						rs.getDate("input_date"));
				
				list.add(bVO);
			}
			
		}finally {
			//7. 연결 끊기
			db.closeCon(rs, pstmt, con);
		}
		return list;
	}
	
}//class
