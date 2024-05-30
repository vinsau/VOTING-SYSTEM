package UI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Database.DatabaseConnection;
import Utilities.NameMergeUtility;
import Utilities.RegistrationFormValidatorUtility;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class VoterAccountRegistrationUI extends javax.swing.JFrame {

    String imagePath = null;
    
    public VoterAccountRegistrationUI() {
        initComponents();
        

        GenderBox.setSelectedItem(null);
        CivilStatus.setSelectedItem(null);

        GenderBox.insertItemAt("Select Gender", 0);
        CivilStatus.insertItemAt("Select Civil Status", 0);

        GenderBox.setSelectedIndex(0);
        CivilStatus.setSelectedIndex(0);
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
        StepsTabs = new javax.swing.JTabbedPane();
        STEP1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MiddleNameField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CitizenshipField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        SurnameField = new javax.swing.JTextField();
        FirstNameField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        CivilStatus = new javax.swing.JComboBox<>();
        GenderBox = new javax.swing.JComboBox<>();
        DOB = new com.toedter.calendar.JDateChooser();
        PasswordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        STEP2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        SecurityQuestionBox = new javax.swing.JComboBox<>();
        SecurityAnswerField = new javax.swing.JTextField();
        BACK = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        VerifyCodeButton = new javax.swing.JButton();
        EmailProvided = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        TOOLBAR.setBackground(new java.awt.Color(25, 18, 211));
        TOOLBAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TOOLBAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Minimize.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Minimize.setForeground(new java.awt.Color(255, 255, 255));
        Minimize.setText("—");
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        TOOLBAR.add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 16, -1, -1));

        Exit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        TOOLBAR.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 16, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Already have an account? Back to");
        TOOLBAR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 7, 340, 40));

        SignIn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SignIn.setForeground(new java.awt.Color(255, 255, 255));
        SignIn.setText("SIGN IN");
        SignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInMouseClicked(evt);
            }
        });
        TOOLBAR.add(SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 90, 50));

        getContentPane().add(TOOLBAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        STEP1PANEL.setBackground(new java.awt.Color(102, 0, 255));

        STEP1LABEL.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        STEP1LABEL.setForeground(new java.awt.Color(255, 255, 255));
        STEP1LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STEP1LABEL.setText("STEP 1: ACCOUNT INFORMATION");
        STEP1LABEL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

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
        STEP2LABEL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

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
        STEP1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        STEP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CITIZENSHIP");
        STEP1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, 28));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("EMAIL ADDRESS");
        STEP1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ADDRESS");
        STEP1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, 28));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("CONFIRM PASSWORD");
        STEP1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 28));
        STEP1.add(MiddleNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 120, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("DATE OF BIRTH");
        STEP1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, 28));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("GENDER");
        STEP1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, 28));
        STEP1.add(CitizenshipField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 170, 36));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("CIVIL STATUS");
        STEP1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, 28));
        STEP1.add(AddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 240, 36));
        STEP1.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 330, 36));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("FULL NAME");
        STEP1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 28));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("PASSWORD");
        STEP1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 28));

        Next.setBackground(new java.awt.Color(25, 18, 211));
        Next.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Next.setForeground(new java.awt.Color(255, 255, 255));
        Next.setText("NEXT");
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });
        STEP1.add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 120, 50));
        STEP1.add(SurnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 40));
        STEP1.add(FirstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 190, 40));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("MIDDLE NAME");
        STEP1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setText("SURNAME");
        STEP1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel22.setText("FIRST NAME");
        STEP1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        CivilStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CivilStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SINGLE", "MARRIED", "DIVORCED", "WIDOWED" }));
        STEP1.add(CivilStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 150, 40));

        GenderBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GenderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        STEP1.add(GenderBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 150, 40));
        STEP1.add(DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 140, 40));
        STEP1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, 36));
        STEP1.add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 240, 36));

        StepsTabs.addTab("", STEP1);

        STEP2.setBackground(new java.awt.Color(255, 255, 255));
        STEP2.setForeground(new java.awt.Color(255, 255, 255));
        STEP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("SECURITY QUESTIONS");
        STEP2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, 20));

        SecurityQuestionBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SecurityQuestionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In what city were you born?", "What is your mother's maiden name?", "What high school did you attend?", "What is your favorite movie?", "What is the middle name of your youngest child?", "What was your favorite sport in high school?", "Where were you when you had your first kiss?", "What was the house number and street name you lived in as a child?", "What are the last five digits of your driver's license number?" }));
        STEP2.add(SecurityQuestionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 480, 40));

        SecurityAnswerField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        STEP2.add(SecurityAnswerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 480, 40));

        BACK.setBackground(new java.awt.Color(25, 18, 211));
        BACK.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BACK.setForeground(new java.awt.Color(255, 255, 255));
        BACK.setText("BACK");
        BACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKMouseClicked(evt);
            }
        });
        STEP2.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 140, 40));

        SubmitButton.setBackground(new java.awt.Color(25, 18, 211));
        SubmitButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("SUBMIT");
        SubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButtonMouseClicked(evt);
            }
        });
        STEP2.add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 140, 40));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("YOUR ANSWER");
        STEP2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        VerifyCodeButton.setBackground(new java.awt.Color(0, 204, 51));
        VerifyCodeButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        VerifyCodeButton.setForeground(new java.awt.Color(255, 255, 255));
        VerifyCodeButton.setText("CLICK TO VERIFY YOUR EMAIL");
        VerifyCodeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerifyCodeButtonMouseClicked(evt);
            }
        });
        VerifyCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyCodeButtonActionPerformed(evt);
            }
        });
        STEP2.add(VerifyCodeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 300, 50));

        EmailProvided.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        STEP2.add(EmailProvided, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 310, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/VERIFY.png"))); // NOI18N
        STEP2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        StepsTabs.addTab("", STEP2);

        getContentPane().add(StepsTabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 450));

        setSize(new java.awt.Dimension(998, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked

        StepsTabs.setSelectedIndex(1);
        STEP1PANEL.setBackground(new Color(153, 153, 255));
        STEP2PANEL.setBackground(new Color(102, 0, 255));

        EmailProvided.setText("Entered email: " + EmailField.getText());


    }//GEN-LAST:event_NextMouseClicked

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        StepsTabs.setSelectedIndex(0);
        STEP2PANEL.setBackground(new Color(153, 153, 255));
        STEP1PANEL.setBackground(new Color(102, 0, 255));
    }//GEN-LAST:event_BACKMouseClicked

    private void SignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInMouseClicked
        try {
            LoginUI login = new LoginUI();
            login.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred while trying to open the window: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_SignInMouseClicked

    private void SubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButtonMouseClicked
        if (RegistrationFormValidatorUtility.validateRegistrationForm(SurnameField,
                FirstNameField,
                MiddleNameField,
                DOB,
                GenderBox,
                EmailField,
                CitizenshipField,
                CivilStatus,
                PasswordField,
                AddressField,
                SecurityQuestionBox,
                SecurityAnswerField)) {

            String surname = SurnameField.getText();
            String firstName = FirstNameField.getText();
            String middleName = MiddleNameField.getText();
            String fullName = NameMergeUtility.getFullName(surname, firstName, middleName);
            java.util.Date dateOfBirth = DOB.getDate();
            String gender = (String) GenderBox.getSelectedItem();
            String email = EmailField.getText();
            String citizenship = CitizenshipField.getText();
            String civilStatus = (String) CivilStatus.getSelectedItem();
            String password = new String(PasswordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());
            String address = AddressField.getText();
            String securityQuestion = (String) SecurityQuestionBox.getSelectedItem();
            String securityAnswer = SecurityAnswerField.getText();

            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(null, "Passwords do not match.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
           

            saveVoterToDatabase(email, password, fullName, gender, citizenship, civilStatus, dateOfBirth, address, securityQuestion, securityAnswer);
        }
    }//GEN-LAST:event_SubmitButtonMouseClicked

    private void VerifyCodeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerifyCodeButtonMouseClicked
      try{
          VoterVerifyCodeUI verifycode = new VoterVerifyCodeUI();
          verifycode.setVisible(true);
         
      } catch (Exception e){
          e.printStackTrace();
      }
    }//GEN-LAST:event_VerifyCodeButtonMouseClicked

    private void VerifyCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyCodeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerifyCodeButtonActionPerformed

    
   
    private void saveVoterToDatabase(String email, String password, String fullName, String gender, String citizenship, String civilStatus, java.util.Date dateOfBirth, String address, String securityQuestion, String securityAnswer) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DatabaseConnection.getConnection();
            String sql = "INSERT INTO voteraccsinfotb (email, password, fullname, gender, citizenship, civil_status, date_of_birth, address, security_question, security_answer) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);
            statement.setString(3, fullName);
            statement.setString(4, gender);
            statement.setString(5, citizenship);
            statement.setString(6, civilStatus);
            statement.setDate(7, new java.sql.Date(dateOfBirth.getTime()));
            statement.setString(8, address);
            statement.setString(9, securityQuestion);
            statement.setString(10, securityAnswer); 
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Voter registered successfully! Do you want to go back to the Login Page?", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error saving voter: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            DatabaseConnection.closeConnection(connection);
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error closing statement: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        try {
            LoginUI login = new LoginUI();
            login.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred while trying to open the window: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(VoterAccountRegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoterAccountRegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoterAccountRegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoterAccountRegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoterAccountRegistrationUI().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JButton BACK;
    private javax.swing.JTextField CitizenshipField;
    private javax.swing.JComboBox<String> CivilStatus;
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailProvided;
    private javax.swing.JLabel Exit;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JComboBox<String> GenderBox;
    private javax.swing.JTextField MiddleNameField;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton Next;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel STEP1;
    private javax.swing.JLabel STEP1LABEL;
    private javax.swing.JPanel STEP1PANEL;
    private javax.swing.JPanel STEP2;
    private javax.swing.JLabel STEP2LABEL;
    private javax.swing.JPanel STEP2PANEL;
    private javax.swing.JTextField SecurityAnswerField;
    private javax.swing.JComboBox<String> SecurityQuestionBox;
    private javax.swing.JLabel SignIn;
    private javax.swing.JTabbedPane StepsTabs;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField SurnameField;
    private javax.swing.JPanel TOOLBAR;
    private javax.swing.JButton VerifyCodeButton;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
