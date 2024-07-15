package day0508;

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
    if (bDAO == null) {
      bDAO = new BoardDAO();
    } // end if
    return bDAO;
  }// getInstance

  /**
   * 총 레코드의 수
   * 
   * @param sVO
   * @return
   * @throws SQLException
   */
  public int selectTotalCount(SearchVO sVO) throws SQLException {
    int totalCnt = 0;

    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    DbConnection db = DbConnection.getInstance();

    try {
      // 1. JNDI 사용객체 생성
      // 2. DataSource 얻기
      // 3. Connection 얻기
      con = db.getCon("jdbc/dbcp");
      // 4. 쿼리문 생성객체 얻기(Dynamic Query)
      StringBuilder selectCnt = new StringBuilder();
      selectCnt.append("select count(*) cnt from board");

      pstmt = con.prepareStatement(selectCnt.toString());
      // 5. 바인트변수에 값 설정
      // 6. 쿼리문 수행 후 결과 얻기
      rs = pstmt.executeQuery();
      if (rs.next()) {
        totalCnt = rs.getInt("cnt");
      }
    } finally {
      // 7. 연결 끊기
      db.closeCon(rs, pstmt, con);
    }
    return totalCnt;
  }

  public List<BoardVO> selectBoard(SearchVO sVO) throws SQLException {
    List<BoardVO> list = new ArrayList<BoardVO>();

    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    DbConnection db = DbConnection.getInstance();
    try {
      // 1. JNDI 사용객체 생성
      // 2. DataSource 얻기
      // 3. Connection 얻기
      con = db.getCon("jdbc/dbcp");
      // 4. 쿼리문 생성객체 얻기(Dynamic Query)
      StringBuilder selectBoard = new StringBuilder();
      selectBoard.append("  select NUM, TITLE, ID, INPUT_DATE, CNT, rnum   ")
          .append("  from (select NUM, TITLE, ID, INPUT_DATE, CNT,  ")
          .append("         row_number() over(order by input_date desc) rnum   ").append("         from board)   ")
          .append("  where rnum between ? and ?  ");
      pstmt = con.prepareStatement(selectBoard.toString());
      // 5. 바인트변수에 값 설정
      pstmt.setInt(1, sVO.getStartNum());
      pstmt.setInt(2, sVO.getEndNum());

      // 6. 쿼리문 수행 후 결과 얻기

      rs = pstmt.executeQuery();

      BoardVO bVO = null;
      while (rs.next()) {
        bVO = new BoardVO(rs.getInt("num"), rs.getInt("cnt"), rs.getString("title"), null, rs.getString("id"),
            rs.getDate("input_date"));
        list.add(bVO);
      }
    } finally {
      // 7. 연결 끊기
      db.closeCon(rs, pstmt, con);
    }
    return list;
  }

}
