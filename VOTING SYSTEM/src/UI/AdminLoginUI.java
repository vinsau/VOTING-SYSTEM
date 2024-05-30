
package UI;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class AdminLoginUI extends javax.swing.JFrame {

    
    public AdminLoginUI() {
        initComponents();
        
        
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EXIT = new javax.swing.JLabel();
        MINIMIZE = new javax.swing.JLabel();
        ADMINLOGINLABEL = new javax.swing.JLabel();
        AEMTRALOGO = new javax.swing.JLabel();
        USERNAMELABEL = new javax.swing.JLabel();
        PASSWORDLABEL = new javax.swing.JLabel();
        LOGINBUTTON = new javax.swing.JButton();
        ADMINLOGO = new javax.swing.JLabel();
        BDisable = new javax.swing.JLabel();
        BShow = new javax.swing.JLabel();
        UserLogin = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        DESIGN1 = new javax.swing.JLabel();
        DESIGN2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EXIT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        EXIT.setText("X");
        EXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
            }
        });
        jPanel1.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 20, -1));

        MINIMIZE.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        MINIMIZE.setText("—");
        MINIMIZE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MINIMIZE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINIMIZEMouseClicked(evt);
            }
        });
        jPanel1.add(MINIMIZE, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        ADMINLOGINLABEL.setBackground(new java.awt.Color(255, 255, 255));
        ADMINLOGINLABEL.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        ADMINLOGINLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ADMINLOGINLABEL.setText("Admin Login");
        jPanel1.add(ADMINLOGINLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 64));

        AEMTRALOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AEMTRALOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ADMIN PORTAL.png"))); // NOI18N
        jPanel1.add(AEMTRALOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 400, 110));

        USERNAMELABEL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        USERNAMELABEL.setText("Username");
        jPanel1.add(USERNAMELABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        PASSWORDLABEL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PASSWORDLABEL.setText("Password");
        jPanel1.add(PASSWORDLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        LOGINBUTTON.setBackground(new java.awt.Color(255, 255, 255));
        LOGINBUTTON.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LOGINBUTTON.setText("LOGIN");
        LOGINBUTTON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGINBUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGINBUTTONMouseClicked(evt);
            }
        });
        jPanel1.add(LOGINBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 40));

        ADMINLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ADMIN ICON.png"))); // NOI18N
        jPanel1.add(ADMINLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 40, 40));

        BDisable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK INVISIBLE EYE.png"))); // NOI18N
        BDisable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BDisable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BDisableMouseClicked(evt);
            }
        });
        jPanel1.add(BDisable, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 30, 30));

        BShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK EYE.png"))); // NOI18N
        BShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BShowMouseClicked(evt);
            }
        });
        jPanel1.add(BShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 30, 30));

        UserLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK USER.png"))); // NOI18N
        UserLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLoginMouseClicked(evt);
            }
        });
        jPanel1.add(UserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 30, 30));

        txtUsername.setFont(txtUsername.getFont().deriveFont(txtUsername.getFont().getSize()+3f));
        txtUsername.setBorder(null);
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 250, 25));

        txtPassword.setFont(txtPassword.getFont().deriveFont(txtPassword.getFont().getSize()+4f));
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 250, 25));

        DESIGN1.setText("__________________________________");
        jPanel1.add(DESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        DESIGN2.setText("__________________________________");
        jPanel1.add(DESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        setSize(new java.awt.Dimension(400, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        System.exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    private void MINIMIZEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZEMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_MINIMIZEMouseClicked

    private void BDisableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BDisableMouseClicked
        txtPassword.setEchoChar((char) 0);
        BDisable.setVisible(false);
        BDisable.setEnabled(false);
        BShow.setEnabled(true);
    }//GEN-LAST:event_BDisableMouseClicked

    private void BShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BShowMouseClicked
        txtPassword.setEchoChar((char) 8226);
        BDisable.setVisible(true);
        BDisable.setEnabled(true);
        BShow.setEnabled(false);
    }//GEN-LAST:event_BShowMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void UserLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLoginMouseClicked
        LoginUI login = new LoginUI();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_UserLoginMouseClicked

    private void LOGINBUTTONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGINBUTTONMouseClicked
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        try{
        if (username.equals("admin") && password.equals("aemtracorps123")) {
            JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            AdminMainPanelUI admin = new AdminMainPanelUI();
            admin.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_LOGINBUTTONMouseClicked


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
            java.util.logging.Logger.getLogger(AdminLoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADMINLOGINLABEL;
    private javax.swing.JLabel ADMINLOGO;
    private javax.swing.JLabel AEMTRALOGO;
    private javax.swing.JLabel BDisable;
    private javax.swing.JLabel BShow;
    private javax.swing.JLabel DESIGN1;
    private javax.swing.JLabel DESIGN2;
    private javax.swing.JLabel EXIT;
    private javax.swing.JButton LOGINBUTTON;
    private javax.swing.JLabel MINIMIZE;
    private javax.swing.JLabel PASSWORDLABEL;
    private javax.swing.JLabel USERNAMELABEL;
    private javax.swing.JLabel UserLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
