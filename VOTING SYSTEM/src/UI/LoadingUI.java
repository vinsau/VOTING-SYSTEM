package UI;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class LoadingUI extends javax.swing.JFrame {

    public LoadingUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoadingLabel = new javax.swing.JLabel();
        percentageLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 18, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingLabel.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        LoadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoadingLabel.setText("VOTING SYSTEM");
        jPanel1.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 570, 112));

        percentageLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        percentageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percentageLabel.setText("%");
        jPanel1.add(percentageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 250, 570, 60));

        progressBar.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 460, 60));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Beta test 0.0.1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 160, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/WHITE ELECTION.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 570, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Loading, please wait...");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 340));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 360));

        setSize(new java.awt.Dimension(570, 362));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        LoadingUI loading = new LoadingUI();
        loading.progressBar.setForeground(Color.BLUE);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loading.setVisible(true);
            }
        });
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                loading.progressBar.setValue(i);
                loading.percentageLabel.setText(Integer.toString(i) + "%");
                
            }
        } catch (Exception e) {
        }
        try {
            LoginUI login = new LoginUI();
            login.setVisible(true);
            loading.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred while trying to open the window: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel percentageLabel;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
