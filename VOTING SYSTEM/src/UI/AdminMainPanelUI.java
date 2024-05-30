package UI;

import Model.VoterModel;
import Database.DatabaseConnection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class AdminMainPanelUI extends javax.swing.JFrame {

    private DefaultTableModel tableModel;

    public AdminMainPanelUI() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainContainer = new javax.swing.JPanel();
        Toolbar = new javax.swing.JPanel();
        AdminLabel = new javax.swing.JLabel();
        MINIMIZE = new javax.swing.JLabel();
        EXIT = new javax.swing.JLabel();
        Design1 = new javax.swing.JPanel();
        AdminLogo = new javax.swing.JLabel();
        ButtonsContainer = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        HomeLabel = new javax.swing.JLabel();
        ManageAccounts = new javax.swing.JPanel();
        ManageAccountsLabel = new javax.swing.JLabel();
        ManageElections = new javax.swing.JPanel();
        ManageElectionsLabel = new javax.swing.JLabel();
        ManageResults = new javax.swing.JPanel();
        ManageResultsLabel = new javax.swing.JLabel();
        Separator = new javax.swing.JPanel();
        MainTab = new javax.swing.JTabbedPane();
        HomePanel = new javax.swing.JPanel();
        HOMEPIC = new javax.swing.JLabel();
        ManageAccountsPanel = new javax.swing.JPanel();
        Options = new javax.swing.JPanel();
        VoterINFO = new javax.swing.JPanel();
        VoterINFOLabel = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        Search = new javax.swing.JLabel();
        GOPANEL = new javax.swing.JPanel();
        GO = new javax.swing.JLabel();
        DeleteButtonAccounts = new javax.swing.JButton();
        LoadButtonAcccounts = new javax.swing.JButton();
        UpdateButtonAccounts = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        voterTable = new javax.swing.JTable();
        ManageElectionsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ElectionsTable = new javax.swing.JTable();
        ElectionsMajorContainer = new javax.swing.JPanel();
        MainElectionsLabel = new javax.swing.JLabel();
        PositionLabel = new javax.swing.JLabel();
        BallotField = new javax.swing.JTextField();
        CandidateNameField = new javax.swing.JLabel();
        BallotLabel = new javax.swing.JLabel();
        CandidateField = new javax.swing.JTextField();
        PositionField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        UpdateBtnElections = new javax.swing.JButton();
        ViewResults = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ResultsTable = new javax.swing.JTable();
        ResultsLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainContainer.setBackground(new java.awt.Color(255, 255, 255));
        MainContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Toolbar.setBackground(new java.awt.Color(0, 0, 0));
        Toolbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        AdminLabel.setForeground(new java.awt.Color(255, 255, 255));
        AdminLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminLabel.setText("ADMIN PANEL");
        Toolbar.add(AdminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 50));

        MINIMIZE.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        MINIMIZE.setForeground(new java.awt.Color(255, 255, 255));
        MINIMIZE.setText("—");
        MINIMIZE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MINIMIZE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINIMIZEMouseClicked(evt);
            }
        });
        Toolbar.add(MINIMIZE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

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
        Toolbar.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 30, 30));

        Design1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Design1Layout = new javax.swing.GroupLayout(Design1);
        Design1.setLayout(Design1Layout);
        Design1Layout.setHorizontalGroup(
            Design1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Design1Layout.setVerticalGroup(
            Design1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        Toolbar.add(Design1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1133, 0, 3, 50));

        AdminLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/WHITE ADMIN.png"))); // NOI18N
        Toolbar.add(AdminLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        MainContainer.add(Toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 50));

        ButtonsContainer.setBackground(new java.awt.Color(255, 255, 255));
        ButtonsContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setBackground(new java.awt.Color(204, 204, 204));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeLabel.setBackground(new java.awt.Color(204, 204, 204));
        HomeLabel.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        HomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeLabel.setText("HOME");
        HomeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.add(HomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        ButtonsContainer.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        ManageAccounts.setBackground(new java.awt.Color(255, 255, 255));
        ManageAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageAccountsMouseClicked(evt);
            }
        });
        ManageAccounts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageAccountsLabel.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ManageAccountsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageAccountsLabel.setText("MANAGE ACCOUNTS");
        ManageAccountsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageAccounts.add(ManageAccountsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        ButtonsContainer.add(ManageAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 310, 50));

        ManageElections.setBackground(new java.awt.Color(255, 255, 255));
        ManageElections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageElectionsMouseClicked(evt);
            }
        });
        ManageElections.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageElectionsLabel.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ManageElectionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageElectionsLabel.setText("MANAGE ELECTIONS");
        ManageElectionsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageElections.add(ManageElectionsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        ButtonsContainer.add(ManageElections, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 310, 50));

        ManageResults.setBackground(new java.awt.Color(255, 255, 255));
        ManageResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageResultsMouseClicked(evt);
            }
        });
        ManageResults.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageResultsLabel.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ManageResultsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageResultsLabel.setText("VIEW RESULTS");
        ManageResultsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageResults.add(ManageResultsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 50));

        ButtonsContainer.add(ManageResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 310, 50));

        Separator.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout SeparatorLayout = new javax.swing.GroupLayout(Separator);
        Separator.setLayout(SeparatorLayout);
        SeparatorLayout.setHorizontalGroup(
            SeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1860, Short.MAX_VALUE)
        );
        SeparatorLayout.setVerticalGroup(
            SeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        ButtonsContainer.add(Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(-620, 50, -1, -1));

        MainContainer.add(ButtonsContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1240, 60));

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOMEPIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ADMINHOME.png"))); // NOI18N
        HomePanel.add(HOMEPIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 600));

        MainTab.addTab("tab1", HomePanel);

        ManageAccountsPanel.setBackground(new java.awt.Color(0, 0, 0));
        ManageAccountsPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ManageAccountsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Options.setBackground(new java.awt.Color(255, 255, 255));
        Options.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VoterINFO.setBackground(new java.awt.Color(0, 0, 0));
        VoterINFO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        VoterINFO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VoterINFOLabel.setBackground(new java.awt.Color(0, 0, 0));
        VoterINFOLabel.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        VoterINFOLabel.setForeground(new java.awt.Color(255, 255, 255));
        VoterINFOLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VoterINFOLabel.setText("VOTERS' INFORMATION");
        VoterINFO.add(VoterINFOLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 940, 80));

        Options.add(VoterINFO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 80));

        SearchField.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        SearchField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Options.add(SearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 240, 40));

        Search.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/SEARCH.png"))); // NOI18N
        Search.setText("SEARCH");
        Options.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        GOPANEL.setBackground(new java.awt.Color(255, 255, 255));

        GO.setBackground(new java.awt.Color(255, 255, 255));
        GO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FORWARDSMALL.png"))); // NOI18N
        GO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout GOPANELLayout = new javax.swing.GroupLayout(GOPANEL);
        GOPANEL.setLayout(GOPANELLayout);
        GOPANELLayout.setHorizontalGroup(
            GOPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GOPANELLayout.createSequentialGroup()
                .addComponent(GO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        GOPANELLayout.setVerticalGroup(
            GOPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GOPANELLayout.createSequentialGroup()
                .addComponent(GO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Options.add(GOPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 40, 40));

        DeleteButtonAccounts.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteButtonAccounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/DELETE.png"))); // NOI18N
        DeleteButtonAccounts.setText("Delete");
        DeleteButtonAccounts.setIconTextGap(10);
        DeleteButtonAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonAccountsMouseClicked(evt);
            }
        });
        Options.add(DeleteButtonAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 130, 40));

        LoadButtonAcccounts.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoadButtonAcccounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/REFRESH.png"))); // NOI18N
        LoadButtonAcccounts.setText("Load");
        LoadButtonAcccounts.setIconTextGap(10);
        LoadButtonAcccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoadButtonAcccountsMouseClicked(evt);
            }
        });
        Options.add(LoadButtonAcccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 40));

        UpdateButtonAccounts.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateButtonAccounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/UPDATE.png"))); // NOI18N
        UpdateButtonAccounts.setText("Update");
        UpdateButtonAccounts.setIconTextGap(10);
        UpdateButtonAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonAccountsMouseClicked(evt);
            }
        });
        UpdateButtonAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonAccountsActionPerformed(evt);
            }
        });
        Options.add(UpdateButtonAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 140, 40));

        ManageAccountsPanel.add(Options, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 960, 190));

        voterTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        voterTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        voterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Email", "Date of Birth", "Gender", "Citizenship", "Civil Status", "Address", "Security Question", "Security Answer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        voterTable.setRowHeight(20);
        jScrollPane1.setViewportView(voterTable);

        ManageAccountsPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1200, 360));

        MainTab.addTab("tab2", ManageAccountsPanel);

        ManageElectionsPanel.setBackground(new java.awt.Color(0, 0, 0));
        ManageElectionsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ElectionsTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ElectionsTable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ElectionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Position", "Ballot#", "Candidate Name"
            }
        ));
        ElectionsTable.setGridColor(new java.awt.Color(0, 0, 0));
        ElectionsTable.setRowHeight(70);
        jScrollPane2.setViewportView(ElectionsTable);

        ManageElectionsPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 630, 550));

        ElectionsMajorContainer.setBackground(new java.awt.Color(255, 255, 255));
        ElectionsMajorContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ElectionsMajorContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainElectionsLabel.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        MainElectionsLabel.setText("ELECTIONS");
        ElectionsMajorContainer.add(MainElectionsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, -1));

        PositionLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PositionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel.setText("Position:");
        ElectionsMajorContainer.add(PositionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, -1));
        ElectionsMajorContainer.add(BallotField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 90, 40));

        CandidateNameField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CandidateNameField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CandidateNameField.setText("Candidate Name:");
        ElectionsMajorContainer.add(CandidateNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 170, -1));

        BallotLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BallotLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BallotLabel.setText("Ballot #:");
        ElectionsMajorContainer.add(BallotLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 170, -1));
        ElectionsMajorContainer.add(CandidateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 330, 40));
        ElectionsMajorContainer.add(PositionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 330, 40));

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setText("Limit Votes");
        ElectionsMajorContainer.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 435, 170, 40));

        ManageElectionsPanel.add(ElectionsMajorContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 540, 490));

        DeleteBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/DELETE.png"))); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.setIconTextGap(10);
        ManageElectionsPanel.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 530, 130, 40));

        AddBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ADD.png"))); // NOI18N
        AddBtn.setText("Add");
        AddBtn.setIconTextGap(10);
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        ManageElectionsPanel.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 115, 40));

        UpdateBtnElections.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateBtnElections.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/UPDATE.png"))); // NOI18N
        UpdateBtnElections.setText("Update");
        UpdateBtnElections.setIconTextGap(10);
        UpdateBtnElections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnElectionsMouseClicked(evt);
            }
        });
        ManageElectionsPanel.add(UpdateBtnElections, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 530, 140, 40));

        MainTab.addTab("tab3", ManageElectionsPanel);

        ViewResults.setBackground(new java.awt.Color(0, 0, 0));
        ViewResults.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ResultsTable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ResultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Position", "Ballot #", "Candidate Name"
            }
        ));
        ResultsTable.setEnabled(false);
        ResultsTable.setRowHeight(70);
        jScrollPane4.setViewportView(ResultsTable);

        ViewResults.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 840, 400));

        ResultsLabel.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        ResultsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ResultsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ResultsLabel.setText("RESULTS");
        ViewResults.add(ResultsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 840, 70));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setText("REFRESH");
        ViewResults.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, 240, 50));

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton3.setText("PUBLISH RESULTS");
        ViewResults.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 240, 50));

        MainTab.addTab("tab4", ViewResults);

        MainContainer.add(MainTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1240, 620));

        getContentPane().add(MainContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 700));

        setSize(new java.awt.Dimension(1240, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
        int response = JOptionPane.showConfirmDialog(this, "You'll be redirected to Voter Login. Continue?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            LoginUI login = new LoginUI();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_EXITMouseClicked

    private void MINIMIZEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZEMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_MINIMIZEMouseClicked

    private void ManageAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageAccountsMouseClicked
        switchPanel(1, ManageAccounts, Home, ManageElections, ManageResults);
    }//GEN-LAST:event_ManageAccountsMouseClicked

    private void ManageElectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageElectionsMouseClicked
        switchPanel(2, ManageElections, Home, ManageAccounts, ManageResults);

    }//GEN-LAST:event_ManageElectionsMouseClicked

    private void ManageResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageResultsMouseClicked
        switchPanel(3, ManageResults, Home, ManageAccounts, ManageElections);
    }//GEN-LAST:event_ManageResultsMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        switchPanel(0, Home, ManageAccounts, ManageElections, ManageResults);
    }//GEN-LAST:event_HomeMouseClicked

    private void LoadButtonAcccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadButtonAcccountsMouseClicked

        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM voteraccsinfotb";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String fullname = rs.getString("fullname");
                String email = rs.getString("email");
                LocalDate date = rs.getDate("date_of_birth").toLocalDate();
                String gender = rs.getString("gender");
                String citizenship = rs.getString("citizenship");
                String civilStatus = rs.getString("civil_status");
                String address = rs.getString("address");
                String security_question = rs.getString("security_question");
                String security_answer = rs.getString("security_answer");

                String dateString = date.toString();
                String tbData[] = {fullname, email, dateString, gender, citizenship, civilStatus, address, security_question, security_answer};
                DefaultTableModel tblModel = (DefaultTableModel) voterTable.getModel();
                tblModel.addRow(tbData);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "An error occurred while retrieving voter data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        LoadButtonAcccounts.setEnabled(false);
        LoadButtonAcccounts.removeMouseListener(LoadButtonAcccounts.getMouseListeners()[0]);
    }//GEN-LAST:event_LoadButtonAcccountsMouseClicked

    private void DeleteButtonAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonAccountsMouseClicked
        int[] selectedRows = voterTable.getSelectedRows();
int emailColumnIndex = 0; // Assuming email is the first column (index 0)

if (selectedRows.length > 0) {
    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the selected rows?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DatabaseConnection.getConnection();
            String sql = "DELETE FROM voteraccsinfotb WHERE email = ?";
            pstmt = conn.prepareStatement(sql);

            DefaultTableModel tblModel = (DefaultTableModel) voterTable.getModel();
            for (int i = 0; i < selectedRows.length; i++) {
                String email = (String) tblModel.getValueAt(selectedRows[i], emailColumnIndex);
                pstmt.setString(1, email);
                pstmt.executeUpdate();
            }

            
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                tblModel.removeRow(selectedRows[i]);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting rows: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error closing statement: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error closing connection: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
} else {
    if (voterTable.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "Table is empty", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Please select rows to delete", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    }//GEN-LAST:event_DeleteButtonAccountsMouseClicked

    private void UpdateButtonAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonAccountsMouseClicked

        DefaultTableModel tblModel = (DefaultTableModel) voterTable.getModel();

try {
    Connection conn = DatabaseConnection.getConnection();
    String sql = "SELECT * FROM voteraccsinfotb";
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);

    while (rs.next()) {
        String fullname = rs.getString("fullname");
        String email = rs.getString("email");
        LocalDate date = rs.getDate("date_of_birth").toLocalDate();
        String gender = rs.getString("gender");
        String citizenship = rs.getString("citizenship");
        String civilStatus = rs.getString("civil_status");
        String address = rs.getString("address");
        String securityQuestion = rs.getString("security_question");
        String securityAnswer = rs.getString("security_answer");

        String tbData[] = {fullname, email, date.toString(), gender, citizenship, civilStatus, address, securityQuestion, securityAnswer};
        tblModel.addRow(tbData);
    }
    
    // Close resources
    rs.close();
    stmt.close();
    conn.close();
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Error refreshing table: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}



    }//GEN-LAST:event_UpdateButtonAccountsMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if (PositionField.getText().isEmpty() || BallotField.getText().isEmpty() || CandidateNameField.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please enter all data!");
} else {
    try {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "INSERT INTO createcandidatestb (position, ballot_number, candidate_name) VALUES (?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, PositionField.getText());
        pstmt.setString(2, BallotField.getText());
        pstmt.setString(3, CandidateNameField.getText());
        pstmt.executeUpdate();

        DefaultTableModel tblModel = (DefaultTableModel) ElectionsTable.getModel();
        tblModel.addRow(new Object[]{PositionField.getText(), BallotField.getText(), CandidateNameField.getText()});

        JOptionPane.showMessageDialog(this, "Added Successfully!");

        PositionField.setText("");
        BallotField.setText("");
        CandidateNameField.setText("");

        pstmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error adding row: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdateBtnElectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnElectionsMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) ElectionsTable.getModel();
        tblModel.setRowCount(0);

        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM createcandidatestb";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String position = rs.getString("position");
                int ballotnum = rs.getInt("ballotnum");
                String candidatename = rs.getString("candidatename");

                String tbData1[] = {PositionField.getText(), BallotField.getText(), CandidateNameField.getText()};
                tblModel.addRow(tbData1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error refreshing table: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateBtnElectionsMouseClicked

    private void UpdateButtonAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonAccountsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateButtonAccountsActionPerformed

    public void selectPanel(JTabbedPane targetTab, int index) {
        targetTab.setSelectedIndex(index);
    }

    public void turnOn(JComponent targetComponent) {
        targetComponent.setEnabled(true);
    }

    public void turnOff(JComponent targetComponent) {
        targetComponent.setEnabled(false);
    }

    public void backButton(JTabbedPane targetTab) {
        targetTab.setSelectedIndex(0);
    }

    public void switchPanel(int index, JPanel targetPanel, JPanel changePanel1, JPanel changePanel2, JPanel changePanel3) {
        targetPanel.setBackground(new Color(204, 204, 204));

        changePanel1.setBackground(new Color(255, 255, 255));
        changePanel2.setBackground(new Color(255, 255, 255));
        changePanel3.setBackground(new Color(255, 255, 255));

        MainTab.setSelectedIndex(index);
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
            java.util.logging.Logger.getLogger(AdminMainPanelUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainPanelUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainPanelUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainPanelUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainPanelUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JLabel AdminLogo;
    private javax.swing.JTextField BallotField;
    private javax.swing.JLabel BallotLabel;
    private javax.swing.JPanel ButtonsContainer;
    private javax.swing.JTextField CandidateField;
    private javax.swing.JLabel CandidateNameField;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DeleteButtonAccounts;
    private javax.swing.JPanel Design1;
    private javax.swing.JLabel EXIT;
    private javax.swing.JPanel ElectionsMajorContainer;
    private javax.swing.JTable ElectionsTable;
    private javax.swing.JLabel GO;
    private javax.swing.JPanel GOPANEL;
    private javax.swing.JLabel HOMEPIC;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JButton LoadButtonAcccounts;
    private javax.swing.JLabel MINIMIZE;
    private javax.swing.JPanel MainContainer;
    private javax.swing.JLabel MainElectionsLabel;
    private javax.swing.JTabbedPane MainTab;
    private javax.swing.JPanel ManageAccounts;
    private javax.swing.JLabel ManageAccountsLabel;
    private javax.swing.JPanel ManageAccountsPanel;
    private javax.swing.JPanel ManageElections;
    private javax.swing.JLabel ManageElectionsLabel;
    private javax.swing.JPanel ManageElectionsPanel;
    private javax.swing.JPanel ManageResults;
    private javax.swing.JLabel ManageResultsLabel;
    private javax.swing.JPanel Options;
    private javax.swing.JTextField PositionField;
    private javax.swing.JLabel PositionLabel;
    private javax.swing.JLabel ResultsLabel;
    private javax.swing.JTable ResultsTable;
    private javax.swing.JLabel Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JPanel Separator;
    private javax.swing.JPanel Toolbar;
    private javax.swing.JButton UpdateBtnElections;
    private javax.swing.JButton UpdateButtonAccounts;
    private javax.swing.JPanel ViewResults;
    private javax.swing.JPanel VoterINFO;
    private javax.swing.JLabel VoterINFOLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable voterTable;
    // End of variables declaration//GEN-END:variables
}
