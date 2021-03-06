
import classes.Appointment;
import classes.Centre;
import classes.GeneralFunction;
import classes.People;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

public class PersonnelViewAppointment extends javax.swing.JFrame {

    Color priColor = new Color(0, 109, 119);
    Color secColor = new Color(131, 197, 190);
    Color bgColor = new Color(237, 246, 249);

    String centreName;
    String centreId;
    String peopleId;
    String appStatus;
    GeneralFunction gf = new GeneralFunction();
    Centre c = new Centre();
    Appointment ap = new Appointment();
    People ppl = new People();
    ArrayList<ArrayList<String>> appointmentList, centreList;
    JFrame PersonnelViewAppointment = this;

    public PersonnelViewAppointment() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/vaccine-logo.png")));
        appointmentTable.addMouseListener(new MouseAdapter() {
            String value;

            @Override
            public void mouseClicked(MouseEvent me) {

                if (me.getClickCount() == 2) {     // to detect doble click events
                    JTable target = (JTable) me.getSource();
                    int row = target.getSelectedRow(); // select a row
                    // int column = target.getSelectedColumn(); // select a column                
                    value = (String) appointmentTable.getValueAt(row, 0);
                    ppl.setId(value);
                }
            }
        });

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                String ObjButtons[] = {"Yes", "No"};
                int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?", "Vaccineo", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
                if (PromptResult == JOptionPane.YES_OPTION) {
                    Login log = new Login();
                    log.setVisible(true);
                    PersonnelViewAppointment.setVisible(false);
                }
            }
        });

    }

    public PersonnelViewAppointment(String centreName) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/vaccine-logo.png")));
        this.centreName = centreName;
        appointmentTable.addMouseListener(new MouseAdapter() {
            String value;
            String doseNum;
            String completed;
            String appDate;
            String appTime;

            @Override
            public void mouseClicked(MouseEvent me) {

                if (me.getClickCount() == 2) {     // to detect doble click events
                    JTable target = (JTable) me.getSource();
                    int row = target.getSelectedRow(); // select a row
                    value = (String) appointmentTable.getValueAt(row, 0);
                    doseNum = (String) appointmentTable.getValueAt(row, 6);
                    completed = (String) appointmentTable.getValueAt(row, 7);
                    appDate = (String) appointmentTable.getValueAt(row, 1);
                    appTime = (String) appointmentTable.getValueAt(row, 2);

                    if (appDate.equals("-") && appTime.equals("-")) {
                        int result = JOptionPane.showConfirmDialog(null, "This appointment don't have a date and time yet.\nDo you want to set it now?", "Add Appointment", JOptionPane.YES_NO_OPTION);
                        if (result == 0) {
                            //String centreName, String pplId
                            PersonnelAddAppointment pp = new PersonnelAddAppointment(centreFullName.getText(), value);
                            pp.setVisible(true);
                            PersonnelViewAppointment.setVisible(false);
                        }
                    } else {
                        if (completed.equals("No")) {
                            // pass to next jframe
                            PersonnelEditAppointment pea = new PersonnelEditAppointment(centreId, value, doseNum);
                            pea.setVisible(true);
                            PersonnelViewAppointment.setVisible(false);
                        } else {
                            JOptionPane.showMessageDialog(PersonnelViewAppointment, "This appointment already completed.", "Appointment updated", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                }
            }
        });

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                String ObjButtons[] = {"Yes", "No"};
                int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to exit?", "Vaccineo", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
                if (PromptResult == JOptionPane.YES_OPTION) {
                    Login log = new Login();
                    log.setVisible(true);
                    PersonnelViewAppointment.setVisible(false);
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel4 = new javax.swing.JLabel();
        centreFullName = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        searchUser = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        selectAppointmentView = new javax.swing.JComboBox<>();
        backBtn = new RoundedPanel(10, priColor);
        jLabel33 = new javax.swing.JLabel();

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
        ppPanel.setToolTipText("People");
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
        cnPanel.setToolTipText("Centre");
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 109, 119));
        jLabel4.setText("Appointment");

        centreFullName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        centreFullName.setForeground(new java.awt.Color(226, 149, 120));
        centreFullName.setText("Bukit Jalil");

        jPanel8.setBackground(new java.awt.Color(0, 109, 119));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_white.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 109, 119)));
        searchUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchUserKeyReleased(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 109, 119));
        jLabel35.setText("IC/Passport No.");

        appointmentTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    appointmentTable.setGridColor(new java.awt.Color(0, 109, 119));
    appointmentTable.setRowHeight(25);
    appointmentTable.setSelectionBackground(new java.awt.Color(131, 197, 190));
    appointmentTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
    appointmentTable.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(appointmentTable);

    jPanel4.setBackground(new java.awt.Color(0, 109, 119));

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 123, Short.MAX_VALUE)
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
    );

    jPanel5.setBackground(new java.awt.Color(0, 109, 119));

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 135, Short.MAX_VALUE)
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
    );

    jPanel6.setBackground(new java.awt.Color(0, 109, 119));

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 123, Short.MAX_VALUE)
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
    );

    selectAppointmentView.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    selectAppointmentView.setForeground(new java.awt.Color(0, 109, 119));
    selectAppointmentView.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "pending", "accepted", "cancelled" }));
    selectAppointmentView.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            selectAppointmentViewActionPerformed(evt);
        }
    });

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

    javax.swing.GroupLayout formBackgroundLayout = new javax.swing.GroupLayout(formBackground);
    formBackground.setLayout(formBackgroundLayout);
    formBackgroundLayout.setHorizontalGroup(
        formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(formBackgroundLayout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(80, 80, 80)
            .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formBackgroundLayout.createSequentialGroup()
                    .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1)
                        .addGroup(formBackgroundLayout.createSequentialGroup()
                            .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(selectAppointmentView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(formBackgroundLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(58, 58, 58)
                                    .addComponent(jLabel7))
                                .addComponent(centreFullName))
                            .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(formBackgroundLayout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBackgroundLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel35)
                                        .addGroup(formBackgroundLayout.createSequentialGroup()
                                            .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGap(80, 80, 80))
                .addGroup(formBackgroundLayout.createSequentialGroup()
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    formBackgroundLayout.setVerticalGroup(
        formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(formBackgroundLayout.createSequentialGroup()
            .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(formBackgroundLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formBackgroundLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(10, 10, 10)
                            .addComponent(centreFullName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(selectAppointmentView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBackgroundLayout.createSequentialGroup()
                            .addComponent(jLabel35)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(formBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(12, 12, 12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(4, 4, 4))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(formBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(formBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

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
        ppPanel.setBackground(gf.secColor);
    }//GEN-LAST:event_ppPanelMouseEntered

    private void ppPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppPanelMouseExited
        ppPanel.setBackground(gf.priColor);
    }//GEN-LAST:event_ppPanelMouseExited

    private void vaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaPanelMouseClicked
        PersonnelVaccine pv = new PersonnelVaccine();
        this.setVisible(false);
        pv.setVisible(true);
    }//GEN-LAST:event_vaPanelMouseClicked

    private void vaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaPanelMouseEntered
        vaPanel.setBackground(gf.secColor);
    }//GEN-LAST:event_vaPanelMouseEntered

    private void vaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaPanelMouseExited
        vaPanel.setBackground(gf.priColor);
    }//GEN-LAST:event_vaPanelMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            c.generateCentreList();
            centreList = c.getCentreList();
            c.searchCentre(centreName);
            centreId = c.getCentreId();
            ap.generateAppointmentList();
            appointmentList = ap.getAppointmentList();
            centreFullName.setText(centreName);
            //System.out.println(appointmentList);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonnelViewAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }

        gf.tableLoaderEquals(appointmentTable, appointmentList, 3, centreName);
        gf.tableRowClicked(appointmentTable);

    }//GEN-LAST:event_formWindowOpened

    private void searchUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchUserKeyReleased
        String searchTerm = searchUser.getText();
        selectAppointmentView.setSelectedIndex(0);
        gf.refreshTable(appointmentTable);
        gf.tableLoaderStartsWith(appointmentTable, appointmentList, 0, searchTerm, 3, centreFullName.getText());

    }//GEN-LAST:event_searchUserKeyReleased

    private void selectAppointmentViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAppointmentViewActionPerformed

        JComboBox selectAppointmentView = (JComboBox) evt.getSource();

        int index = selectAppointmentView.getSelectedIndex();
        if (index != 0) {
            String selectedStatus = (String) selectAppointmentView.getSelectedItem();
            gf.refreshTable(appointmentTable);
            gf.tableLoaderEqualsMore(appointmentTable, appointmentList, 3, centreName, 4, selectedStatus);
        } else {
            gf.refreshTable(appointmentTable);
            gf.tableLoaderEquals(appointmentTable, appointmentList, 3, centreName);
        }


    }//GEN-LAST:event_selectAppointmentViewActionPerformed

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        PersonnelCentreDetail pcd = new PersonnelCentreDetail(centreFullName.getText());
        pcd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnMouseClicked

    private void dbPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbPanelMouseEntered
        dbPanel.setBackground(secColor);
    }//GEN-LAST:event_dbPanelMouseEntered

    private void dbPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbPanelMouseClicked
        PersonnelDashboard pd = new PersonnelDashboard();
        pd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dbPanelMouseClicked

    private void dbPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbPanelMouseExited
        dbPanel.setBackground(priColor);
    }//GEN-LAST:event_dbPanelMouseExited

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
            java.util.logging.Logger.getLogger(PersonnelViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonnelViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonnelViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonnelViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonnelViewAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentTable;
    private javax.swing.JPanel backBtn;
    private javax.swing.JLabel centreFullName;
    private javax.swing.JPanel cnPanel;
    private javax.swing.JPanel dbPanel;
    private javax.swing.JPanel formBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel ppPanel;
    private javax.swing.JTextField searchUser;
    private javax.swing.JComboBox<String> selectAppointmentView;
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
