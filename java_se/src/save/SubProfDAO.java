//package save;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class SubProfDAO {
//	/**
//	 * 관리자 모드 > 교수 관리 > 교수 상세 조회, 교수 모드 > 교수 메인을 위한 method
//	 * @param prof_number
//	 * @return
//	 * @throws SQLException
//	 */
//	public ProfVO slctProfMgtSlct(int prof_number) throws SQLException{
//		ProfVO pVO = null;
//		DbConnection dbCon = DbConnection.getInstance();
//		
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		try {
//			String id = "scott";
//			String pass = "tiger";
//			
//			con = dbCon.getConnection(id, pass);
//			
//			String selectProf = "select distinct p.prof_number, p.prof_name, p.prof_email, d.dept_name "
//								+ "from professor p "
//								+ "join dept d on d.dept_code = p.dept_code "
//								+ "where p.prof_number = ?";
//			pstmt = con.prepareStatement(selectProf);
//			pstmt.setInt(1, prof_number);
//			rs = pstmt.executeQuery();
//			
//			
//			while(rs.next()) {
//				pVO = new ProfVO(prof_number, rs.getString("prof_name"), rs.getString("prof_email"), rs.getString("dept_name"));
//			} // end while
//		} finally {
//			dbCon.dbClose(rs, pstmt, con);
//		} // end finally
//		
//		return pVO;
////		return listProfVO;
//	} // slctProfMgtSlct
//}
