import classes.Certificate;
import classes.GeneralFunction;
import classes.People;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dexte
 */
public class PeopleDashboard extends javax.swing.JFrame {

    /**
     * Creates new form PeopleDashboard
     */
    Color priColor = new Color(0, 109, 119);
    Color secColor = new Color(131, 197, 190);
    Color bgColor = new Color(237, 246, 249);
    Color empColor = new Color(255, 221, 210);
    Color whiteColor = new Color(255, 255, 255);

    Timer timer;
    People ppl = new People();
    GeneralFunction gf = new GeneralFunction();
    Certificate cert = new Certificate();
    ArrayList<ArrayList<String>> peopleList;
    ArrayList<ArrayList<String>> certificate;

    private Scanner x;
    public PeopleDashboard() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/vaccine-logo.png")));
        column3panel.setVisible(false);
        // Real and current time in Malaysia
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Time in 12Hrs Format
                Date date1 = new Date();
                DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss aa");
                String time = timeFormat.format(date1);
                timelbl.setText(time);
            }
        };
        timer = new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }

    public void peopleInfo(String value) {
        String id = value;
        String dose = "1";
        try {
            ppl.generatePeopleList();
            peopleList = ppl.getPeopleList();
            ppl.searchUser(peopleList, id);
            ppl.setId(value);
            ppl.setVaccinationStatus(ppl.getVaccinationStatus());
            userlabel.setText(ppl.getUsername());
            cert.showCertificate(id, dose);
        } catch (Exception e) {
            //System.out.println("Error");
        }
        
        //Check if user ady done 1st,2nd or both doses.
        //Check if user ady register for vaccination.
        String vacstatus = ppl.getVaccinationStatus();
            
        if(vacstatus.equals("Not Registered")){
            System.out.println("Haven Registered Yet");
        } else {
            ImageIcon appointmentIcon = new ImageIcon(
            Objects.requireNonNull(this.getClass().getResource("/images/dash-appoint.png")));
            registervac1.setIcon(appointmentIcon);
            registervac2.setText("Appointment");      
        }
        
        String complete = cert.getComplete();
        if(cert.getDose().equals("1") && complete.equals("yes")){
            column3panel.setVisible(true);
        } else {
            column3panel.setVisible(false);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basepanel = new javax.swing.JPanel();
        navpanel = new javax.swing.JPanel();
        logolabel = new javax.swing.JLabel();
        ppllabel = new javax.swing.JLabel();
        logoutlabel = new javax.swing.JLabel();
        logopanel = new RoundedPanel(20, priColor);
        jPanel1 = new javax.swing.JPanel();
        column1panel = new RoundedPanel(10, secColor);
        registervac1 = new javax.swing.JLabel();
        registervac2 = new javax.swing.JLabel();
        welcomelabel = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        column2panel = new RoundedPanel(10, secColor);
        vaccineLibrary1 = new javax.swing.JLabel();
        vaccineLibrary2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        column3panel = new RoundedPanel(10, secColor);
        viewCertificate1 = new javax.swing.JLabel();
        viewCertificate2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        basepanel.setBackground(new java.awt.Color(237, 246, 249));
        basepanel.setMinimumSize(new java.awt.Dimension(1440, 800));
        basepanel.setPreferredSize(new java.awt.Dimension(1440, 800));

        navpanel.setBackground(new java.awt.Color(0, 109, 119));

        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vaccineo-logo-big.png"))); // NOI18N
        logolabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logolabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logolabelMouseClicked(evt);
            }
        });

        ppllabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile-nav.png"))); // NOI18N
        ppllabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ppllabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ppllabelMouseClicked(evt);
            }
        });

        logoutlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout-nav.png"))); // NOI18N
        logoutlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutlabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navpanelLayout = new javax.swing.GroupLayout(navpanel);
        navpanel.setLayout(navpanelLayout);
        navpanelLayout.setHorizontalGroup(
            navpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navpanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(logolabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 982, Short.MAX_VALUE)
                .addComponent(ppllabel)
                .addGap(34, 34, 34)
                .addComponent(logoutlabel)
                .addGap(117, 117, 117))
        );
        navpanelLayout.setVerticalGroup(
            navpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(navpanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(navpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ppllabel)
                    .addComponent(logoutlabel))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        logopanel.setBackground(new java.awt.Color(237, 246, 249));
        logopanel.setPreferredSize(new java.awt.Dimension(228, 86));

        javax.swing.GroupLayout logopanelLayout = new javax.swing.GroupLayout(logopanel);
        logopanel.setLayout(logopanelLayout);
        logopanelLayout.setHorizontalGroup(
            logopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        logopanelLayout.setVerticalGroup(
            logopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(237, 246, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(992, 554));
        jPanel1.setLayout(null);

        column1panel.setBackground(new java.awt.Color(237, 246, 249));
        column1panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        column1panel.setMinimumSize(new java.awt.Dimension(200, 140));
        column1panel.setPreferredSize(new java.awt.Dimension(200, 140));
        column1panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                column1panelMouseClicked(evt);
            }
        });

        registervac1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registervac1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dash-regvaccine.png"))); // NOI18N

        registervac2.setBackground(new java.awt.Color(237, 246, 249));
        registervac2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registervac2.setForeground(new java.awt.Color(237, 246, 249));
        registervac2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registervac2.setText("Register Vaccine");

        javax.swing.GroupLayout column1panelLayout = new javax.swing.GroupLayout(column1panel);
        column1panel.setLayout(column1panelLayout);
        column1panelLayout.setHorizontalGroup(
            column1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registervac1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(registervac2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        column1panelLayout.setVerticalGroup(
            column1panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(column1panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(registervac1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registervac2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(column1panel);
        column1panel.setBounds(350, 60, 200, 150);

        welcomelabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        welcomelabel.setForeground(new java.awt.Color(0, 109, 119));
        welcomelabel.setText("Welcome,");
        jPanel1.add(welcomelabel);
        welcomelabel.setBounds(0, 0, 176, 44);

        userlabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        userlabel.setForeground(new java.awt.Color(226, 149, 120));
        userlabel.setText("Josh");
        jPanel1.add(userlabel);
        userlabel.setBounds(182, 0, 450, 44);

        column2panel.setBackground(new java.awt.Color(237, 246, 249));
        column2panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        column2panel.setMinimumSize(new java.awt.Dimension(200, 140));
        column2panel.setPreferredSize(new java.awt.Dimension(200, 140));
        column2panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                column2panelMouseClicked(evt);
            }
        });

        vaccineLibrary1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vaccineLibrary1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dash-vaclibrary.png"))); // NOI18N
        vaccineLibrary1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        vaccineLibrary2.setBackground(new java.awt.Color(237, 246, 249));
        vaccineLibrary2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vaccineLibrary2.setForeground(new java.awt.Color(237, 246, 249));
        vaccineLibrary2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vaccineLibrary2.setText("Vaccine Library");
        vaccineLibrary2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout column2panelLayout = new javax.swing.GroupLayout(column2panel);
        column2panel.setLayout(column2panelLayout);
        column2panelLayout.setHorizontalGroup(
            column2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vaccineLibrary1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(vaccineLibrary2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        column2panelLayout.setVerticalGroup(
            column2panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(column2panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(vaccineLibrary1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vaccineLibrary2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(column2panel);
        column2panel.setBounds(570, 60, 200, 150);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 109, 119));
        jLabel6.setText("Task to Do..");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(348, 231, 107, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/people-dashboard.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 60, 330, 483);

        timelbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        timelbl.setForeground(new java.awt.Color(0, 109, 119));
        timelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timelbl.setText("Real Time");
        jPanel1.add(timelbl);
        timelbl.setBounds(760, 0, 240, 44);

        column3panel.setBackground(new java.awt.Color(237, 246, 249));
        column3panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        column3panel.setMinimumSize(new java.awt.Dimension(200, 140));
        column3panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                column3panelMouseClicked(evt);
            }
        });

        viewCertificate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewCertificate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dash-cert.png"))); // NOI18N
        viewCertificate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        viewCertificate2.setBackground(new java.awt.Color(237, 246, 249));
        viewCertificate2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewCertificate2.setForeground(new java.awt.Color(237, 246, 249));
        viewCertificate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewCertificate2.setText("View Certificate");
        viewCertificate2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout column3panelLayout = new javax.swing.GroupLayout(column3panel);
        column3panel.setLayout(column3panelLayout);
        column3panelLayout.setHorizontalGroup(
            column3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewCertificate1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewCertificate2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        column3panelLayout.setVerticalGroup(
            column3panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(column3panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(viewCertificate1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewCertificate2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(column3panel);
        column3panel.setBounds(790, 60, 200, 150);

        javax.swing.GroupLayout basepanelLayout = new javax.swing.GroupLayout(basepanel);
        basepanel.setLayout(basepanelLayout);
        basepanelLayout.setHorizontalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(basepanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(logopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(basepanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        basepanelLayout.setVerticalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basepanelLayout.createSequentialGroup()
                .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(basepanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ppllabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppllabelMouseClicked
        // TODO add your handling code here:
        String value = ppl.getId();
        Profile pro = new Profile();
        pro.peopleInfo(value);
        pro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ppllabelMouseClicked

    private void logoutlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlabelMouseClicked
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Exit program",
                JOptionPane.ERROR_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            Login log = new Login();

            setVisible(false);
            log.setVisible(true);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_logoutlabelMouseClicked

    private void logolabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logolabelMouseClicked
        // TODO add your handling code here:
        String value = ppl.getId();
        PeopleDashboard ppldash = new PeopleDashboard();
        ppldash.peopleInfo(value);
        ppldash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logolabelMouseClicked

    private void column2panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_column2panelMouseClicked
        // TODO add your handling code here:
        String value = ppl.getId();
        VaccineLibrary vaclib = new VaccineLibrary();
        vaclib.peopleInfo(value);
        vaclib.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_column2panelMouseClicked

    private void column1panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_column1panelMouseClicked
        // TODO add your handling code here:
        String vacstatus = ppl.getVaccinationStatus();
        String value = ppl.getId();
        
        if(vacstatus.equals("Not Registered")){
            RegisterVaccine regvac = new RegisterVaccine();
            regvac.peopleInfo(value);
            regvac.setVisible(true);
            this.setVisible(false);
        } else {
            PeopleAppointment pplappoint = new PeopleAppointment();
            pplappoint.setVisible(true);
            pplappoint.peopleInfo(value);
            this.setVisible(false);    
        }
    }//GEN-LAST:event_column1panelMouseClicked

    private void column3panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_column3panelMouseClicked
        // TODO add your handling code here:
        String value = ppl.getId();
        PeopleCertificate pplcert = new PeopleCertificate();
        pplcert.peopleInfo(value);
        pplcert.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_column3panelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PeopleDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basepanel;
    private javax.swing.JPanel column1panel;
    private javax.swing.JPanel column2panel;
    private javax.swing.JPanel column3panel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logolabel;
    private javax.swing.JPanel logopanel;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JPanel navpanel;
    private javax.swing.JLabel ppllabel;
    private javax.swing.JLabel registervac1;
    private javax.swing.JLabel registervac2;
    private javax.swing.JLabel timelbl;
    private javax.swing.JLabel userlabel;
    private javax.swing.JLabel vaccineLibrary1;
    private javax.swing.JLabel vaccineLibrary2;
    private javax.swing.JLabel viewCertificate1;
    private javax.swing.JLabel viewCertificate2;
    private javax.swing.JLabel welcomelabel;
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

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            // Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); // paint background
            graphics.setColor(getForeground());
            // graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
            // //paint border
            //
        }
    }
}
