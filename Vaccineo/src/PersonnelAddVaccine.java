
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class PersonnelAddVaccine extends javax.swing.JFrame {

    Color priColor = new Color(0, 109, 119);
    Color secColor = new Color(131, 197, 190);
    Color bgColor = new Color(237, 246, 249);
    Color errColor = new Color(238, 118, 116);
    
    public PersonnelAddVaccine() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formBackground1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dbPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logoutPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ppPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cnPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        vaPanel = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        backBtn = new RoundedPanel(10, priColor);
        jLabel33 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel8 = new RoundedPanel(10, priColor);
        jLabel36 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        centreNameLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 800));

        formBackground1.setBackground(new java.awt.Color(237, 246, 249));
        formBackground1.setMaximumSize(new java.awt.Dimension(1440, 800));
        formBackground1.setPreferredSize(new java.awt.Dimension(1440, 800));

        jPanel2.setBackground(new java.awt.Color(0, 109, 119));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 800));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vaccineo-logo-big.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(154, 41));
        jLabel2.setMinimumSize(new java.awt.Dimension(154, 41));

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dashboard");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard-icon.png"))); // NOI18N

        javax.swing.GroupLayout dbPanelLayout = new javax.swing.GroupLayout(dbPanel);
        dbPanel.setLayout(dbPanelLayout);
        dbPanelLayout.setHorizontalGroup(
            dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dbPanelLayout.setVerticalGroup(
            dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dbPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        logoutPanel1.setBackground(new java.awt.Color(131, 197, 190));
        logoutPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanel1MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Logout");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout-logo.png"))); // NOI18N

        javax.swing.GroupLayout logoutPanel1Layout = new javax.swing.GroupLayout(logoutPanel1);
        logoutPanel1.setLayout(logoutPanel1Layout);
        logoutPanel1Layout.setHorizontalGroup(
            logoutPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoutPanel1Layout.setVerticalGroup(
            logoutPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(logoutPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("People");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/people-icon.png"))); // NOI18N

        javax.swing.GroupLayout ppPanelLayout = new javax.swing.GroupLayout(ppPanel);
        ppPanel.setLayout(ppPanelLayout);
        ppPanelLayout.setHorizontalGroup(
            ppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ppPanelLayout.setVerticalGroup(
            ppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        cnPanel.setBackground(new java.awt.Color(0, 109, 119));
        cnPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cnPanel.setPreferredSize(new java.awt.Dimension(300, 65));
        cnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cnPanelMouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Centre");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/center-logo.png"))); // NOI18N

        javax.swing.GroupLayout cnPanelLayout = new javax.swing.GroupLayout(cnPanel);
        cnPanel.setLayout(cnPanelLayout);
        cnPanelLayout.setHorizontalGroup(
            cnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cnPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cnPanelLayout.setVerticalGroup(
            cnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cnPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        vaPanel.setBackground(new java.awt.Color(131, 197, 190));
        vaPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vaPanel.setPreferredSize(new java.awt.Dimension(300, 65));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Vaccine");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vaccine-panel.png"))); // NOI18N

        javax.swing.GroupLayout vaPanelLayout = new javax.swing.GroupLayout(vaPanel);
        vaPanel.setLayout(vaPanelLayout);
        vaPanelLayout.setHorizontalGroup(
            vaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vaPanelLayout.setVerticalGroup(
            vaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vaPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(vaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dbPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addComponent(ppPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(vaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(dbPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ppPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(vaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(logoutPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 109, 119));
        jLabel21.setText("Manufacturer:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 109, 119));
        jLabel27.setText("Size(ml):");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 109, 119));
        jLabel29.setText("Dose Needed:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 109, 119));
        jLabel31.setText("Quantity(per Box):");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(237, 246, 249));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.setPreferredSize(new java.awt.Dimension(58, 22));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Save");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(29, 29, 29))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel36)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        cancelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(226, 149, 120));
        cancelBtn.setText("Cancel");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 109, 119));
        jLabel22.setText("Vaccine Name:");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 109, 119));
        jLabel30.setText("Expiry Duration(month):");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        centreNameLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        centreNameLbl.setForeground(new java.awt.Color(226, 149, 120));
        centreNameLbl.setText("Add New Vaccine");

        javax.swing.GroupLayout formBackground1Layout = new javax.swing.GroupLayout(formBackground1);
        formBackground1.setLayout(formBackground1Layout);
        formBackground1Layout.setHorizontalGroup(
            formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBackground1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formBackground1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formBackground1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(cancelBtn))
                    .addGroup(formBackground1Layout.createSequentialGroup()
                        .addGroup(formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel29)
                            .addComponent(jLabel21)
                            .addComponent(jLabel27)
                            .addComponent(jLabel22))
                        .addGap(62, 62, 62)
                        .addGroup(formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(centreNameLbl))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        formBackground1Layout.setVerticalGroup(
            formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(formBackground1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centreNameLbl)
                .addGap(18, 18, 18)
                .addGroup(formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(formBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formBackground1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cancelBtn))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void logoutPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanel1MouseClicked
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Exit program", JOptionPane.ERROR_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            Login log = new Login();

            setVisible(false);
            log.setVisible(true);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_logoutPanel1MouseClicked

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

    private void cnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnPanelMouseClicked
        PersonnelCentre pc = new PersonnelCentre();
        this.setVisible(false);
        pc.setVisible(true);
    }//GEN-LAST:event_cnPanelMouseClicked

    private void cnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnPanelMouseEntered
        cnPanel.setBackground(secColor);
    }//GEN-LAST:event_cnPanelMouseEntered

    private void cnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnPanelMouseExited
        cnPanel.setBackground(priColor);
    }//GEN-LAST:event_cnPanelMouseExited

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        PersonnelVaccine pv = new PersonnelVaccine();
        pv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnMouseClicked

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        PersonnelVaccine pv = new PersonnelVaccine();
        pv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelBtnMouseClicked

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
            java.util.logging.Logger.getLogger(PersonnelAddVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelAddVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelAddVaccine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backBtn;
    private javax.swing.JLabel cancelBtn;
    private javax.swing.JLabel centreNameLbl;
    private javax.swing.JPanel cnPanel;
    private javax.swing.JPanel dbPanel;
    private javax.swing.JPanel formBackground1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel logoutPanel1;
    private javax.swing.JPanel ppPanel;
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
