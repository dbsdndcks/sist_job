package day0126;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class UseJTable extends JFrame{
	
	public UseJTable() {
		super("MVC 패턴을 도입한 JTable");
		
		// 1. 모델 객체 생성
		String[]columnName = {"번호","이름","나이","이메일"};
		String[][]data ={ {"1","루피","24","test@test.com"},
				 		 {"2","징베","24","test@test.com"},
				 		 {"3","새턴","24","test@test.com"},
				 		 {"4","니무","24","test@test.com"}};
				 
		DefaultTableModel dtm = new DefaultTableModel(data,columnName);
		// 2. 모델 객체와 has a 관계로 View를 생성
		JTable jTable = new JTable(dtm);
		// 3. 데이터 추가 => Model 객체를 사용
		String[]tempData = {"5","썅크스","55","ㄷㄱㅈㄱㅈㄷㄱㅈㄷ"};
		dtm.addRow(tempData);
		
		//vector로 한다면
		Vector<String>vec = new Vector<String>();
		vec.add("6");
		vec.add("dkdk");
		vec.add("27");
		vec.add("sadads");
		
		dtm.addRow(vec);
		
		JScrollPane jScrollPane = new JScrollPane(jTable);
		jScrollPane.setBorder(new TitledBorder("해적왕 후보자"));
		
//		add(jTable); 스크롤바를 사용하지 않으면 컬럼명이 보이지 않는다.
		add(jScrollPane);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new UseJTable();
	}
}
