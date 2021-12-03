
import classes.Appointment;
import classes.People;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
 * @author dexte
 */
public class PeopleAppointment extends javax.swing.JFrame {

    /**
     * Creates new form PeopleAppointment
     */
    Color priColor = new Color(0, 109, 119);
    Color secColor = new Color(131, 197, 190);
    Color bgColor = new Color(237, 246, 249);
    Color empColor = new Color(255, 221, 210);
    Color whiteColor = new Color(255, 255, 255);

    People ppl = new People();
    Appointment appoint = new Appointment();
    ArrayList<ArrayList<String>> peopleList;

    public PeopleAppointment() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/vaccine-logo.png")));
        String dose1lbl = "<html><u>1st Dose Appointment</u></html>";
        dose1label.setText(dose1lbl);
        String dose1lb2 = "<html><u>2nd Dose Appointment</u></html>";
        dose2label.setText(dose1lb2);
        appoint2.setVisible(false);
    }

    public void peopleInfo(String value) {
        String id = value;
        String dose = "1";
        String doses = "2";
        String complete = "Yes";
        try {
            ppl.generatePeopleList();
            peopleList = ppl.getPeopleList();
            ppl.searchUser(peopleList, id);
            ppl.setId(id);
        } catch (Exception e) {
            Logger.getLogger(PersonnelPeople.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            appoint.showAppointment1(id, dose);
            if (appoint.getPeopleId().equals(id) && appoint.getDose().equals(dose)) {
                pplName.setText(ppl.getName());
                pplId.setText(id);
                pplDate.setText(appoint.getAppointmentDate());
                pplTime.setText(appoint.getAppointmentTime());
                pplVenue.setText(appoint.getVenue());
                pplVaccine.setText(appoint.getVaccine());
                 if (!appoint.getAppointmentTime().equals("-")) {
                    submitButtonPanel.setVisible(true);
                    cancelButton.setVisible(true);
                    if (appoint.getCompleted().equals(complete)) {
                        submitButtonPanel.setVisible(false);
                        cancelButton.setVisible(false);
                        statusLabel.setText("Completed 1st Dose");
                    } else if (appoint.getAppointmentStatus().equals("accepted")) {
                        submitButtonPanel.setVisible(false);
                    } else if (appoint.getAppointmentStatus().equals("cancelled")) {
                        submitButtonPanel.setVisible(false);
                        cancelButton.setVisible(false);
                        statusLabel.setText("Waiting New Appointment");
                    }
                } else {
                    submitButtonPanel.setVisible(false);
                    cancelButton.setVisible(false);
                }
            }
        } catch (Exception e) {
        }

        try {
            appoint.showAppointment2(id, doses);
            if (appoint.getPeopleId().equals(id) && appoint.getDose().equals(doses)) {
                appoint2.setVisible(true);
                pplName1.setText(ppl.getName());
                pplId1.setText(id);
                pplDate1.setText(appoint.getAppointmentDate());
                pplTime1.setText(appoint.getAppointmentTime());
                pplVenue1.setText(appoint.getVenue());
                pplVaccine1.setText(appoint.getVaccine());
                if (!appoint.getAppointmentTime().equals("-")) {
                    submitButtonPanel2.setVisible(true);
                    cancelButton2.setVisible(true);
                    if (appoint.getCompleted().equals(complete)) {
                        submitButtonPanel2.setVisible(false);
                        cancelButton2.setVisible(false);
                        statusLabel2.setText("Completed 2nd Dose");
                    } else if (appoint.getAppointmentStatus().equals("accepted")) {
                        submitButtonPanel2.setVisible(false);
                    } else if (appoint.getAppointmentStatus().equals("cancelled")) {
                        submitButtonPanel2.setVisible(false);
                        cancelButton2.setVisible(false);
                        statusLabel2.setText("Waiting New Appointment");
                    }
                } else {
                    submitButtonPanel2.setVisible(false);
                    cancelButton2.setVisible(false);
                }
            }
        } catch (Exception e) {
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
        backbutton = new javax.swing.JButton();
        appoint1 = new RoundedPanel(20, whiteColor);
        dose1label = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pplName = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pplId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pplDate = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pplTime = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pplVenue = new javax.swing.JLabel();
        pplVaccine = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        submitButtonPanel = new RoundedPanel(5, priColor);
        submitButton = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        jPanel4 = new RoundedPanel(60, secColor);
        statusLabel = new javax.swing.JLabel();
        appoint2 = new RoundedPanel(20, whiteColor);
        dose2label = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        pplName1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        pplId1 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        pplDate1 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        pplTime1 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        pplVenue1 = new javax.swing.JLabel();
        pplVaccine1 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        submitButtonPanel2 = new RoundedPanel(5, priColor);
        submitButton2 = new javax.swing.JLabel();
        cancelButton2 = new javax.swing.JLabel();
        jPanel6 = new RoundedPanel(60, secColor);
        statusLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Appointment");

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

        backbutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backbutton.setForeground(new java.awt.Color(0, 109, 119));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-button.png"))); // NOI18N
        backbutton.setText("Back ");
        backbutton.setBorderPainted(false);
        backbutton.setContentAreaFilled(false);
        backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbutton.setFocusPainted(false);
        backbutton.setIconTextGap(15);
        backbutton.setMargin(new java.awt.Insets(2, 0, 2, 0));
        backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttonMouseClicked(evt);
            }
        });

        appoint1.setBackground(new java.awt.Color(237, 246, 249));
        appoint1.setPreferredSize(new java.awt.Dimension(972, 250));

        dose1label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dose1label.setForeground(new java.awt.Color(0, 109, 119));
        dose1label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dose1label.setText("1st Dose Appointment");
        dose1label.setToolTipText("");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 109, 119));
        jLabel24.setText("Name:");
        jLabel24.setToolTipText("");

        pplName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplName.setForeground(new java.awt.Color(0, 109, 119));
        pplName.setText("Test");
        pplName.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 109, 119));
        jLabel23.setText("IC:");
        jLabel23.setToolTipText("");

        pplId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplId.setForeground(new java.awt.Color(0, 109, 119));
        pplId.setText("000000-00-0000");
        pplId.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 109, 119));
        jLabel6.setText("Date:");
        jLabel6.setToolTipText("");

        pplDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplDate.setForeground(new java.awt.Color(0, 109, 119));
        pplDate.setText("27-10-2021");
        pplDate.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 109, 119));
        jLabel9.setText("Time:");
        jLabel9.setToolTipText("");

        pplTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplTime.setForeground(new java.awt.Color(0, 109, 119));
        pplTime.setText("10:30 AM");
        pplTime.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 109, 119));
        jLabel11.setText("Venue:");
        jLabel11.setToolTipText("");

        pplVenue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplVenue.setForeground(new java.awt.Color(0, 109, 119));
        pplVenue.setText("Bukit Jalil Vaccination Centre");
        pplVenue.setToolTipText("");

        pplVaccine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplVaccine.setForeground(new java.awt.Color(0, 109, 119));
        pplVaccine.setText("Sinovac");
        pplVaccine.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 109, 119));
        jLabel14.setText("Vaccine:");
        jLabel14.setToolTipText("");

        submitButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        submitButtonPanel.setPreferredSize(new java.awt.Dimension(138, 40));

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submitButton.setText("Accept");
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout submitButtonPanelLayout = new javax.swing.GroupLayout(submitButtonPanel);
        submitButtonPanel.setLayout(submitButtonPanelLayout);
        submitButtonPanelLayout.setHorizontalGroup(
            submitButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submitButtonPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        submitButtonPanelLayout.setVerticalGroup(
            submitButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submitButtonPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cancelButton.setBackground(new java.awt.Color(0, 109, 119));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(226, 149, 120));
        cancelButton.setText("Decline");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        statusLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText("Pending 1st Dose");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(statusLabel)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(statusLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout appoint1Layout = new javax.swing.GroupLayout(appoint1);
        appoint1.setLayout(appoint1Layout);
        appoint1Layout.setHorizontalGroup(
            appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appoint1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appoint1Layout.createSequentialGroup()
                        .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(appoint1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pplVenue))
                            .addGroup(appoint1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pplTime))
                            .addGroup(appoint1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pplDate))
                            .addGroup(appoint1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pplId))
                            .addGroup(appoint1Layout.createSequentialGroup()
                                .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(appoint1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(submitButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pplVaccine))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(appoint1Layout.createSequentialGroup()
                        .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(appoint1Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pplName))
                            .addComponent(dose1label, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        appoint1Layout.setVerticalGroup(
            appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appoint1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(appoint1Layout.createSequentialGroup()
                        .addComponent(dose1label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(pplName)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(pplId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pplDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pplTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pplVenue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pplVaccine))
                .addGroup(appoint1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appoint1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(appoint1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cancelButton)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        appoint2.setBackground(new java.awt.Color(237, 246, 249));
        appoint2.setPreferredSize(new java.awt.Dimension(566, 250));

        dose2label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dose2label.setForeground(new java.awt.Color(0, 109, 119));
        dose2label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dose2label.setText("1st Dose Appointment");
        dose2label.setToolTipText("");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 109, 119));
        jLabel34.setText("Name:");
        jLabel34.setToolTipText("");

        pplName1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplName1.setForeground(new java.awt.Color(0, 109, 119));
        pplName1.setText("Test");
        pplName1.setToolTipText("");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 109, 119));
        jLabel36.setText("IC:");
        jLabel36.setToolTipText("");

        pplId1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplId1.setForeground(new java.awt.Color(0, 109, 119));
        pplId1.setText("000000-00-0000");
        pplId1.setToolTipText("");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 109, 119));
        jLabel38.setText("Date:");
        jLabel38.setToolTipText("");

        pplDate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplDate1.setForeground(new java.awt.Color(0, 109, 119));
        pplDate1.setText("27-10-2021");
        pplDate1.setToolTipText("");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 109, 119));
        jLabel40.setText("Time:");
        jLabel40.setToolTipText("");

        pplTime1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplTime1.setForeground(new java.awt.Color(0, 109, 119));
        pplTime1.setText("10:30 AM");
        pplTime1.setToolTipText("");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 109, 119));
        jLabel42.setText("Venue:");
        jLabel42.setToolTipText("");

        pplVenue1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplVenue1.setForeground(new java.awt.Color(0, 109, 119));
        pplVenue1.setText("Bukit Jalil Vaccination Centre");
        pplVenue1.setToolTipText("");

        pplVaccine1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pplVaccine1.setForeground(new java.awt.Color(0, 109, 119));
        pplVaccine1.setText("Sinovac");
        pplVaccine1.setToolTipText("");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 109, 119));
        jLabel47.setText("Vaccine:");
        jLabel47.setToolTipText("");

        submitButtonPanel2.setBackground(new java.awt.Color(255, 255, 255));
        submitButtonPanel2.setPreferredSize(new java.awt.Dimension(138, 40));

        submitButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitButton2.setForeground(new java.awt.Color(255, 255, 255));
        submitButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submitButton2.setText("Accept");
        submitButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout submitButtonPanel2Layout = new javax.swing.GroupLayout(submitButtonPanel2);
        submitButtonPanel2.setLayout(submitButtonPanel2Layout);
        submitButtonPanel2Layout.setHorizontalGroup(
            submitButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submitButtonPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        submitButtonPanel2Layout.setVerticalGroup(
            submitButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, submitButtonPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cancelButton2.setBackground(new java.awt.Color(0, 109, 119));
        cancelButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton2.setForeground(new java.awt.Color(226, 149, 120));
        cancelButton2.setText("Decline");
        cancelButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButton2MouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        statusLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        statusLabel2.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel2.setText("Pending 2nd Dose");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(statusLabel2)
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(statusLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout appoint2Layout = new javax.swing.GroupLayout(appoint2);
        appoint2.setLayout(appoint2Layout);
        appoint2Layout.setHorizontalGroup(
            appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appoint2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appoint2Layout.createSequentialGroup()
                        .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(appoint2Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pplName1))
                            .addComponent(dose2label, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(appoint2Layout.createSequentialGroup()
                        .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(appoint2Layout.createSequentialGroup()
                                .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cancelButton2)
                                    .addComponent(jLabel47))
                                .addGap(18, 18, 18)
                                .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pplVaccine1)
                                    .addComponent(submitButtonPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(appoint2Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pplVenue1))
                            .addGroup(appoint2Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pplTime1))
                            .addGroup(appoint2Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pplDate1))
                            .addGroup(appoint2Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pplId1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        appoint2Layout.setVerticalGroup(
            appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appoint2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(appoint2Layout.createSequentialGroup()
                        .addComponent(dose2label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(pplName1)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(pplId1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(pplDate1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(pplTime1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(pplVenue1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(pplVaccine1))
                .addGroup(appoint2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appoint2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cancelButton2))
                    .addGroup(appoint2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(submitButtonPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout basepanelLayout = new javax.swing.GroupLayout(basepanel);
        basepanel.setLayout(basepanelLayout);
        basepanelLayout.setHorizontalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basepanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(backbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(basepanelLayout.createSequentialGroup()
                .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(basepanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(logopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(basepanelLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(appoint1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appoint2, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        basepanelLayout.setVerticalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basepanelLayout.createSequentialGroup()
                .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(basepanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(backbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appoint1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appoint2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void ppllabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ppllabelMouseClicked
        // TODO add your handling code here:
        String value = ppl.getId();
        Profile pro = new Profile();
        pro.peopleInfo(value);
        pro.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_ppllabelMouseClicked

    private void logoutlabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logoutlabelMouseClicked
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
    }// GEN-LAST:event_logoutlabelMouseClicked

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_backbuttonMouseClicked
        // TODO add your handling code here:
        String value = ppl.getId();
        PeopleDashboard ppldash = new PeopleDashboard();
        ppldash.peopleInfo(value);
        ppldash.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_backbuttonMouseClicked

    private void logolabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logolabelMouseClicked
        // TODO add your handling code here:
        String value = ppl.getId();
        PeopleDashboard ppldash = new PeopleDashboard();
        ppldash.peopleInfo(value);
        ppldash.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_logolabelMouseClicked

    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_submitButtonMouseClicked
        // TODO add your handling code here:
        String appPeopleId = appoint.getPeopleId();
        String appStatus = "accepted";
        String appdose = "1";

        try {
            appoint.acceptAppointment(appPeopleId, appStatus, appdose);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }// GEN-LAST:event_submitButtonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cancelButtonMouseClicked
        // TODO add your handling code here:
        String appPeopleId = appoint.getPeopleId();
        String appStatus = "cancelled";
        String appdose = "1";

        try {
            appoint.cancelAppointment(appPeopleId, appStatus, appdose);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }// GEN-LAST:event_cancelButtonMouseClicked

    private void submitButton2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_submitButton2MouseClicked
        // TODO add your handling code here:
        String appPeopleId = appoint.getPeopleId();
        String appStatus = "accepted";
        String appdose = "2";

        try {
            appoint.acceptAppointment(appPeopleId, appStatus, appdose);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }// GEN-LAST:event_submitButton2MouseClicked

    private void cancelButton2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cancelButton2MouseClicked
        // TODO add your handling code here:
        String appPeopleId = appoint.getPeopleId();
        String appStatus = "cancelled";
        String appdose = "2";

        try {
            appoint.cancelAppointment(appPeopleId, appStatus, appdose);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }// GEN-LAST:event_cancelButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
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
            java.util.logging.Logger.getLogger(PeopleAppointment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleAppointment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleAppointment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleAppointment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appoint1;
    private javax.swing.JPanel appoint2;
    private javax.swing.JButton backbutton;
    private javax.swing.JPanel basepanel;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JLabel cancelButton2;
    private javax.swing.JLabel dose1label;
    private javax.swing.JLabel dose2label;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logolabel;
    private javax.swing.JPanel logopanel;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JPanel navpanel;
    private javax.swing.JLabel pplDate;
    private javax.swing.JLabel pplDate1;
    private javax.swing.JLabel pplId;
    private javax.swing.JLabel pplId1;
    private javax.swing.JLabel pplName;
    private javax.swing.JLabel pplName1;
    private javax.swing.JLabel pplTime;
    private javax.swing.JLabel pplTime1;
    private javax.swing.JLabel pplVaccine;
    private javax.swing.JLabel pplVaccine1;
    private javax.swing.JLabel pplVenue;
    private javax.swing.JLabel pplVenue1;
    private javax.swing.JLabel ppllabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusLabel2;
    private javax.swing.JLabel submitButton;
    private javax.swing.JLabel submitButton2;
    private javax.swing.JPanel submitButtonPanel;
    private javax.swing.JPanel submitButtonPanel2;
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