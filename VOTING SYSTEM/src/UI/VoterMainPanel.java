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
        OPTIONSTAB.setSelectedIndex(0);
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
        CHART.removeAll();
        CHART.add(barpChartPanel, BorderLayout.CENTER);
        CHART.validate();
        
        
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
        TOOLBAR = new javax.swing.JPanel();
        EXIT = new javax.swing.JLabel();
        MINIMIZE = new javax.swing.JLabel();
        OPTIONSTAB = new javax.swing.JTabbedPane();
        INDEX0 = new javax.swing.JPanel();
        DATETIME = new javax.swing.JPanel();
        dateTime = new javax.swing.JLabel();
        DASHBOARDCONTENT = new javax.swing.JPanel();
        ANNOUNCEMENTCONTAINER = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NONVOTED = new javax.swing.JLabel();
        REGISTEREDVOTERS = new javax.swing.JLabel();
        VOTED = new javax.swing.JLabel();
        USERIMAGE = new javax.swing.JLabel();
        USERIMAGE1 = new javax.swing.JLabel();
        USERIMAGE2 = new javax.swing.JLabel();
        CHART = new javax.swing.JPanel();
        VOTINGSYSTEM = new javax.swing.JLabel();
        STATISTICSLABEL = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
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
        SETTINGSTAB = new javax.swing.JTabbedPane();
        MAIN = new javax.swing.JPanel();
        CONTAINER1 = new javax.swing.JPanel();
        SecurityPanel = new javax.swing.JPanel();
        SECURITYICON = new javax.swing.JLabel();
        SECURITYLABEL = new javax.swing.JLabel();
        AccountInformation = new javax.swing.JPanel();
        INFORMATION = new javax.swing.JLabel();
        ACCOUNTINFORMATIONICON = new javax.swing.JLabel();
        ACCOUNT = new javax.swing.JLabel();
        PrivacyAndPolicy = new javax.swing.JPanel();
        PRIVACYANDPOLICYARROW = new javax.swing.JLabel();
        PRIVACYNPOLICYLABEL = new javax.swing.JLabel();
        PRIVACYNPOLICYICON = new javax.swing.JLabel();
        Feedback = new javax.swing.JPanel();
        FEEDBACKLABEL = new javax.swing.JLabel();
        FEEDBACKICON = new javax.swing.JLabel();
        FEEDBACKARROW = new javax.swing.JLabel();
        SECURITY = new javax.swing.JPanel();
        CHANGEPASSWORDPANEL = new javax.swing.JPanel();
        LABEL1 = new javax.swing.JLabel();
        CURRPASSWORDTEXTFIELD = new javax.swing.JTextField();
        NEWPASSWORDLABEL = new javax.swing.JLabel();
        NEWPASSWORDTEXTFIELD = new javax.swing.JTextField();
        CONFIRMPASSWORDLABEL = new javax.swing.JLabel();
        CONFIRMPASSWORDTEXTFIELD = new javax.swing.JTextField();
        CHANGEPASSCONFIRMBUTTON = new javax.swing.JButton();
        CHANGEPASSPANEL1 = new javax.swing.JPanel();
        CHANGEPASSWORDLABEL = new javax.swing.JLabel();
        CHANGESECUPANEL1 = new javax.swing.JPanel();
        CHANGESECURITYQUESTIONLABEL = new javax.swing.JLabel();
        BACKBUTTON = new javax.swing.JLabel();
        ACCOUNTINFORMATION = new javax.swing.JPanel();
        HORIZONTALSEPARATOR = new javax.swing.JLabel();
        PERSONALINFORMATIONLABEL = new javax.swing.JLabel();
        SEPARATORLINE1 = new javax.swing.JPanel();
        PERSONALINFORMATIONCONTAINER = new javax.swing.JPanel();
        FULLNAMELABEL = new javax.swing.JLabel();
        BIRTHDATELABEL = new javax.swing.JLabel();
        GENDERLABEL = new javax.swing.JLabel();
        EMAILADDRESSLABEL = new javax.swing.JLabel();
        CITIZENSHIPLABEL = new javax.swing.JLabel();
        CIVILSTATUSLABEL = new javax.swing.JLabel();
        BACKBUTTON2 = new javax.swing.JLabel();
        PRIVACYANDPOLICY = new javax.swing.JPanel();
        BACKBUTTON1 = new javax.swing.JLabel();
        PRIVACYANDPOLICYCONTENTPANE = new javax.swing.JScrollPane();
        CONTENT = new javax.swing.JTextPane();
        PRIVACYANDPOLICYHEADER = new javax.swing.JPanel();
        AEMTRAICON = new javax.swing.JLabel();
        PRIVACYANDPOLICYLABEL = new javax.swing.JLabel();
        PRIVACYANDPOLICYBACKGROUND = new javax.swing.JLabel();
        FEEDBACK = new javax.swing.JPanel();
        BACKBUTTON3 = new javax.swing.JLabel();
        FEEDBACKPANEL = new javax.swing.JPanel();
        FEEDBACKHEADER = new javax.swing.JLabel();
        FEEDBACKSUBHEADER2 = new javax.swing.JLabel();
        FEEDBACKSUBHEADER1 = new javax.swing.JLabel();
        NAMETEXTFIELD1 = new javax.swing.JTextField();
        EMAILTEXTFIELD = new javax.swing.JTextField();
        MESSAGE = new javax.swing.JScrollPane();
        MESSAGEPANEL = new javax.swing.JTextArea();
        SENDFEEDBACKBUTTON = new javax.swing.JButton();
        FEEDBACKHORIZONTALSEPARATOR = new javax.swing.JPanel();
        FEEDBACKPANELBACKGROUND = new javax.swing.JLabel();
        CHANGESECURITY = new javax.swing.JPanel();
        CHANGEPASSWORDPANEL2 = new javax.swing.JPanel();
        CHANGEPASSWORDLABEL2 = new javax.swing.JLabel();
        CHANGESECURITYQUESTIONPANEL2 = new javax.swing.JPanel();
        CHANGESECURITYQUESTIONLABEL2 = new javax.swing.JLabel();
        CHANGESECURITYPANEL = new javax.swing.JPanel();
        NEWSECURITYQUESTIONLABEL = new javax.swing.JLabel();
        NEWSECURITYQUESTIONCOMBOBOX = new javax.swing.JComboBox<>();
        CHANGESECURITYQUESTIONCONFIRMBUTTON = new javax.swing.JButton();
        NEWANSWERTEXTFIELD = new javax.swing.JTextField();
        BACKBUTTON4 = new javax.swing.JLabel();
        OPTIONS = new javax.swing.JPanel();
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
        SEPARATOR = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TOOLBAR.setBackground(new java.awt.Color(25, 18, 211));
        TOOLBAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TOOLBAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        TOOLBAR.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 30, 30));

        MINIMIZE.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        MINIMIZE.setForeground(new java.awt.Color(255, 255, 255));
        MINIMIZE.setText("—");
        MINIMIZE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MINIMIZE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINIMIZEMouseClicked(evt);
            }
        });
        TOOLBAR.add(MINIMIZE, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, -1));

        getContentPane().add(TOOLBAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1060, 50));

        INDEX0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DATETIME.setBackground(new java.awt.Color(255, 255, 255));
        DATETIME.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateTime.setBackground(new java.awt.Color(0, 0, 0));
        dateTime.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        dateTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateTime.setText("DateTime");
        DATETIME.add(dateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 40));

        INDEX0.add(DATETIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 40));

        DASHBOARDCONTENT.setBackground(new java.awt.Color(255, 255, 255));
        DASHBOARDCONTENT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DASHBOARDCONTENT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ANNOUNCEMENTCONTAINER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to AEMTRA Corps. Voting System! \nWe're thrilled to have you join our community dedicated to empowering your voice.  \n\nYour Platform for Influence\n\nVoting System is more than just an app; it's your platform to make a difference. \nWhether you're passionate about local issues, national policies, \nor global initiatives, your voice matters here. \n\nWhy Choose Voting System? \n\n      Accessibility: Exercise your right to vote anytime, anywhere. \n      Transparency: Stay informed with clear, concise information about candidates, \n                                propositions, and more. \n      Community: Connect with like-minded individuals and engage in meaningful \n                              discussions about the issues that matter most to you. \n      Impact: Your vote has the power to shape the future. \n\nTogether, we can drive positive change. \n\nGet Started Today! \n\nJoin us in shaping tomorrow by logging in or signing up now. \nTogether, let's amplify your voice and create a brighter future for all. \n\nThank you for choosing Voting System!");
        jTextArea1.setToolTipText("");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        ANNOUNCEMENTCONTAINER.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 49, 570, 510));

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

        ANNOUNCEMENTCONTAINER.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        DASHBOARDCONTENT.add(ANNOUNCEMENTCONTAINER, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 580, -1));

        NONVOTED.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NONVOTED.setText("Voters who haven't voted: ");
        DASHBOARDCONTENT.add(NONVOTED, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 230, 30));

        REGISTEREDVOTERS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        REGISTEREDVOTERS.setText("Registered Voters:");
        DASHBOARDCONTENT.add(REGISTEREDVOTERS, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 170, 30));

        VOTED.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        VOTED.setText("Voters who have voted: ");
        DASHBOARDCONTENT.add(VOTED, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 230, 30));

        USERIMAGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK USER.png"))); // NOI18N
        DASHBOARDCONTENT.add(USERIMAGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 30, -1));

        USERIMAGE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK USER.png"))); // NOI18N
        DASHBOARDCONTENT.add(USERIMAGE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 30, -1));

        USERIMAGE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLACK USER.png"))); // NOI18N
        DASHBOARDCONTENT.add(USERIMAGE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 30, -1));

        CHART.setLayout(new java.awt.BorderLayout());
        DASHBOARDCONTENT.add(CHART, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 420, 310));

        VOTINGSYSTEM.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        VOTINGSYSTEM.setText("VOTING SYSTEM");
        DASHBOARDCONTENT.add(VOTINGSYSTEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        STATISTICSLABEL.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        STATISTICSLABEL.setText("VOTERS' STATISTICS");
        DASHBOARDCONTENT.add(STATISTICSLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ADMIN PORTAL.png"))); // NOI18N
        DASHBOARDCONTENT.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 120, 110));

        INDEX0.add(DASHBOARDCONTENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1050, 600));

        OPTIONSTAB.addTab("", INDEX0);

        INDEX1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ElectorateClassifier.setBackground(new java.awt.Color(0, 0, 0));

        SKButton.setBackground(new java.awt.Color(255, 204, 0));
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
        BackPanel.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 30));

        INDEX1.add(BackPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 50));

        MayorButton.setBackground(new java.awt.Color(0, 0, 102));
        MayorButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        MayorButton.setText("Mayor");

        ViceMayorButton.setBackground(new java.awt.Color(0, 0, 102));
        ViceMayorButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ViceMayorButton.setText("Vice Mayor");

        CongressmanButton.setBackground(new java.awt.Color(0, 0, 102));
        CongressmanButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CongressmanButton.setText("Congressman");

        CityCouncilorButton.setBackground(new java.awt.Color(0, 0, 102));
        CityCouncilorButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CityCouncilorButton.setText("City Councilors");

        BarangayCaptainButton.setBackground(new java.awt.Color(0, 0, 102));
        BarangayCaptainButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BarangayCaptainButton.setText("Barangay Captain");

        BarangayCouncilorsButton.setBackground(new java.awt.Color(0, 0, 102));
        BarangayCouncilorsButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BarangayCouncilorsButton.setText("Barangay Councilors");

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
        SKChairpersonButton.setText("SK Chairperson");
        SKTab.add(SKChairpersonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 377, 207));

        SKKagawadButton.setBackground(new java.awt.Color(255, 204, 0));
        SKKagawadButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        SKKagawadButton.setText("SK Kagawad");
        SKTab.add(SKKagawadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 377, 207));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
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

        OPTIONSTAB.addTab("", INDEX1);

        INDEX2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("FORM 3");
        INDEX2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 298, -1, -1));

        OPTIONSTAB.addTab("", INDEX2);

        INDEX3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MAIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CONTAINER1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        SECURITYLABEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SECURITYLABELMouseClicked(evt);
            }
        });
        SecurityPanel.add(SECURITYLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 100));

        CONTAINER1.add(SecurityPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 260, 210));

        AccountInformation.setBackground(new java.awt.Color(255, 255, 255));
        AccountInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountInformationMouseClicked(evt);
            }
        });
        AccountInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        INFORMATION.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        INFORMATION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        INFORMATION.setText("INFORMATION");
        INFORMATION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INFORMATIONMouseClicked(evt);
            }
        });
        AccountInformation.add(INFORMATION, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, 60));

        ACCOUNTINFORMATIONICON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ACCOUNTINFORMATIONICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ACCOUNTINFORMATION.png"))); // NOI18N
        ACCOUNTINFORMATIONICON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACCOUNTINFORMATIONICONMouseClicked(evt);
            }
        });
        AccountInformation.add(ACCOUNTINFORMATIONICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 6, 260, 140));

        ACCOUNT.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        ACCOUNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ACCOUNT.setText("ACCOUNT");
        ACCOUNT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACCOUNTMouseClicked(evt);
            }
        });
        AccountInformation.add(ACCOUNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 260, 120));

        CONTAINER1.add(AccountInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 260, 210));

        MAIN.add(CONTAINER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 290));

        PrivacyAndPolicy.setBackground(new java.awt.Color(255, 255, 255));
        PrivacyAndPolicy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrivacyAndPolicyMouseClicked(evt);
            }
        });
        PrivacyAndPolicy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRIVACYANDPOLICYARROW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRIVACYANDPOLICYARROW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ARROW.png"))); // NOI18N
        PRIVACYANDPOLICYARROW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRIVACYANDPOLICYARROWMouseClicked(evt);
            }
        });
        PrivacyAndPolicy.add(PRIVACYANDPOLICYARROW, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 0, -1, 80));

        PRIVACYNPOLICYLABEL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PRIVACYNPOLICYLABEL.setText("PRIVACY AND POLICY");
        PrivacyAndPolicy.add(PRIVACYNPOLICYLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 0, 308, 80));

        PRIVACYNPOLICYICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/PRIVACY.png"))); // NOI18N
        PrivacyAndPolicy.add(PRIVACYNPOLICYICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, 80));

        MAIN.add(PrivacyAndPolicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 800, 80));

        Feedback.setBackground(new java.awt.Color(255, 255, 255));
        Feedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeedbackMouseClicked(evt);
            }
        });

        FEEDBACKLABEL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        FEEDBACKLABEL.setText("HOW CAN WE IMPROVE?");

        FEEDBACKICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FEEDBACK.png"))); // NOI18N

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
                .addComponent(FEEDBACKICON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FEEDBACKLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addComponent(FEEDBACKARROW)
                .addGap(18, 18, 18))
        );
        FeedbackLayout.setVerticalGroup(
            FeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FEEDBACKICON, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(FEEDBACKLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(FEEDBACKARROW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MAIN.add(Feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 800, 80));

        SETTINGSTAB.addTab("tab1", MAIN);

        SECURITY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CHANGEPASSWORDPANEL.setBackground(new java.awt.Color(255, 255, 255));
        CHANGEPASSWORDPANEL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CHANGEPASSWORDPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LABEL1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LABEL1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LABEL1.setText("CURRENT PASSWORD");
        CHANGEPASSWORDPANEL.add(LABEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 260, 30));
        CHANGEPASSWORDPANEL.add(CURRPASSWORDTEXTFIELD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 260, 40));

        NEWPASSWORDLABEL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NEWPASSWORDLABEL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NEWPASSWORDLABEL.setText("NEW PASSWORD");
        CHANGEPASSWORDPANEL.add(NEWPASSWORDLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 260, 20));
        CHANGEPASSWORDPANEL.add(NEWPASSWORDTEXTFIELD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 260, 40));

        CONFIRMPASSWORDLABEL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CONFIRMPASSWORDLABEL.setText("CONFIRM PASSWORD");
        CHANGEPASSWORDPANEL.add(CONFIRMPASSWORDLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 260, 30));
        CHANGEPASSWORDPANEL.add(CONFIRMPASSWORDTEXTFIELD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 260, 40));

        CHANGEPASSCONFIRMBUTTON.setBackground(new java.awt.Color(25, 18, 211));
        CHANGEPASSCONFIRMBUTTON.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CHANGEPASSCONFIRMBUTTON.setForeground(new java.awt.Color(255, 255, 255));
        CHANGEPASSCONFIRMBUTTON.setText("CONFIRM");
        CHANGEPASSWORDPANEL.add(CHANGEPASSCONFIRMBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 130, 40));

        SECURITY.add(CHANGEPASSWORDPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 900, 490));

        CHANGEPASSPANEL1.setBackground(new java.awt.Color(51, 51, 255));
        CHANGEPASSPANEL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CHANGEPASSPANEL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHANGEPASSPANEL1MouseClicked(evt);
            }
        });
        CHANGEPASSPANEL1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CHANGEPASSWORDLABEL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CHANGEPASSWORDLABEL.setForeground(new java.awt.Color(255, 255, 255));
        CHANGEPASSWORDLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CHANGEPASSWORDLABEL.setText("CHANGE PASSWORD");
        CHANGEPASSPANEL1.add(CHANGEPASSWORDLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 80));

        SECURITY.add(CHANGEPASSPANEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 450, 80));

        CHANGESECUPANEL1.setBackground(new java.awt.Color(0, 0, 102));
        CHANGESECUPANEL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CHANGESECUPANEL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHANGESECUPANEL1MouseClicked(evt);
            }
        });
        CHANGESECUPANEL1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CHANGESECURITYQUESTIONLABEL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CHANGESECURITYQUESTIONLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CHANGESECURITYQUESTIONLABEL.setText("CHANGE SECURITY QUESTION");
        CHANGESECUPANEL1.add(CHANGESECURITYQUESTIONLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 448, 78));

        SECURITY.add(CHANGESECUPANEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 450, 80));

        BACKBUTTON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BACKBUTTON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BACKBUTTON.setText("BACK");
        BACKBUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKBUTTONMouseClicked(evt);
            }
        });
        SECURITY.add(BACKBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 120, 40));

        SETTINGSTAB.addTab("tab2", SECURITY);

        ACCOUNTINFORMATION.setBackground(new java.awt.Color(255, 255, 255));
        ACCOUNTINFORMATION.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HORIZONTALSEPARATOR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        HORIZONTALSEPARATOR.setText("_____________________________________________________________________________________________________________________________________________");
        ACCOUNTINFORMATION.add(HORIZONTALSEPARATOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 1000, -1));

        PERSONALINFORMATIONLABEL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PERSONALINFORMATIONLABEL.setText("PERSONAL INFORMATION");
        ACCOUNTINFORMATION.add(PERSONALINFORMATIONLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 200, -1));

        SEPARATORLINE1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout SEPARATORLINE1Layout = new javax.swing.GroupLayout(SEPARATORLINE1);
        SEPARATORLINE1.setLayout(SEPARATORLINE1Layout);
        SEPARATORLINE1Layout.setHorizontalGroup(
            SEPARATORLINE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        SEPARATORLINE1Layout.setVerticalGroup(
            SEPARATORLINE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        ACCOUNTINFORMATION.add(SEPARATORLINE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 3, 400));

        PERSONALINFORMATIONCONTAINER.setBackground(new java.awt.Color(255, 255, 255));

        FULLNAMELABEL.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        FULLNAMELABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FULLNAMELABEL.setText("FULL NAME:");

        BIRTHDATELABEL.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        BIRTHDATELABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BIRTHDATELABEL.setText("BIRTHDATE:");

        GENDERLABEL.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        GENDERLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GENDERLABEL.setText("GENDER:");

        EMAILADDRESSLABEL.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        EMAILADDRESSLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EMAILADDRESSLABEL.setText("EMAIL ADDRESS:");

        CITIZENSHIPLABEL.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        CITIZENSHIPLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CITIZENSHIPLABEL.setText("CITIZENSHIP:");

        CIVILSTATUSLABEL.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        CIVILSTATUSLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CIVILSTATUSLABEL.setText("CIVIL STATUS:");

        javax.swing.GroupLayout PERSONALINFORMATIONCONTAINERLayout = new javax.swing.GroupLayout(PERSONALINFORMATIONCONTAINER);
        PERSONALINFORMATIONCONTAINER.setLayout(PERSONALINFORMATIONCONTAINERLayout);
        PERSONALINFORMATIONCONTAINERLayout.setHorizontalGroup(
            PERSONALINFORMATIONCONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BIRTHDATELABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FULLNAMELABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GENDERLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EMAILADDRESSLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
            .addComponent(CITIZENSHIPLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CIVILSTATUSLABEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PERSONALINFORMATIONCONTAINERLayout.setVerticalGroup(
            PERSONALINFORMATIONCONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PERSONALINFORMATIONCONTAINERLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(FULLNAMELABEL)
                .addGap(18, 18, 18)
                .addComponent(BIRTHDATELABEL)
                .addGap(18, 18, 18)
                .addComponent(GENDERLABEL)
                .addGap(18, 18, 18)
                .addComponent(EMAILADDRESSLABEL)
                .addGap(18, 18, 18)
                .addComponent(CITIZENSHIPLABEL)
                .addGap(18, 18, 18)
                .addComponent(CIVILSTATUSLABEL)
                .addContainerGap())
        );

        ACCOUNTINFORMATION.add(PERSONALINFORMATIONCONTAINER, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 310, 350));

        BACKBUTTON2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BACKBUTTON2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BACKBUTTON2.setText("BACK");
        BACKBUTTON2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKBUTTON2MouseClicked(evt);
            }
        });
        ACCOUNTINFORMATION.add(BACKBUTTON2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 100, -1));

        SETTINGSTAB.addTab("tab3", ACCOUNTINFORMATION);

        PRIVACYANDPOLICY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACKBUTTON1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BACKBUTTON1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BACKBUTTON1.setText("BACK");
        BACKBUTTON1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKBUTTON1MouseClicked(evt);
            }
        });
        PRIVACYANDPOLICY.add(BACKBUTTON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 120, 50));

        PRIVACYANDPOLICYCONTENTPANE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CONTENT.setEditable(false);
        CONTENT.setBorder(null);
        CONTENT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CONTENT.setText("At AEMTRA, we are committed to protecting the privacy of our users. This Privacy Policy outlines the types of personal information we collect, how we use it, and how we safeguard it.\n\nInformation We Collect:\n\n1. Voter Information: When users participate in our voting poll, we collect limited personal information such as name and email address to ensure the integrity of the voting process. We do not collect any sensitive personal information such as social security numbers or financial data.\n\n2. Voting Data: We collect data related to votes cast in the poll, including the choices made by users. This data is anonymized and aggregated to analyze overall trends and results.\n\nUse of Information:\n\n1. Ensuring One Vote Per Person: We use the collected voter information to verify the identity of users and prevent multiple votes from the same individual. This helps maintain the integrity and fairness of the voting process.\n\n2. Communications: We may use the provided email address to communicate with users regarding their participation in the voting poll, such as confirmation of their vote or updates about the poll results.\n\n3. Improving Our Services: Aggregated voting data may be analyzed to improve our services, enhance the user experience, and make informed decisions for future projects.\n\nData Security:\n\n1. Secure Storage: We employ industry-standard security measures to protect the personal information and voting data collected through our platform. This includes encryption, access controls, and regular security audits.\n\n2. Limited Access: Access to personal information and voting data is restricted to authorized personnel who require it to perform their duties. We do not sell, rent, or share personal information with third parties for marketing purposes.\n\nUser Rights:\n\n1. Access and Correction: Users have the right to access their personal information and request corrections if necessary. They can contact us at [contact email] to exercise these rights.\n\n2. Data Deletion: Users can request the deletion of their personal information from our systems by contacting us at aemtracorps@gmail.com. However, please note that this may result in the inability to verify their identity for future voting polls.\n\nChanges to this Privacy Policy:\n\nWe reserve the right to update this Privacy Policy from time to time to reflect changes in our practices or applicable laws. We encourage users to review this policy periodically for any updates.\n\nContact Us:\n\nIf you have any questions or concerns about this Privacy Policy or our data practices, please contact us at aemtracorps@gmail.com.");
        CONTENT.setToolTipText("");
        CONTENT.setCaretPosition(1);
        CONTENT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PRIVACYANDPOLICYCONTENTPANE.setViewportView(CONTENT);

        PRIVACYANDPOLICY.add(PRIVACYANDPOLICYCONTENTPANE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 960, 500));

        PRIVACYANDPOLICYHEADER.setBackground(new java.awt.Color(153, 255, 255));
        PRIVACYANDPOLICYHEADER.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PRIVACYANDPOLICYHEADER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AEMTRAICON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AEMTRAICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ADMIN PORTAL.png"))); // NOI18N
        PRIVACYANDPOLICYHEADER.add(AEMTRAICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 150));

        PRIVACYANDPOLICYLABEL.setBackground(new java.awt.Color(255, 255, 255));
        PRIVACYANDPOLICYLABEL.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        PRIVACYANDPOLICYLABEL.setForeground(new java.awt.Color(255, 255, 255));
        PRIVACYANDPOLICYLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRIVACYANDPOLICYLABEL.setText("PRIVACY AND POLICY");
        PRIVACYANDPOLICYHEADER.add(PRIVACYANDPOLICYLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1060, 150));

        PRIVACYANDPOLICYBACKGROUND.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRIVACYANDPOLICYBACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLUEWALL.jpg"))); // NOI18N
        PRIVACYANDPOLICYBACKGROUND.setText("jLabel32");
        PRIVACYANDPOLICYHEADER.add(PRIVACYANDPOLICYBACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 160));

        PRIVACYANDPOLICY.add(PRIVACYANDPOLICYHEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1070, 160));

        SETTINGSTAB.addTab("tab4", PRIVACYANDPOLICY);

        FEEDBACK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BACKBUTTON3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BACKBUTTON3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BACKBUTTON3.setText("BACK");
        BACKBUTTON3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKBUTTON3MouseClicked(evt);
            }
        });
        FEEDBACK.add(BACKBUTTON3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 130, 50));

        FEEDBACKPANEL.setBackground(new java.awt.Color(255, 255, 255));
        FEEDBACKPANEL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        FEEDBACKPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FEEDBACKHEADER.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        FEEDBACKHEADER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FEEDBACKHEADER.setText("FEEDBACK");
        FEEDBACKPANEL.add(FEEDBACKHEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 480, 80));

        FEEDBACKSUBHEADER2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        FEEDBACKSUBHEADER2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FEEDBACKSUBHEADER2.setText("system, so we'd love to hear your feedback.");
        FEEDBACKPANEL.add(FEEDBACKSUBHEADER2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 350, -1));

        FEEDBACKSUBHEADER1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        FEEDBACKSUBHEADER1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FEEDBACKSUBHEADER1.setText("We would love to know your thought of your experience at voting");
        FEEDBACKPANEL.add(FEEDBACKSUBHEADER1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 350, -1));

        NAMETEXTFIELD1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NAMETEXTFIELD1.setForeground(new java.awt.Color(204, 204, 204));
        NAMETEXTFIELD1.setText("NAME");
        NAMETEXTFIELD1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NAMETEXTFIELD1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NAMETEXTFIELD1FocusLost(evt);
            }
        });
        NAMETEXTFIELD1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                NAMETEXTFIELD1ComponentShown(evt);
            }
        });
        FEEDBACKPANEL.add(NAMETEXTFIELD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 400, 30));

        EMAILTEXTFIELD.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        EMAILTEXTFIELD.setForeground(new java.awt.Color(204, 204, 204));
        EMAILTEXTFIELD.setText("EMAIL");
        EMAILTEXTFIELD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EMAILTEXTFIELDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EMAILTEXTFIELDFocusLost(evt);
            }
        });
        FEEDBACKPANEL.add(EMAILTEXTFIELD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 400, 30));

        MESSAGE.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        MESSAGE.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        MESSAGE.setHorizontalScrollBar(null);

        MESSAGEPANEL.setColumns(20);
        MESSAGEPANEL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MESSAGEPANEL.setForeground(new java.awt.Color(204, 204, 204));
        MESSAGEPANEL.setRows(5);
        MESSAGEPANEL.setText("WRITE A MESSAGE...");
        MESSAGEPANEL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MESSAGEPANELFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MESSAGEPANELFocusLost(evt);
            }
        });
        MESSAGE.setViewportView(MESSAGEPANEL);

        FEEDBACKPANEL.add(MESSAGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 400, 120));

        SENDFEEDBACKBUTTON.setBackground(new java.awt.Color(0, 255, 51));
        SENDFEEDBACKBUTTON.setText("SEND FEEDBACK");
        SENDFEEDBACKBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENDFEEDBACKBUTTONActionPerformed(evt);
            }
        });
        FEEDBACKPANEL.add(SENDFEEDBACKBUTTON, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 170, 50));

        FEEDBACKHORIZONTALSEPARATOR.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout FEEDBACKHORIZONTALSEPARATORLayout = new javax.swing.GroupLayout(FEEDBACKHORIZONTALSEPARATOR);
        FEEDBACKHORIZONTALSEPARATOR.setLayout(FEEDBACKHORIZONTALSEPARATORLayout);
        FEEDBACKHORIZONTALSEPARATORLayout.setHorizontalGroup(
            FEEDBACKHORIZONTALSEPARATORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        FEEDBACKHORIZONTALSEPARATORLayout.setVerticalGroup(
            FEEDBACKHORIZONTALSEPARATORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        FEEDBACKPANEL.add(FEEDBACKHORIZONTALSEPARATOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 420, 2));

        FEEDBACK.add(FEEDBACKPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 480, 510));

        FEEDBACKPANELBACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BLUEBG (3).jpg"))); // NOI18N
        FEEDBACK.add(FEEDBACKPANELBACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1060, 670));

        SETTINGSTAB.addTab("tab5", FEEDBACK);

        CHANGESECURITY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CHANGEPASSWORDPANEL2.setBackground(new java.awt.Color(0, 0, 102));
        CHANGEPASSWORDPANEL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CHANGEPASSWORDPANEL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CHANGEPASSWORDPANEL2MouseClicked(evt);
            }
        });
        CHANGEPASSWORDPANEL2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CHANGEPASSWORDLABEL2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CHANGEPASSWORDLABEL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CHANGEPASSWORDLABEL2.setText("CHANGE PASSWORD");
        CHANGEPASSWORDPANEL2.add(CHANGEPASSWORDLABEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 78));

        CHANGESECURITY.add(CHANGEPASSWORDPANEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 450, 80));

        CHANGESECURITYQUESTIONPANEL2.setBackground(new java.awt.Color(51, 51, 255));
        CHANGESECURITYQUESTIONPANEL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CHANGESECURITYQUESTIONLABEL2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CHANGESECURITYQUESTIONLABEL2.setForeground(new java.awt.Color(255, 255, 255));
        CHANGESECURITYQUESTIONLABEL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CHANGESECURITYQUESTIONLABEL2.setText("CHANGE SECURITY QUESTION");

        javax.swing.GroupLayout CHANGESECURITYQUESTIONPANEL2Layout = new javax.swing.GroupLayout(CHANGESECURITYQUESTIONPANEL2);
        CHANGESECURITYQUESTIONPANEL2.setLayout(CHANGESECURITYQUESTIONPANEL2Layout);
        CHANGESECURITYQUESTIONPANEL2Layout.setHorizontalGroup(
            CHANGESECURITYQUESTIONPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CHANGESECURITYQUESTIONPANEL2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CHANGESECURITYQUESTIONLABEL2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        CHANGESECURITYQUESTIONPANEL2Layout.setVerticalGroup(
            CHANGESECURITYQUESTIONPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CHANGESECURITYQUESTIONPANEL2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CHANGESECURITYQUESTIONLABEL2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        CHANGESECURITY.add(CHANGESECURITYQUESTIONPANEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 450, 80));

        CHANGESECURITYPANEL.setBackground(new java.awt.Color(255, 255, 255));
        CHANGESECURITYPANEL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NEWSECURITYQUESTIONLABEL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NEWSECURITYQUESTIONLABEL.setText("NEW SECURITY QUESTION");

        NEWSECURITYQUESTIONCOMBOBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In what city were you born?", "What is your mother's maiden name?", "What high school did you attend?", "What is your favorite movie?", "What is the middle name of your youngest child?", "What was your favorite sport in high school?", "Where were you when you had your first kiss?", "What was the house number and street name you lived in as a child?", "What are the last five digits of your driver's license number?" }));

        CHANGESECURITYQUESTIONCONFIRMBUTTON.setBackground(new java.awt.Color(25, 18, 211));
        CHANGESECURITYQUESTIONCONFIRMBUTTON.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CHANGESECURITYQUESTIONCONFIRMBUTTON.setForeground(new java.awt.Color(255, 255, 255));
        CHANGESECURITYQUESTIONCONFIRMBUTTON.setText("CONFIRM");

        NEWANSWERTEXTFIELD.setText("Write your answer here...");
        NEWANSWERTEXTFIELD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NEWANSWERTEXTFIELDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NEWANSWERTEXTFIELDFocusLost(evt);
            }
        });

        javax.swing.GroupLayout CHANGESECURITYPANELLayout = new javax.swing.GroupLayout(CHANGESECURITYPANEL);
        CHANGESECURITYPANEL.setLayout(CHANGESECURITYPANELLayout);
        CHANGESECURITYPANELLayout.setHorizontalGroup(
            CHANGESECURITYPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CHANGESECURITYPANELLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CHANGESECURITYQUESTIONCONFIRMBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(CHANGESECURITYPANELLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(CHANGESECURITYPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NEWSECURITYQUESTIONLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NEWSECURITYQUESTIONCOMBOBOX, 0, 465, Short.MAX_VALUE)
                    .addComponent(NEWANSWERTEXTFIELD))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        CHANGESECURITYPANELLayout.setVerticalGroup(
            CHANGESECURITYPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CHANGESECURITYPANELLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(NEWSECURITYQUESTIONLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NEWSECURITYQUESTIONCOMBOBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(NEWANSWERTEXTFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(CHANGESECURITYQUESTIONCONFIRMBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        CHANGESECURITY.add(CHANGESECURITYPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 900, 490));

        BACKBUTTON4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BACKBUTTON4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BACKBUTTON4.setText("BACK");
        BACKBUTTON4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKBUTTON4MouseClicked(evt);
            }
        });
        CHANGESECURITY.add(BACKBUTTON4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 120, 40));

        SETTINGSTAB.addTab("tab7", CHANGESECURITY);

        INDEX3.add(SETTINGSTAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1050, 680));

        OPTIONSTAB.addTab("", INDEX3);

        getContentPane().add(OPTIONSTAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 1050, 680));

        OPTIONS.setBackground(new java.awt.Color(255, 255, 255));
        OPTIONS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OPTIONS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PROFILE.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        OPTIONS.add(PROFILE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 30));

        ID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ID.setText("View your profile ->");
        ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDMouseClicked(evt);
            }
        });
        OPTIONS.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, 30));

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

        OPTIONS.add(dashboardpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 90));

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

        OPTIONS.add(electionspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 170, 90));

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

        OPTIONS.add(resultspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 170, 90));

        settingspanel.setBackground(new java.awt.Color(255, 255, 255));
        settingspanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingspanelMouseClicked(evt);
            }
        });
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

        OPTIONS.add(settingspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 170, 90));

        SEPARATOR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SEPARATOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEPARATOR.setText("________________________");
        OPTIONS.add(SEPARATOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 190, -1));

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

        OPTIONS.add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 150, 40));

        getContentPane().add(OPTIONS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 700));

        setSize(new java.awt.Dimension(1240, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        System.exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    private void MINIMIZEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZEMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_MINIMIZEMouseClicked

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
        SETTINGSTAB.setSelectedIndex(0);
    }//GEN-LAST:event_settingspicMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        setPanel(3, settingspanel);
        setCursor(settings);
        SETTINGSTAB.setSelectedIndex(0);
    }//GEN-LAST:event_settingsMouseClicked

    private void IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_IDMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked

    }//GEN-LAST:event_logoutMouseClicked

    private void SECURITYICONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SECURITYICONMouseClicked
            SETTINGSTAB.setSelectedIndex(1);
    }//GEN-LAST:event_SECURITYICONMouseClicked

    private void ACCOUNTINFORMATIONICONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNTINFORMATIONICONMouseClicked
        SETTINGSTAB.setSelectedIndex(2);
    }//GEN-LAST:event_ACCOUNTINFORMATIONICONMouseClicked

    private void PRIVACYANDPOLICYARROWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRIVACYANDPOLICYARROWMouseClicked
        SETTINGSTAB.setSelectedIndex(3);   
    }//GEN-LAST:event_PRIVACYANDPOLICYARROWMouseClicked

    private void FEEDBACKARROWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FEEDBACKARROWMouseClicked
        SETTINGSTAB.setSelectedIndex(4);
    }//GEN-LAST:event_FEEDBACKARROWMouseClicked

    private void SecurityPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecurityPanelMouseClicked
        SETTINGSTAB.setSelectedIndex(1);
    }//GEN-LAST:event_SecurityPanelMouseClicked

    private void AccountInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountInformationMouseClicked
        SETTINGSTAB.setSelectedIndex(2);
    }//GEN-LAST:event_AccountInformationMouseClicked

    private void PrivacyAndPolicyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrivacyAndPolicyMouseClicked
        SETTINGSTAB.setSelectedIndex(3);
    }//GEN-LAST:event_PrivacyAndPolicyMouseClicked
        
    private void FeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedbackMouseClicked
        SETTINGSTAB.setSelectedIndex(4);
    }//GEN-LAST:event_FeedbackMouseClicked

    private void CHANGEPASSPANEL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHANGEPASSPANEL1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CHANGEPASSPANEL1MouseClicked

    private void CHANGESECUPANEL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHANGESECUPANEL1MouseClicked
        SETTINGSTAB.setSelectedIndex(5);
    }//GEN-LAST:event_CHANGESECUPANEL1MouseClicked

    private void BACKBUTTONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKBUTTONMouseClicked
        SETTINGSTAB.setSelectedIndex(0);
    }//GEN-LAST:event_BACKBUTTONMouseClicked

    private void BACKBUTTON2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKBUTTON2MouseClicked
        SETTINGSTAB.setSelectedIndex(0);
    }//GEN-LAST:event_BACKBUTTON2MouseClicked

    private void BACKBUTTON3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKBUTTON3MouseClicked
        SETTINGSTAB.setSelectedIndex(0);
    }//GEN-LAST:event_BACKBUTTON3MouseClicked

    private void SENDFEEDBACKBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENDFEEDBACKBUTTONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SENDFEEDBACKBUTTONActionPerformed

    private void CHANGEPASSWORDPANEL2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHANGEPASSWORDPANEL2MouseClicked
        SETTINGSTAB.setSelectedIndex(1);
    }//GEN-LAST:event_CHANGEPASSWORDPANEL2MouseClicked

    private void BACKBUTTON4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKBUTTON4MouseClicked
        SETTINGSTAB.setSelectedIndex(0);
    }//GEN-LAST:event_BACKBUTTON4MouseClicked

    private void settingspanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingspanelMouseClicked
            //
    }//GEN-LAST:event_settingspanelMouseClicked

    private void SECURITYLABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SECURITYLABELMouseClicked
        SETTINGSTAB.setSelectedIndex(1);
    }//GEN-LAST:event_SECURITYLABELMouseClicked

    private void INFORMATIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INFORMATIONMouseClicked
        SETTINGSTAB.setSelectedIndex(2);
    }//GEN-LAST:event_INFORMATIONMouseClicked

    private void ACCOUNTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNTMouseClicked
        SETTINGSTAB.setSelectedIndex(2);
    }//GEN-LAST:event_ACCOUNTMouseClicked

    private void BACKBUTTON1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKBUTTON1MouseClicked
        SETTINGSTAB.setSelectedIndex(0);
    }//GEN-LAST:event_BACKBUTTON1MouseClicked

    private void NEWANSWERTEXTFIELDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NEWANSWERTEXTFIELDFocusGained
        if(NEWANSWERTEXTFIELD.getText().equals("Write your answer here...")){
            
            NEWANSWERTEXTFIELD.setText("");
            NEWANSWERTEXTFIELD.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_NEWANSWERTEXTFIELDFocusGained

    private void NEWANSWERTEXTFIELDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NEWANSWERTEXTFIELDFocusLost
        if(NEWANSWERTEXTFIELD.getText().equals("Write your answer here...")){
            
            NEWANSWERTEXTFIELD.setText("");
            NEWANSWERTEXTFIELD.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_NEWANSWERTEXTFIELDFocusLost

    private void NAMETEXTFIELD1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NAMETEXTFIELD1FocusGained
        if(NAMETEXTFIELD1.getText().equals("NAME")){
            NAMETEXTFIELD1.setText("");
            NAMETEXTFIELD1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_NAMETEXTFIELD1FocusGained

    private void NAMETEXTFIELD1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NAMETEXTFIELD1FocusLost
         if(NAMETEXTFIELD1.getText().equals("")){
            NAMETEXTFIELD1.setText("NAME");
            NAMETEXTFIELD1.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_NAMETEXTFIELD1FocusLost

    private void NAMETEXTFIELD1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_NAMETEXTFIELD1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMETEXTFIELD1ComponentShown

    private void EMAILTEXTFIELDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EMAILTEXTFIELDFocusGained
        if(EMAILTEXTFIELD.getText().equals("EMAIL")){
            EMAILTEXTFIELD.setText("");
            EMAILTEXTFIELD.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_EMAILTEXTFIELDFocusGained

    private void EMAILTEXTFIELDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EMAILTEXTFIELDFocusLost
        if(EMAILTEXTFIELD.getText().equals("")){
            EMAILTEXTFIELD.setText("EMAIL");
            EMAILTEXTFIELD.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_EMAILTEXTFIELDFocusLost

    private void MESSAGEPANELFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MESSAGEPANELFocusGained
        if (MESSAGEPANEL.getText().equals("WRITE A MESSAGE..."))
        {
            MESSAGEPANEL.setText("");
            MESSAGEPANEL.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_MESSAGEPANELFocusGained

    private void MESSAGEPANELFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MESSAGEPANELFocusLost
        if (MESSAGEPANEL.getText().equals(""))
        {
            MESSAGEPANEL.setText("WRITE A MESSAGE...");
            MESSAGEPANEL.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_MESSAGEPANELFocusLost

    private void SKButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKButtonMouseClicked
        
    }//GEN-LAST:event_SKButtonMouseClicked

    private void setCursor(JLabel targetLabel) {
       targetLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void setPanel(int index, JPanel targetPanel) {
        //Changes for the target panel
        targetPanel.setBackground(new Color(204, 204, 204));
        OPTIONSTAB.setSelectedIndex(index);

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
    private javax.swing.JLabel ACCOUNT;
    private javax.swing.JPanel ACCOUNTINFORMATION;
    private javax.swing.JLabel ACCOUNTINFORMATIONICON;
    private javax.swing.JLabel AEMTRAICON;
    private javax.swing.JPanel ANNOUNCEMENTCONTAINER;
    private javax.swing.JPanel AccountInformation;
    private javax.swing.JLabel BACKBUTTON;
    private javax.swing.JLabel BACKBUTTON1;
    private javax.swing.JLabel BACKBUTTON2;
    private javax.swing.JLabel BACKBUTTON3;
    private javax.swing.JLabel BACKBUTTON4;
    private javax.swing.JLabel BIRTHDATELABEL;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BackPanel;
    private javax.swing.JButton BarangayCaptainButton;
    private javax.swing.JPanel BarangayCaptainTab;
    private javax.swing.JPanel BarangayCouncilorTab;
    private javax.swing.JButton BarangayCouncilorsButton;
    private javax.swing.JButton CHANGEPASSCONFIRMBUTTON;
    private javax.swing.JPanel CHANGEPASSPANEL1;
    private javax.swing.JLabel CHANGEPASSWORDLABEL;
    private javax.swing.JLabel CHANGEPASSWORDLABEL2;
    private javax.swing.JPanel CHANGEPASSWORDPANEL;
    private javax.swing.JPanel CHANGEPASSWORDPANEL2;
    private javax.swing.JPanel CHANGESECUPANEL1;
    private javax.swing.JPanel CHANGESECURITY;
    private javax.swing.JPanel CHANGESECURITYPANEL;
    private javax.swing.JButton CHANGESECURITYQUESTIONCONFIRMBUTTON;
    private javax.swing.JLabel CHANGESECURITYQUESTIONLABEL;
    private javax.swing.JLabel CHANGESECURITYQUESTIONLABEL2;
    private javax.swing.JPanel CHANGESECURITYQUESTIONPANEL2;
    private javax.swing.JPanel CHART;
    private javax.swing.JLabel CITIZENSHIPLABEL;
    private javax.swing.JLabel CIVILSTATUSLABEL;
    private javax.swing.JLabel CONFIRMPASSWORDLABEL;
    private javax.swing.JTextField CONFIRMPASSWORDTEXTFIELD;
    private javax.swing.JPanel CONTAINER1;
    private javax.swing.JTextPane CONTENT;
    private javax.swing.JTextField CURRPASSWORDTEXTFIELD;
    private javax.swing.JButton CityCouncilorButton;
    private javax.swing.JPanel CityCouncilorTab;
    private javax.swing.JButton CongressmanButton;
    private javax.swing.JPanel CongressmanTab;
    private javax.swing.JPanel DASHBOARDCONTENT;
    private javax.swing.JPanel DATETIME;
    private javax.swing.JLabel EMAILADDRESSLABEL;
    private javax.swing.JTextField EMAILTEXTFIELD;
    private javax.swing.JLabel EXIT;
    private javax.swing.JPanel ElectorateButton;
    private javax.swing.JPanel ElectorateClassifier;
    private javax.swing.JLabel ElectorateLabel;
    private javax.swing.JTabbedPane ElectorateTab;
    private javax.swing.JPanel FEEDBACK;
    private javax.swing.JLabel FEEDBACKARROW;
    private javax.swing.JLabel FEEDBACKHEADER;
    private javax.swing.JPanel FEEDBACKHORIZONTALSEPARATOR;
    private javax.swing.JLabel FEEDBACKICON;
    private javax.swing.JLabel FEEDBACKLABEL;
    private javax.swing.JPanel FEEDBACKPANEL;
    private javax.swing.JLabel FEEDBACKPANELBACKGROUND;
    private javax.swing.JLabel FEEDBACKSUBHEADER1;
    private javax.swing.JLabel FEEDBACKSUBHEADER2;
    private javax.swing.JLabel FULLNAMELABEL;
    private javax.swing.JPanel Feedback;
    private javax.swing.JLabel GENDERLABEL;
    private javax.swing.JLabel HORIZONTALSEPARATOR;
    private javax.swing.JLabel ID;
    private javax.swing.JPanel INDEX0;
    private javax.swing.JPanel INDEX1;
    private javax.swing.JPanel INDEX2;
    private javax.swing.JPanel INDEX3;
    private javax.swing.JLabel INFORMATION;
    private javax.swing.JLabel LABEL1;
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel LOGOUT;
    private javax.swing.JPanel MAIN;
    private javax.swing.JScrollPane MESSAGE;
    private javax.swing.JTextArea MESSAGEPANEL;
    private javax.swing.JLabel MINIMIZE;
    private javax.swing.JButton MayorButton;
    private javax.swing.JPanel MayorTab;
    private javax.swing.JTextField NAMETEXTFIELD1;
    private javax.swing.JTextField NEWANSWERTEXTFIELD;
    private javax.swing.JLabel NEWPASSWORDLABEL;
    private javax.swing.JTextField NEWPASSWORDTEXTFIELD;
    private javax.swing.JComboBox<String> NEWSECURITYQUESTIONCOMBOBOX;
    private javax.swing.JLabel NEWSECURITYQUESTIONLABEL;
    private javax.swing.JLabel NONVOTED;
    private javax.swing.JPanel OPTIONS;
    private javax.swing.JTabbedPane OPTIONSTAB;
    private javax.swing.JPanel PERSONALINFORMATIONCONTAINER;
    private javax.swing.JLabel PERSONALINFORMATIONLABEL;
    private javax.swing.JPanel PRIVACYANDPOLICY;
    private javax.swing.JLabel PRIVACYANDPOLICYARROW;
    private javax.swing.JLabel PRIVACYANDPOLICYBACKGROUND;
    private javax.swing.JScrollPane PRIVACYANDPOLICYCONTENTPANE;
    private javax.swing.JPanel PRIVACYANDPOLICYHEADER;
    private javax.swing.JLabel PRIVACYANDPOLICYLABEL;
    private javax.swing.JLabel PRIVACYNPOLICYICON;
    private javax.swing.JLabel PRIVACYNPOLICYLABEL;
    private javax.swing.JLabel PROFILE;
    private javax.swing.JPanel PrivacyAndPolicy;
    private javax.swing.JLabel REGISTEREDVOTERS;
    private javax.swing.JPanel SECURITY;
    private javax.swing.JLabel SECURITYICON;
    private javax.swing.JLabel SECURITYLABEL;
    private javax.swing.JButton SENDFEEDBACKBUTTON;
    private javax.swing.JLabel SEPARATOR;
    private javax.swing.JPanel SEPARATORLINE1;
    private javax.swing.JTabbedPane SETTINGSTAB;
    private javax.swing.JButton SKButton;
    private javax.swing.JButton SKChairpersonButton;
    private javax.swing.JPanel SKChairpersonTab;
    private javax.swing.JButton SKKagawadButton;
    private javax.swing.JPanel SKKagawadTab;
    private javax.swing.JPanel SKTab;
    private javax.swing.JLabel STATISTICSLABEL;
    private javax.swing.JPanel SecurityPanel;
    private javax.swing.JPanel TOOLBAR;
    private javax.swing.JLabel USERIMAGE;
    private javax.swing.JLabel USERIMAGE1;
    private javax.swing.JLabel USERIMAGE2;
    private javax.swing.JLabel VOTED;
    private javax.swing.JLabel VOTINGSYSTEM;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
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

