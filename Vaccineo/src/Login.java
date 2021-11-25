
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.font.TextAttribute;
import java.net.URI;
import java.util.Map;
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
public class Login extends javax.swing.JFrame {

    Color priColor = new Color(0,109,119);
    Color secColor = new Color(131, 197, 190);
    Color bgColor = new Color(237,246,249);
    Color errColor = new Color(238,118,116);
    
    public Login() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/vaccine-logo.png")));
        errLoginPanel.setBackground(bgColor);
        errLabel.setForeground(bgColor);
        errIcon.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        learnMoreLbl = new javax.swing.JLabel();
        learnMoreBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        regAccountLbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        errLoginPanel = new javax.swing.JPanel();
        errLabel = new javax.swing.JLabel();
        errIcon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));

        jPanel1.setBackground(new java.awt.Color(237, 246, 249));
        jPanel1.setLayout(null);

        learnMoreLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        learnMoreLbl.setForeground(new java.awt.Color(237, 246, 249));
        learnMoreLbl.setText("Learn more about Vaccination");
        learnMoreLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        learnMoreLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                learnMoreLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                learnMoreLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                learnMoreLblMouseExited(evt);
            }
        });
        jPanel1.add(learnMoreLbl);
        learnMoreLbl.setBounds(430, 600, 190, 30);

        learnMoreBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/learn_more_btn.png"))); // NOI18N
        learnMoreBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        learnMoreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                learnMoreBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                learnMoreBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                learnMoreBtnMouseExited(evt);
            }
        });
        jPanel1.add(learnMoreBtn);
        learnMoreBtn.setBounds(390, 600, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_slogan.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 250, 390, 330);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vaccineo-logo-big.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 70, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_poster.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 800);

        jPanel2.setBackground(new java.awt.Color(237, 246, 249));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 109, 119));
        jLabel6.setText("Login");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 109, 119));
        jLabel8.setText("IC/Passport Number");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 109, 119)));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 109, 119)));

        regAccountLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        regAccountLbl.setForeground(new java.awt.Color(226, 149, 120));
        regAccountLbl.setText("Register Here.");
        regAccountLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regAccountLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regAccountLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regAccountLblMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 109, 119));
        jLabel10.setText("No Account?");

        errLoginPanel.setPreferredSize(new java.awt.Dimension(210, 57));

        errLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        errLabel.setForeground(new java.awt.Color(255, 255, 255));
        errLabel.setText("Invalid Password");

        errIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info_icon.png"))); // NOI18N

        javax.swing.GroupLayout errLoginPanelLayout = new javax.swing.GroupLayout(errLoginPanel);
        errLoginPanel.setLayout(errLoginPanelLayout);
        errLoginPanelLayout.setHorizontalGroup(
            errLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errLoginPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(errIcon)
                .addGap(15, 15, 15)
                .addComponent(errLabel)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        errLoginPanelLayout.setVerticalGroup(
            errLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, errLoginPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(errLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(errLabel)
                    .addComponent(errIcon))
                .addGap(18, 18, 18))
        );

        jPanel3.setBackground(new java.awt.Color(0, 109, 119));
        jPanel3.setPreferredSize(new java.awt.Dimension(58, 22));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sign In");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel7)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 109, 119));
        jLabel9.setText("Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(errLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(regAccountLbl)
                            .addGap(52, 52, 52))
                        .addComponent(jTextField2)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6)
                        .addComponent(jTextField1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)))
                .addGap(97, 97, 97))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(errLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regAccountLbl)
                    .addComponent(jLabel10))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(870, 0, 530, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regAccountLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regAccountLblMouseEntered
        Font font = regAccountLbl.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        regAccountLbl.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_regAccountLblMouseEntered

    private void regAccountLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regAccountLblMouseExited
        regAccountLbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
    }//GEN-LAST:event_regAccountLblMouseExited

    private void learnMoreLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learnMoreLblMouseEntered
        Font font = learnMoreLbl.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        learnMoreLbl.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_learnMoreLblMouseEntered

    private void learnMoreLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learnMoreLblMouseExited
        learnMoreLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
    }//GEN-LAST:event_learnMoreLblMouseExited

    private void learnMoreBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learnMoreBtnMouseEntered
        Font font = learnMoreLbl.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        learnMoreLbl.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_learnMoreBtnMouseEntered

    private void learnMoreBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learnMoreBtnMouseExited
        learnMoreLbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
    }//GEN-LAST:event_learnMoreBtnMouseExited

    private void learnMoreLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learnMoreLblMouseClicked
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://www.vaksincovid.gov.my/");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_learnMoreLblMouseClicked

    private void learnMoreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learnMoreBtnMouseClicked
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://www.vaksincovid.gov.my/");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_learnMoreBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errIcon;
    private javax.swing.JLabel errLabel;
    private javax.swing.JPanel errLoginPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel learnMoreBtn;
    private javax.swing.JLabel learnMoreLbl;
    private javax.swing.JLabel regAccountLbl;
    // End of variables declaration//GEN-END:variables
class RoundedPanel extends JPanel
    {
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
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }

}