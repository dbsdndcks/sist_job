package day0530;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.co.sist.dao.MyBatisDAO;
import kr.co.sist.domain.BoardDomain;
import kr.co.sist.domain.CarDomain;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.domain.JoinDomain;

public class ExamMapper6DAO {
	private static ExamMapper6DAO em6DAO;
	
	private ExamMapper6DAO() {
		
	}
	public static ExamMapper6DAO getInstance() {
		if(em6DAO == null) {
			em6DAO = new ExamMapper6DAO();
		}//end if
		return em6DAO;
	}//getInstance
	
	
	public List<EmpDomain> dynamicChoose(int num)throws PersistenceException{
		List<EmpDomain> list = null;
		//1. MyBatis Handler 얻기
		MyBatisDAO mbDAO = MyBatisDAO.getInstance();
		SqlSession ss = mbDAO.getMyBatisHandler(false);
		//2. 쿼리수행
		list = ss.selectList("kr.co.sist.exam6.dynamicChoose",num);
		//3. MyBatis Handler 닫기
		mbDAO.closeHandler(ss);
		
		return list;
	}//dynamicIf
	
	public static void main(String[] args) {
//		ExamMapper4DAO.getInstance().scsr(7788);
//		ExamMapper4DAO.getInstance().scmr(10);
//		ExamMapper4DAO.getInstance().mcsr(7788);
//		ExamMapper4DAO.getInstance().mcmr(10);
//		ExamMapper4DAO.getInstance().lessThan(3000);
//		ExamMapper4DAO.getInstance().greaterThan(3000);
//		ExamMapper5DAO.getInstance().subquery();
//		ExamMapper5DAO.getInstance().join(10);
//		ExamMapper5DAO.getInstance().dynamicIf(10);
		ExamMapper6DAO.getInstance().dynamicChoose(1);
	}
	
}//class
