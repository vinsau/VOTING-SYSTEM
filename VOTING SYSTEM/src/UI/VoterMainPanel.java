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
        ElectorateClassifier = new javax.swing.JPanel();
        SKButton = new javax.swing.JButton();
        ElectorateLabel = new javax.swing.JLabel();
        BackPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        ElectorateTab = new javax.swing.JTabbedPane();
        ElectorateButton = new javax.swing.JPanel();
        MayorButton = new javax.swing.JButton();
        ViceMayorButton = new javax.swing.JButton();
        CongressmanButton = new javax.swing.JButton();
        CityCouncilorButton = new javax.swing.JButton();
        BarangayCaptainButton = new javax.swing.JButton();
        BarangayCouncilorsButton = new javax.swing.JButton();
        MayorTab = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        ViceMayorTab = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        CongressmanTab = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        CityCouncilorTab = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        BarangayCaptainTab = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        BarangayCouncilorTab = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        SKTab = new javax.swing.JPanel();
        SKChairpersonButton = new javax.swing.JButton();
        SKKagawadButton = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        SKChairpersonTab = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        SKKagawadTab = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        INDEX2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        INDEX3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
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

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to AEMTRA Corps. Voting System! \nWe're thrilled to have you join our community dedicated to empowering your voice.  \n\nYour Platform for Influence\n\nVoting System is more than just an app; it's your platform to make a difference. \nWhether you're passionate about local issues, national policies, \nor global initiatives, your voice matters here. \n\nWhy Choose Voting System? \n\n      Accessibility: Exercise your right to vote anytime, anywhere. \n      Transparency: Stay informed with clear, concise information about candidates, \n                                propositions, and more. \n      Community: Connect with like-minded individuals and engage in meaningful \n                              discussions about the issues that matter most to you. \n      Impact: Your vote has the power to shape the future. \n\nTogether, we can drive positive change. \n\nGet Started Today! \n\nJoin us in shaping tomorrow by logging in or signing up now. \nTogether, let's amplify your voice and create a brighter future for all. \n\nThank you for choosing Voting System!");
        jTextArea1.setToolTipText("");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        ElectorateClassifier.setBackground(new java.awt.Color(0, 0, 0));

        SKButton.setBackground(new java.awt.Color(255, 204, 0));
        SKButton.setForeground(new java.awt.Color(0, 0, 0));
        SKButton.setText("Sangguniang Kabataan");
        SKButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKButtonMouseClicked(evt);
            }
        });

        ElectorateLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ElectorateLabel.setForeground(new java.awt.Color(255, 255, 255));
        ElectorateLabel.setText("ELECTORATE:");

        javax.swing.GroupLayout ElectorateClassifierLayout = new javax.swing.GroupLayout(ElectorateClassifier);
        ElectorateClassifier.setLayout(ElectorateClassifierLayout);
        ElectorateClassifierLayout.setHorizontalGroup(
            ElectorateClassifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectorateClassifierLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ElectorateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 600, Short.MAX_VALUE)
                .addComponent(SKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        ElectorateClassifierLayout.setVerticalGroup(
            ElectorateClassifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectorateClassifierLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(SKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ElectorateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        INDEX1.add(ElectorateClassifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 50));

        BackPanel.setBackground(new java.awt.Color(0, 0, 0));
        BackPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        BackPanel.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 30));

        INDEX1.add(BackPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 50));

        MayorButton.setBackground(new java.awt.Color(0, 0, 102));
        MayorButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        MayorButton.setText("Mayor");
        MayorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MayorButtonMouseClicked(evt);
            }
        });

        ViceMayorButton.setBackground(new java.awt.Color(0, 0, 102));
        ViceMayorButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ViceMayorButton.setText("Vice Mayor");
        ViceMayorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViceMayorButtonMouseClicked(evt);
            }
        });

        CongressmanButton.setBackground(new java.awt.Color(0, 0, 102));
        CongressmanButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CongressmanButton.setText("Congressman");
        CongressmanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CongressmanButtonMouseClicked(evt);
            }
        });

        CityCouncilorButton.setBackground(new java.awt.Color(0, 0, 102));
        CityCouncilorButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CityCouncilorButton.setText("City Councilors");
        CityCouncilorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CityCouncilorButtonMouseClicked(evt);
            }
        });

        BarangayCaptainButton.setBackground(new java.awt.Color(0, 0, 102));
        BarangayCaptainButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BarangayCaptainButton.setText("Barangay Captain");
        BarangayCaptainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarangayCaptainButtonMouseClicked(evt);
            }
        });

        BarangayCouncilorsButton.setBackground(new java.awt.Color(0, 0, 102));
        BarangayCouncilorsButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BarangayCouncilorsButton.setText("Barangay Councilors");
        BarangayCouncilorsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarangayCouncilorsButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ElectorateButtonLayout = new javax.swing.GroupLayout(ElectorateButton);
        ElectorateButton.setLayout(ElectorateButtonLayout);
        ElectorateButtonLayout.setHorizontalGroup(
            ElectorateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectorateButtonLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(ElectorateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MayorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityCouncilorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(ElectorateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BarangayCaptainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViceMayorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(ElectorateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BarangayCouncilorsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CongressmanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 90, Short.MAX_VALUE))
        );
        ElectorateButtonLayout.setVerticalGroup(
            ElectorateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectorateButtonLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(ElectorateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MayorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViceMayorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CongressmanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(ElectorateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BarangayCouncilorsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BarangayCaptainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityCouncilorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        ElectorateTab.addTab("", ElectorateButton);

        jLabel17.setText("MAYOR");

        javax.swing.GroupLayout MayorTabLayout = new javax.swing.GroupLayout(MayorTab);
        MayorTab.setLayout(MayorTabLayout);
        MayorTabLayout.setHorizontalGroup(
            MayorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MayorTabLayout.createSequentialGroup()
                .addGap(471, 471, 471)
                .addComponent(jLabel17)
                .addContainerGap(547, Short.MAX_VALUE))
        );
        MayorTabLayout.setVerticalGroup(
            MayorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MayorTabLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel17)
                .addContainerGap(395, Short.MAX_VALUE))
        );

        ElectorateTab.addTab("", MayorTab);

        jLabel19.setText("vice mayor");

        javax.swing.GroupLayout ViceMayorTabLayout = new javax.swing.GroupLayout(ViceMayorTab);
        ViceMayorTab.setLayout(ViceMayorTabLayout);
        ViceMayorTabLayout.setHorizontalGroup(
            ViceMayorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViceMayorTabLayout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(jLabel19)
                .addContainerGap(525, Short.MAX_VALUE))
        );
        ViceMayorTabLayout.setVerticalGroup(
            ViceMayorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViceMayorTabLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel19)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        ElectorateTab.addTab("tab3", ViceMayorTab);

        jLabel20.setText("congressman");

        javax.swing.GroupLayout CongressmanTabLayout = new javax.swing.GroupLayout(CongressmanTab);
        CongressmanTab.setLayout(CongressmanTabLayout);
        CongressmanTabLayout.setHorizontalGroup(
            CongressmanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CongressmanTabLayout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jLabel20)
                .addContainerGap(530, Short.MAX_VALUE))
        );
        CongressmanTabLayout.setVerticalGroup(
            CongressmanTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CongressmanTabLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel20)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        ElectorateTab.addTab("tab4", CongressmanTab);

        jLabel21.setText("city councilor");

        javax.swing.GroupLayout CityCouncilorTabLayout = new javax.swing.GroupLayout(CityCouncilorTab);
        CityCouncilorTab.setLayout(CityCouncilorTabLayout);
        CityCouncilorTabLayout.setHorizontalGroup(
            CityCouncilorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityCouncilorTabLayout.createSequentialGroup()
                .addGap(465, 465, 465)
                .addComponent(jLabel21)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        CityCouncilorTabLayout.setVerticalGroup(
            CityCouncilorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityCouncilorTabLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel21)
                .addContainerGap(357, Short.MAX_VALUE))
        );

        ElectorateTab.addTab("tab5", CityCouncilorTab);

        jLabel22.setText("barangay captain");

        javax.swing.GroupLayout BarangayCaptainTabLayout = new javax.swing.GroupLayout(BarangayCaptainTab);
        BarangayCaptainTab.setLayout(BarangayCaptainTabLayout);
        BarangayCaptainTabLayout.setHorizontalGroup(
            BarangayCaptainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangayCaptainTabLayout.createSequentialGroup()
                .addGap(474, 474, 474)
                .addComponent(jLabel22)
                .addContainerGap(495, Short.MAX_VALUE))
        );
        BarangayCaptainTabLayout.setVerticalGroup(
            BarangayCaptainTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangayCaptainTabLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel22)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        ElectorateTab.addTab("tab6", BarangayCaptainTab);

        jLabel23.setText("barangay councilor");

        javax.swing.GroupLayout BarangayCouncilorTabLayout = new javax.swing.GroupLayout(BarangayCouncilorTab);
        BarangayCouncilorTab.setLayout(BarangayCouncilorTabLayout);
        BarangayCouncilorTabLayout.setHorizontalGroup(
            BarangayCouncilorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangayCouncilorTabLayout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(jLabel23)
                .addContainerGap(475, Short.MAX_VALUE))
        );
        BarangayCouncilorTabLayout.setVerticalGroup(
            BarangayCouncilorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangayCouncilorTabLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel23)
                .addContainerGap(331, Short.MAX_VALUE))
        );

        ElectorateTab.addTab("tab7", BarangayCouncilorTab);

        SKTab.setBackground(new java.awt.Color(255, 255, 255));
        SKTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SKChairpersonButton.setBackground(new java.awt.Color(255, 204, 0));
        SKChairpersonButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        SKChairpersonButton.setForeground(new java.awt.Color(0, 0, 0));
        SKChairpersonButton.setText("SK Chairperson");
        SKChairpersonButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKChairpersonButtonMouseClicked(evt);
            }
        });
        SKChairpersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SKChairpersonButtonActionPerformed(evt);
            }
        });
        SKTab.add(SKChairpersonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 377, 207));

        SKKagawadButton.setBackground(new java.awt.Color(255, 204, 0));
        SKKagawadButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        SKKagawadButton.setForeground(new java.awt.Color(0, 0, 0));
        SKKagawadButton.setText("SK Kagawad");
        SKKagawadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKKagawadButtonMouseClicked(evt);
            }
        });
        SKTab.add(SKKagawadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 377, 207));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Sangguniang Kabataan Elections");
        SKTab.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1060, -1));

        ElectorateTab.addTab("tab8", SKTab);

        jLabel7.setText("sk chairperson");

        javax.swing.GroupLayout SKChairpersonTabLayout = new javax.swing.GroupLayout(SKChairpersonTab);
        SKChairpersonTab.setLayout(SKChairpersonTabLayout);
        SKChairpersonTabLayout.setHorizontalGroup(
            SKChairpersonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SKChairpersonTabLayout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(jLabel7)
                .addContainerGap(521, Short.MAX_VALUE))
        );
        SKChairpersonTabLayout.setVerticalGroup(
            SKChairpersonTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SKChairpersonTabLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel7)
                .addContainerGap(353, Short.MAX_VALUE))
        );

        ElectorateTab.addTab("tab9", SKChairpersonTab);

        jLabel18.setText("sk kagawad");

        javax.swing.GroupLayout SKKagawadTabLayout = new javax.swing.GroupLayout(SKKagawadTab);
        SKKagawadTab.setLayout(SKKagawadTabLayout);
        SKKagawadTabLayout.setHorizontalGroup(
            SKKagawadTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SKKagawadTabLayout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel18)
                .addContainerGap(575, Short.MAX_VALUE))
        );
        SKKagawadTabLayout.setVerticalGroup(
            SKKagawadTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SKKagawadTabLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel18)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        ElectorateTab.addTab("tab10", SKKagawadTab);

        INDEX1.add(ElectorateTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 650));

        jTabbedPane1.addTab("", INDEX1);

        INDEX2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("FORM 3");
        INDEX2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 298, -1, -1));

        jTabbedPane1.addTab("", INDEX2);

        INDEX3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("FORM 4");
        INDEX3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 298, -1, -1));

        jTabbedPane1.addTab("", INDEX3);

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
        ElectorateTab.setSelectedIndex(0);
        ElectorateLabel.setVisible(true);
        ElectorateClassifier.setVisible(true);
        ElectorateClassifier.setEnabled(true);
        BackPanel.setEnabled(false);
        BackPanel.setVisible(false);
    }//GEN-LAST:event_electionsMouseClicked

    private void electionspicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electionspicMouseClicked
        setPanel(1, electionspanel);
        setCursor(electionspic);
        ElectorateTab.setSelectedIndex(0);
        ElectorateClassifier.setVisible(true);
        ElectorateClassifier.setEnabled(true);
        ElectorateLabel.setVisible(true);
        BackPanel.setEnabled(false);
        BackPanel.setVisible(false);
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

    private void MayorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MayorButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(1);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);
    }//GEN-LAST:event_MayorButtonMouseClicked

    private void ViceMayorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViceMayorButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(2);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);
    }//GEN-LAST:event_ViceMayorButtonMouseClicked

    private void CongressmanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CongressmanButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(3);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        ElectorateLabel.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);
    }//GEN-LAST:event_CongressmanButtonMouseClicked

    private void CityCouncilorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CityCouncilorButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(4);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        ElectorateLabel.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);
    }//GEN-LAST:event_CityCouncilorButtonMouseClicked

    private void BarangayCaptainButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarangayCaptainButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(5);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        ElectorateLabel.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);
    }//GEN-LAST:event_BarangayCaptainButtonMouseClicked

    private void BarangayCouncilorsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarangayCouncilorsButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(6);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        ElectorateLabel.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);
    }//GEN-LAST:event_BarangayCouncilorsButtonMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(0);
        BackPanel.setEnabled(false);
        BackPanel.setVisible(false);
        ElectorateLabel.setVisible(true);
        ElectorateClassifier.setEnabled(true);
        ElectorateClassifier.setVisible(true);
        ElectorateLabel.setVisible(true);
    }//GEN-LAST:event_BackButtonMouseClicked

    private void SKChairpersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SKChairpersonButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SKChairpersonButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SKButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(7);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        ElectorateLabel.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);
    }//GEN-LAST:event_SKButtonMouseClicked

    private void SKChairpersonButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKChairpersonButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(8);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        ElectorateLabel.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);
    }//GEN-LAST:event_SKChairpersonButtonMouseClicked

    private void SKKagawadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKKagawadButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(9);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        ElectorateLabel.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);
    }//GEN-LAST:event_SKKagawadButtonMouseClicked

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
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BackPanel;
    private javax.swing.JButton BarangayCaptainButton;
    private javax.swing.JPanel BarangayCaptainTab;
    private javax.swing.JPanel BarangayCouncilorTab;
    private javax.swing.JButton BarangayCouncilorsButton;
    private javax.swing.JButton CityCouncilorButton;
    private javax.swing.JPanel CityCouncilorTab;
    private javax.swing.JButton CongressmanButton;
    private javax.swing.JPanel CongressmanTab;
    private javax.swing.JPanel ElectorateButton;
    private javax.swing.JPanel ElectorateClassifier;
    private javax.swing.JLabel ElectorateLabel;
    private javax.swing.JTabbedPane ElectorateTab;
    private javax.swing.JLabel ID;
    private javax.swing.JPanel INDEX0;
    private javax.swing.JPanel INDEX1;
    private javax.swing.JPanel INDEX2;
    private javax.swing.JPanel INDEX3;
    private javax.swing.JPanel LOGOUT;
    private javax.swing.JButton MayorButton;
    private javax.swing.JPanel MayorTab;
    private javax.swing.JLabel PROFILE;
    private javax.swing.JButton SKButton;
    private javax.swing.JButton SKChairpersonButton;
    private javax.swing.JPanel SKChairpersonTab;
    private javax.swing.JButton SKKagawadButton;
    private javax.swing.JPanel SKKagawadTab;
    private javax.swing.JPanel SKTab;
    private javax.swing.JButton ViceMayorButton;
    private javax.swing.JPanel ViceMayorTab;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel results;
    private javax.swing.JPanel resultspanel;
    private javax.swing.JLabel resultspic;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JLabel settingspic;
    // End of variables declaration//GEN-END:variables

   
}

