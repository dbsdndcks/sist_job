package day0305;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import kr.co.sist.dao.DbConnection;

/**
 * 조회하는 테이블의 Schema 정보를 얻을 때 사용하는 객체
 * desc 테이블명 수준의 정보를 얻는다. 더 자세한 정보를 얻을 때에는 DD를 사용해야함
 */
public class UseResultSetMetaData {

	public UseResultSetMetaData()throws SQLException {
		//EMP테이블의 MetaData를 얻기
		DbConnection dbCon = DbConnection.getInstance();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 1.
		try {
		// 2.
			String id = "scott";
			String pass = "tiger";
			con = dbCon.getConnection(id, pass);
		// 3. 바인드 변수는 값과 묶이는 변수로 값은 설정할 수 있지만, 컬럼명이나 테이블명에는 
			//사용할 수 없다.
			String tname = "dept";
//			String selectEmp = "select * from ?";
			String selectEmp = "select * from " + tname;
			pstmt = con.prepareStatement(selectEmp);
		// 4.
			//바인드 변수에 값 설정
//			pstmt.setString(1, tname);
			
			
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			StringBuilder sb = new StringBuilder();
			sb.append(tname).append("테이블의 정보\n");
			sb.append("NAME\t").append("NotNull\t").append("Type\n")
			.append("=============================================\n");
			int size = 0;
			for(int i=1 ; i<= rsmd.getColumnCount() ; i++) {
				size =rsmd.getPrecision(i);
				sb
				.append(rsmd.getColumnName(i)).append("\t")
				.append(rsmd.isNullable(i)==0?"NOT NULL":"").append("\t")
				.append(rsmd.getColumnTypeName(i)).append("\t");
				if(size != 0) {
					sb.append("(").append(size).append(")");
				}//end if
				sb.append("\n");
			}//end for
		
		// 5.
			JTextArea jta = new JTextArea(sb.toString(),20,30);
			JScrollPane jsp = new JScrollPane(jta);
			JOptionPane.showMessageDialog(null, jsp);
		} finally {
		// 6.
			dbCon.dbClose(null, pstmt, con);
		}
	}
	
	public static void main(String[] args) {
		try {
			new UseResultSetMetaData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//main

}//class
