package UI;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JOptionPane;
import UI.MessageDialog;

public class AdminMainPanel extends javax.swing.JFrame {

    public AdminMainPanel() {
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
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        Search = new javax.swing.JLabel();
        GOPANEL = new javax.swing.JPanel();
        GO = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VoterInfos = new javax.swing.JTable();
        MainVoterImage = new javax.swing.JLabel();
        ManageElectionsPanel = new javax.swing.JPanel();
        PositionTabs = new javax.swing.JTabbedPane();
        Elections = new javax.swing.JPanel();
        LOCAL = new javax.swing.JPanel();
        LocalLabel = new javax.swing.JLabel();
        MayorButton = new javax.swing.JButton();
        ViceMayorButton = new javax.swing.JButton();
        CongressmanButton = new javax.swing.JButton();
        CityCouncilorButton = new javax.swing.JButton();
        BarangayCaptainButton = new javax.swing.JButton();
        BarangayCouncilorButton = new javax.swing.JButton();
        STATE = new javax.swing.JPanel();
        StateLabel = new javax.swing.JLabel();
        ViceGovernorButton = new javax.swing.JButton();
        PBMButton = new javax.swing.JButton();
        GovernorButton = new javax.swing.JButton();
        NATIONAL = new javax.swing.JPanel();
        NationalLabel = new javax.swing.JLabel();
        VicePresidentButton = new javax.swing.JButton();
        SenatorButton = new javax.swing.JButton();
        PartyListsButton = new javax.swing.JButton();
        PresidentButton = new javax.swing.JButton();
        SK = new javax.swing.JPanel();
        SKLabel = new javax.swing.JLabel();
        SKCHAIRMAN = new javax.swing.JButton();
        SKCOUNCILOR = new javax.swing.JButton();
        ManageMayor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MayorTable = new javax.swing.JTable();
        SwitchContainer = new javax.swing.JPanel();
        DeleteLabel1 = new javax.swing.JLabel();
        AddCandidateTF1 = new javax.swing.JTextField();
        DeleteCandidateTF1 = new javax.swing.JTextField();
        AddCandidate1 = new javax.swing.JButton();
        DeleteCandidate1 = new javax.swing.JButton();
        AddLabel1 = new javax.swing.JLabel();
        SWITCH1 = new javax.swing.JToggleButton();
        PositionLabel1 = new javax.swing.JLabel();
        BackButton1 = new javax.swing.JButton();
        ManageViceMayor = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ViceMayorTable = new javax.swing.JTable();
        PositionLabel2 = new javax.swing.JLabel();
        SwitchContainer2 = new javax.swing.JPanel();
        DeleteLabel2 = new javax.swing.JLabel();
        AddCandidateTF2 = new javax.swing.JTextField();
        DeleteCandidateTF2 = new javax.swing.JTextField();
        AddCandidate2 = new javax.swing.JButton();
        DeleteCandidate2 = new javax.swing.JButton();
        AddLabel2 = new javax.swing.JLabel();
        SWITCH2 = new javax.swing.JToggleButton();
        BackButton2 = new javax.swing.JButton();
        ManageCongressman = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ViceMayorTable1 = new javax.swing.JTable();
        MayorLabel3 = new javax.swing.JLabel();
        SwitchContainer3 = new javax.swing.JPanel();
        DeleteLabel3 = new javax.swing.JLabel();
        AddCandidateTF3 = new javax.swing.JTextField();
        DeleteCandidateTF3 = new javax.swing.JTextField();
        AddCandidate3 = new javax.swing.JButton();
        DeleteCandidate3 = new javax.swing.JButton();
        AddLabel3 = new javax.swing.JLabel();
        SWITCH3 = new javax.swing.JToggleButton();
        BackButton3 = new javax.swing.JButton();
        ManageCityCouncilor = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ViceMayorTable2 = new javax.swing.JTable();
        PositionLabel4 = new javax.swing.JLabel();
        SwitchContainer4 = new javax.swing.JPanel();
        DeleteLabel4 = new javax.swing.JLabel();
        AddCandidateTF4 = new javax.swing.JTextField();
        DeleteCandidateTF4 = new javax.swing.JTextField();
        AddCandidate4 = new javax.swing.JButton();
        DeleteCandidate4 = new javax.swing.JButton();
        AddLabel4 = new javax.swing.JLabel();
        SWITCH4 = new javax.swing.JToggleButton();
        BackButton4 = new javax.swing.JButton();
        ManageBarangayCaptain = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ViceMayorTable3 = new javax.swing.JTable();
        PositionLabel5 = new javax.swing.JLabel();
        SwitchContainer5 = new javax.swing.JPanel();
        DeleteLabel5 = new javax.swing.JLabel();
        AddCandidateTF5 = new javax.swing.JTextField();
        DeleteCandidateTF5 = new javax.swing.JTextField();
        AddCandidate5 = new javax.swing.JButton();
        DeleteCandidate5 = new javax.swing.JButton();
        AddLabel5 = new javax.swing.JLabel();
        SWITCH5 = new javax.swing.JToggleButton();
        BackButton5 = new javax.swing.JButton();
        ManageBarangayCouncilor = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ViceMayorTable4 = new javax.swing.JTable();
        PositionLabel6 = new javax.swing.JLabel();
        SwitchContainer6 = new javax.swing.JPanel();
        DeleteLabel6 = new javax.swing.JLabel();
        AddCandidateTF6 = new javax.swing.JTextField();
        DeleteCandidateTF6 = new javax.swing.JTextField();
        AddCandidate6 = new javax.swing.JButton();
        DeleteCandidate6 = new javax.swing.JButton();
        AddLabel6 = new javax.swing.JLabel();
        SWITCH6 = new javax.swing.JToggleButton();
        BackButton6 = new javax.swing.JButton();
        ManageGovernor = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ViceMayorTable5 = new javax.swing.JTable();
        PositionLabel7 = new javax.swing.JLabel();
        SwitchContainer7 = new javax.swing.JPanel();
        DeleteLabel7 = new javax.swing.JLabel();
        AddCandidateTF7 = new javax.swing.JTextField();
        DeleteCandidateTF7 = new javax.swing.JTextField();
        AddCandidate7 = new javax.swing.JButton();
        DeleteCandidate7 = new javax.swing.JButton();
        AddLabel7 = new javax.swing.JLabel();
        SWITCH7 = new javax.swing.JToggleButton();
        BackButton7 = new javax.swing.JButton();
        ManageViceGovernor = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        ViceMayorTable6 = new javax.swing.JTable();
        PositionLabel8 = new javax.swing.JLabel();
        SwitchContainer8 = new javax.swing.JPanel();
        DeleteLabel8 = new javax.swing.JLabel();
        AddCandidateTF8 = new javax.swing.JTextField();
        DeleteCandidateTF8 = new javax.swing.JTextField();
        AddCandidate8 = new javax.swing.JButton();
        DeleteCandidate8 = new javax.swing.JButton();
        AddLabel8 = new javax.swing.JLabel();
        SWITCH8 = new javax.swing.JToggleButton();
        BackButton8 = new javax.swing.JButton();
        ManagePBM = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        ViceMayorTable7 = new javax.swing.JTable();
        PositionLabel9 = new javax.swing.JLabel();
        SwitchContainer9 = new javax.swing.JPanel();
        DeleteLabel9 = new javax.swing.JLabel();
        AddCandidateTF9 = new javax.swing.JTextField();
        DeleteCandidateTF9 = new javax.swing.JTextField();
        AddCandidate9 = new javax.swing.JButton();
        DeleteCandidate9 = new javax.swing.JButton();
        AddLabel9 = new javax.swing.JLabel();
        SWITCH9 = new javax.swing.JToggleButton();
        BackButton9 = new javax.swing.JButton();
        ManagePresident = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        ViceMayorTable8 = new javax.swing.JTable();
        PositionLabel10 = new javax.swing.JLabel();
        SwitchContainer10 = new javax.swing.JPanel();
        DeleteLabel10 = new javax.swing.JLabel();
        AddCandidateTF10 = new javax.swing.JTextField();
        DeleteCandidateTF10 = new javax.swing.JTextField();
        AddCandidate10 = new javax.swing.JButton();
        DeleteCandidate10 = new javax.swing.JButton();
        AddLabel10 = new javax.swing.JLabel();
        SWITCH10 = new javax.swing.JToggleButton();
        BackButton10 = new javax.swing.JButton();
        ManageVicePresident = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        ViceMayorTable9 = new javax.swing.JTable();
        PositionLabel11 = new javax.swing.JLabel();
        SwitchContainer11 = new javax.swing.JPanel();
        DeleteLabel11 = new javax.swing.JLabel();
        AddCandidateTF11 = new javax.swing.JTextField();
        DeleteCandidateTF11 = new javax.swing.JTextField();
        AddCandidate11 = new javax.swing.JButton();
        DeleteCandidate11 = new javax.swing.JButton();
        AddLabel11 = new javax.swing.JLabel();
        SWITCH11 = new javax.swing.JToggleButton();
        BackButton11 = new javax.swing.JButton();
        ManageSenator = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        ViceMayorTable10 = new javax.swing.JTable();
        PositionLabel12 = new javax.swing.JLabel();
        SwitchContainer12 = new javax.swing.JPanel();
        DeleteLabel12 = new javax.swing.JLabel();
        AddCandidateTF12 = new javax.swing.JTextField();
        DeleteCandidateTF12 = new javax.swing.JTextField();
        AddCandidate12 = new javax.swing.JButton();
        DeleteCandidate12 = new javax.swing.JButton();
        AddLabel12 = new javax.swing.JLabel();
        SWITCH12 = new javax.swing.JToggleButton();
        BackButton12 = new javax.swing.JButton();
        ManagePartylists = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        ViceMayorTable11 = new javax.swing.JTable();
        PositionLabel13 = new javax.swing.JLabel();
        SwitchContainer13 = new javax.swing.JPanel();
        DeleteLabel13 = new javax.swing.JLabel();
        AddCandidateTF13 = new javax.swing.JTextField();
        DeleteCandidateTF13 = new javax.swing.JTextField();
        AddCandidate13 = new javax.swing.JButton();
        DeleteCandidate13 = new javax.swing.JButton();
        AddLabel13 = new javax.swing.JLabel();
        SWITCH13 = new javax.swing.JToggleButton();
        BackButton13 = new javax.swing.JButton();
        ManageSKChairman = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        ViceMayorTable12 = new javax.swing.JTable();
        PositionLabel14 = new javax.swing.JLabel();
        SwitchContainer14 = new javax.swing.JPanel();
        DeleteLabel14 = new javax.swing.JLabel();
        AddCandidateTF14 = new javax.swing.JTextField();
        DeleteCandidateTF14 = new javax.swing.JTextField();
        AddCandidate14 = new javax.swing.JButton();
        DeleteCandidate14 = new javax.swing.JButton();
        AddLabel14 = new javax.swing.JLabel();
        SWITCH14 = new javax.swing.JToggleButton();
        BackButton14 = new javax.swing.JButton();
        ManageSKCouncilor = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        ViceMayorTable13 = new javax.swing.JTable();
        PositionLabel15 = new javax.swing.JLabel();
        SwitchContainer15 = new javax.swing.JPanel();
        DeleteLabel15 = new javax.swing.JLabel();
        AddCandidateTF15 = new javax.swing.JTextField();
        DeleteCandidateTF15 = new javax.swing.JTextField();
        AddCandidate15 = new javax.swing.JButton();
        DeleteCandidate15 = new javax.swing.JButton();
        AddLabel15 = new javax.swing.JLabel();
        SWITCH15 = new javax.swing.JToggleButton();
        BackButton16 = new javax.swing.JButton();
        ManageResultsPanel = new javax.swing.JPanel();
        LocalResult = new javax.swing.JPanel();
        LocalLabel1 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        LocalTableResult = new javax.swing.JTable();
        StateResult = new javax.swing.JPanel();
        StateLabel1 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        StateTableResult = new javax.swing.JTable();
        NationalResult = new javax.swing.JPanel();
        NationalLabel1 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        NationalTableResult = new javax.swing.JTable();
        SKResult = new javax.swing.JPanel();
        SKLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SKTableResult = new javax.swing.JTable();

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
        Home.add(HomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

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
        ManageAccounts.add(ManageAccountsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

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
        ManageElections.add(ManageElectionsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

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
        ManageResultsLabel.setText("MANAGE RESULTS");
        ManageResultsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageResults.add(ManageResultsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

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

        ManageAccountsPanel.setBackground(new java.awt.Color(255, 255, 255));
        ManageAccountsPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ManageAccountsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Options.setBackground(new java.awt.Color(204, 204, 204));
        Options.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VoterINFO.setBackground(new java.awt.Color(25, 18, 211));
        VoterINFO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        VoterINFO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VoterINFOLabel.setBackground(new java.awt.Color(25, 18, 211));
        VoterINFOLabel.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        VoterINFOLabel.setForeground(new java.awt.Color(255, 255, 255));
        VoterINFOLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VoterINFOLabel.setText("VOTER'S INFORMATION");
        VoterINFO.add(VoterINFOLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 940, 80));

        Options.add(VoterINFO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 80));

        Delete.setBackground(new java.awt.Color(255, 51, 51));
        Delete.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        Delete.setText("DELETE");
        Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Options.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 210, 60));

        Edit.setBackground(new java.awt.Color(102, 102, 255));
        Edit.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        Edit.setText("EDIT");
        Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Options.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, 60));

        Add.setBackground(new java.awt.Color(51, 255, 0));
        Add.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        Add.setText("ADD");
        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Options.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, 60));

        SearchField.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
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
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(GOPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GOPANELLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(GO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        GOPANELLayout.setVerticalGroup(
            GOPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(GOPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GOPANELLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(GO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Options.add(GOPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 40, 40));

        ManageAccountsPanel.add(Options, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 190));

        VoterInfos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        VoterInfos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Email", "Password", "Date of Birth", "Gender", "Citizenship", "Civil Status", "Address", "Security Question", "Security Answer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        VoterInfos.setRowHeight(20);
        jScrollPane1.setViewportView(VoterInfos);

        ManageAccountsPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1210, 370));

        MainVoterImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/USERPROFILEBIG.png"))); // NOI18N
        ManageAccountsPanel.add(MainVoterImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 200, 210));

        MainTab.addTab("tab2", ManageAccountsPanel);

        ManageElectionsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Elections.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOCAL.setBackground(new java.awt.Color(25, 18, 211));
        LOCAL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        LOCAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LocalLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        LocalLabel.setForeground(new java.awt.Color(255, 255, 255));
        LocalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LocalLabel.setText("LOCAL");
        LOCAL.add(LocalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 308, 71));

        MayorButton.setBackground(new java.awt.Color(255, 255, 255));
        MayorButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MayorButton.setText("MAYOR");
        MayorButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        MayorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MayorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MayorButtonMouseClicked(evt);
            }
        });
        LOCAL.add(MayorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 260, 40));

        ViceMayorButton.setBackground(new java.awt.Color(255, 255, 255));
        ViceMayorButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ViceMayorButton.setText("VICE-MAYOR");
        ViceMayorButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ViceMayorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViceMayorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViceMayorButtonMouseClicked(evt);
            }
        });
        LOCAL.add(ViceMayorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, 40));

        CongressmanButton.setBackground(new java.awt.Color(255, 255, 255));
        CongressmanButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CongressmanButton.setText("CONGRESSMAN");
        CongressmanButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CongressmanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CongressmanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CongressmanButtonMouseClicked(evt);
            }
        });
        LOCAL.add(CongressmanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 260, 40));

        CityCouncilorButton.setBackground(new java.awt.Color(255, 255, 255));
        CityCouncilorButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CityCouncilorButton.setText("CITY COUNCILOR");
        CityCouncilorButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CityCouncilorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CityCouncilorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CityCouncilorButtonMouseClicked(evt);
            }
        });
        LOCAL.add(CityCouncilorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 260, 40));

        BarangayCaptainButton.setBackground(new java.awt.Color(255, 255, 255));
        BarangayCaptainButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BarangayCaptainButton.setText("BARANGAY CAPTAIN");
        BarangayCaptainButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BarangayCaptainButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BarangayCaptainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarangayCaptainButtonMouseClicked(evt);
            }
        });
        LOCAL.add(BarangayCaptainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 260, 40));

        BarangayCouncilorButton.setBackground(new java.awt.Color(255, 255, 255));
        BarangayCouncilorButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BarangayCouncilorButton.setText("BARANGAY COUNCILOR");
        BarangayCouncilorButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BarangayCouncilorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BarangayCouncilorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarangayCouncilorButtonMouseClicked(evt);
            }
        });
        LOCAL.add(BarangayCouncilorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 260, 40));

        Elections.add(LOCAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 600));

        STATE.setBackground(new java.awt.Color(255, 0, 0));
        STATE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        STATE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StateLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        StateLabel.setForeground(new java.awt.Color(255, 255, 255));
        StateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StateLabel.setText("STATE");
        STATE.add(StateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 308, 71));

        ViceGovernorButton.setBackground(new java.awt.Color(255, 255, 255));
        ViceGovernorButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ViceGovernorButton.setText("VICE GOVERNOR");
        ViceGovernorButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ViceGovernorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViceGovernorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViceGovernorButtonMouseClicked(evt);
            }
        });
        STATE.add(ViceGovernorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 40));

        PBMButton.setBackground(new java.awt.Color(255, 255, 255));
        PBMButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PBMButton.setText("PBM");
        PBMButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PBMButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PBMButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PBMButtonMouseClicked(evt);
            }
        });
        STATE.add(PBMButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 250, 40));

        GovernorButton.setBackground(new java.awt.Color(255, 255, 255));
        GovernorButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GovernorButton.setText("GOVERNOR");
        GovernorButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        GovernorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GovernorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GovernorButtonMouseClicked(evt);
            }
        });
        STATE.add(GovernorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 250, 40));

        Elections.add(STATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 310, 600));

        NATIONAL.setBackground(new java.awt.Color(51, 204, 0));
        NATIONAL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        NATIONAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NationalLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        NationalLabel.setForeground(new java.awt.Color(255, 255, 255));
        NationalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NationalLabel.setText("NATIONAL");
        NATIONAL.add(NationalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 308, 71));

        VicePresidentButton.setBackground(new java.awt.Color(255, 255, 255));
        VicePresidentButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        VicePresidentButton.setText("VICE-PRESIDENT");
        VicePresidentButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        VicePresidentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VicePresidentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VicePresidentButtonMouseClicked(evt);
            }
        });
        NATIONAL.add(VicePresidentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 40));

        SenatorButton.setBackground(new java.awt.Color(255, 255, 255));
        SenatorButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SenatorButton.setText("SENATOR");
        SenatorButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SenatorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SenatorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SenatorButtonMouseClicked(evt);
            }
        });
        NATIONAL.add(SenatorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 250, 40));

        PartyListsButton.setBackground(new java.awt.Color(255, 255, 255));
        PartyListsButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PartyListsButton.setText("PARTYLISTS");
        PartyListsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PartyListsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PartyListsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PartyListsButtonMouseClicked(evt);
            }
        });
        NATIONAL.add(PartyListsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 250, 40));

        PresidentButton.setBackground(new java.awt.Color(255, 255, 255));
        PresidentButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PresidentButton.setText("PRESIDENT");
        PresidentButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PresidentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PresidentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PresidentButtonMouseClicked(evt);
            }
        });
        NATIONAL.add(PresidentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 250, 40));

        Elections.add(NATIONAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 310, 600));

        SK.setBackground(new java.awt.Color(255, 204, 0));
        SK.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SKLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        SKLabel.setForeground(new java.awt.Color(255, 255, 255));
        SKLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SKLabel.setText("SK");
        SK.add(SKLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 308, 71));

        SKCHAIRMAN.setBackground(new java.awt.Color(255, 255, 255));
        SKCHAIRMAN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SKCHAIRMAN.setText("SK CHAIRMAN");
        SKCHAIRMAN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SKCHAIRMAN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SKCHAIRMAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKCHAIRMANMouseClicked(evt);
            }
        });
        SK.add(SKCHAIRMAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 250, 40));

        SKCOUNCILOR.setBackground(new java.awt.Color(255, 255, 255));
        SKCOUNCILOR.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SKCOUNCILOR.setText("SK COUNCILOR");
        SKCOUNCILOR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SKCOUNCILOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SKCOUNCILOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKCOUNCILORMouseClicked(evt);
            }
        });
        SK.add(SKCOUNCILOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 40));

        Elections.add(SK, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 310, 600));

        PositionTabs.addTab("tab16", Elections);

        ManageMayor.setBackground(new java.awt.Color(25, 18, 211));
        ManageMayor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ManageMayor.setEnabled(false);
        ManageMayor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MayorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane2.setViewportView(MayorTable);

        ManageMayor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        SwitchContainer.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel1.setText("Input the Ballot# ");
        SwitchContainer.add(DeleteLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF1.setEnabled(false);
        SwitchContainer.add(AddCandidateTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF1.setEnabled(false);
        SwitchContainer.add(DeleteCandidateTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate1.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate1.setText("ADD");
        AddCandidate1.setEnabled(false);
        SwitchContainer.add(AddCandidate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate1.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate1.setText("DELETE");
        DeleteCandidate1.setEnabled(false);
        SwitchContainer.add(DeleteCandidate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel1.setText("Add a Candidate");
        SwitchContainer.add(AddLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH1.setText("ON");
        SWITCH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH1MouseClicked(evt);
            }
        });
        SwitchContainer.add(SWITCH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageMayor.add(SwitchContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        PositionLabel1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel1.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel1.setText("MAYOR");
        ManageMayor.add(PositionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        BackButton1.setBackground(new java.awt.Color(255, 255, 255));
        BackButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton1.setText("BACK");
        BackButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton1MouseClicked(evt);
            }
        });
        ManageMayor.add(BackButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab1", ManageMayor);

        ManageViceMayor.setBackground(new java.awt.Color(25, 18, 211));
        ManageViceMayor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane4.setViewportView(ViceMayorTable);

        ManageViceMayor.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel2.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel2.setText("VICE-MAYOR");
        ManageViceMayor.add(PositionLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer2.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel2.setText("Input the Ballot# ");
        SwitchContainer2.add(DeleteLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF2.setEnabled(false);
        SwitchContainer2.add(AddCandidateTF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF2.setEnabled(false);
        SwitchContainer2.add(DeleteCandidateTF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate2.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate2.setText("ADD");
        AddCandidate2.setEnabled(false);
        SwitchContainer2.add(AddCandidate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate2.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate2.setText("DELETE");
        DeleteCandidate2.setEnabled(false);
        SwitchContainer2.add(DeleteCandidate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel2.setText("Add a Candidate");
        SwitchContainer2.add(AddLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH2.setText("ON");
        SWITCH2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH2MouseClicked(evt);
            }
        });
        SwitchContainer2.add(SWITCH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageViceMayor.add(SwitchContainer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton2.setBackground(new java.awt.Color(255, 255, 255));
        BackButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton2.setText("BACK");
        BackButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton2MouseClicked(evt);
            }
        });
        ManageViceMayor.add(BackButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab2", ManageViceMayor);

        ManageCongressman.setBackground(new java.awt.Color(25, 18, 211));
        ManageCongressman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane5.setViewportView(ViceMayorTable1);

        ManageCongressman.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        MayorLabel3.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        MayorLabel3.setForeground(new java.awt.Color(255, 255, 255));
        MayorLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MayorLabel3.setText("CONGRESSMAN");
        ManageCongressman.add(MayorLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer3.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel3.setText("Input the Ballot# ");
        SwitchContainer3.add(DeleteLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF3.setEnabled(false);
        SwitchContainer3.add(AddCandidateTF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF3.setEnabled(false);
        SwitchContainer3.add(DeleteCandidateTF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate3.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate3.setText("ADD");
        AddCandidate3.setEnabled(false);
        SwitchContainer3.add(AddCandidate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate3.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate3.setText("DELETE");
        DeleteCandidate3.setEnabled(false);
        SwitchContainer3.add(DeleteCandidate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel3.setText("Add a Candidate");
        SwitchContainer3.add(AddLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH3.setText("ON");
        SWITCH3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH3MouseClicked(evt);
            }
        });
        SwitchContainer3.add(SWITCH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageCongressman.add(SwitchContainer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton3.setBackground(new java.awt.Color(255, 255, 255));
        BackButton3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton3.setText("BACK");
        BackButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton3MouseClicked(evt);
            }
        });
        ManageCongressman.add(BackButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab3", ManageCongressman);

        ManageCityCouncilor.setBackground(new java.awt.Color(25, 18, 211));
        ManageCityCouncilor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane6.setViewportView(ViceMayorTable2);

        ManageCityCouncilor.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel4.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel4.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel4.setText("CITY COUNCILOR");
        ManageCityCouncilor.add(PositionLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer4.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel4.setText("Input the Ballot# ");
        SwitchContainer4.add(DeleteLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF4.setEnabled(false);
        SwitchContainer4.add(AddCandidateTF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF4.setEnabled(false);
        SwitchContainer4.add(DeleteCandidateTF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate4.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate4.setText("ADD");
        AddCandidate4.setEnabled(false);
        SwitchContainer4.add(AddCandidate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate4.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate4.setText("DELETE");
        DeleteCandidate4.setEnabled(false);
        SwitchContainer4.add(DeleteCandidate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel4.setText("Add a Candidate");
        SwitchContainer4.add(AddLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH4.setText("ON");
        SWITCH4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH4MouseClicked(evt);
            }
        });
        SwitchContainer4.add(SWITCH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageCityCouncilor.add(SwitchContainer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton4.setBackground(new java.awt.Color(255, 255, 255));
        BackButton4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton4.setText("BACK");
        BackButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton4MouseClicked(evt);
            }
        });
        ManageCityCouncilor.add(BackButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab4", ManageCityCouncilor);

        ManageBarangayCaptain.setBackground(new java.awt.Color(25, 18, 211));
        ManageBarangayCaptain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane7.setViewportView(ViceMayorTable3);

        ManageBarangayCaptain.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel5.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel5.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel5.setText("BARANGAY CAPTAIN");
        ManageBarangayCaptain.add(PositionLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer5.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel5.setText("Input the Ballot# ");
        SwitchContainer5.add(DeleteLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF5.setEnabled(false);
        SwitchContainer5.add(AddCandidateTF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF5.setEnabled(false);
        SwitchContainer5.add(DeleteCandidateTF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate5.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate5.setText("ADD");
        AddCandidate5.setEnabled(false);
        SwitchContainer5.add(AddCandidate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate5.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate5.setText("DELETE");
        DeleteCandidate5.setEnabled(false);
        SwitchContainer5.add(DeleteCandidate5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel5.setText("Add a Candidate");
        SwitchContainer5.add(AddLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH5.setText("ON");
        SWITCH5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH5MouseClicked(evt);
            }
        });
        SwitchContainer5.add(SWITCH5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageBarangayCaptain.add(SwitchContainer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton5.setBackground(new java.awt.Color(255, 255, 255));
        BackButton5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton5.setText("BACK");
        BackButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton5MouseClicked(evt);
            }
        });
        ManageBarangayCaptain.add(BackButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab5", ManageBarangayCaptain);

        ManageBarangayCouncilor.setBackground(new java.awt.Color(25, 18, 211));
        ManageBarangayCouncilor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane8.setViewportView(ViceMayorTable4);

        ManageBarangayCouncilor.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel6.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel6.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel6.setText("BARANGAY COUNCILOR");
        ManageBarangayCouncilor.add(PositionLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer6.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel6.setText("Input the Ballot# ");
        SwitchContainer6.add(DeleteLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF6.setEnabled(false);
        SwitchContainer6.add(AddCandidateTF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF6.setEnabled(false);
        SwitchContainer6.add(DeleteCandidateTF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate6.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate6.setText("ADD");
        AddCandidate6.setEnabled(false);
        SwitchContainer6.add(AddCandidate6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate6.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate6.setText("DELETE");
        DeleteCandidate6.setEnabled(false);
        SwitchContainer6.add(DeleteCandidate6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel6.setText("Add a Candidate");
        SwitchContainer6.add(AddLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH6.setText("ON");
        SWITCH6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH6MouseClicked(evt);
            }
        });
        SwitchContainer6.add(SWITCH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageBarangayCouncilor.add(SwitchContainer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton6.setBackground(new java.awt.Color(255, 255, 255));
        BackButton6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton6.setText("BACK");
        BackButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton6MouseClicked(evt);
            }
        });
        ManageBarangayCouncilor.add(BackButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab6", ManageBarangayCouncilor);

        ManageGovernor.setBackground(new java.awt.Color(255, 0, 0));
        ManageGovernor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane9.setViewportView(ViceMayorTable5);

        ManageGovernor.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel7.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel7.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel7.setText("GOVERNOR");
        ManageGovernor.add(PositionLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer7.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel7.setText("Input the Ballot# ");
        SwitchContainer7.add(DeleteLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF7.setEnabled(false);
        SwitchContainer7.add(AddCandidateTF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF7.setEnabled(false);
        SwitchContainer7.add(DeleteCandidateTF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate7.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate7.setText("ADD");
        AddCandidate7.setEnabled(false);
        SwitchContainer7.add(AddCandidate7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate7.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate7.setText("DELETE");
        DeleteCandidate7.setEnabled(false);
        SwitchContainer7.add(DeleteCandidate7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel7.setText("Add a Candidate");
        SwitchContainer7.add(AddLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH7.setText("ON");
        SWITCH7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH7MouseClicked(evt);
            }
        });
        SwitchContainer7.add(SWITCH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageGovernor.add(SwitchContainer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton7.setBackground(new java.awt.Color(255, 255, 255));
        BackButton7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton7.setText("BACK");
        BackButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton7MouseClicked(evt);
            }
        });
        ManageGovernor.add(BackButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab7", ManageGovernor);

        ManageViceGovernor.setBackground(new java.awt.Color(255, 0, 0));
        ManageViceGovernor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane10.setViewportView(ViceMayorTable6);

        ManageViceGovernor.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel8.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel8.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel8.setText("VICE-GOVERNOR");
        ManageViceGovernor.add(PositionLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer8.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel8.setText("Input the Ballot# ");
        SwitchContainer8.add(DeleteLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF8.setEnabled(false);
        SwitchContainer8.add(AddCandidateTF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF8.setEnabled(false);
        SwitchContainer8.add(DeleteCandidateTF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate8.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate8.setText("ADD");
        AddCandidate8.setEnabled(false);
        SwitchContainer8.add(AddCandidate8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate8.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate8.setText("DELETE");
        DeleteCandidate8.setEnabled(false);
        SwitchContainer8.add(DeleteCandidate8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel8.setText("Add a Candidate");
        SwitchContainer8.add(AddLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH8.setText("ON");
        SWITCH8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH8MouseClicked(evt);
            }
        });
        SwitchContainer8.add(SWITCH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageViceGovernor.add(SwitchContainer8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton8.setBackground(new java.awt.Color(255, 255, 255));
        BackButton8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton8.setText("BACK");
        BackButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton8MouseClicked(evt);
            }
        });
        ManageViceGovernor.add(BackButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab8", ManageViceGovernor);

        ManagePBM.setBackground(new java.awt.Color(255, 0, 0));
        ManagePBM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane11.setViewportView(ViceMayorTable7);

        ManagePBM.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel9.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel9.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel9.setText("PROVINCIAL BOARD MEMBERS");
        ManagePBM.add(PositionLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer9.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel9.setText("Input the Ballot# ");
        SwitchContainer9.add(DeleteLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF9.setEnabled(false);
        SwitchContainer9.add(AddCandidateTF9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF9.setEnabled(false);
        SwitchContainer9.add(DeleteCandidateTF9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate9.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate9.setText("ADD");
        AddCandidate9.setEnabled(false);
        SwitchContainer9.add(AddCandidate9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate9.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate9.setText("DELETE");
        DeleteCandidate9.setEnabled(false);
        SwitchContainer9.add(DeleteCandidate9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel9.setText("Add a Candidate");
        SwitchContainer9.add(AddLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH9.setText("ON");
        SWITCH9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH9MouseClicked(evt);
            }
        });
        SwitchContainer9.add(SWITCH9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManagePBM.add(SwitchContainer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton9.setBackground(new java.awt.Color(255, 255, 255));
        BackButton9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton9.setText("BACK");
        BackButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton9MouseClicked(evt);
            }
        });
        ManagePBM.add(BackButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab9", ManagePBM);

        ManagePresident.setBackground(new java.awt.Color(51, 204, 0));
        ManagePresident.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane12.setViewportView(ViceMayorTable8);

        ManagePresident.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel10.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel10.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel10.setText("PRESIDENT");
        ManagePresident.add(PositionLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer10.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel10.setText("Input the Ballot# ");
        SwitchContainer10.add(DeleteLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF10.setEnabled(false);
        SwitchContainer10.add(AddCandidateTF10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF10.setEnabled(false);
        SwitchContainer10.add(DeleteCandidateTF10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate10.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate10.setText("ADD");
        AddCandidate10.setEnabled(false);
        SwitchContainer10.add(AddCandidate10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate10.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate10.setText("DELETE");
        DeleteCandidate10.setEnabled(false);
        SwitchContainer10.add(DeleteCandidate10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel10.setText("Add a Candidate");
        SwitchContainer10.add(AddLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH10.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH10.setText("ON");
        SWITCH10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH10MouseClicked(evt);
            }
        });
        SwitchContainer10.add(SWITCH10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManagePresident.add(SwitchContainer10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton10.setBackground(new java.awt.Color(255, 255, 255));
        BackButton10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton10.setText("BACK");
        BackButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton10MouseClicked(evt);
            }
        });
        ManagePresident.add(BackButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab10", ManagePresident);

        ManageVicePresident.setBackground(new java.awt.Color(51, 204, 0));
        ManageVicePresident.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane13.setViewportView(ViceMayorTable9);

        ManageVicePresident.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel11.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel11.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel11.setText("VICE-PRESIDENT");
        ManageVicePresident.add(PositionLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer11.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel11.setText("Input the Ballot# ");
        SwitchContainer11.add(DeleteLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF11.setEnabled(false);
        SwitchContainer11.add(AddCandidateTF11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF11.setEnabled(false);
        SwitchContainer11.add(DeleteCandidateTF11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate11.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate11.setText("ADD");
        AddCandidate11.setEnabled(false);
        SwitchContainer11.add(AddCandidate11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate11.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate11.setText("DELETE");
        DeleteCandidate11.setEnabled(false);
        SwitchContainer11.add(DeleteCandidate11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel11.setText("Add a Candidate");
        SwitchContainer11.add(AddLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH11.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH11.setText("ON");
        SWITCH11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH11MouseClicked(evt);
            }
        });
        SwitchContainer11.add(SWITCH11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageVicePresident.add(SwitchContainer11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton11.setBackground(new java.awt.Color(255, 255, 255));
        BackButton11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton11.setText("BACK");
        BackButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton11MouseClicked(evt);
            }
        });
        ManageVicePresident.add(BackButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab11", ManageVicePresident);

        ManageSenator.setBackground(new java.awt.Color(51, 204, 0));
        ManageSenator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane14.setViewportView(ViceMayorTable10);

        ManageSenator.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel12.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel12.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel12.setText("SENATORS");
        ManageSenator.add(PositionLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer12.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel12.setText("Input the Ballot# ");
        SwitchContainer12.add(DeleteLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF12.setEnabled(false);
        SwitchContainer12.add(AddCandidateTF12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF12.setEnabled(false);
        SwitchContainer12.add(DeleteCandidateTF12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate12.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate12.setText("ADD");
        AddCandidate12.setEnabled(false);
        SwitchContainer12.add(AddCandidate12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate12.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate12.setText("DELETE");
        DeleteCandidate12.setEnabled(false);
        SwitchContainer12.add(DeleteCandidate12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel12.setText("Add a Candidate");
        SwitchContainer12.add(AddLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH12.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH12.setText("ON");
        SWITCH12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH12MouseClicked(evt);
            }
        });
        SwitchContainer12.add(SWITCH12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageSenator.add(SwitchContainer12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton12.setBackground(new java.awt.Color(255, 255, 255));
        BackButton12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton12.setText("BACK");
        BackButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton12MouseClicked(evt);
            }
        });
        ManageSenator.add(BackButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab12", ManageSenator);

        ManagePartylists.setBackground(new java.awt.Color(51, 204, 0));
        ManagePartylists.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane15.setViewportView(ViceMayorTable11);

        ManagePartylists.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel13.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel13.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel13.setText("PARTYLISTS");
        ManagePartylists.add(PositionLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer13.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel13.setText("Input the Ballot# ");
        SwitchContainer13.add(DeleteLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF13.setEnabled(false);
        SwitchContainer13.add(AddCandidateTF13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF13.setEnabled(false);
        SwitchContainer13.add(DeleteCandidateTF13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate13.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate13.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate13.setText("ADD");
        AddCandidate13.setEnabled(false);
        SwitchContainer13.add(AddCandidate13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate13.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate13.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate13.setText("DELETE");
        DeleteCandidate13.setEnabled(false);
        SwitchContainer13.add(DeleteCandidate13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel13.setText("Add a Candidate");
        SwitchContainer13.add(AddLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH13.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH13.setText("ON");
        SWITCH13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH13MouseClicked(evt);
            }
        });
        SwitchContainer13.add(SWITCH13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManagePartylists.add(SwitchContainer13, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton13.setBackground(new java.awt.Color(255, 255, 255));
        BackButton13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton13.setText("BACK");
        BackButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton13MouseClicked(evt);
            }
        });
        ManagePartylists.add(BackButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab13", ManagePartylists);

        ManageSKChairman.setBackground(new java.awt.Color(255, 204, 0));
        ManageSKChairman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane16.setViewportView(ViceMayorTable12);

        ManageSKChairman.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel14.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel14.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel14.setText("SK CHAIRMAN");
        ManageSKChairman.add(PositionLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer14.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel14.setText("Input the Ballot# ");
        SwitchContainer14.add(DeleteLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF14.setEnabled(false);
        SwitchContainer14.add(AddCandidateTF14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF14.setEnabled(false);
        SwitchContainer14.add(DeleteCandidateTF14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate14.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate14.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate14.setText("ADD");
        AddCandidate14.setEnabled(false);
        SwitchContainer14.add(AddCandidate14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate14.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate14.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate14.setText("DELETE");
        DeleteCandidate14.setEnabled(false);
        SwitchContainer14.add(DeleteCandidate14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel14.setText("Add a Candidate");
        SwitchContainer14.add(AddLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH14.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH14.setText("ON");
        SWITCH14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH14MouseClicked(evt);
            }
        });
        SwitchContainer14.add(SWITCH14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageSKChairman.add(SwitchContainer14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton14.setBackground(new java.awt.Color(255, 255, 255));
        BackButton14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton14.setText("BACK");
        BackButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton14MouseClicked(evt);
            }
        });
        ManageSKChairman.add(BackButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab14", ManageSKChairman);

        ManageSKCouncilor.setBackground(new java.awt.Color(255, 204, 0));
        ManageSKCouncilor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViceMayorTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jScrollPane17.setViewportView(ViceMayorTable13);

        ManageSKCouncilor.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 443));

        PositionLabel15.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PositionLabel15.setForeground(new java.awt.Color(255, 255, 255));
        PositionLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PositionLabel15.setText("SK COUNCILORS");
        ManageSKCouncilor.add(PositionLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1240, 60));

        SwitchContainer15.setBackground(new java.awt.Color(204, 204, 204));
        SwitchContainer15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SwitchContainer15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeleteLabel15.setText("Input the Ballot# ");
        SwitchContainer15.add(DeleteLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 30));

        AddCandidateTF15.setEnabled(false);
        SwitchContainer15.add(AddCandidateTF15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 40));

        DeleteCandidateTF15.setEnabled(false);
        SwitchContainer15.add(DeleteCandidateTF15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 40));

        AddCandidate15.setBackground(new java.awt.Color(51, 204, 0));
        AddCandidate15.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        AddCandidate15.setText("ADD");
        AddCandidate15.setEnabled(false);
        SwitchContainer15.add(AddCandidate15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 105, -1, 45));

        DeleteCandidate15.setBackground(new java.awt.Color(255, 0, 0));
        DeleteCandidate15.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        DeleteCandidate15.setText("DELETE");
        DeleteCandidate15.setEnabled(false);
        SwitchContainer15.add(DeleteCandidate15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 195, -1, 45));

        AddLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddLabel15.setText("Add a Candidate");
        SwitchContainer15.add(AddLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        SWITCH15.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        SWITCH15.setText("ON");
        SWITCH15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SWITCH15MouseClicked(evt);
            }
        });
        SwitchContainer15.add(SWITCH15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        ManageSKCouncilor.add(SwitchContainer15, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 380, 270));

        BackButton16.setBackground(new java.awt.Color(255, 255, 255));
        BackButton16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BackButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKBUTTON.png"))); // NOI18N
        BackButton16.setText("BACK");
        BackButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButton16MouseClicked(evt);
            }
        });
        ManageSKCouncilor.add(BackButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 130, 50));

        PositionTabs.addTab("tab15", ManageSKCouncilor);

        ManageElectionsPanel.add(PositionTabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1240, 630));

        MainTab.addTab("tab3", ManageElectionsPanel);

        ManageResultsPanel.setLayout(new java.awt.GridLayout());

        LocalResult.setBackground(new java.awt.Color(25, 18, 211));
        LocalResult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        LocalResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LocalLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        LocalLabel1.setForeground(new java.awt.Color(255, 255, 255));
        LocalLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LocalLabel1.setText("LOCAL");
        LocalResult.add(LocalLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 308, 71));

        LocalTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        LocalTableResult.setEnabled(false);
        jScrollPane18.setViewportView(LocalTableResult);

        LocalResult.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 290, -1));

        ManageResultsPanel.add(LocalResult);

        StateResult.setBackground(new java.awt.Color(255, 0, 0));
        StateResult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        StateResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StateLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        StateLabel1.setForeground(new java.awt.Color(255, 255, 255));
        StateLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StateLabel1.setText("STATE");
        StateResult.add(StateLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 308, 71));

        StateTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        StateTableResult.setEnabled(false);
        jScrollPane19.setViewportView(StateTableResult);

        StateResult.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 290, -1));

        ManageResultsPanel.add(StateResult);

        NationalResult.setBackground(new java.awt.Color(51, 204, 0));
        NationalResult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        NationalResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NationalLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        NationalLabel1.setForeground(new java.awt.Color(255, 255, 255));
        NationalLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NationalLabel1.setText("NATIONAL");
        NationalResult.add(NationalLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 308, 71));

        NationalTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        NationalTableResult.setEnabled(false);
        jScrollPane20.setViewportView(NationalTableResult);

        NationalResult.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 290, -1));

        ManageResultsPanel.add(NationalResult);

        SKResult.setBackground(new java.awt.Color(255, 204, 0));
        SKResult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SKResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SKLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        SKLabel1.setForeground(new java.awt.Color(255, 255, 255));
        SKLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SKLabel1.setText("SK");
        SKResult.add(SKLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 308, 71));

        jScrollPane3.setEnabled(false);

        SKTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        SKTableResult.setEnabled(false);
        jScrollPane3.setViewportView(SKTableResult);

        SKResult.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 290, -1));

        ManageResultsPanel.add(SKResult);

        MainTab.addTab("tab4", ManageResultsPanel);

        MainContainer.add(MainTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1240, 620));

        getContentPane().add(MainContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 700));

        setSize(new java.awt.Dimension(1240, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
      System.exit(0);
    }//GEN-LAST:event_EXITMouseClicked

    private void MINIMIZEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZEMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_MINIMIZEMouseClicked

    private void ManageAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageAccountsMouseClicked
        switchPanel(1, ManageAccounts, Home, ManageElections, ManageResults);
    }//GEN-LAST:event_ManageAccountsMouseClicked

    private void ManageElectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageElectionsMouseClicked
        switchPanel(2, ManageElections, Home, ManageAccounts, ManageResults);
        PositionTabs.setSelectedIndex(0);
    }//GEN-LAST:event_ManageElectionsMouseClicked

    private void ManageResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageResultsMouseClicked
        switchPanel(3, ManageResults, Home, ManageAccounts, ManageElections);
    }//GEN-LAST:event_ManageResultsMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        switchPanel(0, Home, ManageAccounts, ManageElections, ManageResults);
    }//GEN-LAST:event_HomeMouseClicked

    private void MayorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MayorButtonMouseClicked
        selectPanel(PositionTabs, 1);
    }//GEN-LAST:event_MayorButtonMouseClicked

    private void SWITCH1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH1MouseClicked
        if (SWITCH1.isSelected()) {
            SWITCH1.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate1);
            turnOn(DeleteCandidate1);
            turnOn(AddCandidateTF1);
            turnOn(DeleteCandidateTF1);
        } else {
            SWITCH1.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate1);
            turnOff(DeleteCandidate1);
            turnOff(AddCandidateTF1);
            turnOff(DeleteCandidateTF1);
        }

    }//GEN-LAST:event_SWITCH1MouseClicked

    private void SWITCH2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH2MouseClicked
       if (SWITCH2.isSelected()) {
            SWITCH2.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate2);
            turnOn(DeleteCandidate2);
            turnOn(AddCandidateTF2);
            turnOn(DeleteCandidateTF2);
        } else {
            SWITCH2.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate2);
            turnOff(DeleteCandidate2);
            turnOff(AddCandidateTF2);
            turnOff(DeleteCandidateTF2);
        }
    }//GEN-LAST:event_SWITCH2MouseClicked

    private void ViceMayorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViceMayorButtonMouseClicked
        selectPanel(PositionTabs, 2);
    }//GEN-LAST:event_ViceMayorButtonMouseClicked

    private void CongressmanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CongressmanButtonMouseClicked
        selectPanel(PositionTabs, 3);
    }//GEN-LAST:event_CongressmanButtonMouseClicked

    private void CityCouncilorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CityCouncilorButtonMouseClicked
        selectPanel(PositionTabs, 4);
    }//GEN-LAST:event_CityCouncilorButtonMouseClicked

    private void BarangayCaptainButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarangayCaptainButtonMouseClicked
        selectPanel(PositionTabs, 5);
    }//GEN-LAST:event_BarangayCaptainButtonMouseClicked

    private void BarangayCouncilorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarangayCouncilorButtonMouseClicked
        selectPanel(PositionTabs, 6);
    }//GEN-LAST:event_BarangayCouncilorButtonMouseClicked

    private void ViceGovernorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViceGovernorButtonMouseClicked
        selectPanel(PositionTabs, 8);
    }//GEN-LAST:event_ViceGovernorButtonMouseClicked

    private void PBMButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PBMButtonMouseClicked
        selectPanel(PositionTabs, 9);
    }//GEN-LAST:event_PBMButtonMouseClicked

    private void GovernorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GovernorButtonMouseClicked
        selectPanel(PositionTabs, 7);
    }//GEN-LAST:event_GovernorButtonMouseClicked

    private void VicePresidentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VicePresidentButtonMouseClicked
        selectPanel(PositionTabs, 11);
    }//GEN-LAST:event_VicePresidentButtonMouseClicked

    private void SenatorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SenatorButtonMouseClicked
         selectPanel(PositionTabs, 12);
    }//GEN-LAST:event_SenatorButtonMouseClicked

    private void PartyListsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PartyListsButtonMouseClicked
        selectPanel(PositionTabs, 13);
    }//GEN-LAST:event_PartyListsButtonMouseClicked

    private void PresidentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PresidentButtonMouseClicked
       selectPanel(PositionTabs, 10);
    }//GEN-LAST:event_PresidentButtonMouseClicked

    private void SKCHAIRMANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKCHAIRMANMouseClicked
        selectPanel(PositionTabs, 14);
    }//GEN-LAST:event_SKCHAIRMANMouseClicked

    private void SKCOUNCILORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKCOUNCILORMouseClicked
        selectPanel(PositionTabs, 15);
    }//GEN-LAST:event_SKCOUNCILORMouseClicked

    private void BackButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton1MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton1MouseClicked

    private void BackButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton2MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton2MouseClicked

    private void SWITCH3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH3MouseClicked
        if (SWITCH3.isSelected()) {
            SWITCH3.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate3);
            turnOn(DeleteCandidate3);
            turnOn(AddCandidateTF3);
            turnOn(DeleteCandidateTF3);
        } else {
            SWITCH3.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate3);
            turnOff(DeleteCandidate3);
            turnOff(AddCandidateTF3);
            turnOff(DeleteCandidateTF3);
        }
    }//GEN-LAST:event_SWITCH3MouseClicked

    private void SWITCH4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH4MouseClicked
        if (SWITCH4.isSelected()) {
            SWITCH4.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate4);
            turnOn(DeleteCandidate4);
            turnOn(AddCandidateTF4);
            turnOn(DeleteCandidateTF4);
        } else {
            SWITCH4.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate4);
            turnOff(DeleteCandidate4);
            turnOff(AddCandidateTF4);
            turnOff(DeleteCandidateTF4);
        }
    }//GEN-LAST:event_SWITCH4MouseClicked

    private void BackButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton4MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton4MouseClicked

    private void SWITCH5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH5MouseClicked
        if (SWITCH5.isSelected()) {
            SWITCH5.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate5);
            turnOn(DeleteCandidate5);
            turnOn(AddCandidateTF5);
            turnOn(DeleteCandidateTF5);
        } else {
            SWITCH5.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate5);
            turnOff(DeleteCandidate5);
            turnOff(AddCandidateTF5);
            turnOff(DeleteCandidateTF5);
        }
    }//GEN-LAST:event_SWITCH5MouseClicked

    private void BackButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton5MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton5MouseClicked

    private void SWITCH6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH6MouseClicked
       if (SWITCH6.isSelected()) {
            SWITCH6.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate6);
            turnOn(DeleteCandidate6);
            turnOn(AddCandidateTF6);
            turnOn(DeleteCandidateTF6);
        } else {
            SWITCH6.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate6);
            turnOff(DeleteCandidate6);
            turnOff(AddCandidateTF6);
            turnOff(DeleteCandidateTF6);
        }
    }//GEN-LAST:event_SWITCH6MouseClicked

    private void BackButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton6MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton6MouseClicked

    private void SWITCH7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH7MouseClicked
        if (SWITCH7.isSelected()) {
            SWITCH7.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate7);
            turnOn(DeleteCandidate7);
            turnOn(AddCandidateTF7);
            turnOn(DeleteCandidateTF7);
        } else {
            SWITCH7.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate7);
            turnOff(DeleteCandidate7);
            turnOff(AddCandidateTF7);
            turnOff(DeleteCandidateTF7);
        }
    }//GEN-LAST:event_SWITCH7MouseClicked

    private void BackButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton7MouseClicked
       backButton(PositionTabs);
    }//GEN-LAST:event_BackButton7MouseClicked

    private void SWITCH8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH8MouseClicked
       if (SWITCH8.isSelected()) {
            SWITCH8.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate8);
            turnOn(DeleteCandidate8);
            turnOn(AddCandidateTF8);
            turnOn(DeleteCandidateTF8);
        } else {
            SWITCH8.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate8);
            turnOff(DeleteCandidate8);
            turnOff(AddCandidateTF8);
            turnOff(DeleteCandidateTF8);
        }
    }//GEN-LAST:event_SWITCH8MouseClicked

    private void BackButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton8MouseClicked
       backButton(PositionTabs);
    }//GEN-LAST:event_BackButton8MouseClicked

    private void SWITCH9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH9MouseClicked
        if (SWITCH9.isSelected()) {
            SWITCH9.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate9);
            turnOn(DeleteCandidate9);
            turnOn(AddCandidateTF9);
            turnOn(DeleteCandidateTF9);
        } else {
            SWITCH9.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate9);
            turnOff(DeleteCandidate9);
            turnOff(AddCandidateTF9);
            turnOff(DeleteCandidateTF9);
        }
    }//GEN-LAST:event_SWITCH9MouseClicked

    private void BackButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton9MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton9MouseClicked

    private void SWITCH10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH10MouseClicked
        if (SWITCH10.isSelected()) {
            SWITCH10.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate10);
            turnOn(DeleteCandidate10);
            turnOn(AddCandidateTF10);
            turnOn(DeleteCandidateTF10);
        } else {
            SWITCH10.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate10);
            turnOff(DeleteCandidate10);
            turnOff(AddCandidateTF10);
            turnOff(DeleteCandidateTF10);
        }
    }//GEN-LAST:event_SWITCH10MouseClicked

    private void BackButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton10MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton10MouseClicked

    private void SWITCH11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH11MouseClicked
        if (SWITCH11.isSelected()) {
            SWITCH11.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate11);
            turnOn(DeleteCandidate11);
            turnOn(AddCandidateTF11);
            turnOn(DeleteCandidateTF11);
        } else {
            SWITCH11.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate11);
            turnOff(DeleteCandidate11);
            turnOff(AddCandidateTF11);
            turnOff(DeleteCandidateTF11);
        }
    }//GEN-LAST:event_SWITCH11MouseClicked

    private void BackButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton11MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton11MouseClicked

    private void SWITCH12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH12MouseClicked
        if (SWITCH12.isSelected()) {
            SWITCH12.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate12);
            turnOn(DeleteCandidate12);
            turnOn(AddCandidateTF12);
            turnOn(DeleteCandidateTF12);
        } else {
            SWITCH12.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate12);
            turnOff(DeleteCandidate12);
            turnOff(AddCandidateTF12);
            turnOff(DeleteCandidateTF12);
        }
    }//GEN-LAST:event_SWITCH12MouseClicked

    private void BackButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton12MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton12MouseClicked

    private void SWITCH13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH13MouseClicked
       if (SWITCH13.isSelected()) {
            SWITCH13.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate13);
            turnOn(DeleteCandidate13);
            turnOn(AddCandidateTF13);
            turnOn(DeleteCandidateTF13);
        } else {
            SWITCH13.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate13);
            turnOff(DeleteCandidate13);
            turnOff(AddCandidateTF13);
            turnOff(DeleteCandidateTF13);
        }
    }//GEN-LAST:event_SWITCH13MouseClicked

    private void BackButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton13MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton13MouseClicked

    private void SWITCH14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH14MouseClicked
        if (SWITCH14.isSelected()) {
            SWITCH14.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate14);
            turnOn(DeleteCandidate14);
            turnOn(AddCandidateTF14);
            turnOn(DeleteCandidateTF14);
        } else {
            SWITCH14.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate14);
            turnOff(DeleteCandidate14);
            turnOff(AddCandidateTF14);
            turnOff(DeleteCandidateTF14);
        }
    }//GEN-LAST:event_SWITCH14MouseClicked

    private void BackButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton14MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton14MouseClicked

    private void SWITCH15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SWITCH15MouseClicked
        if (SWITCH15.isSelected()) {
            SWITCH15.setText("OFF");
            SwitchContainer.setBackground(new Color(255,255,255));
            turnOn(AddCandidate15);
            turnOn(DeleteCandidate15);
            turnOn(AddCandidateTF15);
            turnOn(DeleteCandidateTF15);
        } else {
            SWITCH15.setText("ON");
            SwitchContainer.setBackground(new Color(204,204,204));
            turnOff(AddCandidate15);
            turnOff(DeleteCandidate15);
            turnOff(AddCandidateTF15);
            turnOff(DeleteCandidateTF15);
        }
    }//GEN-LAST:event_SWITCH15MouseClicked

    private void BackButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton16MouseClicked
        backButton(PositionTabs);
    }//GEN-LAST:event_BackButton16MouseClicked

    private void BackButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButton3MouseClicked
         backButton(PositionTabs);
    }//GEN-LAST:event_BackButton3MouseClicked

    public void selectPanel(JTabbedPane targetTab, int index){
        targetTab.setSelectedIndex(index);
    }
    
    public void turnOn(JComponent targetComponent){
        targetComponent.setEnabled(true);
    }
    
    public void turnOff(JComponent targetComponent){
        targetComponent.setEnabled(false);
    }
    
    public void backButton(JTabbedPane targetTab){
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
            java.util.logging.Logger.getLogger(AdminMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton AddCandidate1;
    private javax.swing.JButton AddCandidate10;
    private javax.swing.JButton AddCandidate11;
    private javax.swing.JButton AddCandidate12;
    private javax.swing.JButton AddCandidate13;
    private javax.swing.JButton AddCandidate14;
    private javax.swing.JButton AddCandidate15;
    private javax.swing.JButton AddCandidate2;
    private javax.swing.JButton AddCandidate3;
    private javax.swing.JButton AddCandidate4;
    private javax.swing.JButton AddCandidate5;
    private javax.swing.JButton AddCandidate6;
    private javax.swing.JButton AddCandidate7;
    private javax.swing.JButton AddCandidate8;
    private javax.swing.JButton AddCandidate9;
    private javax.swing.JTextField AddCandidateTF1;
    private javax.swing.JTextField AddCandidateTF10;
    private javax.swing.JTextField AddCandidateTF11;
    private javax.swing.JTextField AddCandidateTF12;
    private javax.swing.JTextField AddCandidateTF13;
    private javax.swing.JTextField AddCandidateTF14;
    private javax.swing.JTextField AddCandidateTF15;
    private javax.swing.JTextField AddCandidateTF2;
    private javax.swing.JTextField AddCandidateTF3;
    private javax.swing.JTextField AddCandidateTF4;
    private javax.swing.JTextField AddCandidateTF5;
    private javax.swing.JTextField AddCandidateTF6;
    private javax.swing.JTextField AddCandidateTF7;
    private javax.swing.JTextField AddCandidateTF8;
    private javax.swing.JTextField AddCandidateTF9;
    private javax.swing.JLabel AddLabel1;
    private javax.swing.JLabel AddLabel10;
    private javax.swing.JLabel AddLabel11;
    private javax.swing.JLabel AddLabel12;
    private javax.swing.JLabel AddLabel13;
    private javax.swing.JLabel AddLabel14;
    private javax.swing.JLabel AddLabel15;
    private javax.swing.JLabel AddLabel2;
    private javax.swing.JLabel AddLabel3;
    private javax.swing.JLabel AddLabel4;
    private javax.swing.JLabel AddLabel5;
    private javax.swing.JLabel AddLabel6;
    private javax.swing.JLabel AddLabel7;
    private javax.swing.JLabel AddLabel8;
    private javax.swing.JLabel AddLabel9;
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JLabel AdminLogo;
    private javax.swing.JButton BackButton1;
    private javax.swing.JButton BackButton10;
    private javax.swing.JButton BackButton11;
    private javax.swing.JButton BackButton12;
    private javax.swing.JButton BackButton13;
    private javax.swing.JButton BackButton14;
    private javax.swing.JButton BackButton16;
    private javax.swing.JButton BackButton2;
    private javax.swing.JButton BackButton3;
    private javax.swing.JButton BackButton4;
    private javax.swing.JButton BackButton5;
    private javax.swing.JButton BackButton6;
    private javax.swing.JButton BackButton7;
    private javax.swing.JButton BackButton8;
    private javax.swing.JButton BackButton9;
    private javax.swing.JButton BarangayCaptainButton;
    private javax.swing.JButton BarangayCouncilorButton;
    private javax.swing.JPanel ButtonsContainer;
    private javax.swing.JButton CityCouncilorButton;
    private javax.swing.JButton CongressmanButton;
    private javax.swing.JButton Delete;
    private javax.swing.JButton DeleteCandidate1;
    private javax.swing.JButton DeleteCandidate10;
    private javax.swing.JButton DeleteCandidate11;
    private javax.swing.JButton DeleteCandidate12;
    private javax.swing.JButton DeleteCandidate13;
    private javax.swing.JButton DeleteCandidate14;
    private javax.swing.JButton DeleteCandidate15;
    private javax.swing.JButton DeleteCandidate2;
    private javax.swing.JButton DeleteCandidate3;
    private javax.swing.JButton DeleteCandidate4;
    private javax.swing.JButton DeleteCandidate5;
    private javax.swing.JButton DeleteCandidate6;
    private javax.swing.JButton DeleteCandidate7;
    private javax.swing.JButton DeleteCandidate8;
    private javax.swing.JButton DeleteCandidate9;
    private javax.swing.JTextField DeleteCandidateTF1;
    private javax.swing.JTextField DeleteCandidateTF10;
    private javax.swing.JTextField DeleteCandidateTF11;
    private javax.swing.JTextField DeleteCandidateTF12;
    private javax.swing.JTextField DeleteCandidateTF13;
    private javax.swing.JTextField DeleteCandidateTF14;
    private javax.swing.JTextField DeleteCandidateTF15;
    private javax.swing.JTextField DeleteCandidateTF2;
    private javax.swing.JTextField DeleteCandidateTF3;
    private javax.swing.JTextField DeleteCandidateTF4;
    private javax.swing.JTextField DeleteCandidateTF5;
    private javax.swing.JTextField DeleteCandidateTF6;
    private javax.swing.JTextField DeleteCandidateTF7;
    private javax.swing.JTextField DeleteCandidateTF8;
    private javax.swing.JTextField DeleteCandidateTF9;
    private javax.swing.JLabel DeleteLabel1;
    private javax.swing.JLabel DeleteLabel10;
    private javax.swing.JLabel DeleteLabel11;
    private javax.swing.JLabel DeleteLabel12;
    private javax.swing.JLabel DeleteLabel13;
    private javax.swing.JLabel DeleteLabel14;
    private javax.swing.JLabel DeleteLabel15;
    private javax.swing.JLabel DeleteLabel2;
    private javax.swing.JLabel DeleteLabel3;
    private javax.swing.JLabel DeleteLabel4;
    private javax.swing.JLabel DeleteLabel5;
    private javax.swing.JLabel DeleteLabel6;
    private javax.swing.JLabel DeleteLabel7;
    private javax.swing.JLabel DeleteLabel8;
    private javax.swing.JLabel DeleteLabel9;
    private javax.swing.JPanel Design1;
    private javax.swing.JLabel EXIT;
    private javax.swing.JButton Edit;
    private javax.swing.JPanel Elections;
    private javax.swing.JLabel GO;
    private javax.swing.JPanel GOPANEL;
    private javax.swing.JButton GovernorButton;
    private javax.swing.JLabel HOMEPIC;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel LOCAL;
    private javax.swing.JLabel LocalLabel;
    private javax.swing.JLabel LocalLabel1;
    private javax.swing.JPanel LocalResult;
    private javax.swing.JTable LocalTableResult;
    private javax.swing.JLabel MINIMIZE;
    private javax.swing.JPanel MainContainer;
    private javax.swing.JTabbedPane MainTab;
    private javax.swing.JLabel MainVoterImage;
    private javax.swing.JPanel ManageAccounts;
    private javax.swing.JLabel ManageAccountsLabel;
    private javax.swing.JPanel ManageAccountsPanel;
    private javax.swing.JPanel ManageBarangayCaptain;
    private javax.swing.JPanel ManageBarangayCouncilor;
    private javax.swing.JPanel ManageCityCouncilor;
    private javax.swing.JPanel ManageCongressman;
    private javax.swing.JPanel ManageElections;
    private javax.swing.JLabel ManageElectionsLabel;
    private javax.swing.JPanel ManageElectionsPanel;
    private javax.swing.JPanel ManageGovernor;
    private javax.swing.JPanel ManageMayor;
    private javax.swing.JPanel ManagePBM;
    private javax.swing.JPanel ManagePartylists;
    private javax.swing.JPanel ManagePresident;
    private javax.swing.JPanel ManageResults;
    private javax.swing.JLabel ManageResultsLabel;
    private javax.swing.JPanel ManageResultsPanel;
    private javax.swing.JPanel ManageSKChairman;
    private javax.swing.JPanel ManageSKCouncilor;
    private javax.swing.JPanel ManageSenator;
    private javax.swing.JPanel ManageViceGovernor;
    private javax.swing.JPanel ManageViceMayor;
    private javax.swing.JPanel ManageVicePresident;
    private javax.swing.JButton MayorButton;
    private javax.swing.JLabel MayorLabel3;
    private javax.swing.JTable MayorTable;
    private javax.swing.JPanel NATIONAL;
    private javax.swing.JLabel NationalLabel;
    private javax.swing.JLabel NationalLabel1;
    private javax.swing.JPanel NationalResult;
    private javax.swing.JTable NationalTableResult;
    private javax.swing.JPanel Options;
    private javax.swing.JButton PBMButton;
    private javax.swing.JButton PartyListsButton;
    private javax.swing.JLabel PositionLabel1;
    private javax.swing.JLabel PositionLabel10;
    private javax.swing.JLabel PositionLabel11;
    private javax.swing.JLabel PositionLabel12;
    private javax.swing.JLabel PositionLabel13;
    private javax.swing.JLabel PositionLabel14;
    private javax.swing.JLabel PositionLabel15;
    private javax.swing.JLabel PositionLabel2;
    private javax.swing.JLabel PositionLabel4;
    private javax.swing.JLabel PositionLabel5;
    private javax.swing.JLabel PositionLabel6;
    private javax.swing.JLabel PositionLabel7;
    private javax.swing.JLabel PositionLabel8;
    private javax.swing.JLabel PositionLabel9;
    private javax.swing.JTabbedPane PositionTabs;
    private javax.swing.JButton PresidentButton;
    private javax.swing.JPanel SK;
    private javax.swing.JButton SKCHAIRMAN;
    private javax.swing.JButton SKCOUNCILOR;
    private javax.swing.JLabel SKLabel;
    private javax.swing.JLabel SKLabel1;
    private javax.swing.JPanel SKResult;
    private javax.swing.JTable SKTableResult;
    private javax.swing.JPanel STATE;
    private javax.swing.JToggleButton SWITCH1;
    private javax.swing.JToggleButton SWITCH10;
    private javax.swing.JToggleButton SWITCH11;
    private javax.swing.JToggleButton SWITCH12;
    private javax.swing.JToggleButton SWITCH13;
    private javax.swing.JToggleButton SWITCH14;
    private javax.swing.JToggleButton SWITCH15;
    private javax.swing.JToggleButton SWITCH2;
    private javax.swing.JToggleButton SWITCH3;
    private javax.swing.JToggleButton SWITCH4;
    private javax.swing.JToggleButton SWITCH5;
    private javax.swing.JToggleButton SWITCH6;
    private javax.swing.JToggleButton SWITCH7;
    private javax.swing.JToggleButton SWITCH8;
    private javax.swing.JToggleButton SWITCH9;
    private javax.swing.JLabel Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JButton SenatorButton;
    private javax.swing.JPanel Separator;
    private javax.swing.JLabel StateLabel;
    private javax.swing.JLabel StateLabel1;
    private javax.swing.JPanel StateResult;
    private javax.swing.JTable StateTableResult;
    private javax.swing.JPanel SwitchContainer;
    private javax.swing.JPanel SwitchContainer10;
    private javax.swing.JPanel SwitchContainer11;
    private javax.swing.JPanel SwitchContainer12;
    private javax.swing.JPanel SwitchContainer13;
    private javax.swing.JPanel SwitchContainer14;
    private javax.swing.JPanel SwitchContainer15;
    private javax.swing.JPanel SwitchContainer2;
    private javax.swing.JPanel SwitchContainer3;
    private javax.swing.JPanel SwitchContainer4;
    private javax.swing.JPanel SwitchContainer5;
    private javax.swing.JPanel SwitchContainer6;
    private javax.swing.JPanel SwitchContainer7;
    private javax.swing.JPanel SwitchContainer8;
    private javax.swing.JPanel SwitchContainer9;
    private javax.swing.JPanel Toolbar;
    private javax.swing.JButton ViceGovernorButton;
    private javax.swing.JButton ViceMayorButton;
    private javax.swing.JTable ViceMayorTable;
    private javax.swing.JTable ViceMayorTable1;
    private javax.swing.JTable ViceMayorTable10;
    private javax.swing.JTable ViceMayorTable11;
    private javax.swing.JTable ViceMayorTable12;
    private javax.swing.JTable ViceMayorTable13;
    private javax.swing.JTable ViceMayorTable2;
    private javax.swing.JTable ViceMayorTable3;
    private javax.swing.JTable ViceMayorTable4;
    private javax.swing.JTable ViceMayorTable5;
    private javax.swing.JTable ViceMayorTable6;
    private javax.swing.JTable ViceMayorTable7;
    private javax.swing.JTable ViceMayorTable8;
    private javax.swing.JTable ViceMayorTable9;
    private javax.swing.JButton VicePresidentButton;
    private javax.swing.JPanel VoterINFO;
    private javax.swing.JLabel VoterINFOLabel;
    private javax.swing.JTable VoterInfos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
