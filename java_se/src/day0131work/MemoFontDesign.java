package day0131work;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MemoFontDesign extends JDialog{
	private JTextField jtfFont,jtfStyle,jtfSize;
	private JList<String> jlfont,jlStyle,jlSize;
	private DefaultListModel<String>dlmFont,dlmStyle,dlmSize;
	private JLabel jlPreview;
	private JButton jbtnCheck,jbtnCancel;
	private JavaMemoDesign jmd = new JavaMemoDesign();
	 
	

	public MemoFontDesign(JavaMemoDesign jmd) {
		super(jmd, "글꼴", false);
        setPreview();
        
        
      	//이벤트 등록
        MemoFontEvent mfe = new MemoFontEvent(this,jmd);
        addWindowListener(mfe);
        jlfont.addMouseListener(mfe);
        jlStyle.addMouseListener(mfe);
        jlSize.addMouseListener(mfe);
        jbtnCheck.addActionListener(mfe);
        jbtnCancel.addActionListener(mfe);
        
        setLayout(null);
        setResizable(false);
        setSize(480, 300);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void setPreview() {
  
        // JTextArea에서 현재 폰트 세부 정보 가져오기
        String jmdFontName = jmd.getJta().getFont().getFamily();
        int jmdFontStyle = jmd.getJta().getFont().getStyle();
        int jmdFontSize = jmd.getJta().getFont().getSize();
        
        //==========버튼============
        jbtnCheck = new JButton("확인");
        jbtnCancel = new JButton("취소");
        jbtnCheck.setBounds(300, 200, 70, 30); // 예상 크기에 맞게 수정
        jbtnCancel.setBounds(380, 200, 70, 30); // 예상 크기에 맞게 수정

        add(jbtnCheck);
        add(jbtnCancel);

        //===========폰트============
        dlmFont = new DefaultListModel<>();
        dlmFont.addElement("고딕체");
        dlmFont.addElement("궁서체");
        dlmFont.addElement("Consolas");
        dlmFont.addElement("새굴림");
        dlmFont.addElement("맑은 고딕");

        Font[] fonts = {
                new Font("Gothic", Font.PLAIN, 12),
                new Font("Gungsuh", Font.PLAIN, 12),
                new Font("Consolas", Font.PLAIN, 12),
                new Font("New Gulim", Font.PLAIN, 12),
                new Font("Malgun Gothic", Font.PLAIN, 12)
        };

        jlfont = new JList<>(dlmFont);
        jlfont.setCellRenderer(new FontListCellRenderer(fonts));
        JScrollPane jspFont = new JScrollPane(jlfont);

        jtfFont = new JTextField(12);
        jtfFont.setText(jmdFontName);
        Font newFont = new Font(jmdFontName, Font.PLAIN, jmdFontSize);
        jtfFont.setFont(newFont);

        JLabel labelFont = new JLabel("글꼴(T):");

        JPanel jpFont = new JPanel(new BorderLayout());
        jpFont.add("North", jtfFont);
        jpFont.add("Center", jspFont);

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        jp.add(labelFont, BorderLayout.NORTH);
        jp.add(jpFont, BorderLayout.CENTER);

        add(jp);
        jp.setBounds(30, 30, 150, 130);

        //==========폰트스타일============
        dlmStyle = new DefaultListModel<>();
        dlmStyle.addElement("가늘게");
        dlmStyle.addElement("보통");
        dlmStyle.addElement("굵게");
        dlmStyle.addElement("가는 기울임꼴");
        dlmStyle.addElement("굵은 기울임 꼴");

        Font[] fontStyle = {
                new Font(Font.SANS_SERIF, Font.PLAIN, 12),
                new Font(Font.SANS_SERIF, Font.PLAIN, 12),
                new Font(Font.SANS_SERIF, Font.BOLD, 12),
                new Font(Font.SANS_SERIF, Font.ITALIC + Font.PLAIN, 12),
                new Font(Font.SANS_SERIF, Font.ITALIC, 12),
                new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 12)
        };

        jlStyle = new JList<>(dlmStyle);
        jlStyle.setCellRenderer(new FontListCellRenderer(fontStyle));
        JScrollPane jspStyle = new JScrollPane(jlStyle);

        jtfStyle = new JTextField(10);
        jtfStyle.setText(getFontStyleName(jmdFontStyle));
        jtfStyle.setFont(jmd.getJta().getFont());

        JLabel labelStyle = new JLabel("글꼴 스타일(Y):");

        JPanel jp1 = new JPanel();
        jp1.setLayout(new BorderLayout());
        jp1.add(labelStyle, BorderLayout.NORTH);

        JPanel jpStyle = new JPanel(new BorderLayout());
        jpStyle.add("North", jtfStyle);
        jpStyle.add("Center", jspStyle);

        jp1.add(jpStyle, BorderLayout.CENTER);
        add(jp1);
        jp1.setBounds(190, 30, 130, 130);

        //==========폰트사이즈============
        dlmSize = new DefaultListModel<>();
        for (int i = 1; i < 40; i++) {
            if (i < 12) {
                dlmSize.addElement(String.valueOf(i));
            } else if (i == 12) {
                dlmSize.addElement(String.valueOf(i));
            } else {
                dlmSize.addElement(String.valueOf(i + 1));
            }
        }

        jlSize = new JList<>(dlmSize);
        JScrollPane jspSize = new JScrollPane(jlSize);

        jtfSize = new JTextField(6);
        jtfSize.setText(String.valueOf(jmdFontSize));
        JLabel labelSize = new JLabel("크기(S):");

        JPanel jp2 = new JPanel();
        jp2.setLayout(new BorderLayout());
        jp2.add(labelSize, BorderLayout.NORTH);

        JPanel jpSize = new JPanel(new BorderLayout());
        jpSize.add("North", jtfSize);
        jpSize.add("Center", jspSize);

        jp2.add(jpSize, BorderLayout.CENTER);
        add(jp2);
        jp2.setBounds(330, 30, 80, 130);


    }//setPreiew
	
	//스타일반환 메서드
	public String getFontStyleName(int style) {
	    switch (style) {
	        case Font.PLAIN:
	            return "보통";
	        case Font.BOLD:
	            return "굵게";
	        case Font.ITALIC:
	            return "기울임꼴";
	        default:
	            return "기타";
	    }
	}//getFontStyleName
	
	public String getFontName(String font) {
	    switch (font) {
	        case "Gothic":
	            return "고딕";
	        case "Gungsuh":
	            return "궁서";
	        case "Consolas":
	            return "Consolas";
	        case "New Gulim":
	        	return "새굴림";
	        case "Malgun Gothic":
	        	return "맑은 고딕";
	        default:
	            return "기타";
	    }
	}//getFontStyleName
	
	
	public JTextField getJtfFont() {
		return jtfFont;
	}

	public JTextField getJtfStyle() {
		return jtfStyle;
	}

	public JTextField getJtfSize() {
		return jtfSize;
	}

	public JList<String> getJlfont() {
		return jlfont;
	}

	public JList<String> getJlStyle() {
		return jlStyle;
	}

	public JList<String> getJlSize() {
		return jlSize;
	}

	public DefaultListModel<String> getDlmFont() {
		return dlmFont;
	}

	public DefaultListModel<String> getDlmStyle() {
		return dlmStyle;
	}

	public DefaultListModel<String> getDlmSize() {
		return dlmSize;
	}

	public JLabel getJlPreview() {
		return jlPreview;
	}

	public JButton getJbtnCheck() {
		return jbtnCheck;
	}

	public JButton getJbtnCancel() {
		return jbtnCancel;
	}

	
}//class
