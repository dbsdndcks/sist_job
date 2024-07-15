package day0304homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TableViewEvt extends WindowAdapter implements ActionListener{

	private TableView tv;
	
	public TableViewEvt(TableView tv) {
		this.tv = tv;
	}//TableViewEvt
	
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == tv.getJbtn()) {
			viewTable();
		}
	}//actionPerformed
	

	@Override
	public void windowClosing(WindowEvent e) {
		tv.dispose();
	}	// windowClosing

	private void viewTable() {
		// Model 객체 생성
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();
		
		//Model 객체와 has a 관계 View 객체 생성
		JComboBox<String>jcb = new JComboBox<String>(dcbm);
		
		//DBMS에서 저회된 결과를 받아서 사용자에게 보여준다.
		TableDAO tbDAO = TableDAO.getInstance();
		try {
		List<String> listAllEmp = tbDAO.selectAllTable();
		if(listAllEmp.isEmpty()) {
			JOptionPane.showMessageDialog(null, "데이터가 없습니다");
		}else {
			for(String s : listAllEmp) {
				dcbm.addElement(s);
			}//end for
		}//end else
		
		
		
		JPanel jp = new JPanel();
		jp.add(jcb);
        JOptionPane.showMessageDialog(null,jp);

		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
}//class
