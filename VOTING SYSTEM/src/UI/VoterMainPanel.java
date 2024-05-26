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

        dashboardpanel.setBackground(new Color(204,204,204));
        panels = new JPanel[]{dashboardpanel, electionspanel, resultspanel, settingspanel};
        OPTIONSTAB.setSelectedIndex(0);
        currentDateTime();
        this.dateTime = dateTime;
        startDateTimeUpdater();
        showBarChart();
        BackResultsButton.setEnabled(false);
        BackResultsButton.setVisible(false);
       
        FILLER.setEnabled(false);
       FILLER.setVisible(false);
       
       SKBackButton1.setEnabled(false);
       SKBackButton1.setVisible(false);
       
       SKBackButton2.setEnabled(false);
       SKBackButton2.setVisible(false);
       
       
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
        jTabbedPane3 = new javax.swing.JTabbedPane();
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
        GEOINDEX = new javax.swing.JPanel();
        NATIONAL = new javax.swing.JButton();
        LOCAL = new javax.swing.JButton();
        STATE = new javax.swing.JButton();
        BackPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        SKBackButton1 = new javax.swing.JButton();
        SKBackButton2 = new javax.swing.JButton();
        FILLER = new javax.swing.JPanel();
        ElectorateTab = new javax.swing.JTabbedPane();
        EChoiceTab = new javax.swing.JTabbedPane();
        LOCALTAB = new javax.swing.JPanel();
        MayorButton = new javax.swing.JButton();
        ViceMayorButton = new javax.swing.JButton();
        CongressmanButton = new javax.swing.JButton();
        CityCouncilorButton = new javax.swing.JButton();
        BarangayCaptainButton = new javax.swing.JButton();
        BarangayCouncilorsButton = new javax.swing.JButton();
        STATETAB = new javax.swing.JPanel();
        ElectorateChoices1 = new javax.swing.JPanel();
        GOVERNORButton = new javax.swing.JButton();
        VICEGOVERNORButton = new javax.swing.JButton();
        PROVINCIALBOARDMEMBERButton = new javax.swing.JButton();
        NATIONALTAB = new javax.swing.JPanel();
        ElectorateChoices2 = new javax.swing.JPanel();
        PRESIDENTButton = new javax.swing.JButton();
        VICEPRESIDENTButton1 = new javax.swing.JButton();
        SENATORButton2 = new javax.swing.JButton();
        HOUSEOFREPRESENTIVESButton2 = new javax.swing.JButton();
        SKTab = new javax.swing.JPanel();
        SKChairpersonButton = new javax.swing.JButton();
        SKKagawadButton = new javax.swing.JButton();
        SKLabel = new javax.swing.JLabel();
        SKLabel1 = new javax.swing.JLabel();
        MayorTab = new javax.swing.JPanel();
        VOTEFORMAYOR = new javax.swing.JLabel();
        MAYORTABLESCROLL = new javax.swing.JScrollPane();
        MAYORTABLE = new javax.swing.JTable();
        MAYORSCROLL = new javax.swing.JScrollPane();
        MAYORINSTRUCTION = new javax.swing.JTextPane();
        MAYORVOTINGPANEL = new javax.swing.JPanel();
        MAYORSPINNER = new javax.swing.JSpinner();
        MAYORSUBMIT = new javax.swing.JButton();
        MAYORBALLOTNUM = new javax.swing.JLabel();
        MAYORDESIGN1 = new javax.swing.JPanel();
        MAYORDESIGN2 = new javax.swing.JPanel();
        ViceMayorTab = new javax.swing.JPanel();
        VOTEFORVICEMAYOR = new javax.swing.JLabel();
        VICEMAYORTABLESCROLL = new javax.swing.JScrollPane();
        VICEMAYORTABLE = new javax.swing.JTable();
        VICEMAYORSCROLL = new javax.swing.JScrollPane();
        VICEMAYORINSTRUCTION = new javax.swing.JTextPane();
        VICEMAYORVOTINGPANEL = new javax.swing.JPanel();
        VICEMAYORSPINNER = new javax.swing.JSpinner();
        VICEMAYORSUBMIT = new javax.swing.JButton();
        VICEMAYORBALLOTNUM = new javax.swing.JLabel();
        VICEMAYORDESIGN1 = new javax.swing.JPanel();
        VICEMAYORDESIGN2 = new javax.swing.JPanel();
        CongressmanTab = new javax.swing.JPanel();
        VOTEFORCONGRESSMAN = new javax.swing.JLabel();
        CONGRESSMANTABLESCROLL = new javax.swing.JScrollPane();
        CONGRESSMANTABLE = new javax.swing.JTable();
        CONGRESSMANSCROLL = new javax.swing.JScrollPane();
        CONGRESSMANINSTRUCTION = new javax.swing.JTextPane();
        CONGRESSMANVOTINGPANEL = new javax.swing.JPanel();
        CONGRESSMANSPINNER = new javax.swing.JSpinner();
        CONGRESSMANSUBMIT = new javax.swing.JButton();
        CONGRESSMANBALLOTNUM = new javax.swing.JLabel();
        CONGRESSMANDESIGN1 = new javax.swing.JPanel();
        CONGRESSMANDESIGN2 = new javax.swing.JPanel();
        CityCounselorTab = new javax.swing.JPanel();
        VOTEFORCITYCOUNSELOR = new javax.swing.JLabel();
        CITYCOUNSELORTABLESCROLL = new javax.swing.JScrollPane();
        CITYCOUNSELORTABLE = new javax.swing.JTable();
        CITYCOUNSELORSCROLL = new javax.swing.JScrollPane();
        CITYCOUNSELORINSTRUCTION = new javax.swing.JTextPane();
        CITYCOUNSELORVOTINGPANEL = new javax.swing.JPanel();
        CITYCOUNSELORSPINNER = new javax.swing.JSpinner();
        CITYCOUNSELORSUBMIT = new javax.swing.JButton();
        CITYCOUNSELORBALLOTNUM = new javax.swing.JLabel();
        CITYCOUNSELORDESIGN1 = new javax.swing.JPanel();
        CITYCOUNSELORDESIGN2 = new javax.swing.JPanel();
        BarangayCaptainTab = new javax.swing.JPanel();
        VOTEFORBARANGGAYCAPTAIN = new javax.swing.JLabel();
        BARANGGAYCAPTAINTABLESCROLL = new javax.swing.JScrollPane();
        BARANGGAYCAPTAINTABLE = new javax.swing.JTable();
        BARANGGAYCAPTAINSCROLL = new javax.swing.JScrollPane();
        CITYCOUNSELORINSTRUCTION1 = new javax.swing.JTextPane();
        BARANGGAYCAPTAINVOTINGPANEL = new javax.swing.JPanel();
        BARANGGAYCAPTAINSPINNER = new javax.swing.JSpinner();
        BARANGGAYCAPTAINSUBMIT = new javax.swing.JButton();
        BARANGGAYCAPTAINBALLOTNUM = new javax.swing.JLabel();
        BARANGGAYCAPTAINDESIGN1 = new javax.swing.JPanel();
        BARANGGAYCAPTAINDESIGN2 = new javax.swing.JPanel();
        BarangayCouncilorTab = new javax.swing.JPanel();
        VOTEFORBARANGGAYCOUNSELOR = new javax.swing.JLabel();
        BARANGGAYCOUNSELORTABLESCROLL = new javax.swing.JScrollPane();
        BARANGGAYCOUNSELORTABLE = new javax.swing.JTable();
        BARANGGAYCOUNSELORSCROLL = new javax.swing.JScrollPane();
        BARANGGAYCOUNSELORINSTRUCTION = new javax.swing.JTextPane();
        BARANGGAYCOUNSELORVOTINGPANEL = new javax.swing.JPanel();
        BARANGGAYCOUNSELORSPINNER = new javax.swing.JSpinner();
        BARANGGAYCOUNSELORSUBMIT = new javax.swing.JButton();
        BARANGGAYCOUNSELORBALLOTNUM = new javax.swing.JLabel();
        BARANGGAYCOUNSELORDESIGN1 = new javax.swing.JPanel();
        BARANGGAYCOUNSELORDESIGN2 = new javax.swing.JPanel();
        GovernorTab = new javax.swing.JPanel();
        VOTEFORGOVERNOR = new javax.swing.JLabel();
        GOVERNORTABLESCROLL1 = new javax.swing.JScrollPane();
        GOVERNORTABLE = new javax.swing.JTable();
        GOVERNORSCROLL = new javax.swing.JScrollPane();
        GOVERNORINSTRUCTION = new javax.swing.JTextPane();
        GOVERNORVOTINGPANEL = new javax.swing.JPanel();
        GOVERNORSPINNER = new javax.swing.JSpinner();
        GOVERNORSUBMIT = new javax.swing.JButton();
        GOVERNORBALLOTNUM = new javax.swing.JLabel();
        GOVERNORDESIGN1 = new javax.swing.JPanel();
        GOVERNORDESIGN2 = new javax.swing.JPanel();
        ViceGovernorTab = new javax.swing.JPanel();
        VOTEFORVICEGOVERNOR = new javax.swing.JLabel();
        VICEGOVERNORTABLESCROLL = new javax.swing.JScrollPane();
        VICEGOVERNORTABLE = new javax.swing.JTable();
        VICEGOVERNORSCROLL = new javax.swing.JScrollPane();
        VICEGOVERNORINSTRUCTION = new javax.swing.JTextPane();
        VICEGOVERNORVOTINGPANEL = new javax.swing.JPanel();
        VICEGOVERNORSPINNER = new javax.swing.JSpinner();
        VICEGOVERNORSUBMIT = new javax.swing.JButton();
        VICEGOVERNORBALLOTNUM = new javax.swing.JLabel();
        VICEGOVERNORDESIGN1 = new javax.swing.JPanel();
        VICEGOVERNORDESIGN2 = new javax.swing.JPanel();
        ProvencialBoardMember = new javax.swing.JPanel();
        PBMTab = new javax.swing.JPanel();
        VOTEFORPBM = new javax.swing.JLabel();
        PBMTABLESCROLL = new javax.swing.JScrollPane();
        PBMTABLE = new javax.swing.JTable();
        PBMSCROLL = new javax.swing.JScrollPane();
        PBMINSTRUCTION = new javax.swing.JTextPane();
        PBMVOTINGPANEL = new javax.swing.JPanel();
        PBMSPINNER = new javax.swing.JSpinner();
        PBMSUBMIT = new javax.swing.JButton();
        PBMBALLOTNUM = new javax.swing.JLabel();
        PBMDESIGN1 = new javax.swing.JPanel();
        PBMORDESIGN2 = new javax.swing.JPanel();
        President = new javax.swing.JPanel();
        VOTEFORPRESIDENT = new javax.swing.JLabel();
        PRESIDENTTABLESCROLL1 = new javax.swing.JScrollPane();
        PRESIDENTTABLE = new javax.swing.JTable();
        PRESIDENTSCROLL = new javax.swing.JScrollPane();
        PRESIDENTINSTRUCTION = new javax.swing.JTextPane();
        PRESIDENTVOTINGPANEL = new javax.swing.JPanel();
        PRESIDENTSPINNER = new javax.swing.JSpinner();
        PRESIDENTSUBMIT = new javax.swing.JButton();
        PRESIDENTBALLOTNUM = new javax.swing.JLabel();
        PRESIDENTDESIGN1 = new javax.swing.JPanel();
        PRESIDENTDESIGN2 = new javax.swing.JPanel();
        VicePresident = new javax.swing.JPanel();
        VOTEFORVICEPRESIDENT = new javax.swing.JLabel();
        VICEPRESIDENTTABLESCROLL = new javax.swing.JScrollPane();
        VICEPRESIDENTTABLE = new javax.swing.JTable();
        VICEPRESIDENTSCROLL = new javax.swing.JScrollPane();
        VICEPRESIDENTINSTRUCTION = new javax.swing.JTextPane();
        VICEPRESIDENTVOTINGPANEL = new javax.swing.JPanel();
        VICEPRESIDENTSPINNER = new javax.swing.JSpinner();
        VICEPRESIDENTSUBMIT = new javax.swing.JButton();
        VICEPRESIDENTBALLOTNUM = new javax.swing.JLabel();
        VICEPRESIDENTDESIGN1 = new javax.swing.JPanel();
        VICEPRESIDENTDESIGN2 = new javax.swing.JPanel();
        Senator = new javax.swing.JPanel();
        VOTEFORSENATOR = new javax.swing.JLabel();
        SENATORTABLESCROLL = new javax.swing.JScrollPane();
        SENATORTABLE = new javax.swing.JTable();
        SENATORSCROLL = new javax.swing.JScrollPane();
        SENATORINSTRUCTION = new javax.swing.JTextPane();
        SENATORVOTINGPANEL = new javax.swing.JPanel();
        SENATORSPINNER = new javax.swing.JSpinner();
        SENATORSUBMIT = new javax.swing.JButton();
        SENATORBALLOTNUM = new javax.swing.JLabel();
        SENATORDESIGN1 = new javax.swing.JPanel();
        SENATORDESIGN2 = new javax.swing.JPanel();
        HouseOfRepresentatives = new javax.swing.JPanel();
        VOTEFORHOUSEREP = new javax.swing.JLabel();
        HOUSEREPTABLESCROLL1 = new javax.swing.JScrollPane();
        HOUSEREPTABLE = new javax.swing.JTable();
        HOUSEREPSCROLL = new javax.swing.JScrollPane();
        HOUSEREPINSTRUCTION1 = new javax.swing.JTextPane();
        HOUSEREPVOTINGPANEL = new javax.swing.JPanel();
        HOUSEREPSPINNER = new javax.swing.JSpinner();
        HOUSEREPSUBMIT = new javax.swing.JButton();
        HOUSEREPBALLOTNUM = new javax.swing.JLabel();
        HOUSEREPDESIGN1 = new javax.swing.JPanel();
        HOUSEREPDESIGN2 = new javax.swing.JPanel();
        SKChairpersonTab = new javax.swing.JPanel();
        VOTEFORSKCHAIR = new javax.swing.JLabel();
        SKCHAIRTABLESCROLL = new javax.swing.JScrollPane();
        SKCHAIRTABLE = new javax.swing.JTable();
        SKCHAIRSCROLL = new javax.swing.JScrollPane();
        SKCHAIRINSTRUCTION = new javax.swing.JTextPane();
        SKCHAIRVOTINGPANEL = new javax.swing.JPanel();
        SKCHAIRSPINNER = new javax.swing.JSpinner();
        SKCHAIRSUBMIT = new javax.swing.JButton();
        SKCHAIRBALLOTNUM = new javax.swing.JLabel();
        SKCHAIRDESIGN1 = new javax.swing.JPanel();
        SKCHAIRDESIGN2 = new javax.swing.JPanel();
        SKCounselorTab = new javax.swing.JPanel();
        VOTEFORSKCOUNCILOR = new javax.swing.JLabel();
        SKCOUNCILORTABLESCROLL1 = new javax.swing.JScrollPane();
        SKCOUNCILORTABLE = new javax.swing.JTable();
        SKCOUNCILORSCROLL = new javax.swing.JScrollPane();
        SKCOUNCILORINSTRUCTION = new javax.swing.JTextPane();
        SKCOUNCILORVOTINGPANEL1 = new javax.swing.JPanel();
        SKCOUNCILORSPINNER = new javax.swing.JSpinner();
        SKCOUNCILORSUBMIT = new javax.swing.JButton();
        SKCOUNCILORBALLOTNUM = new javax.swing.JLabel();
        SKCOUNCILORDESIGN = new javax.swing.JPanel();
        SKCOUNCILORDESIGN2 = new javax.swing.JPanel();
        INDEX2 = new javax.swing.JPanel();
        ResultsLabelPanel = new javax.swing.JPanel();
        BackResultsButton = new javax.swing.JButton();
        ResultsLabel = new javax.swing.JLabel();
        ResultsTab = new javax.swing.JTabbedPane();
        ResultsPanel = new javax.swing.JPanel();
        LocalResultsPanel = new javax.swing.JPanel();
        LocalResultLabel = new javax.swing.JLabel();
        SEPARATOR2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        StateResultsPanel = new javax.swing.JPanel();
        StateResultLabel = new javax.swing.JLabel();
        SEPARATOR3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        NationalResultsPanel = new javax.swing.JPanel();
        NationalResultLabel = new javax.swing.JLabel();
        SEPARATOR1 = new javax.swing.JLabel();
        SKResultsButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        SKResultsPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SEPARATOR4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
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
        TOOLBAR.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 700));

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
        SKButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        SKButton.setText("Sangguniang Kabataan");
        SKButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKButtonMouseClicked(evt);
            }
        });
        SKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SKButtonActionPerformed(evt);
            }
        });

        ElectorateLabel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ElectorateLabel.setForeground(new java.awt.Color(255, 255, 255));
        ElectorateLabel.setText("ELECTIONS");

        javax.swing.GroupLayout ElectorateClassifierLayout = new javax.swing.GroupLayout(ElectorateClassifier);
        ElectorateClassifier.setLayout(ElectorateClassifierLayout);
        ElectorateClassifierLayout.setHorizontalGroup(
            ElectorateClassifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectorateClassifierLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ElectorateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 655, Short.MAX_VALUE)
                .addComponent(SKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        ElectorateClassifierLayout.setVerticalGroup(
            ElectorateClassifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectorateClassifierLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(SKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ElectorateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        INDEX1.add(ElectorateClassifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 50));

        GEOINDEX.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NATIONAL.setBackground(new java.awt.Color(153, 153, 255));
        NATIONAL.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        NATIONAL.setForeground(new java.awt.Color(255, 255, 255));
        NATIONAL.setText("NATIONAL");
        NATIONAL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        NATIONAL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NATIONALMouseClicked(evt);
            }
        });
        GEOINDEX.add(NATIONAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 358, 60));

        LOCAL.setBackground(new java.awt.Color(25, 18, 211));
        LOCAL.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        LOCAL.setForeground(new java.awt.Color(255, 255, 255));
        LOCAL.setText("LOCAL");
        LOCAL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        LOCAL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOCALMouseClicked(evt);
            }
        });
        LOCAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOCALActionPerformed(evt);
            }
        });
        GEOINDEX.add(LOCAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 358, 60));

        STATE.setBackground(new java.awt.Color(153, 153, 255));
        STATE.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        STATE.setForeground(new java.awt.Color(255, 255, 255));
        STATE.setText("STATE");
        STATE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        STATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                STATEMouseClicked(evt);
            }
        });
        STATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STATEActionPerformed(evt);
            }
        });
        GEOINDEX.add(STATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 358, 60));

        INDEX1.add(GEOINDEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1080, 60));

        BackPanel.setBackground(new java.awt.Color(0, 0, 0));
        BackPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
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
        BackPanel.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 50));

        SKBackButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        SKBackButton1.setText("Back");
        SKBackButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKBackButton1MouseClicked(evt);
            }
        });
        SKBackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SKBackButton1ActionPerformed(evt);
            }
        });
        BackPanel.add(SKBackButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 50));

        SKBackButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        SKBackButton2.setText("Back");
        SKBackButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKBackButton2MouseClicked(evt);
            }
        });
        SKBackButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SKBackButton2ActionPerformed(evt);
            }
        });
        BackPanel.add(SKBackButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 50));

        INDEX1.add(BackPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 75));

        FILLER.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout FILLERLayout = new javax.swing.GroupLayout(FILLER);
        FILLER.setLayout(FILLERLayout);
        FILLERLayout.setHorizontalGroup(
            FILLERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        FILLERLayout.setVerticalGroup(
            FILLERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        INDEX1.add(FILLER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 100));

        LOCALTAB.setBackground(new java.awt.Color(51, 51, 51));
        LOCALTAB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MayorButton.setBackground(new java.awt.Color(25, 18, 211));
        MayorButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        MayorButton.setForeground(new java.awt.Color(255, 255, 255));
        MayorButton.setText("Mayor");
        MayorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MayorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MayorButtonMouseClicked(evt);
            }
        });
        MayorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MayorButtonActionPerformed(evt);
            }
        });
        LOCALTAB.add(MayorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 250, 180));

        ViceMayorButton.setBackground(new java.awt.Color(25, 18, 211));
        ViceMayorButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        ViceMayorButton.setForeground(new java.awt.Color(255, 255, 255));
        ViceMayorButton.setText("Vice Mayor");
        ViceMayorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViceMayorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViceMayorButtonMouseClicked(evt);
            }
        });
        ViceMayorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViceMayorButtonActionPerformed(evt);
            }
        });
        LOCALTAB.add(ViceMayorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 250, 180));

        CongressmanButton.setBackground(new java.awt.Color(25, 18, 211));
        CongressmanButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CongressmanButton.setForeground(new java.awt.Color(255, 255, 255));
        CongressmanButton.setText("Congressman");
        CongressmanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CongressmanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CongressmanButtonMouseClicked(evt);
            }
        });
        CongressmanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CongressmanButtonActionPerformed(evt);
            }
        });
        LOCALTAB.add(CongressmanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 250, 180));

        CityCouncilorButton.setBackground(new java.awt.Color(25, 18, 211));
        CityCouncilorButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CityCouncilorButton.setForeground(new java.awt.Color(255, 255, 255));
        CityCouncilorButton.setText("City Councilors");
        CityCouncilorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CityCouncilorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CityCouncilorButtonMouseClicked(evt);
            }
        });
        CityCouncilorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityCouncilorButtonActionPerformed(evt);
            }
        });
        LOCALTAB.add(CityCouncilorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 250, 180));

        BarangayCaptainButton.setBackground(new java.awt.Color(25, 18, 211));
        BarangayCaptainButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BarangayCaptainButton.setForeground(new java.awt.Color(255, 255, 255));
        BarangayCaptainButton.setText("Barangay Captain");
        BarangayCaptainButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BarangayCaptainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarangayCaptainButtonMouseClicked(evt);
            }
        });
        BarangayCaptainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarangayCaptainButtonActionPerformed(evt);
            }
        });
        LOCALTAB.add(BarangayCaptainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 250, 180));

        BarangayCouncilorsButton.setBackground(new java.awt.Color(25, 18, 211));
        BarangayCouncilorsButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BarangayCouncilorsButton.setForeground(new java.awt.Color(255, 255, 255));
        BarangayCouncilorsButton.setText("Barangay Councilors");
        BarangayCouncilorsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BarangayCouncilorsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarangayCouncilorsButtonMouseClicked(evt);
            }
        });
        BarangayCouncilorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarangayCouncilorsButtonActionPerformed(evt);
            }
        });
        LOCALTAB.add(BarangayCouncilorsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 250, 180));

        EChoiceTab.addTab("", LOCALTAB);

        STATETAB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                STATETABMouseClicked(evt);
            }
        });
        STATETAB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ElectorateChoices1.setBackground(new java.awt.Color(51, 51, 51));
        ElectorateChoices1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GOVERNORButton.setBackground(new java.awt.Color(255, 0, 0));
        GOVERNORButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        GOVERNORButton.setForeground(new java.awt.Color(255, 255, 255));
        GOVERNORButton.setText("Governor");
        GOVERNORButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GOVERNORButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GOVERNORButtonMouseClicked(evt);
            }
        });
        GOVERNORButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOVERNORButtonActionPerformed(evt);
            }
        });
        ElectorateChoices1.add(GOVERNORButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 250, 180));

        VICEGOVERNORButton.setBackground(new java.awt.Color(255, 0, 0));
        VICEGOVERNORButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        VICEGOVERNORButton.setForeground(new java.awt.Color(255, 255, 255));
        VICEGOVERNORButton.setText("Vice - Governor");
        VICEGOVERNORButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VICEGOVERNORButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VICEGOVERNORButtonMouseClicked(evt);
            }
        });
        VICEGOVERNORButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VICEGOVERNORButtonActionPerformed(evt);
            }
        });
        ElectorateChoices1.add(VICEGOVERNORButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 250, 180));

        PROVINCIALBOARDMEMBERButton.setBackground(new java.awt.Color(255, 0, 0));
        PROVINCIALBOARDMEMBERButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        PROVINCIALBOARDMEMBERButton.setForeground(new java.awt.Color(255, 255, 255));
        PROVINCIALBOARDMEMBERButton.setText("Provincial Board Members");
        PROVINCIALBOARDMEMBERButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PROVINCIALBOARDMEMBERButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PROVINCIALBOARDMEMBERButtonMouseClicked(evt);
            }
        });
        ElectorateChoices1.add(PROVINCIALBOARDMEMBERButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 250, 180));

        STATETAB.add(ElectorateChoices1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 615));

        EChoiceTab.addTab("tab11", STATETAB);

        NATIONALTAB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ElectorateChoices2.setBackground(new java.awt.Color(51, 51, 51));
        ElectorateChoices2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRESIDENTButton.setBackground(new java.awt.Color(51, 204, 0));
        PRESIDENTButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        PRESIDENTButton.setForeground(new java.awt.Color(255, 255, 255));
        PRESIDENTButton.setText("President");
        PRESIDENTButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PRESIDENTButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRESIDENTButtonMouseClicked(evt);
            }
        });
        PRESIDENTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESIDENTButtonActionPerformed(evt);
            }
        });
        ElectorateChoices2.add(PRESIDENTButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 250, 180));

        VICEPRESIDENTButton1.setBackground(new java.awt.Color(51, 204, 0));
        VICEPRESIDENTButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        VICEPRESIDENTButton1.setForeground(new java.awt.Color(255, 255, 255));
        VICEPRESIDENTButton1.setText("Vice - President");
        VICEPRESIDENTButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VICEPRESIDENTButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VICEPRESIDENTButton1MouseClicked(evt);
            }
        });
        VICEPRESIDENTButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VICEPRESIDENTButton1ActionPerformed(evt);
            }
        });
        ElectorateChoices2.add(VICEPRESIDENTButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 250, 180));

        SENATORButton2.setBackground(new java.awt.Color(51, 204, 0));
        SENATORButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        SENATORButton2.setForeground(new java.awt.Color(255, 255, 255));
        SENATORButton2.setText("Senator");
        SENATORButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SENATORButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SENATORButton2MouseClicked(evt);
            }
        });
        SENATORButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENATORButton2ActionPerformed(evt);
            }
        });
        ElectorateChoices2.add(SENATORButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 250, 180));

        HOUSEOFREPRESENTIVESButton2.setBackground(new java.awt.Color(51, 204, 0));
        HOUSEOFREPRESENTIVESButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        HOUSEOFREPRESENTIVESButton2.setForeground(new java.awt.Color(255, 255, 255));
        HOUSEOFREPRESENTIVESButton2.setText("Party-Lists");
        HOUSEOFREPRESENTIVESButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HOUSEOFREPRESENTIVESButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HOUSEOFREPRESENTIVESButton2MouseClicked(evt);
            }
        });
        HOUSEOFREPRESENTIVESButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOUSEOFREPRESENTIVESButton2ActionPerformed(evt);
            }
        });
        ElectorateChoices2.add(HOUSEOFREPRESENTIVESButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 250, 180));

        NATIONALTAB.add(ElectorateChoices2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1060, 615));

        EChoiceTab.addTab("tab12", NATIONALTAB);

        SKTab.setBackground(new java.awt.Color(51, 51, 51));
        SKTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKTabMouseClicked(evt);
            }
        });
        SKTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SKChairpersonButton.setBackground(new java.awt.Color(255, 204, 0));
        SKChairpersonButton.setFont(new java.awt.Font("Arial Black", 1, 26)); // NOI18N
        SKChairpersonButton.setText("SK CHAIRPERSON");
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
        SKTab.add(SKChairpersonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 362, 177));

        SKKagawadButton.setBackground(new java.awt.Color(255, 204, 0));
        SKKagawadButton.setFont(new java.awt.Font("Arial Black", 1, 26)); // NOI18N
        SKKagawadButton.setText("SK - COUNCILOR ");
        SKKagawadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKKagawadButtonMouseClicked(evt);
            }
        });
        SKTab.add(SKKagawadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 362, 177));

        SKLabel.setBackground(new java.awt.Color(0, 0, 0));
        SKLabel.setFont(new java.awt.Font("Arial Black", 1, 44)); // NOI18N
        SKLabel.setForeground(new java.awt.Color(255, 255, 255));
        SKLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SKLabel.setText("KABATAAN");
        SKTab.add(SKLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1060, -1));

        SKLabel1.setBackground(new java.awt.Color(0, 0, 0));
        SKLabel1.setFont(new java.awt.Font("Arial Black", 1, 44)); // NOI18N
        SKLabel1.setForeground(new java.awt.Color(255, 255, 255));
        SKLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SKLabel1.setText("SANGGUNIANG");
        SKTab.add(SKLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1060, -1));

        EChoiceTab.addTab("tab8", SKTab);

        ElectorateTab.addTab("tab13", EChoiceTab);

        MayorTab.setBackground(new java.awt.Color(51, 51, 51));
        MayorTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORMAYOR.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        VOTEFORMAYOR.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORMAYOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORMAYOR.setText("VOTE FOR A MAYOR");
        MayorTab.add(VOTEFORMAYOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        MAYORTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MAYORTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        MAYORTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        MAYORTABLESCROLL.setViewportView(MAYORTABLE);

        MayorTab.add(MAYORTABLESCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        MAYORSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        MAYORSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        MAYORSCROLL.setAutoscrolls(true);
        MAYORSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                MAYORSCROLLComponentShown(evt);
            }
        });

        MAYORINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MAYORINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        MAYORSCROLL.setViewportView(MAYORINSTRUCTION);

        MayorTab.add(MAYORSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        MAYORVOTINGPANEL.setBackground(new java.awt.Color(25, 18, 211));
        MAYORVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MAYORSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        MAYORSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        MAYORVOTINGPANEL.add(MAYORSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        MAYORSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MAYORSUBMIT.setText("SUBMIT");
        MAYORSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        MAYORSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAYORSUBMITActionPerformed(evt);
            }
        });
        MAYORVOTINGPANEL.add(MAYORSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        MAYORBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        MAYORBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        MAYORBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MAYORBALLOTNUM.setText("BALLOT #");
        MAYORVOTINGPANEL.add(MAYORBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        MayorTab.add(MAYORVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        MAYORDESIGN1.setBackground(new java.awt.Color(25, 18, 211));
        MAYORDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout MAYORDESIGN1Layout = new javax.swing.GroupLayout(MAYORDESIGN1);
        MAYORDESIGN1.setLayout(MAYORDESIGN1Layout);
        MAYORDESIGN1Layout.setHorizontalGroup(
            MAYORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        MAYORDESIGN1Layout.setVerticalGroup(
            MAYORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        MayorTab.add(MAYORDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 630, 500));

        MAYORDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout MAYORDESIGN2Layout = new javax.swing.GroupLayout(MAYORDESIGN2);
        MAYORDESIGN2.setLayout(MAYORDESIGN2Layout);
        MAYORDESIGN2Layout.setHorizontalGroup(
            MAYORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        MAYORDESIGN2Layout.setVerticalGroup(
            MAYORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        MayorTab.add(MAYORDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1080, 70));

        ElectorateTab.addTab("", MayorTab);

        ViceMayorTab.setBackground(new java.awt.Color(51, 51, 51));
        ViceMayorTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORVICEMAYOR.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        VOTEFORVICEMAYOR.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORVICEMAYOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORVICEMAYOR.setText("VOTE FOR A VICE-MAYOR");
        ViceMayorTab.add(VOTEFORVICEMAYOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        VICEMAYORTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        VICEMAYORTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        VICEMAYORTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        VICEMAYORTABLESCROLL.setViewportView(VICEMAYORTABLE);

        ViceMayorTab.add(VICEMAYORTABLESCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        VICEMAYORSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        VICEMAYORSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        VICEMAYORSCROLL.setAutoscrolls(true);
        VICEMAYORSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                VICEMAYORSCROLLComponentShown(evt);
            }
        });

        VICEMAYORINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        VICEMAYORINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        VICEMAYORSCROLL.setViewportView(VICEMAYORINSTRUCTION);

        ViceMayorTab.add(VICEMAYORSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        VICEMAYORVOTINGPANEL.setBackground(new java.awt.Color(25, 18, 211));
        VICEMAYORVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VICEMAYORSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        VICEMAYORSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        VICEMAYORVOTINGPANEL.add(VICEMAYORSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        VICEMAYORSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        VICEMAYORSUBMIT.setText("SUBMIT");
        VICEMAYORSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        VICEMAYORSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VICEMAYORSUBMITActionPerformed(evt);
            }
        });
        VICEMAYORVOTINGPANEL.add(VICEMAYORSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        VICEMAYORBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        VICEMAYORBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        VICEMAYORBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VICEMAYORBALLOTNUM.setText("BALLOT #");
        VICEMAYORVOTINGPANEL.add(VICEMAYORBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        ViceMayorTab.add(VICEMAYORVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        VICEMAYORDESIGN1.setBackground(new java.awt.Color(25, 18, 211));
        VICEMAYORDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout VICEMAYORDESIGN1Layout = new javax.swing.GroupLayout(VICEMAYORDESIGN1);
        VICEMAYORDESIGN1.setLayout(VICEMAYORDESIGN1Layout);
        VICEMAYORDESIGN1Layout.setHorizontalGroup(
            VICEMAYORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        VICEMAYORDESIGN1Layout.setVerticalGroup(
            VICEMAYORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        ViceMayorTab.add(VICEMAYORDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 630, 500));

        VICEMAYORDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout VICEMAYORDESIGN2Layout = new javax.swing.GroupLayout(VICEMAYORDESIGN2);
        VICEMAYORDESIGN2.setLayout(VICEMAYORDESIGN2Layout);
        VICEMAYORDESIGN2Layout.setHorizontalGroup(
            VICEMAYORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        VICEMAYORDESIGN2Layout.setVerticalGroup(
            VICEMAYORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        ViceMayorTab.add(VICEMAYORDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1060, 70));

        ElectorateTab.addTab("tab3", ViceMayorTab);

        CongressmanTab.setBackground(new java.awt.Color(51, 51, 51));
        CongressmanTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CongressmanTabMouseClicked(evt);
            }
        });
        CongressmanTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORCONGRESSMAN.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        VOTEFORCONGRESSMAN.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORCONGRESSMAN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORCONGRESSMAN.setText("VOTE FOR A CONGRESSMAN");
        CongressmanTab.add(VOTEFORCONGRESSMAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        CONGRESSMANTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CONGRESSMANTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        CONGRESSMANTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        CONGRESSMANTABLESCROLL.setViewportView(CONGRESSMANTABLE);

        CongressmanTab.add(CONGRESSMANTABLESCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        CONGRESSMANSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        CONGRESSMANSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        CONGRESSMANSCROLL.setAutoscrolls(true);
        CONGRESSMANSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CONGRESSMANSCROLLComponentShown(evt);
            }
        });

        CONGRESSMANINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CONGRESSMANINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        CONGRESSMANSCROLL.setViewportView(CONGRESSMANINSTRUCTION);

        CongressmanTab.add(CONGRESSMANSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        CONGRESSMANVOTINGPANEL.setBackground(new java.awt.Color(25, 18, 211));
        CONGRESSMANVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CONGRESSMANSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        CONGRESSMANSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CONGRESSMANVOTINGPANEL.add(CONGRESSMANSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        CONGRESSMANSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CONGRESSMANSUBMIT.setText("SUBMIT");
        CONGRESSMANSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CONGRESSMANSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONGRESSMANSUBMITActionPerformed(evt);
            }
        });
        CONGRESSMANVOTINGPANEL.add(CONGRESSMANSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        CONGRESSMANBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CONGRESSMANBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        CONGRESSMANBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CONGRESSMANBALLOTNUM.setText("BALLOT #");
        CONGRESSMANVOTINGPANEL.add(CONGRESSMANBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        CongressmanTab.add(CONGRESSMANVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        CONGRESSMANDESIGN1.setBackground(new java.awt.Color(25, 18, 211));
        CONGRESSMANDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout CONGRESSMANDESIGN1Layout = new javax.swing.GroupLayout(CONGRESSMANDESIGN1);
        CONGRESSMANDESIGN1.setLayout(CONGRESSMANDESIGN1Layout);
        CONGRESSMANDESIGN1Layout.setHorizontalGroup(
            CONGRESSMANDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        CONGRESSMANDESIGN1Layout.setVerticalGroup(
            CONGRESSMANDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        CongressmanTab.add(CONGRESSMANDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 630, 500));

        CONGRESSMANDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout CONGRESSMANDESIGN2Layout = new javax.swing.GroupLayout(CONGRESSMANDESIGN2);
        CONGRESSMANDESIGN2.setLayout(CONGRESSMANDESIGN2Layout);
        CONGRESSMANDESIGN2Layout.setHorizontalGroup(
            CONGRESSMANDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        CONGRESSMANDESIGN2Layout.setVerticalGroup(
            CONGRESSMANDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        CongressmanTab.add(CONGRESSMANDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1060, 70));

        ElectorateTab.addTab("tab4", CongressmanTab);

        CityCounselorTab.setBackground(new java.awt.Color(51, 51, 51));
        CityCounselorTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CityCounselorTabMouseClicked(evt);
            }
        });
        CityCounselorTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORCITYCOUNSELOR.setFont(new java.awt.Font("Arial Black", 1, 33)); // NOI18N
        VOTEFORCITYCOUNSELOR.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORCITYCOUNSELOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORCITYCOUNSELOR.setText("VOTE FOR  CITY-COUNCILORS");
        CityCounselorTab.add(VOTEFORCITYCOUNSELOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        CITYCOUNSELORTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CITYCOUNSELORTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        CITYCOUNSELORTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        CITYCOUNSELORTABLESCROLL.setViewportView(CITYCOUNSELORTABLE);

        CityCounselorTab.add(CITYCOUNSELORTABLESCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        CITYCOUNSELORSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        CITYCOUNSELORSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        CITYCOUNSELORSCROLL.setAutoscrolls(true);
        CITYCOUNSELORSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CITYCOUNSELORSCROLLComponentShown(evt);
            }
        });

        CITYCOUNSELORINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CITYCOUNSELORINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        CITYCOUNSELORSCROLL.setViewportView(CITYCOUNSELORINSTRUCTION);

        CityCounselorTab.add(CITYCOUNSELORSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        CITYCOUNSELORVOTINGPANEL.setBackground(new java.awt.Color(25, 18, 211));
        CITYCOUNSELORVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CITYCOUNSELORSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        CITYCOUNSELORSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CITYCOUNSELORVOTINGPANEL.add(CITYCOUNSELORSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        CITYCOUNSELORSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CITYCOUNSELORSUBMIT.setText("SUBMIT");
        CITYCOUNSELORSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CITYCOUNSELORSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CITYCOUNSELORSUBMITActionPerformed(evt);
            }
        });
        CITYCOUNSELORVOTINGPANEL.add(CITYCOUNSELORSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        CITYCOUNSELORBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        CITYCOUNSELORBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        CITYCOUNSELORBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CITYCOUNSELORBALLOTNUM.setText("BALLOT #");
        CITYCOUNSELORVOTINGPANEL.add(CITYCOUNSELORBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        CityCounselorTab.add(CITYCOUNSELORVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        CITYCOUNSELORDESIGN1.setBackground(new java.awt.Color(25, 18, 211));
        CITYCOUNSELORDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout CITYCOUNSELORDESIGN1Layout = new javax.swing.GroupLayout(CITYCOUNSELORDESIGN1);
        CITYCOUNSELORDESIGN1.setLayout(CITYCOUNSELORDESIGN1Layout);
        CITYCOUNSELORDESIGN1Layout.setHorizontalGroup(
            CITYCOUNSELORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        CITYCOUNSELORDESIGN1Layout.setVerticalGroup(
            CITYCOUNSELORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        CityCounselorTab.add(CITYCOUNSELORDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 630, 500));

        CITYCOUNSELORDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout CITYCOUNSELORDESIGN2Layout = new javax.swing.GroupLayout(CITYCOUNSELORDESIGN2);
        CITYCOUNSELORDESIGN2.setLayout(CITYCOUNSELORDESIGN2Layout);
        CITYCOUNSELORDESIGN2Layout.setHorizontalGroup(
            CITYCOUNSELORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        CITYCOUNSELORDESIGN2Layout.setVerticalGroup(
            CITYCOUNSELORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        CityCounselorTab.add(CITYCOUNSELORDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1060, 70));

        ElectorateTab.addTab("tab5", CityCounselorTab);

        BarangayCaptainTab.setBackground(new java.awt.Color(51, 51, 51));
        BarangayCaptainTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORBARANGGAYCAPTAIN.setFont(new java.awt.Font("Arial Black", 1, 33)); // NOI18N
        VOTEFORBARANGGAYCAPTAIN.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORBARANGGAYCAPTAIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORBARANGGAYCAPTAIN.setText("VOTE FOR A BARANGAY CPT.");
        BarangayCaptainTab.add(VOTEFORBARANGGAYCAPTAIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        BARANGGAYCAPTAINTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BARANGGAYCAPTAINTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        BARANGGAYCAPTAINTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        BARANGGAYCAPTAINTABLESCROLL.setViewportView(BARANGGAYCAPTAINTABLE);

        BarangayCaptainTab.add(BARANGGAYCAPTAINTABLESCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        BARANGGAYCAPTAINSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        BARANGGAYCAPTAINSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        BARANGGAYCAPTAINSCROLL.setAutoscrolls(true);
        BARANGGAYCAPTAINSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BARANGGAYCAPTAINSCROLLComponentShown(evt);
            }
        });

        CITYCOUNSELORINSTRUCTION1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CITYCOUNSELORINSTRUCTION1.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        BARANGGAYCAPTAINSCROLL.setViewportView(CITYCOUNSELORINSTRUCTION1);

        BarangayCaptainTab.add(BARANGGAYCAPTAINSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        BARANGGAYCAPTAINVOTINGPANEL.setBackground(new java.awt.Color(25, 18, 211));
        BARANGGAYCAPTAINVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BARANGGAYCAPTAINSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        BARANGGAYCAPTAINSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BARANGGAYCAPTAINVOTINGPANEL.add(BARANGGAYCAPTAINSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        BARANGGAYCAPTAINSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BARANGGAYCAPTAINSUBMIT.setText("SUBMIT");
        BARANGGAYCAPTAINSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BARANGGAYCAPTAINSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BARANGGAYCAPTAINSUBMITActionPerformed(evt);
            }
        });
        BARANGGAYCAPTAINVOTINGPANEL.add(BARANGGAYCAPTAINSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        BARANGGAYCAPTAINBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BARANGGAYCAPTAINBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        BARANGGAYCAPTAINBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BARANGGAYCAPTAINBALLOTNUM.setText("BALLOT #");
        BARANGGAYCAPTAINVOTINGPANEL.add(BARANGGAYCAPTAINBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        BarangayCaptainTab.add(BARANGGAYCAPTAINVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        BARANGGAYCAPTAINDESIGN1.setBackground(new java.awt.Color(25, 18, 211));
        BARANGGAYCAPTAINDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout BARANGGAYCAPTAINDESIGN1Layout = new javax.swing.GroupLayout(BARANGGAYCAPTAINDESIGN1);
        BARANGGAYCAPTAINDESIGN1.setLayout(BARANGGAYCAPTAINDESIGN1Layout);
        BARANGGAYCAPTAINDESIGN1Layout.setHorizontalGroup(
            BARANGGAYCAPTAINDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        BARANGGAYCAPTAINDESIGN1Layout.setVerticalGroup(
            BARANGGAYCAPTAINDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        BarangayCaptainTab.add(BARANGGAYCAPTAINDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 630, 500));

        BARANGGAYCAPTAINDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout BARANGGAYCAPTAINDESIGN2Layout = new javax.swing.GroupLayout(BARANGGAYCAPTAINDESIGN2);
        BARANGGAYCAPTAINDESIGN2.setLayout(BARANGGAYCAPTAINDESIGN2Layout);
        BARANGGAYCAPTAINDESIGN2Layout.setHorizontalGroup(
            BARANGGAYCAPTAINDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        BARANGGAYCAPTAINDESIGN2Layout.setVerticalGroup(
            BARANGGAYCAPTAINDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        BarangayCaptainTab.add(BARANGGAYCAPTAINDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1060, 70));

        ElectorateTab.addTab("tab6", BarangayCaptainTab);

        BarangayCouncilorTab.setBackground(new java.awt.Color(51, 51, 51));
        BarangayCouncilorTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORBARANGGAYCOUNSELOR.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        VOTEFORBARANGGAYCOUNSELOR.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORBARANGGAYCOUNSELOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORBARANGGAYCOUNSELOR.setText("VOTE FOR BARANGAY-COUNCILORS");
        BarangayCouncilorTab.add(VOTEFORBARANGGAYCOUNSELOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        BARANGGAYCOUNSELORTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BARANGGAYCOUNSELORTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        BARANGGAYCOUNSELORTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        BARANGGAYCOUNSELORTABLESCROLL.setViewportView(BARANGGAYCOUNSELORTABLE);

        BarangayCouncilorTab.add(BARANGGAYCOUNSELORTABLESCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        BARANGGAYCOUNSELORSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        BARANGGAYCOUNSELORSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        BARANGGAYCOUNSELORSCROLL.setAutoscrolls(true);
        BARANGGAYCOUNSELORSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BARANGGAYCOUNSELORSCROLLComponentShown(evt);
            }
        });

        BARANGGAYCOUNSELORINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BARANGGAYCOUNSELORINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        BARANGGAYCOUNSELORSCROLL.setViewportView(BARANGGAYCOUNSELORINSTRUCTION);

        BarangayCouncilorTab.add(BARANGGAYCOUNSELORSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        BARANGGAYCOUNSELORVOTINGPANEL.setBackground(new java.awt.Color(25, 18, 211));
        BARANGGAYCOUNSELORVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BARANGGAYCOUNSELORSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        BARANGGAYCOUNSELORSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BARANGGAYCOUNSELORVOTINGPANEL.add(BARANGGAYCOUNSELORSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        BARANGGAYCOUNSELORSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BARANGGAYCOUNSELORSUBMIT.setText("SUBMIT");
        BARANGGAYCOUNSELORSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BARANGGAYCOUNSELORSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BARANGGAYCOUNSELORSUBMITActionPerformed(evt);
            }
        });
        BARANGGAYCOUNSELORVOTINGPANEL.add(BARANGGAYCOUNSELORSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        BARANGGAYCOUNSELORBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BARANGGAYCOUNSELORBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        BARANGGAYCOUNSELORBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BARANGGAYCOUNSELORBALLOTNUM.setText("BALLOT #");
        BARANGGAYCOUNSELORVOTINGPANEL.add(BARANGGAYCOUNSELORBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        BarangayCouncilorTab.add(BARANGGAYCOUNSELORVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        BARANGGAYCOUNSELORDESIGN1.setBackground(new java.awt.Color(25, 18, 211));
        BARANGGAYCOUNSELORDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout BARANGGAYCOUNSELORDESIGN1Layout = new javax.swing.GroupLayout(BARANGGAYCOUNSELORDESIGN1);
        BARANGGAYCOUNSELORDESIGN1.setLayout(BARANGGAYCOUNSELORDESIGN1Layout);
        BARANGGAYCOUNSELORDESIGN1Layout.setHorizontalGroup(
            BARANGGAYCOUNSELORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        BARANGGAYCOUNSELORDESIGN1Layout.setVerticalGroup(
            BARANGGAYCOUNSELORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        BarangayCouncilorTab.add(BARANGGAYCOUNSELORDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 630, 500));

        BARANGGAYCOUNSELORDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout BARANGGAYCOUNSELORDESIGN2Layout = new javax.swing.GroupLayout(BARANGGAYCOUNSELORDESIGN2);
        BARANGGAYCOUNSELORDESIGN2.setLayout(BARANGGAYCOUNSELORDESIGN2Layout);
        BARANGGAYCOUNSELORDESIGN2Layout.setHorizontalGroup(
            BARANGGAYCOUNSELORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        BARANGGAYCOUNSELORDESIGN2Layout.setVerticalGroup(
            BARANGGAYCOUNSELORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        BarangayCouncilorTab.add(BARANGGAYCOUNSELORDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 80));

        ElectorateTab.addTab("tab7", BarangayCouncilorTab);

        GovernorTab.setBackground(new java.awt.Color(51, 51, 51));
        GovernorTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORGOVERNOR.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        VOTEFORGOVERNOR.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORGOVERNOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORGOVERNOR.setText("VOTE FOR A GOVERNOR");
        GovernorTab.add(VOTEFORGOVERNOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        GOVERNORTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GOVERNORTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        GOVERNORTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        GOVERNORTABLESCROLL1.setViewportView(GOVERNORTABLE);

        GovernorTab.add(GOVERNORTABLESCROLL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        GOVERNORSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        GOVERNORSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        GOVERNORSCROLL.setAutoscrolls(true);
        GOVERNORSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                GOVERNORSCROLLComponentShown(evt);
            }
        });

        GOVERNORINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GOVERNORINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        GOVERNORSCROLL.setViewportView(GOVERNORINSTRUCTION);

        GovernorTab.add(GOVERNORSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        GOVERNORVOTINGPANEL.setBackground(new java.awt.Color(255, 0, 0));
        GOVERNORVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GOVERNORSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        GOVERNORSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        GOVERNORVOTINGPANEL.add(GOVERNORSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        GOVERNORSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        GOVERNORSUBMIT.setText("SUBMIT");
        GOVERNORSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        GOVERNORSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOVERNORSUBMITActionPerformed(evt);
            }
        });
        GOVERNORVOTINGPANEL.add(GOVERNORSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        GOVERNORBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        GOVERNORBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        GOVERNORBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GOVERNORBALLOTNUM.setText("BALLOT #");
        GOVERNORVOTINGPANEL.add(GOVERNORBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        GovernorTab.add(GOVERNORVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        GOVERNORDESIGN1.setBackground(new java.awt.Color(255, 0, 0));
        GOVERNORDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout GOVERNORDESIGN1Layout = new javax.swing.GroupLayout(GOVERNORDESIGN1);
        GOVERNORDESIGN1.setLayout(GOVERNORDESIGN1Layout);
        GOVERNORDESIGN1Layout.setHorizontalGroup(
            GOVERNORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        GOVERNORDESIGN1Layout.setVerticalGroup(
            GOVERNORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        GovernorTab.add(GOVERNORDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 630, 500));

        GOVERNORDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout GOVERNORDESIGN2Layout = new javax.swing.GroupLayout(GOVERNORDESIGN2);
        GOVERNORDESIGN2.setLayout(GOVERNORDESIGN2Layout);
        GOVERNORDESIGN2Layout.setHorizontalGroup(
            GOVERNORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        GOVERNORDESIGN2Layout.setVerticalGroup(
            GOVERNORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        GovernorTab.add(GOVERNORDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 80));

        ElectorateTab.addTab("tab11", GovernorTab);

        ViceGovernorTab.setBackground(new java.awt.Color(51, 51, 51));
        ViceGovernorTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORVICEGOVERNOR.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        VOTEFORVICEGOVERNOR.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORVICEGOVERNOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORVICEGOVERNOR.setText("VOTE FOR A VICE-GOVERNOR");
        ViceGovernorTab.add(VOTEFORVICEGOVERNOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        VICEGOVERNORTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        VICEGOVERNORTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        VICEGOVERNORTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        VICEGOVERNORTABLESCROLL.setViewportView(VICEGOVERNORTABLE);

        ViceGovernorTab.add(VICEGOVERNORTABLESCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        VICEGOVERNORSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        VICEGOVERNORSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        VICEGOVERNORSCROLL.setAutoscrolls(true);
        VICEGOVERNORSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                VICEGOVERNORSCROLLComponentShown(evt);
            }
        });

        VICEGOVERNORINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        VICEGOVERNORINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        VICEGOVERNORSCROLL.setViewportView(VICEGOVERNORINSTRUCTION);

        ViceGovernorTab.add(VICEGOVERNORSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        VICEGOVERNORVOTINGPANEL.setBackground(new java.awt.Color(255, 0, 0));
        VICEGOVERNORVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VICEGOVERNORSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        VICEGOVERNORSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        VICEGOVERNORVOTINGPANEL.add(VICEGOVERNORSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        VICEGOVERNORSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        VICEGOVERNORSUBMIT.setText("SUBMIT");
        VICEGOVERNORSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        VICEGOVERNORSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VICEGOVERNORSUBMITActionPerformed(evt);
            }
        });
        VICEGOVERNORVOTINGPANEL.add(VICEGOVERNORSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        VICEGOVERNORBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        VICEGOVERNORBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        VICEGOVERNORBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VICEGOVERNORBALLOTNUM.setText("BALLOT #");
        VICEGOVERNORVOTINGPANEL.add(VICEGOVERNORBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        ViceGovernorTab.add(VICEGOVERNORVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        VICEGOVERNORDESIGN1.setBackground(new java.awt.Color(255, 0, 0));
        VICEGOVERNORDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout VICEGOVERNORDESIGN1Layout = new javax.swing.GroupLayout(VICEGOVERNORDESIGN1);
        VICEGOVERNORDESIGN1.setLayout(VICEGOVERNORDESIGN1Layout);
        VICEGOVERNORDESIGN1Layout.setHorizontalGroup(
            VICEGOVERNORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        VICEGOVERNORDESIGN1Layout.setVerticalGroup(
            VICEGOVERNORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        ViceGovernorTab.add(VICEGOVERNORDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 630, 500));

        VICEGOVERNORDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout VICEGOVERNORDESIGN2Layout = new javax.swing.GroupLayout(VICEGOVERNORDESIGN2);
        VICEGOVERNORDESIGN2.setLayout(VICEGOVERNORDESIGN2Layout);
        VICEGOVERNORDESIGN2Layout.setHorizontalGroup(
            VICEGOVERNORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        VICEGOVERNORDESIGN2Layout.setVerticalGroup(
            VICEGOVERNORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        ViceGovernorTab.add(VICEGOVERNORDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 80));

        ElectorateTab.addTab("tab12", ViceGovernorTab);

        ProvencialBoardMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PBMTab.setBackground(new java.awt.Color(51, 51, 51));
        PBMTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORPBM.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        VOTEFORPBM.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORPBM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORPBM.setText("VOTE FOR A P.B.MS'");
        PBMTab.add(VOTEFORPBM, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        PBMTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PBMTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        PBMTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        PBMTABLESCROLL.setViewportView(PBMTABLE);

        PBMTab.add(PBMTABLESCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        PBMSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        PBMSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        PBMSCROLL.setAutoscrolls(true);
        PBMSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PBMSCROLLComponentShown(evt);
            }
        });

        PBMINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PBMINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        PBMSCROLL.setViewportView(PBMINSTRUCTION);

        PBMTab.add(PBMSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        PBMVOTINGPANEL.setBackground(new java.awt.Color(255, 0, 0));
        PBMVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PBMSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PBMSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PBMVOTINGPANEL.add(PBMSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        PBMSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PBMSUBMIT.setText("SUBMIT");
        PBMSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PBMSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBMSUBMITActionPerformed(evt);
            }
        });
        PBMVOTINGPANEL.add(PBMSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        PBMBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        PBMBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        PBMBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PBMBALLOTNUM.setText("BALLOT #");
        PBMVOTINGPANEL.add(PBMBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        PBMTab.add(PBMVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        PBMDESIGN1.setBackground(new java.awt.Color(255, 0, 0));
        PBMDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout PBMDESIGN1Layout = new javax.swing.GroupLayout(PBMDESIGN1);
        PBMDESIGN1.setLayout(PBMDESIGN1Layout);
        PBMDESIGN1Layout.setHorizontalGroup(
            PBMDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        PBMDESIGN1Layout.setVerticalGroup(
            PBMDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        PBMTab.add(PBMDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 630, 500));

        PBMORDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PBMORDESIGN2Layout = new javax.swing.GroupLayout(PBMORDESIGN2);
        PBMORDESIGN2.setLayout(PBMORDESIGN2Layout);
        PBMORDESIGN2Layout.setHorizontalGroup(
            PBMORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        PBMORDESIGN2Layout.setVerticalGroup(
            PBMORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        PBMTab.add(PBMORDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 80));

        ProvencialBoardMember.add(PBMTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ElectorateTab.addTab("tab13", ProvencialBoardMember);

        President.setBackground(new java.awt.Color(51, 51, 51));
        President.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORPRESIDENT.setBackground(new java.awt.Color(0, 255, 0));
        VOTEFORPRESIDENT.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        VOTEFORPRESIDENT.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORPRESIDENT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORPRESIDENT.setText("VOTE FOR A PRESIDENT");
        President.add(VOTEFORPRESIDENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        PRESIDENTTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PRESIDENTTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        PRESIDENTTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        PRESIDENTTABLESCROLL1.setViewportView(PRESIDENTTABLE);

        President.add(PRESIDENTTABLESCROLL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        PRESIDENTSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        PRESIDENTSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        PRESIDENTSCROLL.setAutoscrolls(true);
        PRESIDENTSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PRESIDENTSCROLLComponentShown(evt);
            }
        });

        PRESIDENTINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PRESIDENTINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        PRESIDENTSCROLL.setViewportView(PRESIDENTINSTRUCTION);

        President.add(PRESIDENTSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        PRESIDENTVOTINGPANEL.setBackground(new java.awt.Color(51, 204, 0));
        PRESIDENTVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRESIDENTSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        PRESIDENTSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PRESIDENTVOTINGPANEL.add(PRESIDENTSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        PRESIDENTSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PRESIDENTSUBMIT.setText("SUBMIT");
        PRESIDENTSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PRESIDENTSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESIDENTSUBMITActionPerformed(evt);
            }
        });
        PRESIDENTVOTINGPANEL.add(PRESIDENTSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        PRESIDENTBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        PRESIDENTBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        PRESIDENTBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PRESIDENTBALLOTNUM.setText("BALLOT #");
        PRESIDENTVOTINGPANEL.add(PRESIDENTBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        President.add(PRESIDENTVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        PRESIDENTDESIGN1.setBackground(new java.awt.Color(51, 204, 0));
        PRESIDENTDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout PRESIDENTDESIGN1Layout = new javax.swing.GroupLayout(PRESIDENTDESIGN1);
        PRESIDENTDESIGN1.setLayout(PRESIDENTDESIGN1Layout);
        PRESIDENTDESIGN1Layout.setHorizontalGroup(
            PRESIDENTDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        PRESIDENTDESIGN1Layout.setVerticalGroup(
            PRESIDENTDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        President.add(PRESIDENTDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 630, 500));

        PRESIDENTDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PRESIDENTDESIGN2Layout = new javax.swing.GroupLayout(PRESIDENTDESIGN2);
        PRESIDENTDESIGN2.setLayout(PRESIDENTDESIGN2Layout);
        PRESIDENTDESIGN2Layout.setHorizontalGroup(
            PRESIDENTDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        PRESIDENTDESIGN2Layout.setVerticalGroup(
            PRESIDENTDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        President.add(PRESIDENTDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 80));

        ElectorateTab.addTab("tab14", President);

        VicePresident.setBackground(new java.awt.Color(51, 51, 51));
        VicePresident.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORVICEPRESIDENT.setBackground(new java.awt.Color(0, 255, 0));
        VOTEFORVICEPRESIDENT.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        VOTEFORVICEPRESIDENT.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORVICEPRESIDENT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORVICEPRESIDENT.setText("VOTE FOR A VICE-PRESIDENT");
        VicePresident.add(VOTEFORVICEPRESIDENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        VICEPRESIDENTTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        VICEPRESIDENTTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        VICEPRESIDENTTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        VICEPRESIDENTTABLESCROLL.setViewportView(VICEPRESIDENTTABLE);

        VicePresident.add(VICEPRESIDENTTABLESCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        VICEPRESIDENTSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        VICEPRESIDENTSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        VICEPRESIDENTSCROLL.setAutoscrolls(true);
        VICEPRESIDENTSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                VICEPRESIDENTSCROLLComponentShown(evt);
            }
        });

        VICEPRESIDENTINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        VICEPRESIDENTINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        VICEPRESIDENTSCROLL.setViewportView(VICEPRESIDENTINSTRUCTION);

        VicePresident.add(VICEPRESIDENTSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        VICEPRESIDENTVOTINGPANEL.setBackground(new java.awt.Color(51, 204, 0));
        VICEPRESIDENTVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VICEPRESIDENTSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        VICEPRESIDENTSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        VICEPRESIDENTVOTINGPANEL.add(VICEPRESIDENTSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        VICEPRESIDENTSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        VICEPRESIDENTSUBMIT.setText("SUBMIT");
        VICEPRESIDENTSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        VICEPRESIDENTSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VICEPRESIDENTSUBMITActionPerformed(evt);
            }
        });
        VICEPRESIDENTVOTINGPANEL.add(VICEPRESIDENTSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        VICEPRESIDENTBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        VICEPRESIDENTBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        VICEPRESIDENTBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VICEPRESIDENTBALLOTNUM.setText("BALLOT #");
        VICEPRESIDENTVOTINGPANEL.add(VICEPRESIDENTBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        VicePresident.add(VICEPRESIDENTVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        VICEPRESIDENTDESIGN1.setBackground(new java.awt.Color(51, 204, 0));
        VICEPRESIDENTDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout VICEPRESIDENTDESIGN1Layout = new javax.swing.GroupLayout(VICEPRESIDENTDESIGN1);
        VICEPRESIDENTDESIGN1.setLayout(VICEPRESIDENTDESIGN1Layout);
        VICEPRESIDENTDESIGN1Layout.setHorizontalGroup(
            VICEPRESIDENTDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        VICEPRESIDENTDESIGN1Layout.setVerticalGroup(
            VICEPRESIDENTDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        VicePresident.add(VICEPRESIDENTDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 630, 500));

        VICEPRESIDENTDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout VICEPRESIDENTDESIGN2Layout = new javax.swing.GroupLayout(VICEPRESIDENTDESIGN2);
        VICEPRESIDENTDESIGN2.setLayout(VICEPRESIDENTDESIGN2Layout);
        VICEPRESIDENTDESIGN2Layout.setHorizontalGroup(
            VICEPRESIDENTDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        VICEPRESIDENTDESIGN2Layout.setVerticalGroup(
            VICEPRESIDENTDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        VicePresident.add(VICEPRESIDENTDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 80));

        ElectorateTab.addTab("tab15", VicePresident);

        Senator.setBackground(new java.awt.Color(51, 51, 51));
        Senator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORSENATOR.setBackground(new java.awt.Color(0, 255, 0));
        VOTEFORSENATOR.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        VOTEFORSENATOR.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORSENATOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORSENATOR.setText("VOTE FOR SENATORS");
        Senator.add(VOTEFORSENATOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        SENATORTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SENATORTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        SENATORTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        SENATORTABLESCROLL.setViewportView(SENATORTABLE);

        Senator.add(SENATORTABLESCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        SENATORSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SENATORSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        SENATORSCROLL.setAutoscrolls(true);
        SENATORSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                SENATORSCROLLComponentShown(evt);
            }
        });

        SENATORINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SENATORINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        SENATORSCROLL.setViewportView(SENATORINSTRUCTION);

        Senator.add(SENATORSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        SENATORVOTINGPANEL.setBackground(new java.awt.Color(51, 204, 0));
        SENATORVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SENATORSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        SENATORSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SENATORVOTINGPANEL.add(SENATORSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        SENATORSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SENATORSUBMIT.setText("SUBMIT");
        SENATORSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SENATORSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENATORSUBMITActionPerformed(evt);
            }
        });
        SENATORVOTINGPANEL.add(SENATORSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        SENATORBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        SENATORBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        SENATORBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SENATORBALLOTNUM.setText("BALLOT #");
        SENATORVOTINGPANEL.add(SENATORBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        Senator.add(SENATORVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        SENATORDESIGN1.setBackground(new java.awt.Color(51, 204, 0));
        SENATORDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout SENATORDESIGN1Layout = new javax.swing.GroupLayout(SENATORDESIGN1);
        SENATORDESIGN1.setLayout(SENATORDESIGN1Layout);
        SENATORDESIGN1Layout.setHorizontalGroup(
            SENATORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        SENATORDESIGN1Layout.setVerticalGroup(
            SENATORDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        Senator.add(SENATORDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 630, 500));

        SENATORDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout SENATORDESIGN2Layout = new javax.swing.GroupLayout(SENATORDESIGN2);
        SENATORDESIGN2.setLayout(SENATORDESIGN2Layout);
        SENATORDESIGN2Layout.setHorizontalGroup(
            SENATORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        SENATORDESIGN2Layout.setVerticalGroup(
            SENATORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        Senator.add(SENATORDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 80));

        ElectorateTab.addTab("tab16", Senator);

        HouseOfRepresentatives.setBackground(new java.awt.Color(51, 51, 51));
        HouseOfRepresentatives.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORHOUSEREP.setBackground(new java.awt.Color(0, 255, 0));
        VOTEFORHOUSEREP.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        VOTEFORHOUSEREP.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORHOUSEREP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORHOUSEREP.setText("VOTE FOR PARTY-LISTS");
        HouseOfRepresentatives.add(VOTEFORHOUSEREP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        HOUSEREPTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        HOUSEREPTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        HOUSEREPTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        HOUSEREPTABLESCROLL1.setViewportView(HOUSEREPTABLE);

        HouseOfRepresentatives.add(HOUSEREPTABLESCROLL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 490));

        HOUSEREPSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        HOUSEREPSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        HOUSEREPSCROLL.setAutoscrolls(true);
        HOUSEREPSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                HOUSEREPSCROLLComponentShown(evt);
            }
        });

        HOUSEREPINSTRUCTION1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        HOUSEREPINSTRUCTION1.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        HOUSEREPSCROLL.setViewportView(HOUSEREPINSTRUCTION1);

        HouseOfRepresentatives.add(HOUSEREPSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        HOUSEREPVOTINGPANEL.setBackground(new java.awt.Color(51, 204, 0));
        HOUSEREPVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOUSEREPSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        HOUSEREPSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        HOUSEREPVOTINGPANEL.add(HOUSEREPSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        HOUSEREPSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HOUSEREPSUBMIT.setText("SUBMIT");
        HOUSEREPSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        HOUSEREPSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOUSEREPSUBMITActionPerformed(evt);
            }
        });
        HOUSEREPVOTINGPANEL.add(HOUSEREPSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        HOUSEREPBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        HOUSEREPBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        HOUSEREPBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HOUSEREPBALLOTNUM.setText("BALLOT #");
        HOUSEREPVOTINGPANEL.add(HOUSEREPBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        HouseOfRepresentatives.add(HOUSEREPVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        HOUSEREPDESIGN1.setBackground(new java.awt.Color(51, 204, 0));
        HOUSEREPDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout HOUSEREPDESIGN1Layout = new javax.swing.GroupLayout(HOUSEREPDESIGN1);
        HOUSEREPDESIGN1.setLayout(HOUSEREPDESIGN1Layout);
        HOUSEREPDESIGN1Layout.setHorizontalGroup(
            HOUSEREPDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        HOUSEREPDESIGN1Layout.setVerticalGroup(
            HOUSEREPDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        HouseOfRepresentatives.add(HOUSEREPDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 630, 500));

        HOUSEREPDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout HOUSEREPDESIGN2Layout = new javax.swing.GroupLayout(HOUSEREPDESIGN2);
        HOUSEREPDESIGN2.setLayout(HOUSEREPDESIGN2Layout);
        HOUSEREPDESIGN2Layout.setHorizontalGroup(
            HOUSEREPDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        HOUSEREPDESIGN2Layout.setVerticalGroup(
            HOUSEREPDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        HouseOfRepresentatives.add(HOUSEREPDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 80));

        ElectorateTab.addTab("tab17", HouseOfRepresentatives);

        SKChairpersonTab.setBackground(new java.awt.Color(51, 51, 51));
        SKChairpersonTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORSKCHAIR.setBackground(new java.awt.Color(255, 255, 0));
        VOTEFORSKCHAIR.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        VOTEFORSKCHAIR.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORSKCHAIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORSKCHAIR.setText("VOTE FOR SK-CHAIRPERSON");
        SKChairpersonTab.add(VOTEFORSKCHAIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        SKCHAIRTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SKCHAIRTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        SKCHAIRTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        SKCHAIRTABLESCROLL.setViewportView(SKCHAIRTABLE);

        SKChairpersonTab.add(SKCHAIRTABLESCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 500));

        SKCHAIRSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SKCHAIRSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        SKCHAIRSCROLL.setAutoscrolls(true);
        SKCHAIRSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                SKCHAIRSCROLLComponentShown(evt);
            }
        });

        SKCHAIRINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SKCHAIRINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        SKCHAIRSCROLL.setViewportView(SKCHAIRINSTRUCTION);

        SKChairpersonTab.add(SKCHAIRSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        SKCHAIRVOTINGPANEL.setBackground(new java.awt.Color(255, 204, 0));
        SKCHAIRVOTINGPANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SKCHAIRSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        SKCHAIRSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SKCHAIRVOTINGPANEL.add(SKCHAIRSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        SKCHAIRSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SKCHAIRSUBMIT.setText("SUBMIT");
        SKCHAIRSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SKCHAIRSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SKCHAIRSUBMITActionPerformed(evt);
            }
        });
        SKCHAIRVOTINGPANEL.add(SKCHAIRSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        SKCHAIRBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        SKCHAIRBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        SKCHAIRBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SKCHAIRBALLOTNUM.setText("BALLOT #");
        SKCHAIRVOTINGPANEL.add(SKCHAIRBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        SKChairpersonTab.add(SKCHAIRVOTINGPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        SKCHAIRDESIGN1.setBackground(new java.awt.Color(255, 204, 0));
        SKCHAIRDESIGN1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout SKCHAIRDESIGN1Layout = new javax.swing.GroupLayout(SKCHAIRDESIGN1);
        SKCHAIRDESIGN1.setLayout(SKCHAIRDESIGN1Layout);
        SKCHAIRDESIGN1Layout.setHorizontalGroup(
            SKCHAIRDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        SKCHAIRDESIGN1Layout.setVerticalGroup(
            SKCHAIRDESIGN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        SKChairpersonTab.add(SKCHAIRDESIGN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 630, 500));

        SKCHAIRDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout SKCHAIRDESIGN2Layout = new javax.swing.GroupLayout(SKCHAIRDESIGN2);
        SKCHAIRDESIGN2.setLayout(SKCHAIRDESIGN2Layout);
        SKCHAIRDESIGN2Layout.setHorizontalGroup(
            SKCHAIRDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        SKCHAIRDESIGN2Layout.setVerticalGroup(
            SKCHAIRDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        SKChairpersonTab.add(SKCHAIRDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 80));

        ElectorateTab.addTab("tab9", SKChairpersonTab);

        SKCounselorTab.setBackground(new java.awt.Color(51, 51, 51));
        SKCounselorTab.setForeground(new java.awt.Color(51, 51, 51));
        SKCounselorTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VOTEFORSKCOUNCILOR.setBackground(new java.awt.Color(255, 255, 0));
        VOTEFORSKCOUNCILOR.setFont(new java.awt.Font("Arial Black", 1, 27)); // NOI18N
        VOTEFORSKCOUNCILOR.setForeground(new java.awt.Color(255, 255, 255));
        VOTEFORSKCOUNCILOR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VOTEFORSKCOUNCILOR.setText("VOTE FOR SK-COUNCILORS");
        SKCounselorTab.add(VOTEFORSKCOUNCILOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 700, -1));

        SKCOUNCILORTABLE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SKCOUNCILORTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BALLOT #", "CANDIDATE NAME"
            }
        ));
        SKCOUNCILORTABLE.setPreferredSize(new java.awt.Dimension(300, 60));
        SKCOUNCILORTABLESCROLL1.setViewportView(SKCOUNCILORTABLE);

        SKCounselorTab.add(SKCOUNCILORTABLESCROLL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 500));

        SKCOUNCILORSCROLL.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SKCOUNCILORSCROLL.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        SKCOUNCILORSCROLL.setAutoscrolls(true);
        SKCOUNCILORSCROLL.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                SKCOUNCILORSCROLLComponentShown(evt);
            }
        });

        SKCOUNCILORINSTRUCTION.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SKCOUNCILORINSTRUCTION.setText("Instructions for Voting \n\nPlease follow the steps below to cast your vote: \n\n1.  Refer to the table below for the list of candidates along with their respective ballot numbers: \n\n2. Choose your preferred candidate by noting their ballot number.\n\n3. Adjust the spinner to reflect the ballot number of your chosen candidate.\n\n4. Once you have selected the correct ballot number, click the \"Submit\" button to cast your vote.\n\n5. A dialog box will appear confirming the candidate you voted for.\n\nNote: You can only vote once, so please ensure your selection is correct before submitting.\n\nThank you for participating in the voting process!");
        SKCOUNCILORSCROLL.setViewportView(SKCOUNCILORINSTRUCTION);

        SKCounselorTab.add(SKCOUNCILORSCROLL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 570, 250));

        SKCOUNCILORVOTINGPANEL1.setBackground(new java.awt.Color(255, 204, 0));
        SKCOUNCILORVOTINGPANEL1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SKCOUNCILORSPINNER.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        SKCOUNCILORSPINNER.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SKCOUNCILORVOTINGPANEL1.add(SKCOUNCILORSPINNER, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 70));

        SKCOUNCILORSUBMIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SKCOUNCILORSUBMIT.setText("SUBMIT");
        SKCOUNCILORSUBMIT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SKCOUNCILORSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SKCOUNCILORSUBMITActionPerformed(evt);
            }
        });
        SKCOUNCILORVOTINGPANEL1.add(SKCOUNCILORSUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        SKCOUNCILORBALLOTNUM.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        SKCOUNCILORBALLOTNUM.setForeground(new java.awt.Color(255, 255, 255));
        SKCOUNCILORBALLOTNUM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SKCOUNCILORBALLOTNUM.setText("BALLOT #");
        SKCOUNCILORVOTINGPANEL1.add(SKCOUNCILORBALLOTNUM, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 110, -1));

        SKCounselorTab.add(SKCOUNCILORVOTINGPANEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 280, 110));

        SKCOUNCILORDESIGN.setBackground(new java.awt.Color(255, 204, 0));
        SKCOUNCILORDESIGN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout SKCOUNCILORDESIGNLayout = new javax.swing.GroupLayout(SKCOUNCILORDESIGN);
        SKCOUNCILORDESIGN.setLayout(SKCOUNCILORDESIGNLayout);
        SKCOUNCILORDESIGNLayout.setHorizontalGroup(
            SKCOUNCILORDESIGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        SKCOUNCILORDESIGNLayout.setVerticalGroup(
            SKCOUNCILORDESIGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        SKCounselorTab.add(SKCOUNCILORDESIGN, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 630, 500));

        SKCOUNCILORDESIGN2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout SKCOUNCILORDESIGN2Layout = new javax.swing.GroupLayout(SKCOUNCILORDESIGN2);
        SKCOUNCILORDESIGN2.setLayout(SKCOUNCILORDESIGN2Layout);
        SKCOUNCILORDESIGN2Layout.setHorizontalGroup(
            SKCOUNCILORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        SKCOUNCILORDESIGN2Layout.setVerticalGroup(
            SKCOUNCILORDESIGN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        SKCounselorTab.add(SKCOUNCILORDESIGN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 80));

        ElectorateTab.addTab("tab10", SKCounselorTab);

        INDEX1.add(ElectorateTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1080, 610));

        OPTIONSTAB.addTab("", INDEX1);

        INDEX2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ResultsLabelPanel.setBackground(new java.awt.Color(0, 0, 0));
        ResultsLabelPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackResultsButton.setBackground(new java.awt.Color(255, 255, 255));
        BackResultsButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        BackResultsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/BACKSMALL.png"))); // NOI18N
        BackResultsButton.setText("Back");
        BackResultsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BackResultsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackResultsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackResultsButtonMouseClicked(evt);
            }
        });
        BackResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackResultsButtonActionPerformed(evt);
            }
        });
        ResultsLabelPanel.add(BackResultsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 40));

        ResultsLabel.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        ResultsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ResultsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ResultsLabel.setText("RESULTS");
        ResultsLabelPanel.add(ResultsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 60));

        INDEX2.add(ResultsLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 60));

        ResultsPanel.setLayout(new java.awt.GridLayout(1, 0));

        LocalResultsPanel.setBackground(new java.awt.Color(51, 102, 255));
        LocalResultsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LocalResultLabel.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        LocalResultLabel.setForeground(new java.awt.Color(255, 255, 255));
        LocalResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LocalResultLabel.setText("LOCAL");
        LocalResultsPanel.add(LocalResultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 350, 60));

        SEPARATOR2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SEPARATOR2.setForeground(new java.awt.Color(255, 255, 255));
        SEPARATOR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEPARATOR2.setText("_______________");
        LocalResultsPanel.add(SEPARATOR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 350, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Mayor", ""},
                {"Vice Mayor", null},
                {"Congressman", null},
                {"City Councilor", null},
                {"Barangay Captain", null},
                {"Barangay Councilor", null},
                {"", null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jTable2.setRowHeight(40);
        jScrollPane3.setViewportView(jTable2);

        LocalResultsPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 330, 380));

        ResultsPanel.add(LocalResultsPanel);

        StateResultsPanel.setBackground(new java.awt.Color(255, 0, 0));
        StateResultsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StateResultLabel.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        StateResultLabel.setForeground(new java.awt.Color(255, 255, 255));
        StateResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StateResultLabel.setText("STATE");
        StateResultsPanel.add(StateResultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 350, 60));

        SEPARATOR3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SEPARATOR3.setForeground(new java.awt.Color(255, 255, 255));
        SEPARATOR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEPARATOR3.setText("_______________");
        StateResultsPanel.add(SEPARATOR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 350, 50));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Governor", null},
                {"Vice Governor", null},
                {"Board Member", null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jTable3.setRowHeight(40);
        jScrollPane4.setViewportView(jTable3);

        StateResultsPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 330, 380));

        ResultsPanel.add(StateResultsPanel);

        NationalResultsPanel.setBackground(new java.awt.Color(51, 204, 0));
        NationalResultsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NationalResultLabel.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        NationalResultLabel.setForeground(new java.awt.Color(255, 255, 255));
        NationalResultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NationalResultLabel.setText("NATIONAL");
        NationalResultsPanel.add(NationalResultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 350, 60));

        SEPARATOR1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SEPARATOR1.setForeground(new java.awt.Color(255, 255, 255));
        SEPARATOR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEPARATOR1.setText("______________________");
        NationalResultsPanel.add(SEPARATOR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 350, 50));

        SKResultsButton.setBackground(new java.awt.Color(255, 204, 0));
        SKResultsButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        SKResultsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FORWARDSMALL.png"))); // NOI18N
        SKResultsButton.setText("SK Results");
        SKResultsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        SKResultsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SKResultsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SKResultsButtonMouseClicked(evt);
            }
        });
        NationalResultsPanel.add(SKResultsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 170, 50));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"President", null},
                {"Vice President", null},
                {"Senator", null},
                {"House of Representative", null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidate"
            }
        ));
        jTable5.setRowHeight(40);
        jScrollPane6.setViewportView(jTable5);

        NationalResultsPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 330, 380));

        ResultsPanel.add(NationalResultsPanel);

        ResultsTab.addTab("", ResultsPanel);

        SKResultsPanel.setBackground(new java.awt.Color(255, 204, 0));
        SKResultsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SANGGUNIANG KABATAAN");
        SKResultsPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1050, 60));

        SEPARATOR4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SEPARATOR4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEPARATOR4.setText("_________________________________________________________");
        SKResultsPanel.add(SEPARATOR4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1050, 50));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SK Chairman", null},
                {"SK Councilor ", null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Position", "Candidates"
            }
        ));
        jTable4.setRowHeight(50);
        jScrollPane5.setViewportView(jTable4);

        SKResultsPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 590, -1));

        ResultsTab.addTab("", SKResultsPanel);

        INDEX2.add(ResultsTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 1050, 710));

        OPTIONSTAB.addTab("", INDEX2);

        INDEX3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SETTINGSTAB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        MAIN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MAIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CONTAINER1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CONTAINER1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SecurityPanel.setBackground(new java.awt.Color(255, 255, 255));
        SecurityPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        AccountInformation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        PrivacyAndPolicy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        Feedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        CHANGEPASSWORDPANEL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        FEEDBACKPANEL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        SENDFEEDBACKBUTTON.setBackground(new java.awt.Color(153, 204, 255));
        SENDFEEDBACKBUTTON.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
        FEEDBACKPANELBACKGROUND.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        CHANGESECURITYQUESTIONCONFIRMBUTTON.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
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
        NEWANSWERTEXTFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWANSWERTEXTFIELDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CHANGESECURITYPANELLayout = new javax.swing.GroupLayout(CHANGESECURITYPANEL);
        CHANGESECURITYPANEL.setLayout(CHANGESECURITYPANELLayout);
        CHANGESECURITYPANELLayout.setHorizontalGroup(
            CHANGESECURITYPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CHANGESECURITYPANELLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(CHANGESECURITYPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NEWSECURITYQUESTIONLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NEWSECURITYQUESTIONCOMBOBOX, 0, 465, Short.MAX_VALUE)
                    .addComponent(NEWANSWERTEXTFIELD))
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CHANGESECURITYPANELLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CHANGESECURITYQUESTIONCONFIRMBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(CHANGESECURITYQUESTIONCONFIRMBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void NEWANSWERTEXTFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWANSWERTEXTFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NEWANSWERTEXTFIELDActionPerformed

    private void SKResultsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKResultsButtonMouseClicked
        ResultsTab.setSelectedIndex(1);
        BackResultsButton.setEnabled(true);
        BackResultsButton.setVisible(true);
    }//GEN-LAST:event_SKResultsButtonMouseClicked

    private void BackResultsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackResultsButtonMouseClicked
        ResultsTab.setSelectedIndex(0);
        BackResultsButton.setEnabled(false);
        BackResultsButton.setVisible(false);
    }//GEN-LAST:event_BackResultsButtonMouseClicked

    private void SKButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(0);
        EChoiceTab.setSelectedIndex(3);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);

        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        FILLER.setEnabled(true);
        FILLER.setVisible(true);

        SKBackButton1.setEnabled(true);
        SKBackButton1.setVisible(true);

        BackButton.setEnabled(false);
        BackButton.setVisible(false);
    }//GEN-LAST:event_SKButtonMouseClicked

    private void SKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SKButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SKButtonActionPerformed

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

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        GEOINDEX.setEnabled(true);
        GEOINDEX.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SKBackButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKBackButton1MouseClicked
        ElectorateTab.setSelectedIndex(0);
        EChoiceTab.setSelectedIndex(0);

        BackButton.setVisible(true);
        BackButton.setEnabled(true);

        SKBackButton1.setVisible(false);
        SKBackButton1.setEnabled(false);

        ElectorateClassifier.setEnabled(true);
        ElectorateClassifier.setVisible(true);

        GEOINDEX.setEnabled(true);
        GEOINDEX.setVisible(true);

        BackPanel.setEnabled(false);
        BackPanel.setVisible(false);

        FILLER.setEnabled(false);
        FILLER.setVisible(false);

        STATE.setBackground(new Color(153,153,255));
        LOCAL.setBackground(new Color(25,18,211));
        NATIONAL.setBackground(new Color(153,153,255));

    }//GEN-LAST:event_SKBackButton1MouseClicked

    private void SKBackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SKBackButton1ActionPerformed

    }//GEN-LAST:event_SKBackButton1ActionPerformed

    private void SKBackButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKBackButton2MouseClicked

        ElectorateTab.setSelectedIndex(0);
        EChoiceTab.setSelectedIndex(3);

        SKBackButton1.setEnabled(true);
        SKBackButton1.setVisible(true);
        SKBackButton2.setEnabled(false);
        SKBackButton2.setVisible(false);

    }//GEN-LAST:event_SKBackButton2MouseClicked

    private void SKBackButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SKBackButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SKBackButton2ActionPerformed

    private void NATIONALMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NATIONALMouseClicked

        ElectorateTab.setSelectedIndex(0);
        EChoiceTab.setSelectedIndex(2);
        ElectorateClassifier.setEnabled(true);
        ElectorateClassifier.setVisible(true);

        STATE.setBackground(new Color(153,153,255));
        LOCAL.setBackground(new Color(153,153,255));
        NATIONAL.setBackground(new Color(51,204,0));
    }//GEN-LAST:event_NATIONALMouseClicked

    private void LOCALMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOCALMouseClicked
        ElectorateTab.setSelectedIndex(0);
        EChoiceTab.setSelectedIndex(0);
        ElectorateClassifier.setEnabled(true);
        ElectorateClassifier.setVisible(true);

        STATE.setBackground(new Color(153,153,255));
        LOCAL.setBackground(new Color(25,18,211));
        NATIONAL.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_LOCALMouseClicked

    private void LOCALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOCALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LOCALActionPerformed

    private void STATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STATEMouseClicked
        ElectorateTab.setSelectedIndex(0);
        EChoiceTab.setSelectedIndex(1);
        ElectorateClassifier.setEnabled(true);
        ElectorateClassifier.setVisible(true);

        STATE.setBackground(new Color(255,0,0));
        LOCAL.setBackground(new Color(153,153,255));
        NATIONAL.setBackground(new Color(153,153,255));

    }//GEN-LAST:event_STATEMouseClicked

    private void STATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STATEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STATEActionPerformed

    private void MayorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MayorButtonMouseClicked

        ElectorateTab.setSelectedIndex(1);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);

    }//GEN-LAST:event_MayorButtonMouseClicked

    private void MayorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MayorButtonActionPerformed

    }//GEN-LAST:event_MayorButtonActionPerformed

    private void ViceMayorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViceMayorButtonMouseClicked

        ElectorateTab.setSelectedIndex(2);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_ViceMayorButtonMouseClicked

    private void ViceMayorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViceMayorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViceMayorButtonActionPerformed

    private void CongressmanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CongressmanButtonMouseClicked
        ElectorateTab.setSelectedIndex(3);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_CongressmanButtonMouseClicked

    private void CongressmanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CongressmanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CongressmanButtonActionPerformed

    private void CityCouncilorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CityCouncilorButtonMouseClicked
        ElectorateTab.setSelectedIndex(4);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_CityCouncilorButtonMouseClicked

    private void CityCouncilorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityCouncilorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityCouncilorButtonActionPerformed

    private void BarangayCaptainButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarangayCaptainButtonMouseClicked
        ElectorateTab.setSelectedIndex(5);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_BarangayCaptainButtonMouseClicked

    private void BarangayCaptainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarangayCaptainButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BarangayCaptainButtonActionPerformed

    private void BarangayCouncilorsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarangayCouncilorsButtonMouseClicked
        ElectorateTab.setSelectedIndex(6);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_BarangayCouncilorsButtonMouseClicked

    private void BarangayCouncilorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarangayCouncilorsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BarangayCouncilorsButtonActionPerformed

    private void GOVERNORButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GOVERNORButtonMouseClicked
        ElectorateTab.setSelectedIndex(7);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_GOVERNORButtonMouseClicked

    private void GOVERNORButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOVERNORButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GOVERNORButtonActionPerformed

    private void VICEGOVERNORButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VICEGOVERNORButtonMouseClicked
        ElectorateTab.setSelectedIndex(8);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_VICEGOVERNORButtonMouseClicked

    private void VICEGOVERNORButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VICEGOVERNORButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VICEGOVERNORButtonActionPerformed

    private void PROVINCIALBOARDMEMBERButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROVINCIALBOARDMEMBERButtonMouseClicked
        ElectorateTab.setSelectedIndex(9);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_PROVINCIALBOARDMEMBERButtonMouseClicked

    private void STATETABMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STATETABMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_STATETABMouseClicked

    private void PRESIDENTButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRESIDENTButtonMouseClicked
        ElectorateTab.setSelectedIndex(10);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_PRESIDENTButtonMouseClicked

    private void PRESIDENTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESIDENTButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRESIDENTButtonActionPerformed

    private void VICEPRESIDENTButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VICEPRESIDENTButton1MouseClicked
        ElectorateTab.setSelectedIndex(11);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_VICEPRESIDENTButton1MouseClicked

    private void VICEPRESIDENTButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VICEPRESIDENTButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VICEPRESIDENTButton1ActionPerformed

    private void SENATORButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SENATORButton2MouseClicked
        ElectorateTab.setSelectedIndex(12);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_SENATORButton2MouseClicked

    private void SENATORButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENATORButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SENATORButton2ActionPerformed

    private void HOUSEOFREPRESENTIVESButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOUSEOFREPRESENTIVESButton2MouseClicked
        ElectorateTab.setSelectedIndex(13);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);
    }//GEN-LAST:event_HOUSEOFREPRESENTIVESButton2MouseClicked

    private void HOUSEOFREPRESENTIVESButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOUSEOFREPRESENTIVESButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HOUSEOFREPRESENTIVESButton2ActionPerformed

    private void SKChairpersonButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKChairpersonButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(14);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        SKBackButton1.setEnabled(false);
        SKBackButton1.setVisible(false);
        SKBackButton2.setEnabled(true);
        SKBackButton2.setVisible(true);
    }//GEN-LAST:event_SKChairpersonButtonMouseClicked

    private void SKChairpersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SKChairpersonButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SKChairpersonButtonActionPerformed

    private void SKKagawadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKKagawadButtonMouseClicked
        // TODO add your handling code here:
        ElectorateTab.setSelectedIndex(15);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        SKBackButton1.setEnabled(false);
        SKBackButton1.setVisible(false);
        SKBackButton2.setEnabled(true);
        SKBackButton2.setVisible(true);
    }//GEN-LAST:event_SKKagawadButtonMouseClicked

    private void SKTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SKTabMouseClicked

    }//GEN-LAST:event_SKTabMouseClicked

    private void MAYORSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_MAYORSCROLLComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_MAYORSCROLLComponentShown

    private void MAYORSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAYORSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MAYORSUBMITActionPerformed

    private void VICEMAYORSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_VICEMAYORSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_VICEMAYORSCROLLComponentShown

    private void VICEMAYORSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VICEMAYORSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VICEMAYORSUBMITActionPerformed

    private void CONGRESSMANSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CONGRESSMANSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_CONGRESSMANSCROLLComponentShown

    private void CONGRESSMANSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONGRESSMANSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CONGRESSMANSUBMITActionPerformed

    private void CongressmanTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CongressmanTabMouseClicked
        ElectorateTab.setSelectedIndex(3);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);

    }//GEN-LAST:event_CongressmanTabMouseClicked

    private void CITYCOUNSELORSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CITYCOUNSELORSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_CITYCOUNSELORSCROLLComponentShown

    private void CITYCOUNSELORSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CITYCOUNSELORSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CITYCOUNSELORSUBMITActionPerformed

    private void CityCounselorTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CityCounselorTabMouseClicked
        ElectorateTab.setSelectedIndex(4);
        ElectorateClassifier.setEnabled(false);
        ElectorateClassifier.setVisible(false);
        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);

        GEOINDEX.setEnabled(false);
        GEOINDEX.setVisible(false);

        BackPanel.setEnabled(true);
        BackPanel.setVisible(true);
    }//GEN-LAST:event_CityCounselorTabMouseClicked

    private void BARANGGAYCAPTAINSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BARANGGAYCAPTAINSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_BARANGGAYCAPTAINSCROLLComponentShown

    private void BARANGGAYCAPTAINSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BARANGGAYCAPTAINSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BARANGGAYCAPTAINSUBMITActionPerformed

    private void BARANGGAYCOUNSELORSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BARANGGAYCOUNSELORSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_BARANGGAYCOUNSELORSCROLLComponentShown

    private void BARANGGAYCOUNSELORSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BARANGGAYCOUNSELORSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BARANGGAYCOUNSELORSUBMITActionPerformed

    private void GOVERNORSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_GOVERNORSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_GOVERNORSCROLLComponentShown

    private void GOVERNORSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOVERNORSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GOVERNORSUBMITActionPerformed

    private void VICEGOVERNORSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_VICEGOVERNORSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_VICEGOVERNORSCROLLComponentShown

    private void VICEGOVERNORSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VICEGOVERNORSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VICEGOVERNORSUBMITActionPerformed

    private void PBMSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PBMSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_PBMSCROLLComponentShown

    private void PBMSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBMSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PBMSUBMITActionPerformed

    private void PRESIDENTSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PRESIDENTSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_PRESIDENTSCROLLComponentShown

    private void PRESIDENTSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESIDENTSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRESIDENTSUBMITActionPerformed

    private void VICEPRESIDENTSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_VICEPRESIDENTSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_VICEPRESIDENTSCROLLComponentShown

    private void VICEPRESIDENTSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VICEPRESIDENTSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VICEPRESIDENTSUBMITActionPerformed

    private void SENATORSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SENATORSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_SENATORSCROLLComponentShown

    private void SENATORSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENATORSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SENATORSUBMITActionPerformed

    private void HOUSEREPSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_HOUSEREPSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_HOUSEREPSCROLLComponentShown

    private void HOUSEREPSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOUSEREPSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HOUSEREPSUBMITActionPerformed

    private void SKCHAIRSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SKCHAIRSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_SKCHAIRSCROLLComponentShown

    private void SKCHAIRSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SKCHAIRSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SKCHAIRSUBMITActionPerformed

    private void SKCOUNCILORSCROLLComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SKCOUNCILORSCROLLComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_SKCOUNCILORSCROLLComponentShown

    private void SKCOUNCILORSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SKCOUNCILORSUBMITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SKCOUNCILORSUBMITActionPerformed

    private void BackResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackResultsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackResultsButtonActionPerformed

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
    private javax.swing.JLabel BARANGGAYCAPTAINBALLOTNUM;
    private javax.swing.JPanel BARANGGAYCAPTAINDESIGN1;
    private javax.swing.JPanel BARANGGAYCAPTAINDESIGN2;
    private javax.swing.JScrollPane BARANGGAYCAPTAINSCROLL;
    private javax.swing.JSpinner BARANGGAYCAPTAINSPINNER;
    private javax.swing.JButton BARANGGAYCAPTAINSUBMIT;
    private javax.swing.JTable BARANGGAYCAPTAINTABLE;
    private javax.swing.JScrollPane BARANGGAYCAPTAINTABLESCROLL;
    private javax.swing.JPanel BARANGGAYCAPTAINVOTINGPANEL;
    private javax.swing.JLabel BARANGGAYCOUNSELORBALLOTNUM;
    private javax.swing.JPanel BARANGGAYCOUNSELORDESIGN1;
    private javax.swing.JPanel BARANGGAYCOUNSELORDESIGN2;
    private javax.swing.JTextPane BARANGGAYCOUNSELORINSTRUCTION;
    private javax.swing.JScrollPane BARANGGAYCOUNSELORSCROLL;
    private javax.swing.JSpinner BARANGGAYCOUNSELORSPINNER;
    private javax.swing.JButton BARANGGAYCOUNSELORSUBMIT;
    private javax.swing.JTable BARANGGAYCOUNSELORTABLE;
    private javax.swing.JScrollPane BARANGGAYCOUNSELORTABLESCROLL;
    private javax.swing.JPanel BARANGGAYCOUNSELORVOTINGPANEL;
    private javax.swing.JLabel BIRTHDATELABEL;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BackPanel;
    private javax.swing.JButton BackResultsButton;
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
    private javax.swing.JLabel CITYCOUNSELORBALLOTNUM;
    private javax.swing.JPanel CITYCOUNSELORDESIGN1;
    private javax.swing.JPanel CITYCOUNSELORDESIGN2;
    private javax.swing.JTextPane CITYCOUNSELORINSTRUCTION;
    private javax.swing.JTextPane CITYCOUNSELORINSTRUCTION1;
    private javax.swing.JScrollPane CITYCOUNSELORSCROLL;
    private javax.swing.JSpinner CITYCOUNSELORSPINNER;
    private javax.swing.JButton CITYCOUNSELORSUBMIT;
    private javax.swing.JTable CITYCOUNSELORTABLE;
    private javax.swing.JScrollPane CITYCOUNSELORTABLESCROLL;
    private javax.swing.JPanel CITYCOUNSELORVOTINGPANEL;
    private javax.swing.JLabel CIVILSTATUSLABEL;
    private javax.swing.JLabel CONFIRMPASSWORDLABEL;
    private javax.swing.JTextField CONFIRMPASSWORDTEXTFIELD;
    private javax.swing.JLabel CONGRESSMANBALLOTNUM;
    private javax.swing.JPanel CONGRESSMANDESIGN1;
    private javax.swing.JPanel CONGRESSMANDESIGN2;
    private javax.swing.JTextPane CONGRESSMANINSTRUCTION;
    private javax.swing.JScrollPane CONGRESSMANSCROLL;
    private javax.swing.JSpinner CONGRESSMANSPINNER;
    private javax.swing.JButton CONGRESSMANSUBMIT;
    private javax.swing.JTable CONGRESSMANTABLE;
    private javax.swing.JScrollPane CONGRESSMANTABLESCROLL;
    private javax.swing.JPanel CONGRESSMANVOTINGPANEL;
    private javax.swing.JPanel CONTAINER1;
    private javax.swing.JTextPane CONTENT;
    private javax.swing.JTextField CURRPASSWORDTEXTFIELD;
    private javax.swing.JButton CityCouncilorButton;
    private javax.swing.JPanel CityCounselorTab;
    private javax.swing.JButton CongressmanButton;
    private javax.swing.JPanel CongressmanTab;
    private javax.swing.JPanel DASHBOARDCONTENT;
    private javax.swing.JPanel DATETIME;
    private javax.swing.JTabbedPane EChoiceTab;
    private javax.swing.JLabel EMAILADDRESSLABEL;
    private javax.swing.JTextField EMAILTEXTFIELD;
    private javax.swing.JLabel EXIT;
    private javax.swing.JPanel ElectorateChoices1;
    private javax.swing.JPanel ElectorateChoices2;
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
    private javax.swing.JPanel FILLER;
    private javax.swing.JLabel FULLNAMELABEL;
    private javax.swing.JPanel Feedback;
    private javax.swing.JLabel GENDERLABEL;
    private javax.swing.JPanel GEOINDEX;
    private javax.swing.JLabel GOVERNORBALLOTNUM;
    private javax.swing.JButton GOVERNORButton;
    private javax.swing.JPanel GOVERNORDESIGN1;
    private javax.swing.JPanel GOVERNORDESIGN2;
    private javax.swing.JTextPane GOVERNORINSTRUCTION;
    private javax.swing.JScrollPane GOVERNORSCROLL;
    private javax.swing.JSpinner GOVERNORSPINNER;
    private javax.swing.JButton GOVERNORSUBMIT;
    private javax.swing.JTable GOVERNORTABLE;
    private javax.swing.JScrollPane GOVERNORTABLESCROLL1;
    private javax.swing.JPanel GOVERNORVOTINGPANEL;
    private javax.swing.JPanel GovernorTab;
    private javax.swing.JLabel HORIZONTALSEPARATOR;
    private javax.swing.JButton HOUSEOFREPRESENTIVESButton2;
    private javax.swing.JLabel HOUSEREPBALLOTNUM;
    private javax.swing.JPanel HOUSEREPDESIGN1;
    private javax.swing.JPanel HOUSEREPDESIGN2;
    private javax.swing.JTextPane HOUSEREPINSTRUCTION1;
    private javax.swing.JScrollPane HOUSEREPSCROLL;
    private javax.swing.JSpinner HOUSEREPSPINNER;
    private javax.swing.JButton HOUSEREPSUBMIT;
    private javax.swing.JTable HOUSEREPTABLE;
    private javax.swing.JScrollPane HOUSEREPTABLESCROLL1;
    private javax.swing.JPanel HOUSEREPVOTINGPANEL;
    private javax.swing.JPanel HouseOfRepresentatives;
    private javax.swing.JLabel ID;
    private javax.swing.JPanel INDEX0;
    private javax.swing.JPanel INDEX1;
    private javax.swing.JPanel INDEX2;
    private javax.swing.JPanel INDEX3;
    private javax.swing.JLabel INFORMATION;
    private javax.swing.JLabel LABEL1;
    private javax.swing.JButton LOCAL;
    private javax.swing.JPanel LOCALTAB;
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel LOGOUT;
    private javax.swing.JLabel LocalResultLabel;
    private javax.swing.JPanel LocalResultsPanel;
    private javax.swing.JPanel MAIN;
    private javax.swing.JLabel MAYORBALLOTNUM;
    private javax.swing.JPanel MAYORDESIGN1;
    private javax.swing.JPanel MAYORDESIGN2;
    private javax.swing.JTextPane MAYORINSTRUCTION;
    private javax.swing.JScrollPane MAYORSCROLL;
    private javax.swing.JSpinner MAYORSPINNER;
    private javax.swing.JButton MAYORSUBMIT;
    private javax.swing.JTable MAYORTABLE;
    private javax.swing.JScrollPane MAYORTABLESCROLL;
    private javax.swing.JPanel MAYORVOTINGPANEL;
    private javax.swing.JScrollPane MESSAGE;
    private javax.swing.JTextArea MESSAGEPANEL;
    private javax.swing.JLabel MINIMIZE;
    private javax.swing.JButton MayorButton;
    private javax.swing.JPanel MayorTab;
    private javax.swing.JTextField NAMETEXTFIELD1;
    private javax.swing.JButton NATIONAL;
    private javax.swing.JPanel NATIONALTAB;
    private javax.swing.JTextField NEWANSWERTEXTFIELD;
    private javax.swing.JLabel NEWPASSWORDLABEL;
    private javax.swing.JTextField NEWPASSWORDTEXTFIELD;
    private javax.swing.JComboBox<String> NEWSECURITYQUESTIONCOMBOBOX;
    private javax.swing.JLabel NEWSECURITYQUESTIONLABEL;
    private javax.swing.JLabel NONVOTED;
    private javax.swing.JLabel NationalResultLabel;
    private javax.swing.JPanel NationalResultsPanel;
    private javax.swing.JPanel OPTIONS;
    private javax.swing.JTabbedPane OPTIONSTAB;
    private javax.swing.JLabel PBMBALLOTNUM;
    private javax.swing.JPanel PBMDESIGN1;
    private javax.swing.JTextPane PBMINSTRUCTION;
    private javax.swing.JPanel PBMORDESIGN2;
    private javax.swing.JScrollPane PBMSCROLL;
    private javax.swing.JSpinner PBMSPINNER;
    private javax.swing.JButton PBMSUBMIT;
    private javax.swing.JTable PBMTABLE;
    private javax.swing.JScrollPane PBMTABLESCROLL;
    private javax.swing.JPanel PBMTab;
    private javax.swing.JPanel PBMVOTINGPANEL;
    private javax.swing.JPanel PERSONALINFORMATIONCONTAINER;
    private javax.swing.JLabel PERSONALINFORMATIONLABEL;
    private javax.swing.JLabel PRESIDENTBALLOTNUM;
    private javax.swing.JButton PRESIDENTButton;
    private javax.swing.JPanel PRESIDENTDESIGN1;
    private javax.swing.JPanel PRESIDENTDESIGN2;
    private javax.swing.JTextPane PRESIDENTINSTRUCTION;
    private javax.swing.JScrollPane PRESIDENTSCROLL;
    private javax.swing.JSpinner PRESIDENTSPINNER;
    private javax.swing.JButton PRESIDENTSUBMIT;
    private javax.swing.JTable PRESIDENTTABLE;
    private javax.swing.JScrollPane PRESIDENTTABLESCROLL1;
    private javax.swing.JPanel PRESIDENTVOTINGPANEL;
    private javax.swing.JPanel PRIVACYANDPOLICY;
    private javax.swing.JLabel PRIVACYANDPOLICYARROW;
    private javax.swing.JLabel PRIVACYANDPOLICYBACKGROUND;
    private javax.swing.JScrollPane PRIVACYANDPOLICYCONTENTPANE;
    private javax.swing.JPanel PRIVACYANDPOLICYHEADER;
    private javax.swing.JLabel PRIVACYANDPOLICYLABEL;
    private javax.swing.JLabel PRIVACYNPOLICYICON;
    private javax.swing.JLabel PRIVACYNPOLICYLABEL;
    private javax.swing.JLabel PROFILE;
    private javax.swing.JButton PROVINCIALBOARDMEMBERButton;
    private javax.swing.JPanel President;
    private javax.swing.JPanel PrivacyAndPolicy;
    private javax.swing.JPanel ProvencialBoardMember;
    private javax.swing.JLabel REGISTEREDVOTERS;
    private javax.swing.JLabel ResultsLabel;
    private javax.swing.JPanel ResultsLabelPanel;
    private javax.swing.JPanel ResultsPanel;
    private javax.swing.JTabbedPane ResultsTab;
    private javax.swing.JPanel SECURITY;
    private javax.swing.JLabel SECURITYICON;
    private javax.swing.JLabel SECURITYLABEL;
    private javax.swing.JLabel SENATORBALLOTNUM;
    private javax.swing.JButton SENATORButton2;
    private javax.swing.JPanel SENATORDESIGN1;
    private javax.swing.JPanel SENATORDESIGN2;
    private javax.swing.JTextPane SENATORINSTRUCTION;
    private javax.swing.JScrollPane SENATORSCROLL;
    private javax.swing.JSpinner SENATORSPINNER;
    private javax.swing.JButton SENATORSUBMIT;
    private javax.swing.JTable SENATORTABLE;
    private javax.swing.JScrollPane SENATORTABLESCROLL;
    private javax.swing.JPanel SENATORVOTINGPANEL;
    private javax.swing.JButton SENDFEEDBACKBUTTON;
    private javax.swing.JLabel SEPARATOR;
    private javax.swing.JLabel SEPARATOR1;
    private javax.swing.JLabel SEPARATOR2;
    private javax.swing.JLabel SEPARATOR3;
    private javax.swing.JLabel SEPARATOR4;
    private javax.swing.JPanel SEPARATORLINE1;
    private javax.swing.JTabbedPane SETTINGSTAB;
    private javax.swing.JButton SKBackButton1;
    private javax.swing.JButton SKBackButton2;
    private javax.swing.JButton SKButton;
    private javax.swing.JLabel SKCHAIRBALLOTNUM;
    private javax.swing.JPanel SKCHAIRDESIGN1;
    private javax.swing.JPanel SKCHAIRDESIGN2;
    private javax.swing.JTextPane SKCHAIRINSTRUCTION;
    private javax.swing.JScrollPane SKCHAIRSCROLL;
    private javax.swing.JSpinner SKCHAIRSPINNER;
    private javax.swing.JButton SKCHAIRSUBMIT;
    private javax.swing.JTable SKCHAIRTABLE;
    private javax.swing.JScrollPane SKCHAIRTABLESCROLL;
    private javax.swing.JPanel SKCHAIRVOTINGPANEL;
    private javax.swing.JLabel SKCOUNCILORBALLOTNUM;
    private javax.swing.JPanel SKCOUNCILORDESIGN;
    private javax.swing.JPanel SKCOUNCILORDESIGN2;
    private javax.swing.JTextPane SKCOUNCILORINSTRUCTION;
    private javax.swing.JScrollPane SKCOUNCILORSCROLL;
    private javax.swing.JSpinner SKCOUNCILORSPINNER;
    private javax.swing.JButton SKCOUNCILORSUBMIT;
    private javax.swing.JTable SKCOUNCILORTABLE;
    private javax.swing.JScrollPane SKCOUNCILORTABLESCROLL1;
    private javax.swing.JPanel SKCOUNCILORVOTINGPANEL1;
    private javax.swing.JButton SKChairpersonButton;
    private javax.swing.JPanel SKChairpersonTab;
    private javax.swing.JPanel SKCounselorTab;
    private javax.swing.JButton SKKagawadButton;
    private javax.swing.JLabel SKLabel;
    private javax.swing.JLabel SKLabel1;
    private javax.swing.JButton SKResultsButton;
    private javax.swing.JPanel SKResultsPanel;
    private javax.swing.JPanel SKTab;
    private javax.swing.JButton STATE;
    private javax.swing.JPanel STATETAB;
    private javax.swing.JLabel STATISTICSLABEL;
    private javax.swing.JPanel SecurityPanel;
    private javax.swing.JPanel Senator;
    private javax.swing.JLabel StateResultLabel;
    private javax.swing.JPanel StateResultsPanel;
    private javax.swing.JPanel TOOLBAR;
    private javax.swing.JLabel USERIMAGE;
    private javax.swing.JLabel USERIMAGE1;
    private javax.swing.JLabel USERIMAGE2;
    private javax.swing.JLabel VICEGOVERNORBALLOTNUM;
    private javax.swing.JButton VICEGOVERNORButton;
    private javax.swing.JPanel VICEGOVERNORDESIGN1;
    private javax.swing.JPanel VICEGOVERNORDESIGN2;
    private javax.swing.JTextPane VICEGOVERNORINSTRUCTION;
    private javax.swing.JScrollPane VICEGOVERNORSCROLL;
    private javax.swing.JSpinner VICEGOVERNORSPINNER;
    private javax.swing.JButton VICEGOVERNORSUBMIT;
    private javax.swing.JTable VICEGOVERNORTABLE;
    private javax.swing.JScrollPane VICEGOVERNORTABLESCROLL;
    private javax.swing.JPanel VICEGOVERNORVOTINGPANEL;
    private javax.swing.JLabel VICEMAYORBALLOTNUM;
    private javax.swing.JPanel VICEMAYORDESIGN1;
    private javax.swing.JPanel VICEMAYORDESIGN2;
    private javax.swing.JTextPane VICEMAYORINSTRUCTION;
    private javax.swing.JScrollPane VICEMAYORSCROLL;
    private javax.swing.JSpinner VICEMAYORSPINNER;
    private javax.swing.JButton VICEMAYORSUBMIT;
    private javax.swing.JTable VICEMAYORTABLE;
    private javax.swing.JScrollPane VICEMAYORTABLESCROLL;
    private javax.swing.JPanel VICEMAYORVOTINGPANEL;
    private javax.swing.JLabel VICEPRESIDENTBALLOTNUM;
    private javax.swing.JButton VICEPRESIDENTButton1;
    private javax.swing.JPanel VICEPRESIDENTDESIGN1;
    private javax.swing.JPanel VICEPRESIDENTDESIGN2;
    private javax.swing.JTextPane VICEPRESIDENTINSTRUCTION;
    private javax.swing.JScrollPane VICEPRESIDENTSCROLL;
    private javax.swing.JSpinner VICEPRESIDENTSPINNER;
    private javax.swing.JButton VICEPRESIDENTSUBMIT;
    private javax.swing.JTable VICEPRESIDENTTABLE;
    private javax.swing.JScrollPane VICEPRESIDENTTABLESCROLL;
    private javax.swing.JPanel VICEPRESIDENTVOTINGPANEL;
    private javax.swing.JLabel VOTED;
    private javax.swing.JLabel VOTEFORBARANGGAYCAPTAIN;
    private javax.swing.JLabel VOTEFORBARANGGAYCOUNSELOR;
    private javax.swing.JLabel VOTEFORCITYCOUNSELOR;
    private javax.swing.JLabel VOTEFORCONGRESSMAN;
    private javax.swing.JLabel VOTEFORGOVERNOR;
    private javax.swing.JLabel VOTEFORHOUSEREP;
    private javax.swing.JLabel VOTEFORMAYOR;
    private javax.swing.JLabel VOTEFORPBM;
    private javax.swing.JLabel VOTEFORPRESIDENT;
    private javax.swing.JLabel VOTEFORSENATOR;
    private javax.swing.JLabel VOTEFORSKCHAIR;
    private javax.swing.JLabel VOTEFORSKCOUNCILOR;
    private javax.swing.JLabel VOTEFORVICEGOVERNOR;
    private javax.swing.JLabel VOTEFORVICEMAYOR;
    private javax.swing.JLabel VOTEFORVICEPRESIDENT;
    private javax.swing.JLabel VOTINGSYSTEM;
    private javax.swing.JPanel ViceGovernorTab;
    private javax.swing.JButton ViceMayorButton;
    private javax.swing.JPanel ViceMayorTab;
    private javax.swing.JPanel VicePresident;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel dashboard;
    private javax.swing.JPanel dashboardpanel;
    private javax.swing.JLabel dashboardpic;
    private javax.swing.JLabel dateTime;
    private javax.swing.JLabel elections;
    private javax.swing.JPanel electionspanel;
    private javax.swing.JLabel electionspic;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
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

