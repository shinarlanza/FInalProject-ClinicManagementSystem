package javaproject;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class setAppointment extends javax.swing.JFrame {
    public int flag=0;
    
    dbConnection database = new dbConnection();
    public setAppointment() throws SQLException {
        initComponents();
        
        jPanel1.setBackground(new Color(197, 239, 247));
        jPanel2.setBackground(new Color(228, 241, 254,120));
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonCon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDocName = new javax.swing.JTextField();
        jLabelDoctName = new javax.swing.JLabel();
        jLabelSchedDay = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jTextFieldDay = new javax.swing.JTextField();
        jTextFieldPatientName = new javax.swing.JTextField();
        jLabelPatientName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 85));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setForeground(new java.awt.Color(255, 0, 0));

        jButtonCon.setBackground(new java.awt.Color(52, 152, 219));
        jButtonCon.setText("Confirm");
        jButtonCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DOCTOR", "DAY", "TIME", "SPECIALIZATION"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextFieldSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonSearch.setBackground(new java.awt.Color(137, 196, 244));
        jButtonSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Specialization");

        jTextFieldDocName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelDoctName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDoctName.setText("Doctor's Name");

        jLabelSchedDay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelSchedDay.setText("Day");

        jButtonCancel.setBackground(new java.awt.Color(246, 71, 71));
        jButtonCancel.setText("Close");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jTextFieldDay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldPatientName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelPatientName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPatientName.setText("Patient's Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearch)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDoctName)
                .addGap(197, 197, 197))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButtonCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCon)
                .addGap(58, 58, 58))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDay, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPatientName)
                .addGap(201, 201, 201))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabelSchedDay)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jTextFieldDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDoctName)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPatientName)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSchedDay)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCon)
                    .addComponent(jButtonCancel))
                .addGap(68, 68, 68))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 540));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 540));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 520, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        try {
            new main().setVisible(true);
        } 
        catch (SQLException ex) {
            Logger.getLogger(setAppointment.class.getName()).log(Level.SEVERE, 
                null, ex);
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConActionPerformed
        String doctor = jTextFieldDocName.getText();
        String patient = jTextFieldPatientName.getText();
        String daySched = jTextFieldDay.getText();
        
        
        try { 
            if(doctor.equals("") && patient.equals("") && daySched.equals("")){
                JOptionPane.showMessageDialog(this, "Please fill all field");
            }
            else if(doctor.matches(".*\\d.*") && patient.matches(".*\\d.*")&&
                daySched.matches(".*\\d.*")){
                JOptionPane.showMessageDialog(this, "Invalid input!");            
            }
            else{
                database.insertAppointment(patient, doctor, daySched);
                JOptionPane.showMessageDialog(this, "Succesfully set an "+
                    "appointment!");
            }  
          } 
            
        catch(SQLException ex) {
            Logger.getLogger(setAppointment.class.getName()).log(Level.SEVERE, 
                null, ex);
        } 
                            
    
    }//GEN-LAST:event_jButtonConActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        
        String specialization = jTextFieldSearch.getText().substring(0,1)
                .toUpperCase()+ jTextFieldSearch.getText().substring(1);
        
        String databaseName = "clinicms";
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
        try{
            Connection connection = DriverManager.getConnection(url,"root","");
            String query = "SELECT * FROM `doctors` WHERE specialization ='"+specialization+"'";
            PreparedStatement statement = connection.prepareStatement(query);            
            ResultSet result=statement.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(result));
            
            if(!result.first()){
                 JOptionPane.showMessageDialog(this, "Sorry! Not Available!");
            }
            else{                 
                 jTextFieldSearch.setEditable(true);
                 flag=1;
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_jButtonSearchActionPerformed

    
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
            java.util.logging.Logger.getLogger(setAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new setAppointment().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(setAppointment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCon;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDoctName;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelSchedDay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDay;
    private javax.swing.JTextField jTextFieldDocName;
    private javax.swing.JTextField jTextFieldPatientName;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
