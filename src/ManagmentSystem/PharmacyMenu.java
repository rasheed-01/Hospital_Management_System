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
import javax.swing.table.DefaultTableModel;
             
public class PharmacyMenu extends javax.swing.JFrame {

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



    public PharmacyMenu(String username3) {
        initComponents();
        this.setLocationRelativeTo(null);
        username4 = username3;
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
        Pharmacy_requests = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pharmacy_table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        pID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        patinfoname = new javax.swing.JTextField();
        patinfoage = new javax.swing.JTextField();
        patmeds = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        cardno = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cardname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cardtype = new javax.swing.JComboBox<>();
        cvv = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        patidsearch = new javax.swing.JTextArea();
        Search1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        stats = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        logoutpharmacy = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setText("Choose One of the Following Options");

        Pharmacy_requests.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Pharmacy_requests.setMinimumSize(new java.awt.Dimension(1316, 725));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pharmacy Medicine Requests");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pharmacy_table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pharmacy_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Age", "Doctor's Name", "Medicine", "Quantity", "Amount", "Status", "Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pharmacy_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pharmacy_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pharmacy_table);
        if (pharmacy_table.getColumnModel().getColumnCount() > 0) {
            pharmacy_table.getColumnModel().getColumn(8).setMinWidth(170);
            pharmacy_table.getColumnModel().getColumn(8).setPreferredWidth(170);
            pharmacy_table.getColumnModel().getColumn(8).setMaxWidth(170);
        }

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel7.setText("Patient ID");

        pID.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel8.setText("Name");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel9.setText("Age");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel10.setText("Medicine");

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel11.setText("Status");

        patinfoage.setEditable(false);

        patmeds.setEditable(false);

        jButton4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton4.setText("PAY");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton3.setText("Refersh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel12.setText("Card type");

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

        jButton7.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Patient Information");

        patidsearch.setColumns(20);
        patidsearch.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        patidsearch.setRows(5);
        jScrollPane11.setViewportView(patidsearch);

        Search1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        Search1.setText("Search");
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel21.setText("Enter Patient ID :");

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel16.setText("Quantity");

        stats.setEditable(false);

        javax.swing.GroupLayout Pharmacy_requestsLayout = new javax.swing.GroupLayout(Pharmacy_requests.getContentPane());
        Pharmacy_requests.getContentPane().setLayout(Pharmacy_requestsLayout);
        Pharmacy_requestsLayout.setHorizontalGroup(
            Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pharmacy_requestsLayout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(22, 22, 22)))
                .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pharmacy_requestsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                                    .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addGap(44, 44, 44)
                                    .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(patinfoname, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(patinfoage, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pharmacy_requestsLayout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel36)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(date))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pharmacy_requestsLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                                                    .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel13))
                                                    .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(cardtype, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                                                            .addGap(7, 7, 7)
                                                            .addComponent(cardname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pharmacy_requestsLayout.createSequentialGroup()
                                                    .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel31)
                                                        .addComponent(jLabel14))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel11)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel16))))
                                    .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(50, 50, 50)
                                    .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(patmeds, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addContainerGap())))
        );
        Pharmacy_requestsLayout.setVerticalGroup(
            Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Search1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(pID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(patinfoname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(patinfoage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(patmeds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(15, 15, 15)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cardtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(cardname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Pharmacy_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(Pharmacy_requestsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(635, 218));

        jButton5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton5.setText("View Pending Requests");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        logoutpharmacy.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        logoutpharmacy.setText("LogOut");
        logoutpharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutpharmacyActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Pharmacy Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addContainerGap(408, Short.MAX_VALUE))
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
                .addComponent(jButton5)
                .addGap(37, 37, 37)
                .addComponent(logoutpharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(logoutpharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        Pharmacy_requests.setModal(false);
                
                try
                {
                Class.forName ("com.mysql.cj.jdbc.Driver");
                sqlConn= DriverManager.getConnection (dataConn,username, password);
                pst = sqlConn.prepareStatement ("select* from pharmacyrequest where Status ='Pending'");

                rs = pst.executeQuery ();
                ResultSetMetaData stData = rs.getMetaData();
                q = stData.getColumnCount ();
                DefaultTableModel RecordTable = (DefaultTableModel) pharmacy_table.getModel();
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
                            columnData.add (rs.getString ("Medicine"));
                            columnData.add (rs.getString ("Quantity"));
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
                
                
                Pharmacy_requests.setModal(false);
                Pharmacy_requests.setLocationRelativeTo(null);
                Pharmacy_requests.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void logoutpharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutpharmacyActionPerformed
         try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement ("INSERT INTO useractivity(Username,Role,DateandTime,Action) value(?,?,?,?)");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
            LocalDateTime now = LocalDateTime.now();
            String dateTime = now.format(formatter);
                
            pst.setString (1,username4);
            pst.setString (2,"Pharmacy");
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
    }//GEN-LAST:event_logoutpharmacyActionPerformed

    private void pharmacy_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacy_tableMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) pharmacy_table.getModel();
        int SelectedRows= pharmacy_table.getSelectedRow();

        pID.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        patinfoname.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        patinfoage.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        patmeds.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        quantity.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        amount.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
        stats.setText("Completed");

    }//GEN-LAST:event_pharmacy_tableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel) pharmacy_table.getModel();
        int SelectedRows= pharmacy_table.getSelectedRow();

        String dt =RecordTable.getValueAt(SelectedRows, 8).toString();

        String patname = cardname.getText();
        String paID= pID.getText();
        String patpay = amount.getText();
        String paytype = cardtype.getSelectedItem().toString();
        String payno = cardno.getText();
        String stats1= stats.getText();
        String Quantity=quantity.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        String dateTime = now.format(formatter);
        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);

            pst = sqlConn.prepareStatement ("update pharmacyrequest set Quantity=?,Amount=?,Status=? where PatientID='" + paID +"' And DateAndTime= '" + dt +"' ");

            pst.setString (1,Quantity );
            pst.setString (2,amount.getText());
            pst.setString (3,stats1 );
            pst.executeUpdate();
            upDateDB();

            pst1 = sqlConn.prepareStatement ("INSERT INTO transactions(PatientID,Name,CardType,CardNo,Amount,Purpose,DateandTime) value(?,?,?,?,?,?,?)");

            pst1.setString (1, paID);
            pst1.setString (2, patname);
            pst1.setString (3, paytype);
            pst1.setString (4, payno);
            pst1.setString (5, patpay);
            pst1.setString (6, "Pharmacy");
            pst1.setString (7, dateTime);

            pst1.executeUpdate();
            JOptionPane.showMessageDialog(this,"Payment Successful");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            sqlConn= DriverManager.getConnection (dataConn,username, password);
            pst = sqlConn.prepareStatement ("select* from pharmacyrequest where Status = 'Pending'");

            rs = pst.executeQuery ();
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount ();
            DefaultTableModel RecordTable = (DefaultTableModel) pharmacy_table.getModel();
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
                    columnData.add (rs.getString ("Medicine"));
                    columnData.add (rs.getString ("Quantity"));
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cardnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnoActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void cardtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardtypeActionPerformed

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        pID.setText("");
        patinfoname.setText("");
        patinfoage.setText("");
        patmeds.setText("");
        quantity.setText("");
        amount.setText("");
        cardname.setText("");
        cardno.setText("");
        cvv.setText("");
        date.setText("");

    }//GEN-LAST:event_jButton7ActionPerformed

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
        int found = 0;
        try
        {
            DefaultTableModel model7 = (DefaultTableModel) pharmacy_table.getModel();
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
                    pst = sqlConn.prepareStatement ("select* from pharmacyrequest where PatientID='" + patno +"'");

                    rs = pst.executeQuery ();
                    ResultSetMetaData stData = rs.getMetaData();
                    q = stData.getColumnCount ();
                    DefaultTableModel RecordTable = (DefaultTableModel) pharmacy_table.getModel();
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
                            columnData.add (rs.getString ("Medicine"));
                            columnData.add (rs.getString ("Quantity"));
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
    }//GEN-LAST:event_Search1ActionPerformed

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
            java.util.logging.Logger.getLogger(PharmacyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmacyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmacyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmacyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Pharmacy_requests;
    private javax.swing.JButton Search1;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField cardname;
    private javax.swing.JTextField cardno;
    private javax.swing.JComboBox<String> cardtype;
    private javax.swing.JTextField cvv;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JButton logoutpharmacy;
    private javax.swing.JTextField pID;
    private javax.swing.JTextArea patidsearch;
    private javax.swing.JTextField patinfoage;
    private javax.swing.JTextField patinfoname;
    private javax.swing.JTextField patmeds;
    private javax.swing.JTable pharmacy_table;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField stats;
    // End of variables declaration//GEN-END:variables
}
