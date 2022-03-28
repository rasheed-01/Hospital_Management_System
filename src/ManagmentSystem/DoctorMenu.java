/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagmentSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class DoctorMenu extends javax.swing.JFrame{

    private static final String username = "root" ;
    private static final String password = "Test@123";
    private static final String dataConn ="jdbc:mysql://localhost:3306/hms";
    Connection sqlConn = null;
    PreparedStatement pst =null;
    PreparedStatement pst1 =null;
    ResultSet rs =null;
    int i,q,db;
    String username4;
    
    public DoctorMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public DoctorMenu(String username3) {
        initComponents();
        this.setLocationRelativeTo(null);
        username4=username3;
    }
    public void upDateDB () throws SQLException
    {
        try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn= DriverManager.getConnection (dataConn,username, password);
            pst = sqlConn.prepareStatement ("select* from appointments");

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
                        columnData.add (rs.getString ("PhoneNo"));
                        columnData.add (rs.getString ("Date"));
                        columnData.add (rs.getString ("Time"));
                        columnData.add (rs.getString ("Dept"));
                        columnData.add (rs.getString ("DoctorName"));
                        columnData.add (rs.getString ("DateandTime"));
                        columnData.add (rs.getString ("Status"));
                 }
                 //RecordTable.addRow(columnData);
            }
        }

        catch (ClassNotFoundException ex) {
                System.out.println("BOOm");
            }
    }
    
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Test_result = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        patidsearch = new javax.swing.JTextField();
        patlabage = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        LAB_Retest = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lab_table = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        patidlab = new javax.swing.JTextField();
        patlabtest = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        patnamelab = new javax.swing.JTextField();
        patresultlab = new javax.swing.JTextField();
        refreshlab = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Appointment_Viewer = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        stats = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        patID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Specific_appointment = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        patid = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        docname = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        labtype = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        medicinetype = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        quantitytype = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        labamt = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        medamt = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        submitlab = new javax.swing.JButton();
        age = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        Test_result.setMinimumSize(new java.awt.Dimension(1350, 524));
        Test_result.setResizable(false);

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Patient ID");

        jButton5.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        patidsearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        patidsearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        patidsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patidsearchActionPerformed(evt);
            }
        });

        jTextField6.setText("Completed");

        LAB_Retest.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        LAB_Retest.setText("Request for a Retest");
        LAB_Retest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LAB_RetestActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(lab_table);

        jLabel30.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Patient Information");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel6.setText("Patient ID");

        jButton11.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton11.setText("Clear");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel8.setText("Age");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel9.setText("Lab Test Name");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel10.setText("Status");

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel11.setText("Result");

        patresultlab.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        patresultlab.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        patresultlab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        refreshlab.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        refreshlab.setText("Refresh");
        refreshlab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshlabActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setForeground(new java.awt.Color(240, 240, 240));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Lab Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Test_resultLayout = new javax.swing.GroupLayout(Test_result.getContentPane());
        Test_result.getContentPane().setLayout(Test_resultLayout);
        Test_resultLayout.setHorizontalGroup(
            Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Test_resultLayout.createSequentialGroup()
                .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Test_resultLayout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(Test_resultLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(patidsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshlab)
                        .addGap(44, 44, 44)))
                .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Test_resultLayout.createSequentialGroup()
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LAB_Retest))
                        .addGroup(Test_resultLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(71, 71, 71)
                            .addComponent(patresultlab, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Test_resultLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patlabtest, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Test_resultLayout.createSequentialGroup()
                        .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(44, 44, 44)
                        .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(patidlab)
                                .addComponent(patnamelab)
                                .addComponent(patlabage, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel30))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Test_resultLayout.setVerticalGroup(
            Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Test_resultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Test_resultLayout.createSequentialGroup()
                        .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Test_resultLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(patidsearch))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Test_resultLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshlab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Test_resultLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(patidlab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(patnamelab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(patlabage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(patlabtest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patresultlab, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(Test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11)
                            .addComponent(LAB_Retest))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Appointment_Viewer.setMinimumSize(new java.awt.Dimension(777, 750));
        Appointment_Viewer.setResizable(false);

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setText("Enter Patient ID :");

        Search.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel27.setText("Status");

        jLabel22.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel22.setText("Patient ID");

        jLabel23.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel23.setText("Name");

        jLabel28.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Request For Lab Test");

        jButton8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton8.setText("Clear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        name.setEditable(false);

        jButton9.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton9.setText("Update");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        patID.setEditable(false);

        Specific_appointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Age", "Date", "Time", "Doc Name", "Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Specific_appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Specific_appointmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Specific_appointment);
        if (Specific_appointment.getColumnModel().getColumnCount() > 0) {
            Specific_appointment.getColumnModel().getColumn(2).setMinWidth(40);
            Specific_appointment.getColumnModel().getColumn(2).setPreferredWidth(40);
            Specific_appointment.getColumnModel().getColumn(2).setMaxWidth(40);
            Specific_appointment.getColumnModel().getColumn(6).setMinWidth(170);
            Specific_appointment.getColumnModel().getColumn(6).setPreferredWidth(170);
            Specific_appointment.getColumnModel().getColumn(6).setMaxWidth(170);
        }

        patid.setColumns(20);
        patid.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        patid.setRows(5);
        jScrollPane4.setViewportView(patid);

        jLabel29.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Patient Information");

        docname.setEditable(false);

        jLabel33.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel33.setText("Doctor's Name");

        labtype.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        labtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Type of Test", "Covid Test", "Pregnancy Test", "Drug Test", " " }));
        labtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labtypeActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel34.setText("Lab Test");

        jLabel38.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Request For Medicine");

        medicinetype.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        medicinetype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Medicine", "Panadol", "Fevadol", "Amoxilin", "Brufen", "Clarinase", "Dicolonac", "Fusibact ", " " }));
        medicinetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinetypeActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel40.setText("Medicine");

        quantitytype.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        quantitytype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        quantitytype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitytypeActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel41.setText("Quantity");

        jButton12.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton12.setText("Submit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        labamt.setEditable(false);
        labamt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel42.setText("Amount");

        medamt.setEditable(false);
        medamt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel43.setText("Amount");

        submitlab.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        submitlab.setText("Submit");
        submitlab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitlabActionPerformed(evt);
            }
        });

        age.setEditable(false);

        jLabel45.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel45.setText("Age");

        jButton2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton6.setText("Calculate");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton10.setText("Refresh");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Appointment_ViewerLayout = new javax.swing.GroupLayout(Appointment_Viewer.getContentPane());
        Appointment_Viewer.getContentPane().setLayout(Appointment_ViewerLayout);
        Appointment_ViewerLayout.setHorizontalGroup(
            Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Appointment_ViewerLayout.createSequentialGroup()
                                                    .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel22)
                                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(61, 61, 61))
                                                .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                                    .addComponent(jLabel33)
                                                    .addGap(28, 28, 28)))
                                            .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(81, 81, 81)))
                                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(age)
                                                .addComponent(name)
                                                .addComponent(patID)
                                                .addComponent(docname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Appointment_ViewerLayout.createSequentialGroup()
                                .addComponent(submitlab, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Appointment_ViewerLayout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
                            .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel43))
                                .addGap(40, 40, 40)
                                .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                        .addComponent(medamt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2))
                                    .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(quantitytype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(medicinetype, 0, 145, Short.MAX_VALUE))))
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel42))
                                .addGap(40, 40, 40)
                                .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                        .addComponent(labamt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6))))))
                    .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Appointment_ViewerLayout.setVerticalGroup(
            Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel23)
                                .addGap(25, 25, 25))
                            .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                                .addComponent(patID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addGap(20, 20, 20)
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(docname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(28, 28, 28)
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Appointment_ViewerLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitlab, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicinetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantitytype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addGap(1, 1, 1)
                        .addGroup(Appointment_ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Doctor's Menu");

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setText("Choose One of the Following Options");

        jButton1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton3.setText("View Pending Appointments");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jButton4.setText("View LAB Test Results");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doctor's Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        try
       {
           Class.forName ("com.mysql.cj.jdbc.Driver");
           sqlConn = DriverManager.getConnection(dataConn, username, password);
           pst = sqlConn.prepareStatement ("INSERT INTO useractivity(Username,Role,DateandTime,Action) value(?,?,?,?)");
           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
           LocalDateTime now = LocalDateTime.now();
           String dateTime = now.format(formatter);

           pst.setString (1,username4);
           pst.setString (2,"Doctor");
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
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //View And Update All Appointments
        Appointment_Viewer.setModal(false);
       String stats3= "Pending";
        
        try
        {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from appointments where Status = '" + stats3 +"' ");
        
        rs = pst.executeQuery ();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount ();
        DefaultTableModel RecordTable = (DefaultTableModel) Specific_appointment.getModel();
        RecordTable.setRowCount (0);
        
        while (rs.next ())
        {
            Vector columnData = new Vector();
             for (i = 1;i <= q; i++)
             {
                   
                    columnData.add (rs.getString ("PatientID"));
                    columnData.add (rs.getString ("Name"));
                    columnData.add (rs.getString ("Age"));
                    columnData.add (rs.getString ("Date"));
                    columnData.add (rs.getString ("Time"));
                    columnData.add (rs.getString ("DoctorName"));
                    columnData.add (rs.getString ("DateAndTime"));
                    
             }
             RecordTable.addRow(columnData);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
       Appointment_Viewer.setModal(true); 
       Appointment_Viewer.setLocationRelativeTo(null);
       Appointment_Viewer.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        try
            {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn= DriverManager.getConnection (dataConn,username, password);
            pst = sqlConn.prepareStatement ("select* from labrequest where Status = 'Completed'");

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
       Test_result.setModal(true); 
       Test_result.setLocationRelativeTo(null);
       Test_result.setVisible(true);       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        int found = 0;
        try
        {
            DefaultTableModel model7 = (DefaultTableModel) Specific_appointment.getModel();
            model7.setRowCount(0);
            if( patid.getText().equals(""))
            {
                found = 2;
                JOptionPane.showMessageDialog(rootPane, "Please Enter A TP Number");
            }
            else
            {
                String patno= patid.getText();
                found=1;
                try
                {
                    Class.forName ("com.mysql.cj.jdbc.Driver");
                    sqlConn= DriverManager.getConnection (dataConn,username, password);
                    pst = sqlConn.prepareStatement ("select* from appointments where PatientID='" + patno +"'");

                    rs = pst.executeQuery ();
                    ResultSetMetaData stData = rs.getMetaData();
                    q = stData.getColumnCount ();
                    DefaultTableModel RecordTable = (DefaultTableModel) Specific_appointment.getModel();
                    RecordTable.setRowCount (0);

                    while (rs.next ())
                    {
                        Vector columnData = new Vector();
                        for (i = 1;i <= q; i++)
                        {
                            
                             columnData.add (rs.getString ("PatientID"));
                            columnData.add (rs.getString ("Name"));
                            columnData.add (rs.getString ("Age"));
                            columnData.add (rs.getString ("Date"));
                            columnData.add (rs.getString ("Time"));
                            columnData.add (rs.getString ("DoctorName"));
                            columnData.add (rs.getString ("DateAndTime"));
                           
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

    }//GEN-LAST:event_SearchActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        patID.setText("");   
        name.setText(""); 
        age.setText("");
        docname.setText("");
       labamt.setText("");
       medamt.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void labtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labtypeActionPerformed

    private void medicinetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinetypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicinetypeActionPerformed

    private void quantitytypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitytypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantitytypeActionPerformed

    
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String patname = name.getText();
        
        String pID= patID.getText();
        String patage= age.getText();
        String DocN=docname.getText();
        String amt = medamt.getText();
        String meds = medicinetype.getSelectedItem().toString();
        String quantity= quantitytype.getSelectedItem().toString();
        int quantity1 = Integer.parseInt(quantity);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        String dateTime = now.format(formatter);
        
        try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst1 = sqlConn.prepareStatement ("INSERT INTO pharmacyrequest (PatientID,Name,Age,DoctorName,Medicine,Quantity,Amount,Status,DateAndTime) value(?,?,?,?,?,?,?,?,?)");

            pst1.setString (1, pID);
            pst1.setString (2, patname);
            pst1.setString (3, patage);
            pst1.setString (4, DocN);
            pst1.setString (5, meds);
            pst1.setString(6,quantity);
            pst1.setString (7, amt);
            pst1.setString (8, "Pending" );
            pst1.setString (9, dateTime);

            pst1.executeUpdate();
            JOptionPane.showMessageDialog(this,"Medicine Request Sent Successfully");
            }
            
        
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButton12ActionPerformed

    private void submitlabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitlabActionPerformed
        
        String patname = name.getText();
        String pID= patID.getText();
        String patage= age.getText();
        String DocN=docname.getText();
        String amt = labamt.getText();
        String testtype = labtype.getSelectedItem().toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        String dateTime = now.format(formatter);
        
        try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst1 = sqlConn.prepareStatement ("INSERT INTO labrequest(PatientID,Name,Age,DoctorName,TestName,Amount,Status,Result,DateAndTime) value(?,?,?,?,?,?,?,?,?)");

            pst1.setString (1, pID);
            pst1.setString (2, patname);
            pst1.setString (3, patage);
            pst1.setString (4, DocN);
            pst1.setString (5, testtype);
            pst1.setString (6, amt);
            pst1.setString (7, "UnPaid" );
            pst1.setString (8, "Awaiting");
            pst1.setString (9, dateTime);

            pst1.executeUpdate();
            JOptionPane.showMessageDialog(this,"LAB Request Sent Successfully");
            }
            
        
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_submitlabActionPerformed

    private void Specific_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Specific_appointmentMouseClicked
         DefaultTableModel RecordTable = (DefaultTableModel) Specific_appointment.getModel();
        int SelectedRows= Specific_appointment.getSelectedRow();
        
         patID.setText(RecordTable.getValueAt(SelectedRows, 0).toString());   
         name.setText(RecordTable.getValueAt(SelectedRows, 1).toString()); 
         age.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
         docname.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
         stats.setText("Completed");
         
    }//GEN-LAST:event_Specific_appointmentMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String stats1=stats.getText();
        String pID = patID.getText();
        DefaultTableModel RecordTable = (DefaultTableModel) Specific_appointment.getModel();
        int SelectedRows= Specific_appointment.getSelectedRow();
        String dt=RecordTable.getValueAt(SelectedRows, 6).toString();
        

        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement ("update appointments set Status=? where PatientID='" + pID +"' And DateAndTime= '" + dt +"' ");
        
            pst.setString (1, stats1);
            pst.executeUpdate();  
            upDateDB();
           JOptionPane.showMessageDialog(this,"Appointment Completed");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int cost;
       int finalcost;
       String meds = medicinetype.getSelectedItem().toString();
       String quantity= quantitytype.getSelectedItem().toString();
       int quantity1 = Integer.parseInt(quantity);
        
        if ("Panadol".equals(meds)){cost=20; finalcost= quantity1*cost; String finalcost1 = Integer.toString(finalcost);medamt.setText("SR "+finalcost1);}
        if ("Fevadol".equals(meds)){cost=15; finalcost= quantity1*cost; String finalcost1 = Integer.toString(finalcost);medamt.setText("SR "+finalcost1);}
        if ("Amoxilin".equals(meds)){cost=40; finalcost= quantity1*cost; String finalcost1 = Integer.toString(finalcost);medamt.setText("SR "+finalcost1);}
        if ("Brufen".equals(meds)){cost=30; finalcost= quantity1*cost; String finalcost1 = Integer.toString(finalcost);medamt.setText("SR "+finalcost1);}
        if ("Clarinase".equals(meds)){cost=10; finalcost= quantity1*cost; String finalcost1 = Integer.toString(finalcost);medamt.setText("SR "+finalcost1);}
        if ("Dicolonac".equals(meds)){cost=22; finalcost= quantity1*cost; String finalcost1 = Integer.toString(finalcost);medamt.setText("SR "+finalcost1);}
        if ("Fusibact".equals(meds)){cost=28; finalcost= quantity1*cost; String finalcost1 = Integer.toString(finalcost);medamt.setText("SR "+finalcost1);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String testtype = labtype.getSelectedItem().toString();
        if ("Covid Test".equals(testtype)){
            labamt.setText("SR 30");}
        if ("Pregnancy Test".equals(testtype)){
            labamt.setText("SR 50");}
        if ("Drug Test".equals(testtype)){
            labamt.setText("SR 100");}        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        patidlab.setText ("");
        patlabtest.setText ("");
        patlabage.setText("");
        patnamelab.setText("");
        patresultlab.setText("");
        patidsearch.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void lab_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_tableMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)lab_table.getModel ();
        int SelectedRows = lab_table.getSelectedRow ();
        patidlab.setText (RecordTable.getValueAt (SelectedRows, 0).toString ());
        patlabtest.setText (RecordTable.getValueAt (SelectedRows, 4).toString ());
        patlabage.setText(RecordTable.getValueAt (SelectedRows, 2).toString ());
        patnamelab.setText(RecordTable.getValueAt (SelectedRows, 1).toString ());
        patresultlab.setText(RecordTable.getValueAt (SelectedRows, 6).toString ());
    }//GEN-LAST:event_lab_tableMouseClicked

    private void LAB_RetestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LAB_RetestActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)lab_table.getModel ();
        int SelectedRows = lab_table.getSelectedRow ();

        String pID= patidlab.getText();
        String dt = RecordTable.getValueAt (SelectedRows, 7).toString ();
        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement ("update labrequest set Status=?, Result=? where PatientID='" + pID +"' And DateAndTime= '" + dt +"' ");

            pst.setString (1,"Pending Test");
            pst.setString (2,"Awaiting" );
            pst.executeUpdate();
            upDatelabDB();
            JOptionPane.showMessageDialog(this,"Request Sent Successfully");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_LAB_RetestActionPerformed

    private void patidsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patidsearchActionPerformed

    }//GEN-LAST:event_patidsearchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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
        catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void refreshlabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshlabActionPerformed
         try
            {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn= DriverManager.getConnection (dataConn,username, password);
            pst = sqlConn.prepareStatement ("select* from labrequest where Status = 'Completed'");

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
    }//GEN-LAST:event_refreshlabActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String stats3= "Pending";
        
        try
        {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from appointments where Status = '" + stats3 +"' ");
        
        rs = pst.executeQuery ();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount ();
        DefaultTableModel RecordTable = (DefaultTableModel) Specific_appointment.getModel();
        RecordTable.setRowCount (0);
        
        while (rs.next ())
        {
            Vector columnData = new Vector();
             for (i = 1;i <= q; i++)
             {
                   
                    columnData.add (rs.getString ("PatientID"));
                    columnData.add (rs.getString ("Name"));
                    columnData.add (rs.getString ("Age"));
                    columnData.add (rs.getString ("Date"));
                    columnData.add (rs.getString ("Time"));
                    columnData.add (rs.getString ("DoctorName"));
                    columnData.add (rs.getString ("DateAndTime"));
                    
             }
             RecordTable.addRow(columnData);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DoctorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Appointment_Viewer;
    private javax.swing.JButton LAB_Retest;
    private javax.swing.JButton Search;
    private javax.swing.JTable Specific_appointment;
    public static javax.swing.JDialog Test_result;
    private javax.swing.JTextField age;
    private javax.swing.JTextField docname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable lab_table;
    private javax.swing.JTextField labamt;
    private javax.swing.JComboBox<String> labtype;
    private javax.swing.JTextField medamt;
    private javax.swing.JComboBox<String> medicinetype;
    private javax.swing.JTextField name;
    private javax.swing.JTextField patID;
    private javax.swing.JTextArea patid;
    private javax.swing.JTextField patidlab;
    private javax.swing.JTextField patidsearch;
    private javax.swing.JTextField patlabage;
    private javax.swing.JTextField patlabtest;
    private javax.swing.JTextField patnamelab;
    private javax.swing.JTextField patresultlab;
    private javax.swing.JComboBox<String> quantitytype;
    private javax.swing.JButton refreshlab;
    private javax.swing.JTextField stats;
    private javax.swing.JButton submitlab;
    // End of variables declaration//GEN-END:variables
}
