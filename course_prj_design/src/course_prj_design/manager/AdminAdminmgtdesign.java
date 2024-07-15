package course_prj_design.manager;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class AdminAdminmgtdesign extends JDialog {

    private ArrayList<AdminVO> admins;

    public AdminAdminmgtdesign(ArrayList<AdminVO> admins) {
        setTitle("Admin 관리");
        this.admins = admins;
        
        // 뒷 배경 이미지
        JLabel jlBack = new JLabel(new ImageIcon("src/images/back.png"));
        jlBack.setBounds(0, 0, 984, 620);
        add(jlBack); // 뒷 배경 이미지를 먼저 추가
        JLabel adminMgmtTitle = new JLabel(new ImageIcon("src/images/관리자_관리.png"));
        adminMgmtTitle.setBounds(10, 76, 967, 45);
        jlBack.add(adminMgmtTitle);

               
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("이름");
        model.addColumn("조회/수정");

        // 관리자 정보와 버튼을 담을 패널
        JPanel adminJp = new JPanel(new FlowLayout());

        for (AdminVO admin : admins) {
            JButton viewButton = new JButton(new ImageIcon("src/images/조회s.png"));
            JButton editButton = new JButton(new ImageIcon("src/images/수정s.png"));
            
            
            
            // 관리자 정보 표시를 위한 라벨 생성
            JLabel adminJlb = new JLabel("ID: " + admin.getId() + ", 이름: " + admin.getName());

            // 버튼을 담을 패널
            JPanel buttonJP = new JPanel();
            buttonJP.add(viewButton);
            buttonJP.add(editButton);
            
            addAdminPanel(adminJp, adminJlb, buttonJP);
            
            String[] adminDatas = { admin.getId(), admin.getName(), };
            model.addRow(adminDatas);

        }
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        
        adminJp.setBounds(530, 10, 450, 500);
        jlBack.add(adminJp);
        setLayout(null);
        setSize(1000, 650);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addAdminPanel(JPanel adminJp, JLabel adminLabel, JPanel buttonJP) {
        // 패널 생성
        JPanel panel = new JPanel(new FlowLayout());
        
        // 관리자 정보와 버튼 패널을 패널에 추가
        panel.add(adminLabel);
        panel.add(buttonJP);
        
        // adminJp 패널에 추가
        adminJp.add(panel);
        
    }
    
    public static void main(String[] args) {
        ArrayList<AdminVO>admins = new ArrayList<AdminVO>();
        admins.add(new AdminVO("yoon", "wonchan"));
        admins.add(new AdminVO("kim", "son"));
        admins.add(new AdminVO("park", "yooungsu"));
        admins.add(new AdminVO("son", "wonchan"));
        new AdminAdminmgtdesign(admins);
    }
}

