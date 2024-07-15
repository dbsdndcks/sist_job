package course_prj_design.manager;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
/**
 * 학사일정 이벤트 관리
 */
public class AcademicCalendarEvent extends WindowAdapter implements ActionListener{

	AcademicCalendar ac;
	
	public AcademicCalendarEvent(AcademicCalendar ac) {
		this.ac = ac;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == ac.getSearchBtn()) {
			ac.calSet();
		}
		
		if(ae.getSource() == ac.getSaveBtn()) {
			int selectedYear = (int)ac.getYearCb().getSelectedItem();
			int selectedMonth = (int)ac.getMonthCb().getSelectedItem();			
			int selectedDay = ac.getDay();
			System.out.println(selectedDay);
			String memoText = ac.getMemoJtf().getText();
			
			CalenderVO cVO = new CalenderVO(selectedYear, selectedMonth, selectedDay, memoText);
			String memoMapKey = selectedYear+""+selectedMonth+""+selectedDay;
			
			ac.getMemoMap().put(memoMapKey, memoText);
			ac.getMemoJtf().setText("");	
			
			for(String str : ac.getMemoMap().values()) {
				System.out.println(str);
			}
			for(String str : ac.getMemoMap().keySet()) {
				System.out.println(str);
			}
		}
		if(ae.getSource() == ac.getDeleteBtn()) {
			
		}
	}

	@Override
	public void windowClosing(WindowEvent we) {
		super.windowClosing(we);
	}
	


}
