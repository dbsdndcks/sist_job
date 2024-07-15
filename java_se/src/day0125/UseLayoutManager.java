package day0125;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속받기
public class UseLayoutManager extends JFrame implements ActionListener{
	
	private JTextField jtfName; //3.Override한 method 안에서 사용해야할 컴포넌트를 인스턴스 변수로 선언
	private JTextArea jtaList;
	private JComboBox<String> jcbGender;
	public UseLayoutManager() {
		super("여러 레이아웃 사용");
		//2. 컴포넌트 생성
		
		//mvc패턴을 적용할 클래스인데 모델을 사용하지 않음.
		JLabel jlbName = new JLabel("이름");
		jtfName = new JTextField(10);
		jcbGender = new JComboBox<String>();
		jcbGender.addItem("남자");
		jcbGender.addItem("여자");
		JButton jbtnInput = new JButton("입력");
		
		//4. 컴포넌트를 이벤트에 등록
		jbtnInput.addActionListener(this);
		jtfName.addActionListener(this);

		jtaList = new JTextArea();
		JScrollPane jsp = new JScrollPane();
		add("Center",jsp);
	
		//여러개의 컴포넌트를 관리하기 위해서 Container Compenent를 사용.
		JPanel jpNorth = new JPanel();
		jpNorth.add(jlbName);
		jpNorth.add(jtfName);
		jpNorth.add(jcbGender);
		jpNorth.add(jbtnInput);
		
		//윈도우 컴포넌트 (Window-사용자에게 보여주는 일) 배치
		add("North",jpNorth);
		add("Center",jtaList);
		
		
		//5.윈도우 크기 설정
		setSize(450,300);
		
		//6.가시화
		setVisible(true);
		//7.윈도우 종료 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 발생했을때 사용자에게 제공할 코드
		//JTextField의 값을 가져와서 JTextFilde를 설정
		String data = jtfName.getText();
		//jtaList.setText(data +"님");
		
		//Model 객체를 사용하지 않았으므로 view객체에서 선택된 아이템의 값을 얻는다.
		jtaList.append(jcbGender.getSelectedItem()+ ": ");	
		
		
		jtaList.append(data+"님\n");
		
		//jtf입력된 이름 삭제
		jtfName.setText(null);

	}
	public static void main(String[] args) {
		new UseLayoutManager();
	}
}
