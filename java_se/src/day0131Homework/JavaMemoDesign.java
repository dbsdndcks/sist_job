package day0131Homework;


import java.awt.Container;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class JavaMemoDesign extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2099005728770117120L;
	private JMenuItem jmiNewTest,jmiOpen,jmiSave,jmiExit,jmiFont,jmiMemoInfo,jmiNewSave;
	private JTextArea jta;

	
	
	
	public JavaMemoDesign() {
		super("메모장");
		try {
			setMenu();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		

		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}//HomeWork
	
	public void setMenu() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("파일");
		JMenu jm2 = new JMenu("서식");
		JMenu jm3 = new JMenu("도움말");
		
		//메뉴아이템 생성
		jmiNewTest = new JMenuItem("새글");
		jmiOpen = new JMenuItem("열기");
		jmiNewSave = new JMenuItem("다른 이름으로 저장");
		jmiSave = new JMenuItem("저장");
		jmiExit = new JMenuItem("종료");
		jmiFont = new JMenuItem("글꼴");
		jmiMemoInfo = new JMenuItem("메모장 정보");
		
		
		jta =new JTextArea();	
		
		File fontFile = new File("C:/Users/user/Desktop/test/font.txt");
        if (fontFile.exists()) {
            Font saveFont = getFont();
            if (saveFont != null) {
            	jta.setFont(saveFont);
            } else {
                // 예외 상황에 대한 처리
                System.err.println("폰트를 불러오는 중에 문제가 발생했습니다. 기본 폰트로 설정합니다.");
                jta.setFont(new Font("고딕", Font.PLAIN, 12));
            }
        } else {
        	jta.setFont(new Font("고딕", Font.PLAIN, 12));
        } 
		add(jta);		
		
		jm1.add(jmiNewTest);
		jm1.add(jmiOpen);
		jm1.add(jmiNewSave);
		jm1.add(jmiSave);
		jm1.add(jmiExit);
		jm2.add(jmiFont);
		jm3.add(jmiMemoInfo);

		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		setJMenuBar(jmb);
		
		//has a이벤트등록
		JavaMemoEvent jme = new JavaMemoEvent(this);
		jmiNewTest.addActionListener(jme);
		jmiOpen.addActionListener(jme);
		jmiNewSave.addActionListener(jme);
		jmiSave.addActionListener(jme);
		jmiExit.addActionListener(jme);
		jmiFont.addActionListener(jme);
		jmiMemoInfo.addActionListener(jme);
		
		
		
}//setMenu

	
	
	public JMenuItem getJmiNewSave() {
		return jmiNewSave;
	}

	public JTextArea getJta() {
		return jta;
	}

	public JMenuItem getJmiNewTest() {
		return jmiNewTest;
	}

	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}

	public JMenuItem getJmiSave() {
		return jmiSave;
	}

	public JMenuItem getJmiExit() {
		return jmiExit;
	}

	public JMenuItem getJmiFont() {
		return jmiFont;
	}

	public JMenuItem getJmiMemoInfo() {
		return jmiMemoInfo;
	}

	/////////////////////////////////
	
	public Font getFont() {
        Font font = null;
        ObjectInputStream ois = null;
        try {
            File fontFile = new File("C:/Users/user/Desktop/test/font.txt");
            if (fontFile.exists()) {
                ois = new ObjectInputStream(new FileInputStream(fontFile));
                font = (Font) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

            System.err.println("폰트를 불러오는 중에 문제가 발생했습니다. 기본 폰트로 설정합니다.");
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();

                System.err.println("입출력 스트림을 닫는 중에 문제가 발생했습니다.");
            }
        }
        return font;
    }
	/////////////////


	public static void main(String[] args) {
		new JavaMemoDesign();
	}//main
	
}
