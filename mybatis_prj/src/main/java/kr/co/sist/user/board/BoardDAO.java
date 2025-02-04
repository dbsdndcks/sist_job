package kr.co.sist.user.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.co.sist.dao.MyBatisDAO;

public class BoardDAO {
	
	private static BoardDAO bDAO;
	
	private String[] columnNames;
	
	private BoardDAO() {
		columnNames=new String[]{"title","content","id"};
	}
	
	public static BoardDAO getInstance() {
		if(bDAO == null) {
			bDAO=new BoardDAO();
		}//end if
		return bDAO;
	}//getInstance

	/**
	 * 총 레코드의 수
	 * @param sVO
	 * @return
	 * @throws SQLException
	 */
	public int selectTotalCount(SearchVO sVO)throws PersistenceException{
		int totalCnt=0;
		
		//1. MyBatis Handler 얻기
		MyBatisDAO mbDAO = MyBatisDAO.getInstance();
		SqlSession ss =mbDAO.getMyBatisHandler(false);
		
		//2. 쿼리문 실행
		totalCnt = ss.selectOne("kr.co.sist.board.selectTotalCount",sVO);
		//3. MyBatis Handler 닫기
			
			
		return totalCnt;
	}//totalCount
	
	
	public List<BoardDomain> selectBoard( SearchVO sVO)throws PersistenceException{
		List<BoardDomain> list= null;
		
		//1. Mybatis Handler 얻기
		MyBatisDAO mbDAO = MyBatisDAO.getInstance();
		SqlSession ss = mbDAO.getMyBatisHandler(false);
		//2. 쿼리문 실행
		list = ss.selectList("kr.co.sist.board.selectBoardList",sVO)
		//3. Mybatis Handler 끊기
	;	mbDAO.closeHandler(ss);
		return list;
	}//selectBoard
	
	

	
	public void insertBoard( BoardVO bVO)throws PersistenceException{

		//1. Mybatis Handler 얻기
		MyBatisDAO mbDAO = MyBatisDAO.getInstance();
		SqlSession ss = mbDAO.getMyBatisHandler(true); //auto commit;
		//2. 쿼리문 실행
		int t = ss.insert("kr.co.sist.board.insertBoard",bVO);
		
	
		//3. Mybatis Handler 끊기
		mbDAO.closeHandler(ss);
		
	}//insertBoard
	
	
	
	public BoardDomain selectDetailBoard( int seq )throws PersistenceException{ //로그인한 사람만 글을 읽을 수 있게 하려면 String id도 매개변수로 받음
		BoardDomain bd = null;
		
		//1. Mybatis Handler 얻기
		MyBatisDAO mbDAO = MyBatisDAO.getInstance();
		SqlSession ss = mbDAO.getMyBatisHandler(false); //auto commit;
		//2. 쿼리문 실행
		bd = ss.selectOne("kr.co.sist.board.selectDetailBoard",seq); //글을 조회
		ss.update("kr.co.sist.board.updateCnt",seq); //조회수 증가
		//3. Mybatis Handler 닫기
		mbDAO.closeHandler(ss);
		
		return bd;
	}//selectBoard
	
	public int updateCnt(int seq)throws PersistenceException{
		int cnt = 0;
		//1. Mybatis Handler 얻기
		MyBatisDAO mbDAO = MyBatisDAO.getInstance();
		SqlSession ss = mbDAO.getMyBatisHandler(true); //auto commit;
		//2. 쿼리문 실행
		cnt = ss.update("kr.co.sist.board.updateCnt",seq); //조회수 증가
		//3. Mybatis Handler 닫기
		mbDAO.closeHandler(ss);
		return cnt;
		
		
	}
//	
//	
//	public int updateCnt(int num) throws SQLException {
//        int cnt = 0;
//
//        Connection con = null;
//        PreparedStatement pstmt = null;
//
//        DbConnection db = DbConnection.getInstance();
//
//        try {
//            // 1.JNDI 사용 객체 생성
//            // 2.DataSource 얻기
//            // 3.Connection 얻기
//            con = db.getConn("jdbc/dbcp");
//            // 4.쿼리문 생성객체 얻기(Dynamic Query)
//            StringBuilder updateCnt = new StringBuilder();
//            updateCnt.append("update board  set cnt=cnt+1  ");
//            updateCnt.append("where num=? ");
//            pstmt = con.prepareStatement(updateCnt.toString());;
//
//            // 바인드 변수에 값 설정
//            pstmt.setInt(1, num);
//
//            cnt = pstmt.executeUpdate();
//        } finally {
//            // 7.연결 끊기
//            db.closeCon(null, pstmt, con);
//        }
//        return cnt;
//    }// updateCnt
//	
	public int updateBoard(BoardVO bVO) throws PersistenceException {
		int cnt = 0;
		
		//1. Mybatis Handler 얻기
		MyBatisDAO mbDAO = MyBatisDAO.getInstance();
		SqlSession ss = mbDAO.getMyBatisHandler(true); //auto commit;
		//2. 쿼리문 실행
		cnt = ss.update("kr.co.sist.board.updateBoard",bVO); //조회수 증가
		//3. Mybatis Handler 닫기
		mbDAO.closeHandler(ss);
		return cnt;
	}//updateBoard
	
	public int deleteBoard(BoardVO bVO) throws PersistenceException {
		int cnt = 0;
		
		//1. Mybatis Handler 얻기
		MyBatisDAO mbDAO = MyBatisDAO.getInstance();
		SqlSession ss = mbDAO.getMyBatisHandler(true); //auto commit;
		//2. 쿼리문 실행
		cnt = ss.delete("kr.co.sist.board.deleteBoard",bVO); //조회수 증가
		//3. Mybatis Handler 닫기
		mbDAO.closeHandler(ss);
		
		return cnt;
	}//deleteBoard
	
	
	public static void main(String[] args) {
//		SearchVO sVO = new SearchVO();
		BoardVO bVO = new BoardVO();
//		sVO.setField("2");
//		sVO.setKeyword("");
//		sVO.setStartNum(1);
//		sVO.setEndNum(10);
////		BoardDAO.getInstance().selectTotalCount(sVO);
//		BoardDAO.getInstance().selectBoard(sVO);
//		BoardVO bVO = new BoardVO(0, 530, "마이바티스로 추가", "세상편함 생산성 오지고", "kim", null);
//		BoardDAO.getInstance().insertBoard(bVO);
//		BoardDAO.getInstance().selectDetailBoard(86);
//		BoardDAO.getInstance().updateCnt(86);
//		BoardDAO.getInstance().updateBoard(bVO);
	}	
	
}//class











