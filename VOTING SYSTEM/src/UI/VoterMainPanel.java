package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.AbstractBorder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class VoterMainPanel extends javax.swing.JFrame {

    private final JPanel[] panels;

    public VoterMainPanel() {
        initComponents();

        panels = new JPanel[]{dashboardpanel, electionspanel, resultspanel, settingspanel};
        jTabbedPane1.setSelectedIndex(0);
        currentDateTime();
        this.dateTime = dateTime;
        startDateTimeUpdater();
        showBarChart();
    }
    
      
    public void showBarChart(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(5, "Registered Voters", "Voted");
        dataset.setValue(10, "Registered Voters", "Haven't voted");
        
        JFreeChart chart = ChartFactory.createBarChart("Registered Voters","","Total # of voters", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        jPanel4.removeAll();
        jPanel4.add(barpChartPanel, BorderLayout.CENTER);
        jPanel4.validate();
        
        
    }

   
    private void startDateTimeUpdater() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        Timer timer = new Timer(1000, (ActionEvent e) -> {
            LocalDateTime now = LocalDateTime.now();
            dateTime.setText(dtf.format(now));
        });
        timer.start();
    }
    
    public void currentDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dateTime.setText(dtf.format(now));
    }
    

    


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        INDEX0 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dateTime = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        INDEX1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        INDEX2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        INDEX3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        SecurityPanel = new javax.swing.JPanel();
        SECURITYICON = new javax.swing.JLabel();
        SECURITYLABEL = new javax.swing.JLabel();
        AccountInformation = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        ACCOUNTINFORMATIONICON = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        PrivacyAndPolicy = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        PRIVACYANDPOLICYARROW = new javax.swing.JLabel();
        Feedback = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        FEEDBACKARROW = new javax.swing.JLabel();
        VotingInstructions = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        VOTINGINSTRUCTIONSARROW = new javax.swing.JLabel();
        SECURITYi4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        CHANGEPASSPANEL = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        CHANGESECUPANEL = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        ACCOUNTINFORMATIONi5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        SEPARATORLINE = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        PRIVACYANDPOLICYi6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel55 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        BACKBUTTON = new javax.swing.JLabel();
        FEEDBACKi7 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        VOTINGINSTRUCTIONSi8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        CHANGESECUPAGEi9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PROFILE = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        dashboardpanel = new javax.swing.JPanel();
        dashboardpic = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        electionspanel = new javax.swing.JPanel();
        elections = new javax.swing.JLabel();
        electionspic = new javax.swing.JLabel();
        resultspanel = new javax.swing.JPanel();
        results = new javax.swing.JLabel();
        resultspic = new javax.swing.JLabel();
        settingspanel = new javax.swing.JPanel();
        settingspic = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 18, 211));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 30, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("—");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));
        jPanel2.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 700));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1060, 50));

        INDEX0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateTime.setBackground(new java.awt.Color(0, 0, 0));
        dateTime.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        dateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateTime.setText("DateTime");
        jPanel3.add(dateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 40));

        INDEX0.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to AEMTRA Corps. Voting System! \nWe're thrilled to have you join our community dedicated to empowering your voice.  \n\nYour Platform for Influence\n\nVoting System is more than just an app; it's your platform to make a difference. \nWhether you're passionate about local issues, national policies, \nor global initiatives, your voice matters here. \n\nWhy Choose Voting System? \n\n      Accessibility: Exercise your right to vote anytime, anywhere. \n      Transparency: Stay informed with clear, concise information about candidates, \n                                propositions, and more. \n      Community: Connect with like-minded individuals and engage in meaningful \n                              discussions about the issues that matter most to you. \n      Impact: Your vote has the power to shape the future. \n\nTogether, we can drive positive change. \n\nGet Started Today! \n\nJoin us in shaping tomorrow by logging in or signing up now. \nTogether, let's amplify your voice and create a brighter future for all. \n\nThank you for choosing Voting System!");
        jTextArea1.setToolTipText("");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 49, 570, 510));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Announcement");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 580, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Voters who haven't voted: ");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 230, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Registered Voters:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 170, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Voters who have voted: ");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK USER.png"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 30, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK USER.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 30, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK USER.png"))); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 30, -1));

        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 420, 310));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel14.setText("VOTING SYSTEM");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel15.setText("VOTERS' STATISTICS");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ADMIN PORTAL.png"))); // NOI18N
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 120, 110));

        INDEX0.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1050, 600));

        jTabbedPane1.addTab("", INDEX0);

        INDEX1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("FORM 2");
        INDEX1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 81, -1, -1));

        jTabbedPane1.addTab("", INDEX1);

        INDEX2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("FORM 3");
        INDEX2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 298, -1, -1));

        jTabbedPane1.addTab("", INDEX2);

        INDEX3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SecurityPanel.setBackground(new java.awt.Color(255, 255, 255));
        SecurityPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecurityPanelMouseClicked(evt);
            }
        });
        SecurityPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SECURITYICON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SECURITYICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/SECURITY.png"))); // NOI18N
        SECURITYICON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SECURITYICONMouseClicked(evt);
            }
        });
        SecurityPanel.add(SECURITYICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 150));

        SECURITYLABEL.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        SECURITYLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SECURITYLABEL.setText(" SECURITY");
        SecurityPanel.add(SECURITYLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 100));

        jPanel8.add(SecurityPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 260, 210));

        AccountInformation.setBackground(new java.awt.Color(255, 255, 255));
        AccountInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountInformationMouseClicked(evt);
            }
        });
        AccountInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("INFORMATION");
        AccountInformation.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, 60));

        ACCOUNTINFORMATIONICON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ACCOUNTINFORMATIONICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ACCOUNTINFORMATION.png"))); // NOI18N
        ACCOUNTINFORMATIONICON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACCOUNTINFORMATIONICONMouseClicked(evt);
            }
        });
        AccountInformation.add(ACCOUNTINFORMATIONICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 6, 260, 140));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("ACCOUNT");
        AccountInformation.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 260, 120));

        jPanel8.add(AccountInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 260, 210));

        INDEX3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 290));

        PrivacyAndPolicy.setBackground(new java.awt.Color(255, 255, 255));
        PrivacyAndPolicy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrivacyAndPolicyMouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel23.setText("PRIVACY AND POLICY");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/PRIVACY.png"))); // NOI18N

        PRIVACYANDPOLICYARROW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRIVACYANDPOLICYARROW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ARROW.png"))); // NOI18N
        PRIVACYANDPOLICYARROW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRIVACYANDPOLICYARROWMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PrivacyAndPolicyLayout = new javax.swing.GroupLayout(PrivacyAndPolicy);
        PrivacyAndPolicy.setLayout(PrivacyAndPolicyLayout);
        PrivacyAndPolicyLayout.setHorizontalGroup(
            PrivacyAndPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrivacyAndPolicyLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(PRIVACYANDPOLICYARROW)
                .addGap(20, 20, 20))
        );
        PrivacyAndPolicyLayout.setVerticalGroup(
            PrivacyAndPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrivacyAndPolicyLayout.createSequentialGroup()
                .addGroup(PrivacyAndPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrivacyAndPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PRIVACYANDPOLICYARROW, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        INDEX3.add(PrivacyAndPolicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 800, 60));

        Feedback.setBackground(new java.awt.Color(255, 255, 255));
        Feedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedbackMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setText("HOW CAN WE IMPROVE?");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FEEDBACK.png"))); // NOI18N

        FEEDBACKARROW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FEEDBACKARROW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ARROW.png"))); // NOI18N
        FEEDBACKARROW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FEEDBACKARROWMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FeedbackLayout = new javax.swing.GroupLayout(Feedback);
        Feedback.setLayout(FeedbackLayout);
        FeedbackLayout.setHorizontalGroup(
            FeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addComponent(FEEDBACKARROW)
                .addGap(18, 18, 18))
        );
        FeedbackLayout.setVerticalGroup(
            FeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(FeedbackLayout.createSequentialGroup()
                .addComponent(FEEDBACKARROW, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        INDEX3.add(Feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 800, 60));

        VotingInstructions.setBackground(new java.awt.Color(255, 255, 255));
        VotingInstructions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotingInstructionsMouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel22.setText("VOTING INSTRUCTIONS");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/INSTRUCTIONS.png"))); // NOI18N

        VOTINGINSTRUCTIONSARROW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTINGINSTRUCTIONSARROW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ARROW.png"))); // NOI18N
        VOTINGINSTRUCTIONSARROW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOTINGINSTRUCTIONSARROWMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VotingInstructionsLayout = new javax.swing.GroupLayout(VotingInstructions);
        VotingInstructions.setLayout(VotingInstructionsLayout);
        VotingInstructionsLayout.setHorizontalGroup(
            VotingInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VotingInstructionsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                .addComponent(VOTINGINSTRUCTIONSARROW)
                .addGap(17, 17, 17))
        );
        VotingInstructionsLayout.setVerticalGroup(
            VotingInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VotingInstructionsLayout.createSequentialGroup()
                .addGroup(VotingInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VotingInstructionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VotingInstructionsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel22))
                    .addComponent(VOTINGINSTRUCTIONSARROW, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        INDEX3.add(VotingInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 800, 60));

        jTabbedPane1.addTab("", INDEX3);

        SECURITYi4.setBackground(new java.awt.Color(153, 153, 153));
        SECURITYi4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("CURRENT PASSWORD");
        jPanel15.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 260, 30));
        jPanel15.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 260, 40));

        jLabel40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("NEW PASSWORD");
        jPanel15.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 260, 20));
        jPanel15.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 260, 40));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("CONFIRM PASSWORD");
        jPanel15.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 260, 30));
        jPanel15.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 260, 40));

        jButton2.setBackground(new java.awt.Color(25, 18, 211));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CONFIRM");
        jPanel15.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 130, 40));

        SECURITYi4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 900, 490));

        CHANGEPASSPANEL.setBackground(new java.awt.Color(51, 51, 255));
        CHANGEPASSPANEL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CHANGEPASSPANEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHANGEPASSPANELMouseClicked(evt);
            }
        });
        CHANGEPASSPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("CHANGE PASSWORD");
        CHANGEPASSPANEL.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 80));

        SECURITYi4.add(CHANGEPASSPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 450, 80));

        CHANGESECUPANEL.setBackground(new java.awt.Color(0, 0, 102));
        CHANGESECUPANEL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CHANGESECUPANEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHANGESECUPANELMouseClicked(evt);
            }
        });
        CHANGESECUPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("CHANGE SECURITY QUESTION");
        CHANGESECUPANEL.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 448, 78));

        SECURITYi4.add(CHANGESECUPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 450, 80));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        jLabel52.setText("BACK");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });
        SECURITYi4.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 130, 50));

        jTabbedPane1.addTab("", SECURITYi4);

        ACCOUNTINFORMATIONi5.setBackground(new java.awt.Color(255, 255, 255));
        ACCOUNTINFORMATIONi5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("_____________________________________________________________________________________________________________________________________________");
        ACCOUNTINFORMATIONi5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 1000, -1));

        jLabel43.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel43.setText("PERSONAL INFORMATION");
        ACCOUNTINFORMATIONi5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 200, -1));

        SEPARATORLINE.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout SEPARATORLINELayout = new javax.swing.GroupLayout(SEPARATORLINE);
        SEPARATORLINE.setLayout(SEPARATORLINELayout);
        SEPARATORLINELayout.setHorizontalGroup(
            SEPARATORLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        SEPARATORLINELayout.setVerticalGroup(
            SEPARATORLINELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        ACCOUNTINFORMATIONi5.add(SEPARATORLINE, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 3, 400));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel45.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("FULL NAME:");

        jLabel46.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("BIRTHDATE:");

        jLabel47.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("GENDER:");

        jLabel48.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("EMAIL ADDRESS:");

        jLabel49.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("CITIZENSHIP:");

        jLabel44.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("CIVIL STATUS:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addContainerGap())
        );

        ACCOUNTINFORMATIONi5.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 310, 350));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        jLabel51.setText("BACK");
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });
        ACCOUNTINFORMATIONi5.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 100, -1));

        jTabbedPane1.addTab("tab6", ACCOUNTINFORMATIONi5);

        PRIVACYANDPOLICYi6.setBackground(new java.awt.Color(255, 255, 255));
        PRIVACYANDPOLICYi6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextPane1.setText("At AEMTRA, we are committed to protecting the privacy of our users. This Privacy Policy outlines the types of personal information we collect, how we use it, and how we safeguard it.\n\nInformation We Collect:\n\n1. Voter Information: When users participate in our voting poll, we collect limited personal information such as name and email address to ensure the integrity of the voting process. We do not collect any sensitive personal information such as social security numbers or financial data.\n\n2. Voting Data: We collect data related to votes cast in the poll, including the choices made by users. This data is anonymized and aggregated to analyze overall trends and results.\n\nUse of Information:\n\n1. Ensuring One Vote Per Person: We use the collected voter information to verify the identity of users and prevent multiple votes from the same individual. This helps maintain the integrity and fairness of the voting process.\n\n2. Communications: We may use the provided email address to communicate with users regarding their participation in the voting poll, such as confirmation of their vote or updates about the poll results.\n\n3. Improving Our Services: Aggregated voting data may be analyzed to improve our services, enhance the user experience, and make informed decisions for future projects.\n\nData Security:\n\n1. Secure Storage: We employ industry-standard security measures to protect the personal information and voting data collected through our platform. This includes encryption, access controls, and regular security audits.\n\n2. Limited Access: Access to personal information and voting data is restricted to authorized personnel who require it to perform their duties. We do not sell, rent, or share personal information with third parties for marketing purposes.\n\nUser Rights:\n\n1. Access and Correction: Users have the right to access their personal information and request corrections if necessary. They can contact us at [contact email] to exercise these rights.\n\n2. Data Deletion: Users can request the deletion of their personal information from our systems by contacting us at aemtracorps@gmail.com. However, please note that this may result in the inability to verify their identity for future voting polls.\n\nChanges to this Privacy Policy:\n\nWe reserve the right to update this Privacy Policy from time to time to reflect changes in our practices or applicable laws. We encourage users to review this policy periodically for any updates.\n\nContact Us:\n\nIf you have any questions or concerns about this Privacy Policy or our data practices, please contact us at aemtracorps@gmail.com.");
        jTextPane1.setToolTipText("");
        jTextPane1.setCaretPosition(1);
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTextPane1);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 960, 500));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        jLabel55.setText("BACK");
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 130, 60));

        jPanel10.setBackground(new java.awt.Color(153, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ADMIN PORTAL.png"))); // NOI18N
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 150));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("PRIVACY AND POLICY");
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1030, 150));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLUEWALL.jpg"))); // NOI18N
        jLabel32.setText("jLabel32");
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 160));

        jPanel11.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1070, 160));

        BACKBUTTON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BACKBUTTON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BACKBUTTON.setText("BACK");
        jPanel11.add(BACKBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 130, 50));

        PRIVACYANDPOLICYi6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 650));

        jTabbedPane1.addTab("tab7", PRIVACYANDPOLICYi6);

        FEEDBACKi7.setBackground(new java.awt.Color(204, 255, 204));
        FEEDBACKi7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        jLabel54.setText("BACK");
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });
        FEEDBACKi7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 130, 50));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("FEEDBACK");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 480, 80));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("system, so we'd love to hear your feedback.");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 350, -1));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("We would love to know your thought of your experience at voting");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 350, -1));

        jTextField1.setText("MESSAGE");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 400, 100));

        jTextField2.setText("NAME");
        jPanel9.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 400, 30));

        jTextField3.setText("EMAIL");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 400, 30));

        jButton1.setBackground(new java.awt.Color(0, 255, 51));
        jButton1.setText("SEND FEEDBACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 170, 50));

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 420, 2));

        FEEDBACKi7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 480, 510));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLUEBG (3).jpg"))); // NOI18N
        FEEDBACKi7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1060, 670));

        jTabbedPane1.addTab("tab8", FEEDBACKi7);

        jLabel28.setText("tab 9");

        javax.swing.GroupLayout VOTINGINSTRUCTIONSi8Layout = new javax.swing.GroupLayout(VOTINGINSTRUCTIONSi8);
        VOTINGINSTRUCTIONSi8.setLayout(VOTINGINSTRUCTIONSi8Layout);
        VOTINGINSTRUCTIONSi8Layout.setHorizontalGroup(
            VOTINGINSTRUCTIONSi8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VOTINGINSTRUCTIONSi8Layout.createSequentialGroup()
                .addContainerGap(551, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(455, 455, 455))
        );
        VOTINGINSTRUCTIONSi8Layout.setVerticalGroup(
            VOTINGINSTRUCTIONSi8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VOTINGINSTRUCTIONSi8Layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(305, 305, 305))
        );

        jTabbedPane1.addTab("tab9", VOTINGINSTRUCTIONSi8);

        CHANGESECUPAGEi9.setBackground(new java.awt.Color(153, 153, 153));
        CHANGESECUPAGEi9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHANGESECUPAGEi9MouseClicked(evt);
            }
        });
        CHANGESECUPAGEi9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 0, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("CHANGE PASSWORD");
        jPanel12.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 78));

        CHANGESECUPAGEi9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 450, 80));

        jPanel13.setBackground(new java.awt.Color(51, 51, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("CHANGE SECURITY QUESTION");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        CHANGESECUPAGEi9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 450, 80));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel37.setText("NEW SECURITY QUESTION");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In what city were you born?", "What is your mother's maiden name?", "What high school did you attend?", "What is your favorite movie?", "What is the middle name of your youngest child?", "What was your favorite sport in high school?", "Where were you when you had your first kiss?", "What was the house number and street name you lived in as a child?", "What are the last five digits of your driver's license number?" }));

        jLabel42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel42.setText("NEW ANSWER");

        jButton3.setBackground(new java.awt.Color(25, 18, 211));
        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CONFIRM");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        CHANGESECUPAGEi9.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 900, 490));

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        jLabel53.setText("BACK");
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });
        CHANGESECUPAGEi9.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 130, 50));

        jTabbedPane1.addTab("tab10", CHANGESECUPAGEi9);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 1060, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PROFILE.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(PROFILE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 30));

        ID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ID.setText("View your profile ->");
        ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDMouseClicked(evt);
            }
        });
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, 30));

        dashboardpanel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardpic.setBackground(new java.awt.Color(255, 255, 255));
        dashboardpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/DASHBOARD.png"))); // NOI18N
        dashboardpic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardpic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardpicMouseClicked(evt);
            }
        });
        dashboardpanel.add(dashboardpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 60));

        dashboard.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setText("DASHBOARD");
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });
        dashboardpanel.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 170, 40));

        jPanel1.add(dashboardpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 90));

        electionspanel.setBackground(new java.awt.Color(255, 255, 255));
        electionspanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        elections.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        elections.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elections.setText("ELECTIONS");
        elections.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                electionsMouseClicked(evt);
            }
        });
        electionspanel.add(elections, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 40));

        electionspic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        electionspic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ELECTION.png"))); // NOI18N
        electionspic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        electionspic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                electionspicMouseClicked(evt);
            }
        });
        electionspanel.add(electionspic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        jPanel1.add(electionspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 170, 90));

        resultspanel.setBackground(new java.awt.Color(255, 255, 255));
        resultspanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        results.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        results.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        results.setText("RESULTS");
        results.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        results.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultsMouseClicked(evt);
            }
        });
        resultspanel.add(results, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 170, 40));

        resultspic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultspic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/RESULTS.png"))); // NOI18N
        resultspic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resultspic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultspicMouseClicked(evt);
            }
        });
        resultspanel.add(resultspic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 170, 50));

        jPanel1.add(resultspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 170, 90));

        settingspanel.setBackground(new java.awt.Color(255, 255, 255));
        settingspanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingspic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingspic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/SETTINGS.png"))); // NOI18N
        settingspic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingspic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingspicMouseClicked(evt);
            }
        });
        settingspanel.add(settingspic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        settings.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setText("SETTINGS");
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });
        settingspanel.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 170, 40));

        jPanel1.add(settingspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 170, 90));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 190, -1));

        LOGOUT.setBackground(new java.awt.Color(255, 0, 0));
        LOGOUT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBackground(new java.awt.Color(255, 0, 0));
        logout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LOGOUT.png"))); // NOI18N
        logout.setText("LOGOUT");
        logout.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        LOGOUT.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        jPanel1.add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 700));

        setSize(new java.awt.Dimension(1248, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void electionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electionsMouseClicked
        setPanel(1, electionspanel);
        setCursor(elections);
    }//GEN-LAST:event_electionsMouseClicked

    private void electionspicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electionspicMouseClicked
        setPanel(1, electionspanel);
        setCursor(electionspic);
    }//GEN-LAST:event_electionspicMouseClicked

    private void resultspicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultspicMouseClicked
        setPanel(2, resultspanel);
        setCursor(resultspic);
    }//GEN-LAST:event_resultspicMouseClicked

    private void resultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultsMouseClicked
        setPanel(2, resultspanel);
        setCursor(results);
    }//GEN-LAST:event_resultsMouseClicked

    private void dashboardpicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardpicMouseClicked
        setPanel(0, dashboardpanel);
        setCursor(dashboardpic);
    }//GEN-LAST:event_dashboardpicMouseClicked

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        setPanel(0, dashboardpanel);
        setCursor(dashboard);
    }//GEN-LAST:event_dashboardMouseClicked

    private void settingspicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingspicMouseClicked
        setPanel(3, settingspanel);
        setCursor(settingspic);
    }//GEN-LAST:event_settingspicMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        setPanel(3, settingspanel);
        setCursor(settings);
    }//GEN-LAST:event_settingsMouseClicked

    private void IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_IDMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked

    }//GEN-LAST:event_logoutMouseClicked

    private void SECURITYICONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SECURITYICONMouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_SECURITYICONMouseClicked

    private void ACCOUNTINFORMATIONICONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNTINFORMATIONICONMouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_ACCOUNTINFORMATIONICONMouseClicked

    private void PRIVACYANDPOLICYARROWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRIVACYANDPOLICYARROWMouseClicked
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_PRIVACYANDPOLICYARROWMouseClicked

    private void FEEDBACKARROWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FEEDBACKARROWMouseClicked
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_FEEDBACKARROWMouseClicked

    private void VOTINGINSTRUCTIONSARROWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOTINGINSTRUCTIONSARROWMouseClicked
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_VOTINGINSTRUCTIONSARROWMouseClicked

    private void SecurityPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecurityPanelMouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_SecurityPanelMouseClicked

    private void AccountInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountInformationMouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_AccountInformationMouseClicked

    private void PrivacyAndPolicyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrivacyAndPolicyMouseClicked
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_PrivacyAndPolicyMouseClicked

    private void FeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbackMouseClicked
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_FeedbackMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CHANGESECUPANELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHANGESECUPANELMouseClicked
        jTabbedPane1.setSelectedIndex(9);
    }//GEN-LAST:event_CHANGESECUPANELMouseClicked

    private void CHANGEPASSPANELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHANGEPASSPANELMouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_CHANGEPASSPANELMouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jPanel12MouseClicked

    private void VotingInstructionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotingInstructionsMouseClicked
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_VotingInstructionsMouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel53MouseClicked

    private void CHANGESECUPAGEi9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHANGESECUPAGEi9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CHANGESECUPAGEi9MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel54MouseClicked

    private void setCursor(JLabel targetLabel) {
       targetLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void setPanel(int index, JPanel targetPanel) {
        //Changes for the target panel
        targetPanel.setBackground(new Color(204, 204, 204));
        jTabbedPane1.setSelectedIndex(index);

        //Changes for the non-target panel
        for (JPanel panel : panels) {
            if (panel != targetPanel) {
                panel.setBackground(new Color(255, 255, 255));
                panel.setEnabled(false);
            }
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
            java.util.logging.Logger.getLogger(VoterMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoterMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoterMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoterMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoterMainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACCOUNTINFORMATIONICON;
    private javax.swing.JPanel ACCOUNTINFORMATIONi5;
    private javax.swing.JPanel AccountInformation;
    private javax.swing.JLabel BACKBUTTON;
    private javax.swing.JPanel CHANGEPASSPANEL;
    private javax.swing.JPanel CHANGESECUPAGEi9;
    private javax.swing.JPanel CHANGESECUPANEL;
    private javax.swing.JLabel FEEDBACKARROW;
    private javax.swing.JPanel FEEDBACKi7;
    private javax.swing.JPanel Feedback;
    private javax.swing.JLabel ID;
    private javax.swing.JPanel INDEX0;
    private javax.swing.JPanel INDEX1;
    private javax.swing.JPanel INDEX2;
    private javax.swing.JPanel INDEX3;
    private javax.swing.JPanel LOGOUT;
    private javax.swing.JLabel PRIVACYANDPOLICYARROW;
    private javax.swing.JPanel PRIVACYANDPOLICYi6;
    private javax.swing.JLabel PROFILE;
    private javax.swing.JPanel PrivacyAndPolicy;
    private javax.swing.JLabel SECURITYICON;
    private javax.swing.JLabel SECURITYLABEL;
    private javax.swing.JPanel SECURITYi4;
    private javax.swing.JPanel SEPARATORLINE;
    private javax.swing.JPanel SecurityPanel;
    private javax.swing.JLabel VOTINGINSTRUCTIONSARROW;
    private javax.swing.JPanel VOTINGINSTRUCTIONSi8;
    private javax.swing.JPanel VotingInstructions;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel dashboard;
    private javax.swing.JPanel dashboardpanel;
    private javax.swing.JLabel dashboardpic;
    private javax.swing.JLabel dateTime;
    private javax.swing.JLabel elections;
    private javax.swing.JPanel electionspanel;
    private javax.swing.JLabel electionspic;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel results;
    private javax.swing.JPanel resultspanel;
    private javax.swing.JLabel resultspic;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JLabel settingspic;
    // End of variables declaration//GEN-END:variables

   
}

