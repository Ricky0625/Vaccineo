
import classes.Centre;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PersonnelEditCentre extends javax.swing.JFrame {

    Color priColor = new Color(0, 109, 119);
    Color secColor = new Color(131, 197, 190);
    Color bgColor = new Color(237, 246, 249);

    String centreId;
    Centre c = new Centre();
    JFrame PersonnelEditCentre = this;

    public PersonnelEditCentre() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/vaccine-logo.png")));
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                String ObjButtons[] = {"Yes", "No"};
                int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?", "Vaccineo", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
                if (PromptResult == JOptionPane.YES_OPTION) {
                    Login log = new Login();
                    log.setVisible(true);
                    PersonnelEditCentre.setVisible(false);
                }
            }
        });
    }

    public PersonnelEditCentre(String id) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/vaccine-logo.png")));
        centreId = id;
        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                String ObjButtons[] = {"Yes", "No"};
                int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?", "Vaccineo", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
                if (PromptResult == JOptionPane.YES_OPTION) {
                    Login log = new Login();
                    log.setVisible(true);
                    PersonnelEditCentre.setVisible(false);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formBackground = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dbPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ppPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cnPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        vaPanel = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        backBtn = new RoundedPanel(10, priColor);
        jLabel33 = new javax.swing.JLabel();
        centreNameLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        centreNameTf = new javax.swing.JTextField();
        centreStreetTf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        centreStateTf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        centrePostcodeTf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        centreCountryLbl = new javax.swing.JLabel();
        savePeopleInfo = new RoundedPanel(10, priColor);
        jLabel34 = new javax.swing.JLabel();
        savePeopleInfo1 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        centreNameHidden = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        formBackground.setBackground(new java.awt.Color(237, 246, 249));
        formBackground.setMaximumSize(new java.awt.Dimension(1440, 800));
        formBackground.setPreferredSize(new java.awt.Dimension(1440, 800));

        jPanel1.setBackground(new java.awt.Color(0, 109, 119));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 800));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vaccineo-logo-big.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(154, 41));
        jLabel1.setMinimumSize(new java.awt.Dimension(154, 41));

        dbPanel.setBackground(new java.awt.Color(0, 109, 119));
        dbPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dbPanel.setPreferredSize(new java.awt.Dimension(300, 65));
        dbPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dbPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dbPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dbPanelMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashboard");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard-icon.png"))); // NOI18N

        javax.swing.GroupLayout dbPanelLayout = new javax.swing.GroupLayout(dbPanel);
        dbPanel.setLayout(dbPanelLayout);
        dbPanelLayout.setHorizontalGroup(
            dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dbPanelLayout.setVerticalGroup(
            dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        logoutPanel.setBackground(new java.awt.Color(131, 197, 190));
        logoutPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Logout");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout-logo.png"))); // NOI18N

        javax.swing.GroupLayout logoutPanelLayout = new javax.swing.GroupLayout(logoutPanel);
        logoutPanel.setLayout(logoutPanelLayout);
        logoutPanelLayout.setHorizontalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutPanelLayout.setVerticalGroup(
            logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(logoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        ppPanel.setBackground(new java.awt.Color(0, 109, 119));
        ppPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ppPanel.setPreferredSize(new java.awt.Dimension(300, 65));
        ppPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ppPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ppPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ppPanelMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("People");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/people-icon.png"))); // NOI18N

        javax.swing.GroupLayout ppPanelLayout = new javax.swing.GroupLayout(ppPanel);
        ppPanel.setLayout(ppPanelLayout);
        ppPanelLayout.setHorizontalGroup(
            ppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ppPanelLayout.setVerticalGroup(
            ppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        cnPanel.setBackground(new java.awt.Color(131, 197, 190));
        cnPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cnPanel.setPreferredSize(new java.awt.Dimension(300, 65));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Centre");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/center-logo.png"))); // NOI18N

        javax.swing.GroupLayout cnPanelLayout = new javax.swing.GroupLayout(cnPanel);
        cnPanel.setLayout(cnPanelLayout);
        cnPanelLayout.setHorizontalGroup(
            cnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cnPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cnPanelLayout.setVerticalGroup(
            cnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cnPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        vaPanel.setBackground(new java.awt.Color(0, 109, 119));
        vaPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vaPanel.setPreferredSize(new java.awt.Dimension(300, 65));
        vaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vaPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vaPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vaPanelMouseExited(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Vaccine");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vaccine-panel.png"))); // NOI18N

        javax.swing.GroupLayout vaPanelLayout = new javax.swing.GroupLayout(vaPanel);
        vaPanel.setLayout(vaPanelLayout);
        vaPanelLayout.setHorizontalGroup(
            vaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vaPanelLayout.setVerticalGroup(
            vaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(vaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel37))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dbPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addComponent(ppPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(vaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(dbPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ppPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(vaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(logoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        backBtn.setBackground(new java.awt.Color(237, 246, 249));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setPreferredSize(new java.awt.Dimension(58, 22));
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-btn.png"))); // NOI18N
        jLabel33.setText("Back");

        javax.swing.GroupLayout backBtnLayout = new javax.swing.GroupLayout(backBtn);
        backBtn.setLayout(backBtnLayout);
        backBtnLayout.setHorizontalGroup(
            backBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backBtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel33)
                .addGap(20, 20, 20))
        );
        backBtnLayout.setVerticalGroup(
            backBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backBtnLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel33)
                .addGap(12, 12, 12))
        );

        centreNameLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        centreNameLbl.setForeground(new java.awt.Color(226, 149, 120));
        centreNameLbl.setText("Edit Centre");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 109, 119));
        jLabel8.setText("Centre Name");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 109, 119));
        jLabel18.setText("Street");

        centreNameTf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        centreStreetTf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 109, 119));
        jLabel19.setText("State");

        centreStateTf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 109, 119));
        jLabel20.setText("Postcode");

        centrePostcodeTf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 109, 119));
        jLabel21.setText("Country");

        centreCountryLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        centreCountryLbl.setForeground(new java.awt.Color(0, 109, 119));
        centreCountryLbl.setText("Malaysia");

        savePeopleInfo.setBackground(new java.awt.Color(237, 246, 249));
        savePeopleInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savePeopleInfo.setPreferredSize(new java.awt.Dimension(58, 22));
        savePeopleInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savePeopleInfoMouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Save");

        javax.swing.GroupLayout savePeopleInfoLayout = new javax.swing.GroupLayout(savePeopleInfo);
        savePeopleInfo.setLayout(savePeopleInfoLayout);
        savePeopleInfoLayout.setHorizontalGroup(
            savePeopleInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, savePeopleInfoLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(29, 29, 29))
        );
        savePeopleInfoLayout.setVerticalGroup(
            savePeopleInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savePeopleInfoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel34)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        savePeopleInfo1.setBackground(new java.awt.Color(237, 246, 249));
        savePeopleInfo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savePeopleInfo1.setPreferredSize(new java.awt.Dimension(58, 22));
        savePeopleInfo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savePeopleInfo1MouseClicked(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(226, 149, 120));
        jLabel35.setText("Cancel");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout savePeopleInfo1Layout = new javax.swing.GroupLayout(savePeopleInfo1);
        savePeopleInfo1.setLayout(savePeopleInfo1Layout);
        savePeopleInfo1Layout.setHorizontalGroup(
            savePeopleInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, savePeopleInfo1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(23, 23, 23))
        );
        savePeopleInfo1Layout.setVerticalGroup(
            savePeopleInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(savePeopleInfo1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel35)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        centreNameHidden.setBackground(new java.awt.Color(237, 246, 249));
        centreNameHidden.setForeground(new java.awt.Color(237, 246, 249));
        centreNameHidden.setText("jLabel2");

        javax.swing.GroupLayout formBackgroundLayout = new javax.swing.GroupLayout(formBackground);
        formBackground.setLayout(formBackgroundLayout);
        formBackgroundLayout.setHorizontalGroup(
            formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBackgroundLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formBackgroundLayout.createSequentialGroup()
                        .addComponent(centreNameLbl)
                        .addGap(42, 42, 42)
                        .addComponent(centreNameHidden))
                    .addComponent(jLabel8)
                    .addComponent(jLabel18)
                    .addComponent(centreNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(centreStreetTf, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formBackgroundLayout.createSequentialGroup()
                        .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(centreStateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(centrePostcodeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel21)
                    .addComponent(centreCountryLbl)
                    .addGroup(formBackgroundLayout.createSequentialGroup()
                        .addComponent(savePeopleInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(savePeopleInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        formBackgroundLayout.setVerticalGroup(
            formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(formBackgroundLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(centreNameLbl)
                    .addComponent(centreNameHidden))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(centreNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(12, 12, 12)
                        .addComponent(centreStreetTf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(centreStateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formBackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(centrePostcodeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addGap(12, 12, 12)
                .addComponent(centreCountryLbl)
                .addGap(18, 18, 18)
                .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savePeopleInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savePeopleInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dbPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbPanelMouseClicked
        PersonnelDashboard pd = new PersonnelDashboard();
        this.setVisible(false);
        pd.setVisible(true);
    }//GEN-LAST:event_dbPanelMouseClicked

    private void dbPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbPanelMouseEntered
        dbPanel.setBackground(secColor);
    }//GEN-LAST:event_dbPanelMouseEntered

    private void dbPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbPanelMouseExited
        dbPanel.setBackground(priColor);
    }//GEN-LAST:event_dbPanelMouseExited

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Exit program", JOptionPane.ERROR_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            Login log = new Login();

            setVisible(false);
            log.setVisible(true);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_logoutPanelMouseClicked

    private void ppPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppPanelMouseClicked
        PersonnelPeopleList ppl = new PersonnelPeopleList();
        this.setVisible(false);
        ppl.setVisible(true);
    }//GEN-LAST:event_ppPanelMouseClicked

    private void ppPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppPanelMouseEntered
        ppPanel.setBackground(secColor);
    }//GEN-LAST:event_ppPanelMouseEntered

    private void ppPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppPanelMouseExited
        ppPanel.setBackground(priColor);
    }//GEN-LAST:event_ppPanelMouseExited

    private void vaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaPanelMouseClicked
        PersonnelVaccine pv = new PersonnelVaccine();
        this.setVisible(false);
        pv.setVisible(true);
    }//GEN-LAST:event_vaPanelMouseClicked

    private void vaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaPanelMouseEntered
        vaPanel.setBackground(secColor);
    }//GEN-LAST:event_vaPanelMouseEntered

    private void vaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaPanelMouseExited
        vaPanel.setBackground(priColor);
    }//GEN-LAST:event_vaPanelMouseExited

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        PersonnelCentreDetail pcd = new PersonnelCentreDetail(c.getCentreName());
        pcd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnMouseClicked

    private void savePeopleInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savePeopleInfoMouseClicked

    }//GEN-LAST:event_savePeopleInfoMouseClicked

    private void savePeopleInfo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savePeopleInfo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_savePeopleInfo1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            c.generateCentreList();
            c.searchCentreById(centreId);
            centreNameHidden.setText(c.getCentreName());
            centreNameTf.setText(c.getCentreName());
            centreStreetTf.setText(c.getStreet());
            centreStateTf.setText(c.getState());
            centrePostcodeTf.setText(Integer.toString(c.getPostcode()));
            centreCountryLbl.setText(c.getCountry());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonnelEditCentre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        PersonnelCentreDetail pcd = new PersonnelCentreDetail(centreNameHidden.getText());
        pcd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel35MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonnelEditCentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelEditCentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelEditCentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelEditCentre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelEditCentre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backBtn;
    private javax.swing.JLabel centreCountryLbl;
    private javax.swing.JLabel centreNameHidden;
    private javax.swing.JLabel centreNameLbl;
    private javax.swing.JTextField centreNameTf;
    private javax.swing.JTextField centrePostcodeTf;
    private javax.swing.JTextField centreStateTf;
    private javax.swing.JTextField centreStreetTf;
    private javax.swing.JPanel cnPanel;
    private javax.swing.JPanel dbPanel;
    private javax.swing.JPanel formBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel ppPanel;
    private javax.swing.JPanel savePeopleInfo;
    private javax.swing.JPanel savePeopleInfo1;
    private javax.swing.JPanel vaPanel;
    // End of variables declaration//GEN-END:variables

    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;

        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(Color bgColor) {
            super();
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }
}
