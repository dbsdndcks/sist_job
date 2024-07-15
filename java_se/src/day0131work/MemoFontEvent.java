package day0131work;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;


public class MemoFontEvent extends WindowAdapter implements ActionListener,MouseListener{
    private String font;
    private int style;
    private int size = 12;
	private MemoFontDesign mfd;
	private JavaMemoDesign jmd;
	
	public MemoFontEvent(MemoFontDesign mfd,JavaMemoDesign jmd) {
		this.mfd = mfd;
		this.jmd = jmd;
	}
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == mfd.getJbtnCheck()) {
			applyFont(jmd);
		}
		if(ae.getSource() == mfd.getJbtnCancel()) {
			closeFontDialog();
		}
	}//actionPerformed
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		switch (me.getButton()) {
		case MouseEvent.BUTTON1:
			if(me.getSource() == mfd.getJlfont()) {
				setNewFont();
			}	// end if
			
			if(me.getSource() == mfd.getJlStyle()) {
				setNewStyle();
			}	// end if
			
			if(me.getSource() == mfd.getJlSize()) {
				setNewSize();
			}
			
		}
	}
	public void setNewSize() {
		int indSize = mfd.getJlSize().getSelectedIndex();
		if(indSize != -1) {
			String selectSize = mfd.getDlmSize().elementAt(indSize);
			mfd.getJtfSize().setText(selectSize);
			this.size = Integer.parseInt(selectSize);
			mfd.getJtfFont().setFont(new Font(this.font, this.style, this.size));
		}	// end if
	}



	private void setNewStyle() {
		int indStyle = mfd.getJlStyle().getSelectedIndex();
		if(indStyle != -1) {
			String selectStyle = mfd.getDlmStyle().elementAt(indStyle);
			mfd.getJtfStyle().setText(selectStyle);
			switch(selectStyle) {
			case "일반" :
				this.style = Font.PLAIN;
				break;
			case "굵게" :
				this.style = Font.BOLD;
				break;
			case "기울임꼴" :
				this.style = Font.ITALIC;
				break;
			case "굵은 기울임꼴" :
				this.style = Font.BOLD | Font.ITALIC;
			}	
			mfd.getJtfStyle().setFont(new Font(this.font, this.style, this.size));
		}	
	}



	private void setNewFont() {
		int indFont = mfd.getJlfont().getSelectedIndex();
		if(indFont != -1) {
			String selectFont = mfd.getDlmFont().elementAt(indFont);
			mfd.getJtfFont().setText(selectFont);
			this.font = selectFont;
	
			mfd.getJtfSize().setFont(new Font(this.font, this.style, this.size));
		}	// end if		
	}

	public void applyFont(JavaMemoDesign jmd) {
	        Font newFont = new Font(this.font, this.style, this.size);
	        jmd.getJta().setFont(newFont);
	        mfd.dispose();
	}
	public void closeFontDialog() {
		mfd.dispose();
	}
	
	

	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}


}
