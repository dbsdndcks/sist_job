package day0130;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class NameManagementDesign extends JFrame{
	//이벤트 처리와 관련있는 컴포넌트를 선언
	private JTextField jtfName;
	private JButton jbtnAdd, jbtnRemove;
	private DefaultListModel<String> dlmName;
	
	public NameManagementDesign() {
		super("이름관리");
		jtfName = new JTextField(10);
		jbtnAdd = new JButton("추가");
		jbtnRemove = new JButton("삭제");
		
		dlmName = new DefaultListModel<String>();
		JList<String> jlName = new JList<String>(dlmName);
		JScrollPane jsp = new JScrollPane(jlName);
		
		JPanel jpNorth = new JPanel();
		jpNorth.add(new JLabel("이름"));
		jpNorth.add(jtfName);
		jpNorth.add(jbtnAdd);
		jpNorth.add(jbtnRemove);
		
		jpNorth.setBorder(new TitledBorder("입력"));
		jsp.setBorder(new TitledBorder("출력"));
		
		add("North",jpNorth);
		add("Center",jsp);
		
		//has a 관계로 이벤트 처리
		NameManegementEvent nme = new NameManegementEvent(this);
		addWindowListener(nme);
		jbtnAdd.addActionListener(nme);
		jbtnRemove.addActionListener(nme);
		
		setBounds(100,50,500,300);
		setVisible(true);
	}//NameManagementDesgin
	
	
	
	
	
	
	
	public JTextField getJtfName() {
		return jtfName;
	}

	public JButton getJbtnAdd() {
		return jbtnAdd;
	}


	public JButton getJbtnRemove() {
		return jbtnRemove;
	}



	public DefaultListModel<String> getDlmName() {
		return dlmName;
	}







	public static void main(String[] args) {
		new NameManagementDesign();
		
	}//main
	
}//class
