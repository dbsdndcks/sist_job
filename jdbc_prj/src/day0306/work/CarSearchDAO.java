package day0306.work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;
import oracle.net.aso.c;

public class CarSearchDAO {
	private static CarSearchDAO csDAO;
	private CarSearchDAO() {
		
	}
	
	public static CarSearchDAO getInstance() {
		if(csDAO == null) {
			csDAO = new CarSearchDAO();
		}
		
		return csDAO;
	}
	
	public List<CarVO> selectCarList(String maker)throws SQLException{
		List<CarVO> list = new ArrayList<CarVO>();
		
		DbConnection dbCon = DbConnection.getInstance();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//1.
		try {
		//2.
			String id = "scott";
			String pass = "tiger";			
			con = dbCon.getConnection(id, pass);
		//3.
			StringBuilder selectCar = new StringBuilder();
			selectCar
			.append("	select country, maker, model, car_year, price, car_option	")
			.append("	from (select cc.country, cc.maker, cmo.model, cmo.car_year, cmo.price, cmo.car_option,	")
			.append("	row_number() over(order by hiredate desc) rnum	")
			.append("	from car_country cc, car_maker cma, car_model cmo	")
			.append("	where (cma.maker(+)=cc.maker and cmo.model(+)=cma.model) and cc.maker=?)	")
			.append(	"where rnum between 1 and 10	");
		//4.
			pstmt = con.prepareStatement(selectCar.toString());
			pstmt.setString(1, maker);
		//5.
			rs = pstmt.executeQuery();
			CarVO cVO = null;
			while(rs.next()) {
				cVO = new CarVO(rs.getString("country"),rs.getString("maker")
						,rs.getString("model"),rs.getString("car_year")
						,rs.getString("car_option"),rs.getInt("price"));
				
				list.add(cVO);
			}
		
		}finally {
		//6.
			dbCon.dbClose(rs, pstmt, con);
		}
		return list;
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(CarSearchDAO.getInstance().selectCarList("현대"));
	}	
	
	
}
