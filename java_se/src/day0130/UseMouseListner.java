package day0130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseMouseListner extends JFrame implements MouseListener,ActionListener{
	//이벤트와 관련 있는 컴포넌트를 인스턴스 변수에 선언
	private DefaultListModel<String> dlmFriend;
	private DefaultListModel<String> dlmBlockFriend;
	private JList<String>jlFriend;
	private JList<String>jlBlockFriend;
	
	private JButton jbtnBlockAll;
	private JButton jbtnBlockAll2;
	
	public UseMouseListner() {
		super("친구 리스트");
		
		dlmFriend = new DefaultListModel<String>();
		dlmFriend.addElement("루피");
		dlmFriend.addElement("나루토");
		dlmFriend.addElement("이치고");
		dlmFriend.addElement("쵸파");
		dlmFriend.addElement("히루루크");
		
		dlmBlockFriend = new DefaultListModel<String>();
		
		//모델 객체와 has a 관계로 view객체를 생성
		jlFriend = new JList<String>(dlmFriend);
		jlBlockFriend = new JList<String>(dlmBlockFriend);
		
		jbtnBlockAll = new JButton(">>");
		jbtnBlockAll2 = new JButton("<<");
		
		JScrollPane jspFriend = new JScrollPane(jlFriend);
		JScrollPane jspBlockFriend = new JScrollPane(jlBlockFriend);
		
		jspFriend.setBorder(new TitledBorder("친구"));
		jspBlockFriend.setBorder(new TitledBorder("차단된 친구"));
		
		//이벤트에 컴포넌트를 등록
		jlBlockFriend.addMouseListener(this);
		jlFriend.addMouseListener(this);
		jbtnBlockAll.addActionListener(this);
		jbtnBlockAll2.addActionListener(this);
		
		setLayout(null);
		
		jspFriend.setBounds(20,40,150,200);
		jbtnBlockAll.setBounds(190, 130, 50, 30);
		jbtnBlockAll2.setBounds(190, 180, 50, 30);
		jspBlockFriend.setBounds(250,40,150,200);
		
		add(jspFriend);
		add(jspBlockFriend);
		add(jbtnBlockAll);
		add(jbtnBlockAll2);
		
		setBounds(100,100,440,300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jbtnBlockAll) {
		Object[]obg = new Object[dlmFriend.size()];
		obg = dlmFriend.toArray();
		for(int i = 0 ; i < obg.length ; i++) {
			dlmBlockFriend.addElement(obg[i].toString());
		}
		dlmFriend.removeAllElements();
		}
		if(ae.getSource() == jbtnBlockAll2) {
			Object[]obg = new Object[dlmBlockFriend.size()];
			obg = dlmBlockFriend.toArray();
			for(int i = 0 ; i < obg.length ; i++) {
				dlmFriend.addElement(obg[i].toString());
			}
			dlmBlockFriend.removeAllElements();
		}
	}
	@Override
	public void mouseClicked(MouseEvent me) {
		if(me.getSource() == jlFriend) {
			System.out.println(
					dlmFriend.getElementAt(jlFriend.getSelectedIndex()));
			//어떤 키가 나오는 호출됨. : 키에 대한 비교
//			System.out.println(me.getButton()); //눌리는 버튼의 값
			switch(me.getButton()) {
			case MouseEvent.BUTTON1 :
				int ind = jlFriend.getSelectedIndex();
				if( ind != -1) {
				//선택된 인덱스에 해당하는 값을 Model에서 얻고 
				String name =  dlmFriend.getElementAt(ind);
				//얻어낸 값을 차단된 친구로 등록 (dlmBlockFriend)
				dlmBlockFriend.addElement(name);
				//선택된 인덱스에 해당하는 값을 모델에서 삭제
				dlmFriend.removeElement(name); // 또는 remove(index)도 가능
				}							
			}
		}
		if(me.getSource() == jlBlockFriend) {
			switch(me.getButton()) {
			case MouseEvent.BUTTON1 :
				int ind = jlBlockFriend.getSelectedIndex();
				if( ind != -1) {
				//선택된 인덱스에 해당하는 값을 Model에서 얻고 
				String name =  dlmBlockFriend.getElementAt(ind);
				//얻어낸 값을 차단된 친구로 등록 (dlmBlockFriend)
				dlmFriend.addElement(name);
				//선택된 인덱스에 해당하는 값을 모델에서 삭제
				dlmBlockFriend.removeElement(name); // 또는 remove(index)도 가능
				}							
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("mouseReleased");		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		System.out.println("mouseEntered");		
	}

	@Override
	public void mouseExited(MouseEvent e) {
//		System.out.println("mouseExited");		
	}

	public static void main(String[] args) {
		new UseMouseListner();
	}


}
