
package UI;

import java.awt.Color;


public class VoterAccountRegistration extends javax.swing.JFrame {

    
    public VoterAccountRegistration() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TOOLBAR = new javax.swing.JPanel();
        Minimize = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SignIn = new javax.swing.JLabel();
        STEP1PANEL = new javax.swing.JPanel();
        STEP1LABEL = new javax.swing.JLabel();
        STEP2PANEL = new javax.swing.JPanel();
        STEP2LABEL = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        STEP1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        STEP2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        BACK = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        SUBMIT = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TOOLBAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TOOLBAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimize.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Minimize.setText("—");
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        TOOLBAR.add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 16, -1, -1));

        Exit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        TOOLBAR.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 16, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Already have an account? Back to");
        TOOLBAR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 260, 40));

        SignIn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        SignIn.setText("Sign In");
        SignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInMouseClicked(evt);
            }
        });
        TOOLBAR.add(SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 6, -1, 40));

        getContentPane().add(TOOLBAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        STEP1PANEL.setBackground(new java.awt.Color(25, 18, 211));

        STEP1LABEL.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        STEP1LABEL.setForeground(new java.awt.Color(255, 255, 255));
        STEP1LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STEP1LABEL.setText("STEP 1: ACCOUNT INFORMATION");

        javax.swing.GroupLayout STEP1PANELLayout = new javax.swing.GroupLayout(STEP1PANEL);
        STEP1PANEL.setLayout(STEP1PANELLayout);
        STEP1PANELLayout.setHorizontalGroup(
            STEP1PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STEP1LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        STEP1PANELLayout.setVerticalGroup(
            STEP1PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STEP1LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        getContentPane().add(STEP1PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 499, 48));

        STEP2PANEL.setBackground(new java.awt.Color(153, 153, 255));

        STEP2LABEL.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        STEP2LABEL.setForeground(new java.awt.Color(255, 255, 255));
        STEP2LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STEP2LABEL.setText("STEP 2: ACCOUNT VERIFICATION");

        javax.swing.GroupLayout STEP2PANELLayout = new javax.swing.GroupLayout(STEP2PANEL);
        STEP2PANEL.setLayout(STEP2PANELLayout);
        STEP2PANELLayout.setHorizontalGroup(
            STEP2PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STEP2LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        STEP2PANELLayout.setVerticalGroup(
            STEP2PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STEP2LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        getContentPane().add(STEP2PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 50, 499, 48));

        STEP1.setBackground(new java.awt.Color(255, 255, 255));
        STEP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        STEP1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 330, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CITIZENSHIP");
        STEP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, 28));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("EMAIL ADDRESS");
        STEP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ADDRESS");
        STEP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, 28));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("CONFIRM PASSWORD");
        STEP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 28));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        STEP1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 120, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("DATE OF BIRTH");
        STEP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, 28));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("GENDER");
        STEP1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, 28));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        STEP1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 170, 36));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("CIVIL STATUS");
        STEP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, 28));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        STEP1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 240, 36));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        STEP1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 330, 36));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        STEP1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 330, 36));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("FULL NAME");
        STEP1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 28));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("PASSWORD");
        STEP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 28));

        Next.setText("NEXT");
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        STEP1.add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 120, 50));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        STEP1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 40));

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        STEP1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 190, 40));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("MIDDLE NAME");
        STEP1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setText("SURNAME");
        STEP1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setText("FIRST NAME");
        STEP1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SINGLE", "MARRIED", "DIVORCED", "WIDOWED" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        STEP1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 150, 40));

        jComboBox3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        STEP1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 150, 40));
        STEP1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 140, 40));

        jTabbedPane1.addTab("", STEP1);

        STEP2.setBackground(new java.awt.Color(255, 255, 255));
        STEP2.setForeground(new java.awt.Color(255, 255, 255));
        STEP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("SECURITY QUESTIONS");
        STEP2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, 20));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In what city were you born?", "What is your mother's maiden name?", "What high school did you attend?", "What is your favorite movie?", "What is the middle name of your youngest child?", "What was your favorite sport in high school?", "Where were you when you had your first kiss?", "What was the house number and street name you lived in as a child?", "What are the last five digits of your driver's license number?" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        STEP2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 480, 40));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("YOUR ANSWER");
        STEP2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        STEP2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 480, 40));

        BACK.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BACK.setText("BACK");
        BACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKMouseClicked(evt);
            }
        });
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        STEP2.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 140, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/VERIFY.png"))); // NOI18N
        STEP2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 280, 280));

        SUBMIT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SUBMIT.setText("SUBMIT");
        SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMITActionPerformed(evt);
            }
        });
        STEP2.add(SUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 140, 40));

        jTabbedPane1.addTab("", STEP2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 450));

        setSize(new java.awt.Dimension(998, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BACKActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUBMITActionPerformed

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        jTabbedPane1.setSelectedIndex(1);
        STEP1PANEL.setBackground(new Color(153,153,255));
        STEP2PANEL.setBackground(new Color(25,18,211));
    }//GEN-LAST:event_NextMouseClicked

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        STEP2PANEL.setBackground(new Color(153,153,255));
        STEP1PANEL.setBackground(new Color(25,18,211));
    }//GEN-LAST:event_BACKMouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void SignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInMouseClicked
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_SignInMouseClicked

   
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
            java.util.logging.Logger.getLogger(VoterAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoterAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoterAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoterAccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoterAccountRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton Next;
    private javax.swing.JPanel STEP1;
    private javax.swing.JLabel STEP1LABEL;
    private javax.swing.JPanel STEP1PANEL;
    private javax.swing.JPanel STEP2;
    private javax.swing.JLabel STEP2LABEL;
    private javax.swing.JPanel STEP2PANEL;
    private javax.swing.JButton SUBMIT;
    private javax.swing.JLabel SignIn;
    private javax.swing.JPanel TOOLBAR;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
