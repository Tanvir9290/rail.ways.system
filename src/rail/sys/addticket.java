/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rail.sys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tanvi
 */
public class addticket extends javax.swing.JFrame {

    /**
     * Creates new form addticket
     */
    String a;
    public addticket() {
        initComponents();
        fillfrom();
        fillto();
        setResizable(false);
    }
    public addticket(String a) {
        initComponents();
        this.a=a;
        setResizable(false);
        fillfrom();
        fillto();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        userna = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pna = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        padd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        frm = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        too = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        dte = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        search = new javax.swing.JLabel();
        tme = new lu.tudor.santec.jtimechooser.JTimeChooser();
        jPanel2 = new javax.swing.JPanel();
        avl = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        Check = new javax.swing.JLabel();
        seat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        submit = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        Back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(217, 131, 59));
        kGradientPanel1.setkGradientFocus(5);
        kGradientPanel1.setkStartColor(new java.awt.Color(25, 92, 133));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        userna.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(25, 92, 133)));

        jLabel5.setText("Username:");

        pna.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(25, 92, 133)));

        jLabel1.setText("PassengerName:");

        pem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(25, 92, 133)));
        pem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemActionPerformed(evt);
            }
        });

        jLabel2.setText("PassengerEmail:");

        padd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(25, 92, 133)));

        jLabel3.setText("PassengerAddess:");

        frm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(25, 92, 133)));

        jLabel7.setText("From:");

        too.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(25, 92, 133)));

        jLabel8.setText("To:");

        dte.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(25, 92, 133)));

        jLabel6.setText("Date:");

        jLabel9.setText("Time:");

        search.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9))
                            .addComponent(userna)
                            .addComponent(pna)
                            .addComponent(pem)
                            .addComponent(padd)
                            .addComponent(frm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(too, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(dte, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(padd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(too, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addComponent(dte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        avl.setBorder(null);

        jLabel10.setText("Available:");

        Check.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Check.setForeground(new java.awt.Color(255, 255, 255));
        Check.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Check.setText("Check");
        Check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Check, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        seat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(25, 92, 133)));

        jLabel15.setText("SeatNo");

        submit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submit.setText("Submit");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        Back.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15))
                            .addComponent(avl, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat)
                            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(8, 8, 8)
                .addComponent(seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(217, 131, 59));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jTable2.setFocusable(false);
        jTable2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable2.setRowHeight(25);
        jTable2.setSelectionBackground(new java.awt.Color(217, 131, 59));
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Available Trains");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Not Available Tickets");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rail/sys/21.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Seat Distributed");

        jLabel12.setText("#NoobCoder");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel11)))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pemActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        String runfrm=(String) frm.getSelectedItem();
        String runto=(String) too.getSelectedItem();
        String time=tme.getFormatedTime();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/rail.ways";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            Statement stat = con.createStatement();    
            String selectQuery = "select number from trains where runfrom='"+runfrm+"' and runto='"+runto+"' and departure >= '"+time+"'";
            ResultSet rs=stat.executeQuery(selectQuery);
            while(rs.next()){
                
                avl.addItem(rs.getString("number"));
            }
            selectQuery="select name as trainName,number as tranNo,departure as StartOn from trains where runfrom='"+runfrm+"' and runto='"+runto+"' and departure >= '"+time+"'";
            rs=stat.executeQuery(selectQuery);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchMouseClicked

    private void CheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckMouseClicked
        // TODO add your handling code here:
        String ab=(String) avl.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/rail.ways";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            Statement stat = con.createStatement();    
            String selectQuery = "select sitno from addticket where trainid='"+ab+"'";
            ResultSet rs=stat.executeQuery(selectQuery);
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            //jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_CheckMouseClicked

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        // TODO add your handling code here:
        SimpleDateFormat sdk=new SimpleDateFormat("yyyy-MM-dd");
        String date=sdk.format(dte.getDate());
        String passN=pna.getText();
        String passE=pem.getText();
        String passAd=padd.getText();
        String passT=tme.getFormatedTime();
        String passTrn=(String) avl.getSelectedItem();
        String username=userna.getText();
        String pseat=seat.getText();
        try
        {
        
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/rail.ways";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            Statement stat = con.createStatement();
            
            String selectQuery = "select * from addticket where addticket.sitno='"+pseat+"'";
            ResultSet rs=stat.executeQuery(selectQuery);
         
           if(rs.next())
           {
             System.out.println("already exist");
             JOptionPane.showMessageDialog(null, "Seat Already Booked");
           }else{
               selectQuery = "insert into addticket values(null,'" + passN + "','" + passE + "','" + passAd + "','" + passTrn + "','" + username + "','" + date + "','" + passT + "','" + pseat + "')";
               stat.executeUpdate(selectQuery);
               JOptionPane.showMessageDialog(null, "Success");
           
           }   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_submitMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:
        login lg=new login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackMouseClicked

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
            java.util.logging.Logger.getLogger(addticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addticket().setVisible(true);
            }
        });
    }
    public void fillfrom(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/rail.ways";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            Statement stat = con.createStatement();    
            String selectQuery="select distinct(runfrom) from trains";
            ResultSet rs=stat.executeQuery(selectQuery);
            while(rs.next())
            {
                frm.addItem(rs.getString("runfrom"));
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
    }
    public void fillto(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/rail.ways";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            Statement stat = con.createStatement();    
            String selectQuery="select distinct(runto) from trains";
            ResultSet rs=stat.executeQuery(selectQuery);
            while(rs.next())
            {
                too.addItem(rs.getString("runto"));
            }
                    
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Check;
    private javax.swing.JComboBox<String> avl;
    private com.toedter.calendar.JDateChooser dte;
    private javax.swing.JComboBox<String> frm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private javax.swing.JTextField padd;
    private javax.swing.JTextField pem;
    private javax.swing.JTextField pna;
    private javax.swing.JLabel search;
    private javax.swing.JTextField seat;
    private javax.swing.JLabel submit;
    private lu.tudor.santec.jtimechooser.JTimeChooser tme;
    private javax.swing.JComboBox<String> too;
    private javax.swing.JTextField userna;
    // End of variables declaration//GEN-END:variables
}
