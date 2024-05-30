
package UI;


public class VoterVerifyCodeUI extends javax.swing.JFrame{

    
    
    
    public VoterVerifyCodeUI() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FIRSTLAYER = new javax.swing.JPanel();
        SendButton = new javax.swing.JButton();
        SUBLABEL1 = new javax.swing.JLabel();
        EmailVerifyField = new javax.swing.JTextField();
        SUBLABEL2 = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        TITLEPANEL = new javax.swing.JPanel();
        SECURITYVERIFICATIONLABEL = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();
        VerifyCodeField = new javax.swing.JTextField();
        SendLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        FIRSTLAYER.setBackground(new java.awt.Color(255, 255, 255));
        FIRSTLAYER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        FIRSTLAYER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SendButton.setBackground(new java.awt.Color(51, 255, 51));
        SendButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SendButton.setText("SEND");
        SendButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SendButtonMouseClicked(evt);
            }
        });
        FIRSTLAYER.add(SendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 100, 40));

        SUBLABEL1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SUBLABEL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBLABEL1.setText("The code will be sent to your email.");
        FIRSTLAYER.add(SUBLABEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 420, 30));

        EmailVerifyField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        FIRSTLAYER.add(EmailVerifyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 330, 40));

        SUBLABEL2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SUBLABEL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUBLABEL2.setText("Click send to obtain the verification code.");
        FIRSTLAYER.add(SUBLABEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 420, 30));

        ConfirmButton.setBackground(new java.awt.Color(25, 18, 211));
        ConfirmButton.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton.setText("CONFIRM");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });
        FIRSTLAYER.add(ConfirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 160, 40));

        TITLEPANEL.setBackground(new java.awt.Color(25, 18, 211));
        TITLEPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SECURITYVERIFICATIONLABEL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SECURITYVERIFICATIONLABEL.setForeground(new java.awt.Color(255, 255, 255));
        SECURITYVERIFICATIONLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SECURITYVERIFICATIONLABEL.setText("SECURITY  VERIFICATION");
        TITLEPANEL.add(SECURITYVERIFICATIONLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        EXIT.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EXIT.setText("X");
        EXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
            }
        });
        TITLEPANEL.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 30, 30));

        FIRSTLAYER.add(TITLEPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 60));

        VerifyCodeField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        FIRSTLAYER.add(VerifyCodeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 320, 40));

        SendLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SendLabel.setText("Click \"Send\" and enter the received verification code");
        FIRSTLAYER.add(SendLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        EmailLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EmailLabel.setText("Enter your email again");
        FIRSTLAYER.add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FIRSTLAYER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FIRSTLAYER, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(423, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
       this.dispose();
    }//GEN-LAST:event_EXITMouseClicked

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void SendButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendButtonMouseClicked
        
    }//GEN-LAST:event_SendButtonMouseClicked

    


    
    
    
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
            java.util.logging.Logger.getLogger(VoterVerifyCodeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoterVerifyCodeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoterVerifyCodeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoterVerifyCodeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoterVerifyCodeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel EXIT;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailVerifyField;
    private javax.swing.JPanel FIRSTLAYER;
    private javax.swing.JLabel SECURITYVERIFICATIONLABEL;
    private javax.swing.JLabel SUBLABEL1;
    private javax.swing.JLabel SUBLABEL2;
    private javax.swing.JButton SendButton;
    private javax.swing.JLabel SendLabel;
    private javax.swing.JPanel TITLEPANEL;
    private javax.swing.JTextField VerifyCodeField;
    // End of variables declaration//GEN-END:variables
}
