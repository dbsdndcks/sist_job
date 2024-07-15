package day0306.work;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RunCarSearchDAO {

	public void searchCarList() {
		CarSearchDAO csDAO = CarSearchDAO.getInstance();
		String inputMaker = JOptionPane.showInputDialog("제조사 입력");
		if (inputMaker != null && !"".equals(inputMaker)) {
			try {
				List<CarVO> list = csDAO.selectCarList(inputMaker);
				
				StringBuilder output = new StringBuilder();
				output.append(inputMaker).append("입력결과입니다\n");
				output.append("제조국\t제조사\t모델명\t년식\t가격\t옵션\n");
				if(list.isEmpty()) {
					output.append("검색된 데이터가 없습니다");
				}
				
				for(CarVO cVO : list) {
					output.append(cVO.getCountry()).append("\t")
					.append(cVO.getMaker()).append("\t")
					.append(cVO.getModel()).append("\t")
					.append(cVO.getCar_year()).append("\t")
					.append(cVO.getPrice()==0? "":cVO.getPrice()).append("\t")
					.append(cVO.getCar_ooption()).append("\n");
				}
				
				JTextArea jta = new JTextArea(output.toString(),10,80);
				JScrollPane jsp = new JScrollPane(jta);
				JOptionPane.showMessageDialog(null, jsp);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}//end catch
		}
	}//searchCarList
	
	public static void main(String[] args) {
		RunCarSearchDAO rcDAO = new RunCarSearchDAO();
		rcDAO.searchCarList();
	}

}
