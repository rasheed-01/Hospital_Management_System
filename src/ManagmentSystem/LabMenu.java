/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagmentSystem;

import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
             
public class LabMenu extends javax.swing.JFrame {

    private static final String username = "root" ;
    private static final String password = "Test@123";
    private static final String dataConn ="jdbc:mysql://localhost:3306/hms";
    Connection sqlConn = null;
    PreparedStatement pst =null;
    PreparedStatement pst1 =null;
    PreparedStatement pst2 =null;
    ResultSet rs =null;
    String username4;
    
    int i,q,db;



    public LabMenu(String username3) {
        initComponents();
        this.setLocationRelativeTo(null);
        username4 = username3;
    }
    class PriceCalc
    {
        private String amount="";
        private String type="";
        
        public String getType()
        {
            return type;
        }
        
        public void setType(String type)
        {
            this.type=type;
        }
                    
}
    ManagmentSystem.PriceCalc calc=new ManagmentSystem.PriceCalc();
    public void upDatelabDB () throws SQLException
    {
    try
    {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from labrequest");
        
        rs = pst.executeQuery ();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount ();
       // DefaultTableModel RecordTable = (DefaultTableModel) Appointment_Table.getModel();
        //RecordTable.setRowCount (0);
        
        while (rs.next ())
        {
            Vector columnData1 = new Vector();
             for (i = 1;i <= q; i++)
             {
                   columnData1.add (rs.getString ("SNo"));
                    columnData1.add (rs.getString ("PatientID"));
                    columnData1.add (rs.getString ("Name"));
                    columnData1.add (rs.getString ("Age"));
                    columnData1.add (rs.getString ("DoctorName"));
                    columnData1.add (rs.getString ("TestName"));
                    columnData1.add (rs.getString ("Amount"));
                    columnData1.add (rs.getString ("Status"));
                    columnData1.add (rs.getString ("Result"));
                    columnData1.add (rs.getString ("DateandTime"));
             }
             
        }
    }
    catch (ClassNotFoundException ex) {
            System.out.println("BOOm");
        }
    }
    public void upDateDB () throws SQLException {
    try
    {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from pharmacyrequest");
        
        rs = pst.executeQuery ();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount ();
       // DefaultTableModel RecordTable = (DefaultTableModel) Appointment_Table.getModel();
        //RecordTable.setRowCount (0);
        
        while (rs.next ())
        {
            Vector columnData = new Vector();
             for (i = 1;i <= q; i++)
             {
                    columnData.add (rs.getString ("SNo"));
                    columnData.add (rs.getString ("PatientID"));
                    columnData.add (rs.getString ("Name"));
                    columnData.add (rs.getString ("Age"));
                    columnData.add (rs.getString ("DoctorName"));
                    columnData.add (rs.getString ("Medicine"));
                    columnData.add (rs.getString ("Quantity"));
                    columnData.add (rs.getString ("Amount"));
                    columnData.add (rs.getString ("Status"));
                    columnData.add (rs.getString ("DateandTime"));
             }
        }
       }
        catch(Exception e){e.printStackTrace();}            
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Lab_result = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lab_table = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        patidlab = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        patnamelab = new javax.swing.JTextField();
        patlabage = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Completeddot = new javax.swing.JRadioButton();
        Completeddot2 = new javax.swing.JRadioButton();
        Completeddot3 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        updatelabrequests = new javax.swing.JButton();
        refreshlabrequests = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        patidsearch = new javax.swing.JTextArea();
        searchlabrequests = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        clearlabrequestfields = new javax.swing.JButton();
        patlabtest = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setText("Choose One of the Following Options");

        Lab_result.setLocationByPlatform(true);
        Lab_result.setMinimumSize(new java.awt.Dimension(1338, 659));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel17.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Pending LAB Test Requests");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lab_table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lab_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Age", "Doctor's Name", "Test Name", "Status", "Result", "Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lab_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lab_table);

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel18.setText("Patient ID");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel7.setText("Age");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel8.setText("Lab Test Name");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel9.setText("Status");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel10.setText("Result");

        jTextField6.setText("Completed");

        Completeddot.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Completeddot.setText("Positve");
        Completeddot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteddotActionPerformed(evt);
            }
        });

        Completeddot2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Completeddot2.setText("Inconclusive");
        Completeddot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Completeddot2ActionPerformed(evt);
            }
        });

        Completeddot3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Completeddot3.setText("Negative");
        Completeddot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Completeddot3ActionPerformed(evt);
            }
        });

        updatelabrequests.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        updatelabrequests.setText("Update");
        updatelabrequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatelabrequestsActionPerformed(evt);
            }
        });

        refreshlabrequests.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        refreshlabrequests.setText("Refresh");
        refreshlabrequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshlabrequestsActionPerformed(evt);
            }
        });

        patidsearch.setColumns(20);
        patidsearch.setRows(5);
        jScrollPane11.setViewportView(patidsearch);

        searchlabrequests.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        searchlabrequests.setText("Search");
        searchlabrequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchlabrequestsActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel21.setText("Enter Patient ID :");

        jLabel30.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Patient Information");

        clearlabrequestfields.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        clearlabrequestfields.setText("Clear");
        clearlabrequestfields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearlabrequestfieldsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Lab_resultLayout = new javax.swing.GroupLayout(Lab_result.getContentPane());
        Lab_result.getContentPane().setLayout(Lab_resultLayout);
        Lab_resultLayout.setHorizontalGroup(
            Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Lab_resultLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Lab_resultLayout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Lab_resultLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patlabtest, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Lab_resultLayout.createSequentialGroup()
                                .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(44, 44, 44)
                                .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(patidlab)
                                        .addComponent(patnamelab)
                                        .addComponent(patlabage, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Lab_resultLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Lab_resultLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(66, 66, 66)
                                        .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Completeddot)
                                            .addComponent(Completeddot2)
                                            .addComponent(Completeddot3)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Lab_resultLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(refreshlabrequests, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(updatelabrequests, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Lab_resultLayout.createSequentialGroup()
                            .addComponent(clearlabrequestfields)
                            .addGap(118, 118, 118)))
                    .addGroup(Lab_resultLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel30)
                        .addGap(40, 40, 40)))
                .addGap(2, 2, 2))
            .addGroup(Lab_resultLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchlabrequests, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 612, Short.MAX_VALUE))
        );
        Lab_resultLayout.setVerticalGroup(
            Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Lab_resultLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchlabrequests, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Lab_resultLayout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(patidlab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(patnamelab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(patlabage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(patlabtest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Lab_resultLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Completeddot, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Completeddot3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Completeddot2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Lab_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(refreshlabrequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatelabrequests))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearlabrequestfields)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Lab Menu");
        setMinimumSize(new java.awt.Dimension(635, 218));

        jButton5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton5.setText("View Pending Requests");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton6.setText("LogOut");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Lab Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addContainerGap(485, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setText("Choose One of the Following Options");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Lab_result.setModal(false);
        try
                {
                Class.forName ("com.mysql.cj.jdbc.Driver");
                sqlConn= DriverManager.getConnection (dataConn,username, password);
                pst = sqlConn.prepareStatement ("select* from labrequest where Status= 'Pending Test'");

                rs = pst.executeQuery ();
                ResultSetMetaData stData = rs.getMetaData();
                q = stData.getColumnCount ();
                DefaultTableModel RecordTable = (DefaultTableModel) lab_table.getModel();
                RecordTable.setRowCount (0);

                while (rs.next ())
                {
                    Vector columnData = new Vector();
                     for (i = 1;i <= q; i++)
                     {
                            
                            columnData.add (rs.getString ("PatientID"));
                            columnData.add (rs.getString ("Name"));
                            columnData.add (rs.getString ("Age"));
                            columnData.add (rs.getString ("DoctorName"));
                            columnData.add (rs.getString ("TestName"));
                            columnData.add (rs.getString ("Status"));
                            columnData.add (rs.getString ("Result"));
                            columnData.add (rs.getString ("DateandTime"));

                     }
                     RecordTable.addRow(columnData);
                }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                Lab_result.setModal(false);
                Lab_result.setLocationRelativeTo(null);
                Lab_result.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement ("INSERT INTO useractivity(Username,Role,DateandTime,Action) value(?,?,?,?)");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
            LocalDateTime now = LocalDateTime.now();
            String dateTime = now.format(formatter);
                
            pst.setString (1,username4);
            pst.setString (2,"lab");
            pst.setString (3,dateTime);
            pst.setString (4,"LogOut");
            
            pst.executeUpdate();
            
        
        }
         catch(Exception e)
        {
            e.printStackTrace();
        }
        new MainInterface().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void lab_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_tableMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)lab_table.getModel ();
        int SelectedRows = lab_table.getSelectedRow ();
        patidlab.setText (RecordTable.getValueAt (SelectedRows, 0).toString ());
        patlabtest.setText (RecordTable.getValueAt (SelectedRows, 4).toString ());
        patlabage.setText(RecordTable.getValueAt (SelectedRows, 2).toString ());
        patnamelab.setText(RecordTable.getValueAt (SelectedRows, 1).toString ());
    }//GEN-LAST:event_lab_tableMouseClicked

    private void CompleteddotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteddotActionPerformed
        calc.setType("Positive");
    }//GEN-LAST:event_CompleteddotActionPerformed

    private void Completeddot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Completeddot2ActionPerformed
        calc.setType("Inconclusive");
    }//GEN-LAST:event_Completeddot2ActionPerformed

    private void Completeddot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Completeddot3ActionPerformed
        calc.setType("Negative");
    }//GEN-LAST:event_Completeddot3ActionPerformed

    private void updatelabrequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatelabrequestsActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)lab_table.getModel ();
        int SelectedRows = lab_table.getSelectedRow ();
        String result = calc.getType();
        String pID= patidlab.getText();
        String dt = RecordTable.getValueAt (SelectedRows, 7).toString ();
        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement ("update labrequest set Status=?, Result=? where PatientID='" + pID +"' And DateAndTime= '" + dt +"' ");

            pst.setString (1,"Completed");
            pst.setString (2, result);
            pst.executeUpdate();
            upDatelabDB();
             JOptionPane.showMessageDialog(this,"Update Successful");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updatelabrequestsActionPerformed

    private void refreshlabrequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshlabrequestsActionPerformed
        try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn= DriverManager.getConnection (dataConn,username, password);
            pst = sqlConn.prepareStatement ("select* from labrequest where Status='Pending Test'");

            rs = pst.executeQuery ();
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount ();
            DefaultTableModel RecordTable = (DefaultTableModel) lab_table.getModel();
            RecordTable.setRowCount (0);

            while (rs.next ())
            {
                Vector columnData = new Vector();
                for (i = 1;i <= q; i++)
                {

                    columnData.add (rs.getString ("PatientID"));
                    columnData.add (rs.getString ("Name"));
                    columnData.add (rs.getString ("Age"));
                    columnData.add (rs.getString ("DoctorName"));
                    columnData.add (rs.getString ("TestName"));
                    columnData.add (rs.getString ("Status"));
                    columnData.add (rs.getString ("Result"));
                    columnData.add (rs.getString ("DateandTime"));

                }
                RecordTable.addRow(columnData);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_refreshlabrequestsActionPerformed

    private void searchlabrequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchlabrequestsActionPerformed
        int found = 0;
        try
        {
            DefaultTableModel model7 = (DefaultTableModel) lab_table.getModel();
            model7.setRowCount(0);
            if( patidsearch.getText().equals(""))
            {
                found = 2;
                JOptionPane.showMessageDialog(rootPane, "Please Enter A Patient ID");
            }
            else
            {
                String patno= patidsearch.getText();
                found=1;
                try
                {
                    Class.forName ("com.mysql.cj.jdbc.Driver");
                    sqlConn= DriverManager.getConnection (dataConn,username, password);
                    pst = sqlConn.prepareStatement ("select* from labrequest where PatientID='" + patno +"'");

                    rs = pst.executeQuery ();
                    ResultSetMetaData stData = rs.getMetaData();
                    q = stData.getColumnCount ();
                    DefaultTableModel RecordTable = (DefaultTableModel) lab_table.getModel();
                    RecordTable.setRowCount (0);

                    while (rs.next ())
                    {
                        Vector columnData = new Vector();
                        for (i = 1;i <= q; i++)
                        {
                            columnData.add (rs.getString ("PatientID"));
                            columnData.add (rs.getString ("Name"));
                            columnData.add (rs.getString ("Age"));
                            columnData.add (rs.getString ("DoctorName"));
                            columnData.add (rs.getString ("TestName"));
                            columnData.add (rs.getString ("Status"));
                            columnData.add (rs.getString ("Result"));
                            columnData.add (rs.getString ("DateandTime"));

                        }
                        RecordTable.addRow(columnData);
                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        if (found == 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Record not found.");
        }
    }//GEN-LAST:event_searchlabrequestsActionPerformed

    private void clearlabrequestfieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearlabrequestfieldsActionPerformed
        patidlab.setText ("");
        patlabtest.setText ("");
        patlabage.setText("");
        patnamelab.setText("");
        patidsearch.setText("");
        Completeddot3.setSelected(false); 
        Completeddot.setSelected(false); 
        Completeddot2.setSelected(false); 

    }//GEN-LAST:event_clearlabrequestfieldsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Completeddot;
    private javax.swing.JRadioButton Completeddot2;
    private javax.swing.JRadioButton Completeddot3;
    private javax.swing.JDialog Lab_result;
    private javax.swing.JButton clearlabrequestfields;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable lab_table;
    private javax.swing.JTextField patidlab;
    private javax.swing.JTextArea patidsearch;
    private javax.swing.JTextField patlabage;
    private javax.swing.JTextField patlabtest;
    private javax.swing.JTextField patnamelab;
    private javax.swing.JButton refreshlabrequests;
    private javax.swing.JButton searchlabrequests;
    private javax.swing.JButton updatelabrequests;
    // End of variables declaration//GEN-END:variables
}
