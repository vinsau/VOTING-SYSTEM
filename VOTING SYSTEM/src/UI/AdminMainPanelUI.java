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
        DeleteVoterBtn = new javax.swing.JButton();
        LoadVoterBtn = new javax.swing.JButton();
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
        LoadBtn = new javax.swing.JButton();
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
        SearchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchFieldMouseClicked(evt);
            }
        });
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

        DeleteVoterBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DeleteVoterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/DELETE.png"))); // NOI18N
        DeleteVoterBtn.setText("Delete");
        DeleteVoterBtn.setIconTextGap(10);
        DeleteVoterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteVoterBtnMouseClicked(evt);
            }
        });
        Options.add(DeleteVoterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 130, 40));

        LoadVoterBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoadVoterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/REFRESH.png"))); // NOI18N
        LoadVoterBtn.setText("Load");
        LoadVoterBtn.setIconTextGap(10);
        LoadVoterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoadVoterBtnMouseClicked(evt);
            }
        });
        Options.add(LoadVoterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 140, 40));

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
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
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

        LoadBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LoadBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/UPDATE.png"))); // NOI18N
        LoadBtn.setText("Load");
        LoadBtn.setIconTextGap(10);
        LoadBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoadBtnMouseClicked(evt);
            }
        });
        ManageElectionsPanel.add(LoadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 530, 140, 40));

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

    private void LoadVoterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadVoterBtnMouseClicked

        loadData();
    }//GEN-LAST:event_LoadVoterBtnMouseClicked

    private void DeleteVoterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteVoterBtnMouseClicked
        deleteVoter();

    }//GEN-LAST:event_DeleteVoterBtnMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        addCandidate();
    }//GEN-LAST:event_AddBtnMouseClicked

    private void LoadBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadBtnMouseClicked
        loadData();
    }//GEN-LAST:event_LoadBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        deleteCandidate();
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void SearchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchFieldMouseClicked
        searchVoter();
    }//GEN-LAST:event_SearchFieldMouseClicked

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
    
    private void loadData() {
       tableModel.setRowCount(0); // Clear existing data
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM candidatecreationtb")) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                tableModel.addRow(new Object[]{id, name, position});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void addCandidate() {
        String name = CandidateField.getText();
        String position = PositionField.getText();

        if (name.isEmpty() || position.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name and Position must not be empty");
            return;
        }

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO candidatecreationtb (name, position) VALUES (?, ?)")) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, position);
            preparedStatement.executeUpdate();
            loadData();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void deleteCandidate() {
        int selectedRow = ElectionsTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select a row to delete");
            return;
        }

        int id = (int) tableModel.getValueAt(selectedRow, 0);

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM candidatecreationtb WHERE id = ?")) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            loadData();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void deleteVoter() {
        int selectedRow = voterTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Select a row to delete");
            return;
        }

        int id = (int) tableModel.getValueAt(selectedRow, 0);

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM voteraccsinfotb WHERE id = ?")) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            loadData();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void searchVoter() {
        String searchText = SearchField.getText();
        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a search term");
            return;
        }

        tableModel.setRowCount(0); // Clear existing data
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM voteraccsinfotb WHERE name LIKE ? OR address LIKE ?")) {

            String searchPattern = "%" + searchText + "%";
            preparedStatement.setString(1, searchPattern);
            preparedStatement.setString(2, searchPattern);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String address = resultSet.getString("address");
                tableModel.addRow(new Object[]{id, name, age, address});
            }

        } catch (SQLException e) {
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
    private javax.swing.JButton DeleteVoterBtn;
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
    private javax.swing.JButton LoadBtn;
    private javax.swing.JButton LoadVoterBtn;
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
