package day0131work;

import java.awt.Component;
import java.awt.Font;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

@SuppressWarnings("serial")
public class FontListCellRenderer extends DefaultListCellRenderer {
    private Font[] fonts;

    public FontListCellRenderer(Font[] fonts) {
        this.fonts = fonts;        
    }

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
            boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        // 현재 항목의 폰트를 설정
        if (index >= 0 && index < fonts.length) {
            setFont(fonts[index]);
        }

        return this;
    }
}
