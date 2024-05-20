package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
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

        panels = new JPanel[]{dashboardpanel, electionspanel, resultspanel, settingspanel, logoutpanel};
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        INDEX0 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dateTime = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        jLabel9 = new javax.swing.JLabel();
        INDEX4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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
        logoutpanel = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        logoutpic = new javax.swing.JLabel();
        settingspanel = new javax.swing.JPanel();
        settingspic = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 18, 211));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 30, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("—");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1000, 50));

        INDEX0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateTime.setBackground(new java.awt.Color(0, 0, 0));
        dateTime.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        dateTime.setForeground(new java.awt.Color(0, 0, 0));
        dateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateTime.setText("DateTime");
        jPanel3.add(dateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        INDEX0.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Announcement");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to AEMTRA Corps. Voting System! \nWe're thrilled to have you join our community dedicated to empowering your voice.  \n\nYour Platform for Influence\n\nVoting System is more than just an app; it's your platform to make a difference. \nWhether you're passionate about local issues, national policies, \nor global initiatives, your voice matters here. \n\nWhy Choose Voting System? \n\n      Accessibility: Exercise your right to vote anytime, anywhere. \n      Transparency: Stay informed with clear, concise information about candidates, \n                                propositions, and more. \n      Community: Connect with like-minded individuals and engage in meaningful \n                              discussions about the issues that matter most to you. \n      Impact: Your vote has the power to shape the future. \n\nTogether, we can drive positive change. \n\nGet Started Today! \n\nJoin us in shaping tomorrow by logging in or signing up now. \nTogether, let's amplify your voice and create a brighter future for all. \n\nThank you for choosing Voting System!");
        jTextArea1.setToolTipText("");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 550, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Voters who haven't voted: ");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 230, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Registered Voters:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 170, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Voters who have voted: ");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK USER.png"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 30, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK USER.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 30, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK USER.png"))); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 30, -1));

        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 420, 310));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("VOTING SYSTEM");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("VOTERS' STATISTICS");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ADMIN PORTAL.png"))); // NOI18N
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        INDEX0.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, 600));

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

        jLabel9.setText("FORM 4");
        INDEX3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 298, -1, -1));

        jTabbedPane1.addTab("", INDEX3);

        jLabel3.setText("form 5");

        javax.swing.GroupLayout INDEX4Layout = new javax.swing.GroupLayout(INDEX4);
        INDEX4.setLayout(INDEX4Layout);
        INDEX4Layout.setHorizontalGroup(
            INDEX4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INDEX4Layout.createSequentialGroup()
                .addGap(449, 449, 449)
                .addComponent(jLabel3)
                .addContainerGap(511, Short.MAX_VALUE))
        );
        INDEX4Layout.setVerticalGroup(
            INDEX4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INDEX4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel3)
                .addContainerGap(542, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", INDEX4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 1000, 680));

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
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 110, 30));

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
        dashboardpanel.add(dashboardpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        dashboard.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setText("DASHBOARD");
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });
        dashboardpanel.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 230, 40));

        jPanel1.add(dashboardpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 230, 90));

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
        electionspanel.add(elections, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, 40));

        electionspic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        electionspic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ELECTION.png"))); // NOI18N
        electionspic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        electionspic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                electionspicMouseClicked(evt);
            }
        });
        electionspanel.add(electionspic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        jPanel1.add(electionspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 230, 90));

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
        resultspanel.add(results, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 230, 40));

        resultspic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultspic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/RESULTS.png"))); // NOI18N
        resultspic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resultspic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultspicMouseClicked(evt);
            }
        });
        resultspanel.add(resultspic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 226, 50));

        jPanel1.add(resultspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 230, 90));

        logoutpanel.setBackground(new java.awt.Color(255, 255, 255));
        logoutpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("LOGOUT");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logoutpanel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 230, 40));

        logoutpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LOGOUT.png"))); // NOI18N
        logoutpic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutpic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutpicMouseClicked(evt);
            }
        });
        logoutpanel.add(logoutpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 3, 230, 50));

        jPanel1.add(logoutpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 230, 90));

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
        settingspanel.add(settingspic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        settings.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setText("SETTINGS");
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });
        settingspanel.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, 40));

        jPanel1.add(settingspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 230, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 700));

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
        setPanel(1, dashboardpanel);
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

    private void logoutpicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutpicMouseClicked
        setPanel(4, logoutpanel);
        setCursor(logoutpic);
    }//GEN-LAST:event_logoutpicMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        setPanel(4, logoutpanel);
        setCursor(logout);
    }//GEN-LAST:event_logoutMouseClicked

    private void IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_IDMouseClicked

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
    private javax.swing.JLabel ID;
    private javax.swing.JPanel INDEX0;
    private javax.swing.JPanel INDEX1;
    private javax.swing.JPanel INDEX2;
    private javax.swing.JPanel INDEX3;
    private javax.swing.JPanel INDEX4;
    private javax.swing.JLabel PROFILE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel dashboard;
    private javax.swing.JPanel dashboardpanel;
    private javax.swing.JLabel dashboardpic;
    private javax.swing.JLabel dateTime;
    private javax.swing.JLabel elections;
    private javax.swing.JPanel electionspanel;
    private javax.swing.JLabel electionspic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel logoutpanel;
    private javax.swing.JLabel logoutpic;
    private javax.swing.JLabel results;
    private javax.swing.JPanel resultspanel;
    private javax.swing.JLabel resultspic;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JLabel settingspic;
    // End of variables declaration//GEN-END:variables

   
}

