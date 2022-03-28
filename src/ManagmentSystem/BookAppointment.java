/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagmentSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
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
 * @author User
 */
class PriceCalc
    {
        private String amount="";
        private String type="";
        
        public String getAmount()
        {
            return amount;
        }
        
        public void setAmount(String amount)
        {
            this.amount=amount;
        }
        
        public String getType()
        {
            return type;
        }
        
        public void setType(String type)
        {
            this.type=type;
        }
                    
}


public class BookAppointment extends javax.swing.JFrame {
    

    private static final String username = "root" ;
    private static final String password = "Test@123";
    private static final String dataConn ="jdbc:mysql://localhost:3306/hms";
    Connection sqlConn = null;
    PreparedStatement pst =null;
    PreparedStatement pst1 =null;
    PreparedStatement pst2 =null;
    PreparedStatement pst3 =null;
    ResultSet rs =null;
    ResultSet rs1 =null;
    int i,q,db;
    
    public BookAppointment() {
        initComponents();
        this.setLocationRelativeTo(null);
        updateDB();
    }
    JFrame f;
    public BookAppointment(String success) 
    {
        initComponents();
        
        f=new JFrame();  
        JOptionPane.showMessageDialog(f, "The Appointment Has Been Successfully Booked");
    }
    
    public void updateDB()
    {
        try{
                Class.forName ("com.mysql.cj.jdbc.Driver");
                sqlConn= DriverManager.getConnection (dataConn,username, password);
                pst = sqlConn.prepareStatement ("select* from docschedule");

                rs = pst.executeQuery ();
                ResultSetMetaData stData = rs.getMetaData();
                q = stData.getColumnCount ();
                DefaultTableModel RecordTable = (DefaultTableModel) doctable.getModel();
                RecordTable.setRowCount (0);

                while (rs.next ())
                {
                    Vector columnData = new Vector();
                     for (i = 1;i <= q; i++)
                     {
                            columnData.add (rs.getString ("SNo"));
                            columnData.add (rs.getString ("DocName"));
                            columnData.add (rs.getString ("Dept"));
                            columnData.add (rs.getString ("Position"));
                            columnData.add (rs.getString ("Days"));
                            columnData.add (rs.getString ("Timings"));
                     }
                     RecordTable.addRow(columnData);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

}
    
    
    
    PriceCalc calc=new PriceCalc();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jLabel7 = new javax.swing.JLabel();
        docname = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        Dentistry = new javax.swing.JRadioButton();
        Opthamology = new javax.swing.JRadioButton();
        Pediatrics = new javax.swing.JRadioButton();
        Generalphy = new javax.swing.JRadioButton();
        price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cardno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        carddate = new javax.swing.JTextField();
        cardname = new javax.swing.JTextField();
        cardtype = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Dermatology = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctable = new javax.swing.JTable();
        time = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        idno = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        findrecord = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(928, 732));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setText("Appointment Date:");

        docname.setEditable(false);
        docname.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        docname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docnameActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        name.setEditable(false);
        name.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setText("Patients Name:");

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setText("Patient ID No.");

        patID.setEditable(false);
        patID.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        patID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patIDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setText("Department");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setText("Phone Number:");

        phone.setEditable(false);
        phone.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        buttonGroup2.add(Dentistry);
        Dentistry.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Dentistry.setText("Dental");
        Dentistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DentistryActionPerformed(evt);
            }
        });

        buttonGroup2.add(Opthamology);
        Opthamology.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Opthamology.setText("Opthomology");
        Opthamology.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpthamologyActionPerformed(evt);
            }
        });

        buttonGroup2.add(Pediatrics);
        Pediatrics.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Pediatrics.setText("Pediatrics");
        Pediatrics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PediatricsActionPerformed(evt);
            }
        });

        buttonGroup2.add(Generalphy);
        Generalphy.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Generalphy.setText("General Physcian");
        Generalphy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralphyActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel8.setText("Amount :");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Appointment Details");

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Payment Details");

        jLabel11.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel11.setText("Card Type:");

        jLabel12.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel12.setText("Card Number:");

        cardno.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        cardno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel13.setText("Name On Card:");

        jLabel14.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel14.setText("CVV:");

        jLabel15.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel15.setText("Expiry Date:");

        cvv.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvActionPerformed(evt);
            }
        });

        carddate.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        carddate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carddateActionPerformed(evt);
            }
        });

        cardname.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        cardname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnameActionPerformed(evt);
            }
        });

        cardtype.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cardtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a card type", "Mastercard", "Visa", "American Express" }));
        cardtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardtypeActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment Booking Portal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel9.setText("Doctor's Name");

        buttonGroup2.add(Dermatology);
        Dermatology.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        Dermatology.setText("Dermatology");
        Dermatology.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DermatologyActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel16.setText("Age");

        age.setEditable(false);
        age.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        doctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "S.No.", "Doctor's Name", "Dept", "Position", "Days", "Timings"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(doctable);
        if (doctable.getColumnModel().getColumnCount() > 0) {
            doctable.getColumnModel().getColumn(0).setMinWidth(40);
            doctable.getColumnModel().getColumn(0).setPreferredWidth(40);
            doctable.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        time.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select A Time", "9", "9:30", "10", "10:30", "11", "11:30", "12", "12:30", "13", "13:30", "14", "14:30", "15", "15:30", "16", "16:30", "17", "17:30", "18", "18:30", "19", "19:30", "20", "20:30", "21", "21:30", "22", "22:30", "23", " " }));
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel17.setText("Appointment Time");

        idno.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        idno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idnoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel18.setText("Identification No.");

        findrecord.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        findrecord.setText("Find");
        findrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findrecordActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(20, 20, 20)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(docname, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Opthamology)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Dentistry)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Pediatrics))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Dermatology)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Generalphy))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(patID, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(name)
                                            .addComponent(age)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(10, 10, 10)
                                        .addComponent(idno)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(findrecord)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cardtype, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(phone, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cardname, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(price)
                                        .addComponent(cvv)
                                        .addComponent(carddate)
                                        .addComponent(cardno, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(Submit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(502, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardtype, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(findrecord))))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(patID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Opthamology, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Dentistry, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Pediatrics, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dermatology, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Generalphy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(docname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        name.setText("");
        age.setText("");
        phone.setText("");
        patID.setText("");
        docname.setText("");
        cardno.setText("");
        cardname.setText("");
        carddate.setText("");
        cvv.setText("");
        Pediatrics.setSelected(false);
        Opthamology.setSelected(false);
        Dentistry.setSelected(false);
        Dermatology.setSelected(false);
        Generalphy.setSelected(false);
        
    }//GEN-LAST:event_clearActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String patname = name.getText();
        String pID= patID.getText();
        String patage= age.getText();
        String DocN=docname.getText();
        String dept = calc.getType();
        String time1 = time.getSelectedItem().toString();

        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
        String patdate = sdf.format(date1.getDate());
        String patpno = phone.getText();
        String patpay = calc.getAmount();
        String paytype = cardtype.getSelectedItem().toString();
        String payno = cardno.getText();
        String payname = cardname.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        String dateTime = now.format(formatter);
        
        try
        {
            
            pst3= sqlConn.prepareStatement ("select* from appointments where DoctorName= ? AND Time=? AND Date=?");
            pst3.setString(1,DocN);
            pst3.setString(2,time1);
            pst3.setString(3,patdate);
            ResultSet rs1 =pst3.executeQuery();
            
                if(rs1.next()== false)
                {
                    Class.forName ("com.mysql.cj.jdbc.Driver");
                    sqlConn = DriverManager.getConnection(dataConn, username, password);
                    pst = sqlConn.prepareStatement ("INSERT INTO appointments(PatientID, Name, Age, PhoneNo, Date, Time, Dept, DoctorName, DateandTime, Status) value(?,?,?,?,?,?,?,?,?,?)");

                    pst.setString (1, pID);
                    pst.setString (2, patname);
                    pst.setString (3,patage);
                    pst.setString (4, patpno);
                    pst.setString (5, patdate);
                    pst.setString (6, time1);
                    pst.setString (7, dept);
                    pst.setString (8,DocN);
                    pst.setString (9, dateTime);
                    pst.setString(10,"Pending");

                    pst.executeUpdate();

                    pst1 = sqlConn.prepareStatement ("INSERT INTO transactions(PatientID,Name,CardType,CardNo,Amount,Purpose,DateandTime) value(?,?,?,?,?,?,?)");

                    pst1.setString (1, pID);
                    pst1.setString (2, payname);
                    pst1.setString (3, paytype);
                    pst1.setString (4, payno);
                    pst1.setString (5, patpay);
                    pst1.setString (6, "Appointment");
                    pst1.setString (7, dateTime);

                    pst1.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Booking Successful");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Appointment Slot Not Available. Please Try a different date or time");
                }   
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_SubmitActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void patIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patIDActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        
    }//GEN-LAST:event_phoneActionPerformed

    private void OpthamologyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpthamologyActionPerformed
        price.setText("SR 200");
        calc.setAmount("SR 200");
        calc.setType("Opthamology");
    }//GEN-LAST:event_OpthamologyActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void GeneralphyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralphyActionPerformed
        price.setText("SR 100");
        calc.setAmount("SR 100");
        calc.setType("General Physcian");
    }//GEN-LAST:event_GeneralphyActionPerformed

    private void DentistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DentistryActionPerformed
        price.setText("SR 150");
        calc.setAmount("Sr 150");
        calc.setType("Dental");
    }//GEN-LAST:event_DentistryActionPerformed

    private void PediatricsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PediatricsActionPerformed
        price.setText("SR 100");
        calc.setAmount("SR 100");
        calc.setType("Pediatrics");
    }//GEN-LAST:event_PediatricsActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void cardnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnoActionPerformed

    private void cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvActionPerformed

    private void carddateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carddateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carddateActionPerformed

    private void cardnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnameActionPerformed

    private void cardtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardtypeActionPerformed

    private void DermatologyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DermatologyActionPerformed
        price.setText("SR 80");
        calc.setAmount("SR 80");
        calc.setType("Dermatology");
    }//GEN-LAST:event_DermatologyActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void doctableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctableMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) doctable.getModel();
        int SelectedRows= doctable.getSelectedRow();
        
        docname.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
    }//GEN-LAST:event_doctableMouseClicked

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void docnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docnameActionPerformed

    private void idnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idnoActionPerformed

    private void findrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findrecordActionPerformed
        String identification=idno.getText();
        try{ 
        
        pst2 = sqlConn.prepareStatement ("select* from registeredpatients where IdentificationNo= ?");
        pst2.setString(1,identification);    
        ResultSet rs =pst2.executeQuery();
        if(rs.next()== true)
        {
             String regpatid=(rs.getString ("PatientID"));
             String regpatname=(rs.getString ("Name"));
             String regpatage=(rs.getString ("Age"));
             String regpatpn=(rs.getString ("PhoneNo"));
             name.setText(regpatname);
             age.setText(regpatage);
             phone.setText(regpatpn);
             patID.setText(regpatid);
             
             
        }
        else{
                JOptionPane.showMessageDialog(this,"Patient is not Registered OR Invalid Identification No.");
            }
        }
         catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_findrecordActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new AdminInterface2().setVisible(true); 
         this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new BookAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Dentistry;
    private javax.swing.JRadioButton Dermatology;
    private javax.swing.JRadioButton Generalphy;
    private javax.swing.JRadioButton Opthamology;
    private javax.swing.JRadioButton Pediatrics;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField carddate;
    private javax.swing.JTextField cardname;
    private javax.swing.JTextField cardno;
    private javax.swing.JComboBox<String> cardtype;
    private javax.swing.JButton clear;
    private javax.swing.JTextField cvv;
    private com.toedter.calendar.JDateChooser date1;
    private javax.swing.JTextField docname;
    private javax.swing.JTable doctable;
    private javax.swing.JButton findrecord;
    private javax.swing.JTextField idno;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField patID;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> time;
    // End of variables declaration//GEN-END:variables
}
