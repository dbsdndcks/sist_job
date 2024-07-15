package day0125;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Homework extends JFrame {
    private final int year = 2024;
    private final int month = 11;
    private int dayCnt = 0;
    @SuppressWarnings("static-access")
	public Homework() {
        super("Homework");
        Calendar date = Calendar.getInstance();
        Calendar lastDate = Calendar.getInstance();
        Calendar nextDate = Calendar.getInstance();

        lastDate.set(year, month-2, 1);
        date.set(year, month - 1, 1);
        nextDate.set(year, month,1);
        
        System.out.println(date.get(Calendar.DAY_OF_WEEK));
        JPanel datePane = new JPanel(new GridLayout(0, 7));
        for (int i = lastDate.getActualMaximum(Calendar.DAY_OF_MONTH)-date.get(Calendar.DAY_OF_WEEK)+2; i <= lastDate.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            JButton jButton = new JButton(String.valueOf(i));
            jButton.setBackground(Color.GRAY);
            jButton.setForeground(Color.WHITE);
            datePane.add(jButton);
            dayCnt++;
        }
        for (int i = 1; i <= date.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            JButton jButton = new JButton(String.valueOf(i));
            jButton.setBackground(Color.BLACK);
            jButton.setForeground(Color.WHITE);
            datePane.add(jButton);
            dayCnt++;
        }
        
        int today = date.get(Calendar.DAY_OF_WEEK);
        int remainDay = 0;
        
        switch(today) {
        case 1,2,3,4,5 : remainDay = 35-dayCnt;
        break;
        case 6 :
        	if(date.getActualMaximum(date.DAY_OF_MONTH) == 31) {
        		remainDay = 42-dayCnt;
        	}else {
        		remainDay = 35-dayCnt;
        	}
        break;
        case 7 : remainDay = 42-dayCnt;
        break;	
        }
        
        
        for(int i=1 ; i<=remainDay ; i++) {
            JButton jButton = new JButton(String.valueOf(i));
            jButton.setBackground(Color.GRAY);
            jButton.setForeground(Color.WHITE);
            datePane.add(jButton);
        }
       
        

        add(datePane);

        datePane.setBackground(Color.BLACK);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Homework();
    }
}
