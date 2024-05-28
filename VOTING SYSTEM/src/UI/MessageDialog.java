
package UI;


public class MessageDialog extends javax.swing.JFrame {

    
    public MessageDialog() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainContainer = new javax.swing.JPanel();
        Toolbar = new javax.swing.JPanel();
        EXIT = new javax.swing.JLabel();
        ConfirmationLabel = new javax.swing.JLabel();
        INFOIMAGE = new javax.swing.JLabel();
        DYWTC = new javax.swing.JLabel();
        NOButton = new javax.swing.JButton();
        YESButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainContainer.setBackground(new java.awt.Color(255, 255, 255));
        MainContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Toolbar.setBackground(new java.awt.Color(25, 18, 211));
        Toolbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EXIT.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EXIT.setText("X");
        EXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
            }
        });
        Toolbar.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 40, 40));

        ConfirmationLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ConfirmationLabel.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmationLabel.setText("Confirmation");
        Toolbar.add(ConfirmationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        MainContainer.add(Toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 40));

        INFOIMAGE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        INFOIMAGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/INFO.png"))); // NOI18N
        MainContainer.add(INFOIMAGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 370, -1));

        DYWTC.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        DYWTC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DYWTC.setText("Do you want to continue?");
        MainContainer.add(DYWTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 370, -1));

        NOButton.setBackground(new java.awt.Color(25, 18, 211));
        NOButton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        NOButton.setForeground(new java.awt.Color(255, 255, 255));
        NOButton.setText("NO");
        MainContainer.add(NOButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        YESButton.setBackground(new java.awt.Color(25, 18, 211));
        YESButton.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        YESButton.setForeground(new java.awt.Color(255, 255, 255));
        YESButton.setText("YES");
        YESButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YESButtonMouseClicked(evt);
            }
        });
        MainContainer.add(YESButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        getContentPane().add(MainContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 330));

        setSize(new java.awt.Dimension(370, 326));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
       this.dispose();
    }//GEN-LAST:event_EXITMouseClicked

    private void YESButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YESButtonMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_YESButtonMouseClicked

    
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
            java.util.logging.Logger.getLogger(MessageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessageDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmationLabel;
    private javax.swing.JLabel DYWTC;
    private javax.swing.JLabel EXIT;
    private javax.swing.JLabel INFOIMAGE;
    private javax.swing.JPanel MainContainer;
    private javax.swing.JButton NOButton;
    private javax.swing.JPanel Toolbar;
    private javax.swing.JButton YESButton;
    // End of variables declaration//GEN-END:variables
}
