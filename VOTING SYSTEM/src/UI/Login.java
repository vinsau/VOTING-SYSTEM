
package UI;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
        txtUsername.setBackground(new java.awt.Color(0,0,0,1));
        txtPassword.setBackground(new java.awt.Color(0,0,0,1));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SignUp = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Disable = new javax.swing.JLabel();
        Show = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        RememberMe = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        AdminPortal = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LOGIN PIC.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, 248));

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel14.setText("VOTING SYSTEM");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/AEMTRA CORPS..png"))); // NOI18N
        jLabel15.setText("AEMTRA CORPS.");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("All Rights Reserved.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        jPanel3.setBackground(new java.awt.Color(25, 18, 211));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 13, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("—");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 13, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome back!");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 64));

        SignUp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setText("Sign Up.");
        SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });
        jPanel3.add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtPassword.setFont(txtPassword.getFont().deriveFont(txtPassword.getFont().getSize()+2f));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("________________________________________");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 290, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email Address");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtUsername.setFont(txtUsername.getFont().deriveFont(txtUsername.getFont().getSize()+2f));
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        jPanel3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 200, 20));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("________________________________________");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 290, 30));

        Disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/INVISIBLE EYE.png"))); // NOI18N
        Disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisableMouseClicked(evt);
            }
        });
        jPanel3.add(Disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 30, 30));

        Show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/EYE.png"))); // NOI18N
        Show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
        });
        jPanel3.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 30, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 340, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/USER.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 30, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Don't have an account?");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jPanel2.setBackground(new java.awt.Color(25, 18, 211));

        RememberMe.setBackground(new java.awt.Color(25, 18, 211));
        RememberMe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RememberMe.setForeground(new java.awt.Color(255, 255, 255));
        RememberMe.setText("Remember me");
        RememberMe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RememberMeMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Forgot your password?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(RememberMe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RememberMe)
                    .addComponent(jLabel12)))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 340, 20));

        AdminPortal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/WHITE ADMIN.png"))); // NOI18N
        AdminPortal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminPortal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminPortalMouseClicked(evt);
            }
        });
        jPanel3.add(AdminPortal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 40, 40));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Please sign in to access your account");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 430, 450));

        setSize(new java.awt.Dimension(950, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked
        txtPassword.setEchoChar((char)8226);
        Disable.setVisible(true);
        Disable.setEnabled(true);
        Show.setEnabled(false);

    }//GEN-LAST:event_ShowMouseClicked

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        VoterAccountRegistration register = new VoterAccountRegistration();
        register.setVisible(true);
        dispose();
    }//GEN-LAST:event_SignUpMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void AdminPortalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminPortalMouseClicked
        AdminLogin admin = new AdminLogin();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_AdminPortalMouseClicked

    private void DisableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisableMouseClicked
        txtPassword.setEchoChar((char)0);
        Disable.setVisible(false);
        Disable.setEnabled(false);
        Show.setEnabled(true);
    }//GEN-LAST:event_DisableMouseClicked

    private void RememberMeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RememberMeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RememberMeMouseClicked

    
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
    private javax.swing.JLabel AdminPortal;
    private javax.swing.JLabel Disable;
    private javax.swing.JCheckBox RememberMe;
    private javax.swing.JLabel Show;
    private javax.swing.JLabel SignUp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
