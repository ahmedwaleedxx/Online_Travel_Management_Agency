/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.awt.Color;

/**
 *
 * @author ahmed
 */
public class ManageAdminAccount extends javax.swing.JFrame {

    /**
     * Creates new form ManageAdminAccount
     */
    public ManageAdminAccount() {
        initComponents();
        makeAllTransparent();
    }


    public void makeAllTransparent(){
//        adminstable.setOpaque(false);
        addbtn.setOpaque(false);
        updatebtn.setOpaque(false);
        deletebtn.setOpaque(false);
    }
    

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 217, 250, 37));

        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 267, 250, 37));

        jTextField3.setBackground(new java.awt.Color(204, 255, 255));
        jTextField3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 322, 250, 37));

        jTextField5.setBackground(new java.awt.Color(204, 255, 255));
        jTextField5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 377, 250, 37));

        jTextField6.setBackground(new java.awt.Color(204, 255, 255));
        jTextField6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 377, 250, 37));

        jTextField4.setBackground(new java.awt.Color(204, 255, 255));
        jTextField4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 322, 250, 37));

        jTextField7.setBackground(new java.awt.Color(204, 255, 255));
        jTextField7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 267, 250, 37));

        jTextField8.setBackground(new java.awt.Color(204, 255, 255));
        jTextField8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 217, 250, 37));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 217, 120, 37));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 278, 120, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 333, 120, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 388, 120, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Phone");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 217, 120, 37));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("jlable");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 267, 120, 37));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("jLabel1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 322, 120, 37));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("jLabel1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 377, 120, 37));

        addbtn.setBackground(new java.awt.Color(0, 0, 0));
        addbtn.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(204, 255, 255));
        addbtn.setText("Add Account");
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 464, 210, 36));

        updatebtn.setBackground(new java.awt.Color(0, 0, 0));
        updatebtn.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(204, 255, 255));
        updatebtn.setText("Update Account");
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 432, 210, 36));

        deletebtn.setBackground(new java.awt.Color(0, 0, 0));
        deletebtn.setFont(new java.awt.Font("Engravers MT", 0, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(204, 255, 255));
        deletebtn.setText("Delete Account");
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 464, 210, 36));

        jLabel9.setFont(new java.awt.Font("Engravers MT", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Manage Admins' Accounts");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 710, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PhotoshopEditedSELogoResized.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 90, 110));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Go-back-icon-edited.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 900, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminMenuResized.jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new ChooseUser().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(ManageAdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAdminAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAdminAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
