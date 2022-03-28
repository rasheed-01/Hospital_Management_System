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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author rashi
 */
public class AdminInterface2 extends javax.swing.JFrame {
    
    private static final String username = "root" ;
    private static final String password = "Test@123";
    private static final String dataConn ="jdbc:mysql://localhost:3306/hms";
    Connection sqlConn = null;
    PreparedStatement pst =null;
    PreparedStatement pst1 =null;
    ResultSet rs =null;
    int i,q,db;
    String username4;
    

    /**
     * Creates new form AdminInterface2*/
        public AdminInterface2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
        
        public AdminInterface2(String username3) {
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
             
        }
    }
    catch(Exception e){ e.printStackTrace();}
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
    catch(Exception e)
        {
            e.printStackTrace();
        }
    }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserActivityTable = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        User_Activity = new javax.swing.JTable();
        Specific_Appointment_Table = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        Specific_appointment = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        patid = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        patinfoname = new javax.swing.JTextField();
        patinfoID = new javax.swing.JTextField();
        patinfoage = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        phoneno = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        docdept = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        patstatus = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        apptdate1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        docname = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        Specific_Transac_Table = new javax.swing.JDialog();
        jScrollPane6 = new javax.swing.JScrollPane();
        Specific_transac = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        patidtransacsearch = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Search_Transactions = new javax.swing.JButton();
        pattransacID = new javax.swing.JTextField();
        pattransacamt = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        pattransacpurpose = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        pattransacname = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        pattransactimestamp = new javax.swing.JTextField();
        Clear_Transactions = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Refresh_Transactions = new javax.swing.JButton();
        LAB_Payment = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        lab_payment = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        patIDlab = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        testnamepay = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        Refreshlabpayment = new javax.swing.JButton();
        status = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cardname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cardtype = new javax.swing.JComboBox<>();
        cvv = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        patlabsearchid = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        Search1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cardno = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        Registered_patients = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        registered_user_table = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        patinfoname1 = new javax.swing.JTextField();
        patinfoID1 = new javax.swing.JTextField();
        patinfoage1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        phoneno1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        patidentiinfo = new javax.swing.JTextField();
        Update_RegisteredUsers = new javax.swing.JButton();
        Clear_registeredusers = new javax.swing.JButton();
        Refresh_Registered_Users = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        patregisteredid = new javax.swing.JTextArea();
        jLabel45 = new javax.swing.JLabel();
        search_registeredUsers = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        UserActivityTable.setMinimumSize(new java.awt.Dimension(895, 400));
        UserActivityTable.setResizable(false);

        User_Activity.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        User_Activity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "S.No", "Username", "Role", "Date And Time", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        User_Activity.setMaximumSize(new java.awt.Dimension(1002, 420));
        User_Activity.setMinimumSize(new java.awt.Dimension(1002, 420));
        User_Activity.setPreferredSize(new java.awt.Dimension(1002, 420));
        jScrollPane2.setViewportView(User_Activity);
        if (User_Activity.getColumnModel().getColumnCount() > 0) {
            User_Activity.getColumnModel().getColumn(0).setMinWidth(40);
            User_Activity.getColumnModel().getColumn(0).setPreferredWidth(40);
            User_Activity.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        javax.swing.GroupLayout UserActivityTableLayout = new javax.swing.GroupLayout(UserActivityTable.getContentPane());
        UserActivityTable.getContentPane().setLayout(UserActivityTableLayout);
        UserActivityTableLayout.setHorizontalGroup(
            UserActivityTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserActivityTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                .addContainerGap())
        );
        UserActivityTableLayout.setVerticalGroup(
            UserActivityTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserActivityTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Specific_Appointment_Table.setMinimumSize(new java.awt.Dimension(1185, 590));
        Specific_Appointment_Table.setResizable(false);

        Specific_appointment.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "S.No", "Patient ID", "Name", "Age", "Contact No.", "Date", "Dept", "Doc Name", "Date & Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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
            Specific_appointment.getColumnModel().getColumn(0).setMinWidth(40);
            Specific_appointment.getColumnModel().getColumn(0).setPreferredWidth(40);
            Specific_appointment.getColumnModel().getColumn(0).setMaxWidth(40);
            Specific_appointment.getColumnModel().getColumn(3).setMinWidth(50);
            Specific_appointment.getColumnModel().getColumn(3).setPreferredWidth(50);
            Specific_appointment.getColumnModel().getColumn(3).setMaxWidth(50);
            Specific_appointment.getColumnModel().getColumn(8).setMinWidth(150);
            Specific_appointment.getColumnModel().getColumn(8).setPreferredWidth(150);
            Specific_appointment.getColumnModel().getColumn(8).setMaxWidth(150);
        }

        patid.setColumns(20);
        patid.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        patid.setRows(5);
        jScrollPane4.setViewportView(patid);

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Enter Patient ID :");

        Search.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel22.setText("Patient ID");

        jLabel23.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel23.setText("Name");

        jLabel24.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel24.setText("Age");

        patinfoID.setEditable(false);

        jLabel25.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel25.setText("Contact No.");

        jLabel26.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel26.setText("Doctor Name");

        docdept.setEditable(false);

        jLabel27.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel27.setText("Status");

        patstatus.setEditable(false);

        jLabel28.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Patient Information");

        jButton9.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton9.setText("Update");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel37.setText("Appointment Date");

        jLabel38.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel38.setText("Department");

        jButton3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton17.setText("Refresh");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Specific_Appointment_TableLayout = new javax.swing.GroupLayout(Specific_Appointment_Table.getContentPane());
        Specific_Appointment_Table.getContentPane().setLayout(Specific_Appointment_TableLayout);
        Specific_Appointment_TableLayout.setHorizontalGroup(
            Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Specific_Appointment_TableLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Specific_Appointment_TableLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Specific_Appointment_TableLayout.createSequentialGroup()
                        .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Specific_Appointment_TableLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)))
                            .addComponent(jLabel26)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patinfoID)
                            .addComponent(patinfoname)
                            .addComponent(patinfoage)
                            .addComponent(phoneno)
                            .addComponent(docdept)
                            .addComponent(patstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apptdate1)
                            .addComponent(docname))
                        .addGap(25, 25, 25))
                    .addGroup(Specific_Appointment_TableLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Specific_Appointment_TableLayout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        Specific_Appointment_TableLayout.setVerticalGroup(
            Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Specific_Appointment_TableLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Specific_Appointment_TableLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Specific_Appointment_TableLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25))
                    .addGroup(Specific_Appointment_TableLayout.createSequentialGroup()
                        .addComponent(patinfoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(patinfoname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(patinfoage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apptdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(17, 17, 17)
                .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(docdept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Specific_Appointment_TableLayout.createSequentialGroup()
                        .addComponent(docname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)))
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton17)
                    .addGroup(Specific_Appointment_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton9)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );

        Specific_Transac_Table.setMinimumSize(new java.awt.Dimension(1060, 500));
        Specific_Transac_Table.setResizable(false);

        Specific_transac.setModel(new javax.swing.table.DefaultTableModel(
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
                "S.No.", "Patient ID", "Name", "Card Type", "Card No.", "Amount", "Purpose", "Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Specific_transac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Specific_transacMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(Specific_transac);
        if (Specific_transac.getColumnModel().getColumnCount() > 0) {
            Specific_transac.getColumnModel().getColumn(0).setMinWidth(40);
            Specific_transac.getColumnModel().getColumn(0).setPreferredWidth(40);
            Specific_transac.getColumnModel().getColumn(0).setMaxWidth(40);
            Specific_transac.getColumnModel().getColumn(1).setResizable(false);
            Specific_transac.getColumnModel().getColumn(1).setPreferredWidth(15);
            Specific_transac.getColumnModel().getColumn(2).setPreferredWidth(15);
            Specific_transac.getColumnModel().getColumn(3).setPreferredWidth(15);
            Specific_transac.getColumnModel().getColumn(4).setPreferredWidth(40);
            Specific_transac.getColumnModel().getColumn(5).setMinWidth(60);
            Specific_transac.getColumnModel().getColumn(5).setPreferredWidth(60);
            Specific_transac.getColumnModel().getColumn(5).setMaxWidth(60);
            Specific_transac.getColumnModel().getColumn(6).setMinWidth(90);
            Specific_transac.getColumnModel().getColumn(6).setPreferredWidth(90);
            Specific_transac.getColumnModel().getColumn(6).setMaxWidth(90);
            Specific_transac.getColumnModel().getColumn(7).setPreferredWidth(80);
        }

        patidtransacsearch.setColumns(20);
        patidtransacsearch.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        patidtransacsearch.setRows(5);
        jScrollPane7.setViewportView(patidtransacsearch);

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Enter Patient ID Number :");

        Search_Transactions.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Search_Transactions.setText("Search");
        Search_Transactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_TransactionsActionPerformed(evt);
            }
        });

        pattransacID.setEditable(false);

        pattransacamt.setEditable(false);

        jLabel29.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel29.setText("Purpose");

        pattransacpurpose.setEditable(false);

        jLabel32.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel32.setText("Patient ID");

        jLabel33.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel33.setText("Name");

        jLabel34.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Transaction Information");

        jLabel35.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel35.setText("Amount");

        pattransacname.setEditable(false);

        jLabel46.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel46.setText("Date & Time");

        pattransactimestamp.setEditable(false);

        Clear_Transactions.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Clear_Transactions.setText("Clear");
        Clear_Transactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_TransactionsActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Transactions");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Refresh_Transactions.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Refresh_Transactions.setText("Refresh");
        Refresh_Transactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_TransactionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Specific_Transac_TableLayout = new javax.swing.GroupLayout(Specific_Transac_Table.getContentPane());
        Specific_Transac_Table.getContentPane().setLayout(Specific_Transac_TableLayout);
        Specific_Transac_TableLayout.setHorizontalGroup(
            Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Specific_Transac_TableLayout.createSequentialGroup()
                .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Specific_Transac_TableLayout.createSequentialGroup()
                        .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Specific_Transac_TableLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Search_Transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Specific_Transac_TableLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Specific_Transac_TableLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel34))
                                    .addGroup(Specific_Transac_TableLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Specific_Transac_TableLayout.createSequentialGroup()
                                                .addComponent(Refresh_Transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Clear_Transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(Specific_Transac_TableLayout.createSequentialGroup()
                                                .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel29)
                                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel46))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(pattransactimestamp, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(pattransacID, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(pattransacname, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(pattransacamt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(pattransacpurpose, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Specific_Transac_TableLayout.setVerticalGroup(
            Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Specific_Transac_TableLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search_Transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Specific_Transac_TableLayout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(pattransacID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(pattransacname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(pattransacamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(pattransacpurpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(pattransactimestamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(Specific_Transac_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clear_Transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Refresh_Transactions, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Specific_Transac_TableLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        LAB_Payment.setMinimumSize(new java.awt.Dimension(1413, 650));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LAB Payment Requests");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lab_payment.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lab_payment.setModel(new javax.swing.table.DefaultTableModel(
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
                "Patient ID", "Name", "Age", "Doctor's Name", "Test Name", "Amount", "Status", "Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lab_payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_paymentMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(lab_payment);
        if (lab_payment.getColumnModel().getColumnCount() > 0) {
            lab_payment.getColumnModel().getColumn(2).setMinWidth(40);
            lab_payment.getColumnModel().getColumn(2).setPreferredWidth(40);
            lab_payment.getColumnModel().getColumn(2).setMaxWidth(40);
            lab_payment.getColumnModel().getColumn(7).setMinWidth(190);
            lab_payment.getColumnModel().getColumn(7).setPreferredWidth(190);
            lab_payment.getColumnModel().getColumn(7).setMaxWidth(190);
        }

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel7.setText("Patient ID");

        patIDlab.setEditable(false);
        patIDlab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patIDlabActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel10.setText("Lab Test Name");

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel11.setText("Status");

        testnamepay.setEditable(false);
        testnamepay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testnamepayActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton5.setText("Pay");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Refreshlabpayment.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Refreshlabpayment.setText("Refresh");
        Refreshlabpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshlabpaymentActionPerformed(evt);
            }
        });

        status.setEditable(false);
        status.setText("Paid");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel5.setText("Card type");

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel13.setText("Name");

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel14.setText("CVV");

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel15.setText("Amount");

        cardtype.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cardtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a card type", "Mastercard", "Visa", "American Express" }));
        cardtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardtypeActionPerformed(evt);
            }
        });

        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });

        amount.setEditable(false);

        patlabsearchid.setColumns(20);
        patlabsearchid.setRows(5);
        jScrollPane11.setViewportView(patlabsearchid);

        jLabel21.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel21.setText("Enter Patient ID :");

        Search1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        Search1.setText("Search");
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Patient Information");

        jLabel31.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel31.setText("Card No.");

        cardno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnoActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel36.setText("Expiry Date");

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton16.setText("Clear");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LAB_PaymentLayout = new javax.swing.GroupLayout(LAB_Payment.getContentPane());
        LAB_Payment.getContentPane().setLayout(LAB_PaymentLayout);
        LAB_PaymentLayout.setHorizontalGroup(
            LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LAB_PaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LAB_PaymentLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 337, Short.MAX_VALUE))
                    .addComponent(jScrollPane8))
                .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LAB_PaymentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(LAB_PaymentLayout.createSequentialGroup()
                        .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LAB_PaymentLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LAB_PaymentLayout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel36)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(date))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LAB_PaymentLayout.createSequentialGroup()
                                    .addGap(18, 20, Short.MAX_VALUE)
                                    .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(LAB_PaymentLayout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(75, 75, 75)
                                            .addComponent(status))
                                        .addGroup(LAB_PaymentLayout.createSequentialGroup()
                                            .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel13))
                                            .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(LAB_PaymentLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cardtype, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(LAB_PaymentLayout.createSequentialGroup()
                                                    .addGap(7, 7, 7)
                                                    .addComponent(cardname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(LAB_PaymentLayout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(testnamepay))
                                        .addGroup(LAB_PaymentLayout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(48, 48, 48)
                                            .addComponent(patIDlab))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LAB_PaymentLayout.createSequentialGroup()
                                            .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel31)
                                                .addComponent(jLabel14))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(LAB_PaymentLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(LAB_PaymentLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LAB_PaymentLayout.createSequentialGroup()
                                            .addComponent(Refreshlabpayment)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        LAB_PaymentLayout.setVerticalGroup(
            LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LAB_PaymentLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LAB_PaymentLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane8))
                    .addGroup(LAB_PaymentLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patIDlab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(testnamepay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cardtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(cardname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LAB_PaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Refreshlabpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Registered_patients.setMinimumSize(new java.awt.Dimension(1040, 535));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Registered Users");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        registered_user_table.setModel(new javax.swing.table.DefaultTableModel(
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
                "S.No", "Patient ID", "Name", "Age", "Identification No", "Contact No", "Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        registered_user_table.getTableHeader().setReorderingAllowed(false);
        registered_user_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registered_user_tableMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(registered_user_table);
        if (registered_user_table.getColumnModel().getColumnCount() > 0) {
            registered_user_table.getColumnModel().getColumn(0).setMinWidth(40);
            registered_user_table.getColumnModel().getColumn(0).setPreferredWidth(40);
            registered_user_table.getColumnModel().getColumn(0).setMaxWidth(40);
            registered_user_table.getColumnModel().getColumn(1).setMinWidth(100);
            registered_user_table.getColumnModel().getColumn(1).setPreferredWidth(100);
            registered_user_table.getColumnModel().getColumn(1).setMaxWidth(100);
            registered_user_table.getColumnModel().getColumn(2).setMinWidth(80);
            registered_user_table.getColumnModel().getColumn(2).setPreferredWidth(80);
            registered_user_table.getColumnModel().getColumn(2).setMaxWidth(80);
            registered_user_table.getColumnModel().getColumn(3).setMinWidth(40);
            registered_user_table.getColumnModel().getColumn(3).setPreferredWidth(40);
            registered_user_table.getColumnModel().getColumn(3).setMaxWidth(40);
            registered_user_table.getColumnModel().getColumn(4).setMinWidth(100);
            registered_user_table.getColumnModel().getColumn(4).setPreferredWidth(100);
            registered_user_table.getColumnModel().getColumn(4).setMaxWidth(100);
            registered_user_table.getColumnModel().getColumn(5).setMinWidth(100);
            registered_user_table.getColumnModel().getColumn(5).setPreferredWidth(100);
            registered_user_table.getColumnModel().getColumn(5).setMaxWidth(100);
            registered_user_table.getColumnModel().getColumn(6).setMinWidth(200);
            registered_user_table.getColumnModel().getColumn(6).setPreferredWidth(200);
            registered_user_table.getColumnModel().getColumn(6).setMaxWidth(200);
        }

        jLabel39.setFont(new java.awt.Font("Rockwell", 1, 28)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Patient Information");

        jLabel40.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel40.setText("Age");

        patinfoID1.setEditable(false);

        jLabel41.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel41.setText("Contact No.");

        jLabel42.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel42.setText("Patient ID");

        jLabel43.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel43.setText("Name");

        jLabel44.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel44.setText("Identification No.");

        Update_RegisteredUsers.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Update_RegisteredUsers.setText("Update");
        Update_RegisteredUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_RegisteredUsersActionPerformed(evt);
            }
        });

        Clear_registeredusers.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Clear_registeredusers.setText("Clear");
        Clear_registeredusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_registeredusersActionPerformed(evt);
            }
        });

        Refresh_Registered_Users.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Refresh_Registered_Users.setText("Refresh");
        Refresh_Registered_Users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_Registered_UsersActionPerformed(evt);
            }
        });

        patregisteredid.setColumns(20);
        patregisteredid.setRows(5);
        jScrollPane12.setViewportView(patregisteredid);

        jLabel45.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel45.setText("Enter Patient ID :");

        search_registeredUsers.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        search_registeredUsers.setText("Search");
        search_registeredUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_registeredUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Registered_patientsLayout = new javax.swing.GroupLayout(Registered_patients.getContentPane());
        Registered_patients.getContentPane().setLayout(Registered_patientsLayout);
        Registered_patientsLayout.setHorizontalGroup(
            Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Registered_patientsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registered_patientsLayout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(search_registeredUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(Registered_patientsLayout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registered_patientsLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Registered_patientsLayout.createSequentialGroup()
                                        .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18))
                                    .addGroup(Registered_patientsLayout.createSequentialGroup()
                                        .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Registered_patientsLayout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel42)))
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel44))
                                        .addGap(18, 18, 18)
                                        .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(patidentiinfo)
                                            .addComponent(patinfoname1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(patinfoage1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(phoneno1)
                                            .addComponent(patinfoID1))
                                        .addGap(36, 36, 36))))
                            .addGroup(Registered_patientsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(Refresh_Registered_Users)
                                .addGap(31, 31, 31)
                                .addComponent(Clear_registeredusers)
                                .addGap(34, 34, 34)
                                .addComponent(Update_RegisteredUsers)
                                .addGap(30, 30, 30))))))
        );
        Registered_patientsLayout.setVerticalGroup(
            Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registered_patientsLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(search_registeredUsers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Registered_patientsLayout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registered_patientsLayout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel43)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel40)
                                .addGap(18, 18, 18)
                                .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41)
                                    .addComponent(phoneno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Registered_patientsLayout.createSequentialGroup()
                                .addComponent(patinfoID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(patinfoname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(patinfoage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(patidentiinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(Registered_patientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Update_RegisteredUsers)
                            .addComponent(Clear_registeredusers)
                            .addComponent(Refresh_Registered_Users))))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Admin Menu");
        setMinimumSize(new java.awt.Dimension(561, 357));
        setSize(new java.awt.Dimension(0, 0));

        jButton1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton1.setText("Payment For Lab Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton2.setText("Appointments");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setText("Choose One of the Following Options");

        jButton4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton4.setText("Transactions");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton7.setText("Update Registered Users");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Admin Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jButton8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton8.setText("Book An Appointment");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton10.setText("View Login Activtiy");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(45, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       LAB_Payment.setModal(false);
       String stats3="UnPaid";
       
       try
        {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from labrequest where Status='" + stats3 +"'");
        
        rs = pst.executeQuery ();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount ();
        DefaultTableModel RecordTable = (DefaultTableModel) lab_payment.getModel();
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
                    columnData.add (rs.getString ("Amount"));
                    columnData.add (rs.getString ("Status"));
                    columnData.add (rs.getString ("DateandTime"));
             }
             RecordTable.addRow(columnData);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
       LAB_Payment.setModal(false);
       LAB_Payment.setLocationRelativeTo(null);
       LAB_Payment.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Specific_Appointment_Table.setModal(false); 
        
        try
        {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from appointments");
        
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
                    columnData.add (rs.getString ("SNo"));
                    columnData.add (rs.getString ("PatientID"));
                    columnData.add (rs.getString ("Name"));
                    columnData.add (rs.getString ("Age"));
                    columnData.add (rs.getString ("PhoneNo"));
                    columnData.add (rs.getString ("Date"));
                    columnData.add (rs.getString ("Dept"));
                    columnData.add (rs.getString ("DoctorName"));
                    columnData.add (rs.getString ("DateandTime"));
                    columnData.add (rs.getString ("Status"));
             }
             RecordTable.addRow(columnData);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        Specific_Appointment_Table.setModal(false);
        Specific_Appointment_Table.setLocationRelativeTo(null);
        Specific_Appointment_Table.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Specific_Transac_Table.setModal(false); 
        
        try
        {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from transactions");
        
        rs = pst.executeQuery ();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount ();
        DefaultTableModel RecordTable = (DefaultTableModel) Specific_transac.getModel();
        RecordTable.setRowCount (0);
        
        while (rs.next ())
        {
            Vector columnData = new Vector();
             for (i = 1;i <= q; i++)
             {
                    columnData.add (rs.getString ("SNo"));
                    columnData.add (rs.getString ("PatientID"));
                    columnData.add (rs.getString ("Name"));
                    columnData.add (rs.getString ("CardType"));
                    columnData.add (rs.getString ("CardNo"));
                    columnData.add (rs.getString ("Amount"));
                    columnData.add (rs.getString ("Purpose"));
                    columnData.add (rs.getString ("DateandTime"));
             }
             RecordTable.addRow(columnData);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        Specific_Transac_Table.setModal(false);
        Specific_Transac_Table.setLocationRelativeTo(null);
        Specific_Transac_Table.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            pst.setString (2,"Admin");
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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Registered_patients.setModal(false);
       
       try
        {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from registeredpatients");
        
        rs = pst.executeQuery ();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount ();
        DefaultTableModel RecordTable = (DefaultTableModel) registered_user_table.getModel();
        RecordTable.setRowCount (0);
        
        while (rs.next ())
        {
            Vector columnData = new Vector();
             for (i = 1;i <= q; i++)
             {
                    columnData.add (rs.getString ("SNo"));
                    columnData.add (rs.getString ("PatientID"));
                    columnData.add (rs.getString ("Name"));
                    columnData.add (rs.getString ("Age"));
                    columnData.add (rs.getString ("IdentificationNo"));
                    columnData.add (rs.getString ("PhoneNo"));
                    columnData.add (rs.getString ("DateandTime"));
             }
             RecordTable.addRow(columnData);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
       Registered_patients.setModal(false);
       Registered_patients.setLocationRelativeTo(null);
       Registered_patients.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
       int found = 0;
        try
        {
            DefaultTableModel model7 = (DefaultTableModel) Specific_appointment.getModel();  
            model7.setRowCount(0);
            if( patid.getText().equals(""))
            {
                found = 2;
                JOptionPane.showMessageDialog(rootPane, "Please Enter A Patient ID");
            }
            else
            {                       
                String patno= patid.getText();
                found=1;
                
                
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
                            columnData.add (rs.getString ("SNo"));
                            columnData.add (rs.getString ("PatientID"));
                            columnData.add (rs.getString ("Name"));
                            columnData.add (rs.getString ("Age"));
                            columnData.add (rs.getString ("PhoneNo"));
                            columnData.add (rs.getString ("Date"));
                            columnData.add (rs.getString ("Dept"));
                            columnData.add (rs.getString ("DoctorName"));
                            columnData.add (rs.getString ("DateandTime"));
                            columnData.add (rs.getString ("Status"));
                     }
                     RecordTable.addRow(columnData);
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

    private void Search_TransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_TransactionsActionPerformed
        int found = 0;
        try
        {
            DefaultTableModel model7 = (DefaultTableModel) Specific_appointment.getModel();  
            model7.setRowCount(0);
            if( patidtransacsearch.getText().equals(""))
            {
                found = 2;
                JOptionPane.showMessageDialog(rootPane, "Please Enter A Patient ID");
            }
            else
            {                       
                String patno= patidtransacsearch.getText();
                found=1;
                try
                {
                Class.forName ("com.mysql.cj.jdbc.Driver");
                sqlConn= DriverManager.getConnection (dataConn,username, password);
                pst = sqlConn.prepareStatement ("select* from transactions where PatientID='" + patno +"'");

                rs = pst.executeQuery ();
                ResultSetMetaData stData = rs.getMetaData();
                q = stData.getColumnCount ();
                DefaultTableModel RecordTable = (DefaultTableModel) Specific_transac.getModel();
                RecordTable.setRowCount (0);

                while (rs.next ())
                {
                    Vector columnData = new Vector();
                     for (i = 1;i <= q; i++)
                     {
                           columnData.add (rs.getString ("SNo"));
                    columnData.add (rs.getString ("PatientID"));
                    columnData.add (rs.getString ("Name"));
                    columnData.add (rs.getString ("CardType"));
                    columnData.add (rs.getString ("CardNo"));
                    columnData.add (rs.getString ("Amount"));
                    columnData.add (rs.getString ("Purpose"));
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
    }//GEN-LAST:event_Search_TransactionsActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       new AppointmentMain().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         UserActivityTable.setModal(false); 
        
        try
        {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from useractivity");
        
        rs = pst.executeQuery ();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount ();
        DefaultTableModel RecordTable = (DefaultTableModel) User_Activity.getModel();
        RecordTable.setRowCount (0);
        
        while (rs.next ())
        {
            Vector columnData = new Vector();
             for (i = 1;i <= q; i++)
             {
                    columnData.add (rs.getString ("SNo"));
                    columnData.add (rs.getString ("Username"));
                    columnData.add (rs.getString ("Role"));
                    columnData.add (rs.getString ("DateAndTime"));
                    columnData.add (rs.getString ("Action"));
             }
             RecordTable.addRow(columnData);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        UserActivityTable.setModal(false);
        UserActivityTable.setLocationRelativeTo(null);
        UserActivityTable.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void cardtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardtypeActionPerformed
       
    }//GEN-LAST:event_cardtypeActionPerformed

    private void RefreshlabpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshlabpaymentActionPerformed
        String stats3= "Unpaid";
        try
        {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from labrequest where Status= '" + stats3 +"'");
        
        rs = pst.executeQuery ();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount ();
        DefaultTableModel RecordTable = (DefaultTableModel) lab_payment.getModel();
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
                    columnData.add (rs.getString ("Amount"));
                    columnData.add (rs.getString ("Status"));
                    columnData.add (rs.getString ("DateandTime"));
             }
             RecordTable.addRow(columnData);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_RefreshlabpaymentActionPerformed

    private void lab_paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_paymentMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)lab_payment.getModel ();
        int SelectedRows = lab_payment.getSelectedRow ();
        patIDlab. setText (RecordTable.getValueAt (SelectedRows, 0).toString ());
        testnamepay.setText (RecordTable.getValueAt (SelectedRows, 4).toString ());
        status.setText("Paid");
        amount.setText(RecordTable.getValueAt (SelectedRows, 5).toString ());
         
    }//GEN-LAST:event_lab_paymentMouseClicked

    private void patIDlabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patIDlabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patIDlabActionPerformed

    private void testnamepayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testnamepayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testnamepayActionPerformed

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvActionPerformed

    private void registered_user_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registered_user_tableMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)registered_user_table.getModel ();
        int SelectedRows = registered_user_table.getSelectedRow ();
        patinfoID1. setText (RecordTable.getValueAt (SelectedRows, 1).toString ());
        patinfoname1. setText (RecordTable.getValueAt (SelectedRows, 2).toString ());
        patinfoage1. setText (RecordTable.getValueAt (SelectedRows, 3).toString ());
        phoneno1. setText (RecordTable.getValueAt (SelectedRows, 5).toString ());
        patidentiinfo. setText (RecordTable.getValueAt (SelectedRows, 4).toString ());
       
    }//GEN-LAST:event_registered_user_tableMouseClicked

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
        int found = 0;
        try
        {
            DefaultTableModel model7 = (DefaultTableModel) lab_payment.getModel();  
            model7.setRowCount(0);
            if( patlabsearchid.getText().equals(""))
            {
                found = 2;
                JOptionPane.showMessageDialog(rootPane, "Please Enter A Patient ID");
            }
            else
            {                       
                String patno= patlabsearchid.getText();
                found=1;
                Class.forName ("com.mysql.cj.jdbc.Driver");
                sqlConn= DriverManager.getConnection (dataConn,username, password);
                pst = sqlConn.prepareStatement ("select* from labrequest where Status='UnPaid'");

                rs = pst.executeQuery ();
                ResultSetMetaData stData = rs.getMetaData();
                q = stData.getColumnCount ();
                DefaultTableModel RecordTable = (DefaultTableModel) lab_payment.getModel();
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
                            columnData.add (rs.getString ("Amount"));
                            columnData.add (rs.getString ("Status"));
                            columnData.add (rs.getString ("DateandTime"));
                     }
                     RecordTable.addRow(columnData);
                }
                }
        }
        catch(Exception e){ e.printStackTrace();}
    }//GEN-LAST:event_Search1ActionPerformed

    private void cardnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String patname = cardname.getText();
        String pID= patIDlab.getText();
        String patpay = amount.getText();
        String paytype = cardtype.getSelectedItem().toString();
        String payno = cardno.getText();
        String paydate = date.getText();
        String paycvv = cvv.getText(); 
        DefaultTableModel RecordTable = (DefaultTableModel) lab_payment.getModel();
        int SelectedRows= lab_payment.getSelectedRow();
        String dt=RecordTable.getValueAt(SelectedRows, 7).toString(); 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        String dateTime = now.format(formatter);
        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement ("update labrequest set Status=? where PatientID='" + pID +"' And DateAndTime= '" + dt +"' ");
        
            pst.setString (1,"Pending Test");
            pst.executeUpdate();  
            upDatelabDB();
            pst1 = sqlConn.prepareStatement ("INSERT INTO transactions(PatientID,Name,CardType,CardNo,Amount,Purpose,DateandTime) value(?,?,?,?,?,?,?)");
        
                
            pst1.setString (1, pID);
            pst1.setString (2, patname);
            pst1.setString (3, paytype);
            pst1.setString (4, payno);
            pst1.setString (5, patpay);
            pst1.setString (6, "Lab Test");
            pst1.setString (7, dateTime);
            
            pst1.executeUpdate();    
            JOptionPane.showMessageDialog(this,"Payment Successful");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void Specific_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Specific_appointmentMouseClicked
         DefaultTableModel RecordTable = (DefaultTableModel) Specific_appointment.getModel();
         int SelectedRows= Specific_appointment.getSelectedRow();
        
         patinfoID.setText(RecordTable.getValueAt(SelectedRows, 1).toString());   
         patinfoname.setText(RecordTable.getValueAt(SelectedRows, 2).toString()); 
         patinfoage.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
         phoneno.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
         apptdate1.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
         docdept.setText(RecordTable.getValueAt(SelectedRows, 6).toString());  
         docname.setText(RecordTable.getValueAt(SelectedRows, 7).toString());  
         patstatus.setText(RecordTable.getValueAt(SelectedRows, 9).toString()); 
    }//GEN-LAST:event_Specific_appointmentMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel) Specific_appointment.getModel();
        int SelectedRows= Specific_appointment.getSelectedRow();
        String dt = RecordTable.getValueAt(SelectedRows, 8).toString();
        String patname = patinfoname.getText();
        String pID= patinfoID.getText();
        String patage= patinfoage.getText();
        String DocN=docname.getText();
        String patdate= apptdate1.getText();
        String patpno = phoneno.getText();
         
        
        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement ("update appointments set Name=? , Age=?,PhoneNo=?, Date=?, DoctorName=? where PatientID='" + pID +"' And DateAndTime= '" + dt +"' ");
        
            pst.setString (1, patname);
            pst.setString (2,patage);
            pst.setString (3, patpno);
            pst.setString (4, patdate);
            pst.setString (5,DocN);
            pst.executeUpdate();  
            upDateDB();
            JOptionPane.showMessageDialog(this,"Update Successful");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel) Specific_appointment.getModel();
         int SelectedRows= Specific_appointment.getSelectedRow();
        
         patinfoID.setText("");   
         patinfoname.setText(""); 
         patinfoage.setText("");
         phoneno.setText("");
         apptdate1.setText("");
         docdept.setText("");  
         docname.setText("");  
         patstatus.setText(""); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try
        {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from appointments");
        
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
                    columnData.add (rs.getString ("SNo"));
                    columnData.add (rs.getString ("PatientID"));
                    columnData.add (rs.getString ("Name"));
                    columnData.add (rs.getString ("Age"));
                    columnData.add (rs.getString ("PhoneNo"));
                    columnData.add (rs.getString ("Date"));
                    columnData.add (rs.getString ("Dept"));
                    columnData.add (rs.getString ("DoctorName"));
                    columnData.add (rs.getString ("DateandTime"));
                    columnData.add (rs.getString ("Status"));
             }
             RecordTable.addRow(columnData);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }       
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
         patIDlab.setText("");   
         testnamepay.setText("");   
         cardname.setText("");
         cardno.setText("");
         date.setText("");
         cvv.setText("");
         amount.setText("");
         patlabsearchid.setText("");
         
    }//GEN-LAST:event_jButton16ActionPerformed

    private void search_registeredUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_registeredUsersActionPerformed
        int found = 0;
        try
        {
            DefaultTableModel model7 = (DefaultTableModel) registered_user_table.getModel();  
            model7.setRowCount(0);
            if( patregisteredid.getText().equals(""))
            {
                found = 2;
                JOptionPane.showMessageDialog(rootPane, "Please Enter A Patient ID");
            }
            else
            {                       
                String patno= patregisteredid.getText();
                found=1;
                
                
                Class.forName ("com.mysql.cj.jdbc.Driver");
                sqlConn= DriverManager.getConnection (dataConn,username, password);
                pst = sqlConn.prepareStatement ("select* from registeredpatients where PatientID='" + patno +"'");

                rs = pst.executeQuery ();
                ResultSetMetaData stData = rs.getMetaData();
                q = stData.getColumnCount ();
                DefaultTableModel RecordTable = (DefaultTableModel) registered_user_table.getModel();
                RecordTable.setRowCount (0);

                while (rs.next ())
                {
                    Vector columnData = new Vector();
                     for (i = 1;i <= q; i++)
                     {
                            columnData.add (rs.getString ("SNo"));
                            columnData.add (rs.getString ("PatientID"));
                            columnData.add (rs.getString ("Name"));
                            columnData.add (rs.getString ("Age"));
                            columnData.add (rs.getString ("IdentificationNo"));
                            columnData.add (rs.getString ("PhoneNo"));
                            columnData.add (rs.getString ("DateandTime"));
                     }
                     RecordTable.addRow(columnData);
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
    }//GEN-LAST:event_search_registeredUsersActionPerformed

    private void Clear_registeredusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_registeredusersActionPerformed
        patinfoID1. setText ("");
        patinfoname1. setText ("");
        patinfoage1. setText ("");
        phoneno1. setText ("");
        patidentiinfo. setText ("");
    }//GEN-LAST:event_Clear_registeredusersActionPerformed

    private void Update_RegisteredUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_RegisteredUsersActionPerformed
        String pID=  patinfoID1. getText ();
        String Name = patinfoname1. getText();
        String Age = patinfoage1. getText ();
        String Contact = phoneno1. getText ();
        String Identification = patidentiinfo. getText(); 
        DefaultTableModel RecordTable = (DefaultTableModel) registered_user_table.getModel();
        int SelectedRows= registered_user_table.getSelectedRow();
        String dt = RecordTable.getValueAt(SelectedRows, 6).toString();
         
        
        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst1 = sqlConn.prepareStatement ("update registeredpatients set Name=?, Age=?, PhoneNo=?,IdentificationNo=? where PatientID='" + pID +"' And DateAndTime= '" + dt +"' ");
        
            pst1.setString (1,Name);
            pst1.setString (2, Age);
            pst1.setString (3, Contact);
            pst1.setString (4, Identification);
            pst1.executeUpdate();  
            
    
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn= DriverManager.getConnection (dataConn,username, password);
            pst = sqlConn.prepareStatement ("select* from registeredpatients");

            rs = pst.executeQuery ();
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount ();


            while (rs.next ())
            {
                Vector columnData = new Vector();
                 for (i = 1;i <= q; i++)
                 {
                        columnData.add (rs.getString ("SNo"));
                        columnData.add (rs.getString ("PatientID"));
                        columnData.add (rs.getString ("Name"));
                        columnData.add (rs.getString ("Age"));
                        columnData.add (rs.getString ("IdentificationNo"));
                        columnData.add (rs.getString ("PhoneNo"));
                        columnData.add (rs.getString ("DateandTime"));
                 }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Update_RegisteredUsersActionPerformed

    private void Clear_TransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_TransactionsActionPerformed
         pattransacID.setText("");   
         pattransacname.setText(""); 
         pattransacpurpose.setText("");
         pattransacamt.setText("");
         pattransactimestamp.setText("");
        patidtransacsearch.setText("");
    }//GEN-LAST:event_Clear_TransactionsActionPerformed

    private void Specific_transacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Specific_transacMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) Specific_transac.getModel();
         int SelectedRows= Specific_transac.getSelectedRow();
        
         pattransacID.setText(RecordTable.getValueAt(SelectedRows, 1).toString());   
         pattransacname.setText(RecordTable.getValueAt(SelectedRows, 2).toString()); 
         pattransacpurpose.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
         pattransacamt.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
         pattransactimestamp.setText(RecordTable.getValueAt(SelectedRows, 7).toString());
        
    }//GEN-LAST:event_Specific_transacMouseClicked

    private void Refresh_TransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_TransactionsActionPerformed
        try
        {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from transactions");
        
        rs = pst.executeQuery ();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount ();
        DefaultTableModel RecordTable = (DefaultTableModel) Specific_transac.getModel();
        RecordTable.setRowCount (0);
        
        while (rs.next ())
        {
            Vector columnData = new Vector();
             for (i = 1;i <= q; i++)
             {
                    columnData.add (rs.getString ("SNo"));
                    columnData.add (rs.getString ("PatientID"));
                    columnData.add (rs.getString ("Name"));
                    columnData.add (rs.getString ("CardType"));
                    columnData.add (rs.getString ("CardNo"));
                    columnData.add (rs.getString ("Amount"));
                    columnData.add (rs.getString ("Purpose"));
                    columnData.add (rs.getString ("DateandTime"));
             }
             RecordTable.addRow(columnData);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Refresh_TransactionsActionPerformed

    private void Refresh_Registered_UsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_Registered_UsersActionPerformed
           try
        {
        Class.forName ("com.mysql.cj.jdbc.Driver");
        sqlConn= DriverManager.getConnection (dataConn,username, password);
        pst = sqlConn.prepareStatement ("select* from registeredpatients");
        
        rs = pst.executeQuery ();
        ResultSetMetaData stData = rs.getMetaData();
        q = stData.getColumnCount ();
        DefaultTableModel RecordTable = (DefaultTableModel) registered_user_table.getModel();
        RecordTable.setRowCount (0);
        
        while (rs.next ())
        {
            Vector columnData = new Vector();
             for (i = 1;i <= q; i++)
             {
                    columnData.add (rs.getString ("SNo"));
                    columnData.add (rs.getString ("PatientID"));
                    columnData.add (rs.getString ("Name"));
                    columnData.add (rs.getString ("Age"));
                    columnData.add (rs.getString ("IdentificationNo"));
                    columnData.add (rs.getString ("PhoneNo"));
                    columnData.add (rs.getString ("DateandTime"));
             }
             RecordTable.addRow(columnData);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_Refresh_Registered_UsersActionPerformed

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
            java.util.logging.Logger.getLogger(AdminInterface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInterface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInterface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInterface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInterface2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear_Transactions;
    private javax.swing.JButton Clear_registeredusers;
    private javax.swing.JDialog LAB_Payment;
    private javax.swing.JButton Refresh_Registered_Users;
    private javax.swing.JButton Refresh_Transactions;
    private javax.swing.JButton Refreshlabpayment;
    private javax.swing.JDialog Registered_patients;
    private javax.swing.JButton Search;
    private javax.swing.JButton Search1;
    private javax.swing.JButton Search_Transactions;
    private javax.swing.JDialog Specific_Appointment_Table;
    private javax.swing.JDialog Specific_Transac_Table;
    private javax.swing.JTable Specific_appointment;
    private javax.swing.JTable Specific_transac;
    private javax.swing.JButton Update_RegisteredUsers;
    private javax.swing.JDialog UserActivityTable;
    private javax.swing.JTable User_Activity;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField apptdate1;
    private javax.swing.JTextField cardname;
    private javax.swing.JTextField cardno;
    private javax.swing.JComboBox<String> cardtype;
    private javax.swing.JTextField cvv;
    private javax.swing.JTextField date;
    private javax.swing.JTextField docdept;
    private javax.swing.JTextField docname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable lab_payment;
    private javax.swing.JTextField patIDlab;
    private javax.swing.JTextArea patid;
    private javax.swing.JTextField patidentiinfo;
    private javax.swing.JTextArea patidtransacsearch;
    private javax.swing.JTextField patinfoID;
    private javax.swing.JTextField patinfoID1;
    private javax.swing.JTextField patinfoage;
    private javax.swing.JTextField patinfoage1;
    private javax.swing.JTextField patinfoname;
    private javax.swing.JTextField patinfoname1;
    private javax.swing.JTextArea patlabsearchid;
    private javax.swing.JTextArea patregisteredid;
    private javax.swing.JTextField patstatus;
    private javax.swing.JTextField pattransacID;
    private javax.swing.JTextField pattransacamt;
    private javax.swing.JTextField pattransacname;
    private javax.swing.JTextField pattransacpurpose;
    private javax.swing.JTextField pattransactimestamp;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField phoneno1;
    private javax.swing.JTable registered_user_table;
    private javax.swing.JButton search_registeredUsers;
    private javax.swing.JTextField status;
    private javax.swing.JTextField testnamepay;
    // End of variables declaration//GEN-END:variables

   // private void fileshare() {
        
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
}
