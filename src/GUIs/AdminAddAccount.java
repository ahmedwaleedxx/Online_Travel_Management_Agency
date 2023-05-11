/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.util.regex.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class AdminAddAccount extends javax.swing.JFrame {

    /**
     * Creates new form AdminAddAccount
     */
    public AdminAddAccount() {
        initComponents();
        makealltransparent();
        
    }
    
    public void showpassword() {
        if (showpasswordcb.isSelected()) {
            passwordtb.setEchoChar((char) 0);
        } else {
            passwordtb.setEchoChar('*');
        }
    }
    
    public void makealltransparent() {
        addaccountbtn.setOpaque(false);
        resetbtn.setOpaque(false);
        showpasswordcb.setOpaque(false);
        typecb.setOpaque(false);
    }
    
    public void checkmissingdata() {
        ImageIcon icon = new ImageIcon("src/Images/erroricon.png");
        String string = "Missing Field !!!";
        if (nametb.getText().isEmpty()) {
            nameerror.setIcon(icon);
            nameerror.setText(string);
        } else {
            nameerror.setIcon(null);
            nameerror.setText("");
        }
        if (usernametb.getText().isEmpty()) {
            usernameerror.setIcon(icon);
            usernameerror.setText(string);
        } else {
            usernameerror.setIcon(null);
            usernameerror.setText("");
        }
        if (passwordtb.getText().isEmpty()) {
            passworderror.setIcon(icon);
            passworderror.setText(string);
        } else {
            passworderror.setIcon(null);
            passworderror.setText("");
        }
        if (emailtb.getText().isEmpty()) {
            emailerror.setIcon(icon);
            emailerror.setText(string);
        } else {
            emailerror.setIcon(null);
            emailerror.setText("");
        }
        if (nationalitytb.getText().isEmpty()) {
            nationalityerror.setIcon(icon);
            nationalityerror.setText(string);
        } else {
            nationalityerror.setIcon(null);
            nationalityerror.setText("");
        }
        if (agetb.getText().isEmpty()) {
            ageerror.setIcon(icon);
            ageerror.setText(string);
        } else {
            ageerror.setIcon(null);
            ageerror.setText("");
        }
        if (gendercombo.getSelectedItem().equals("                     <<SELECT>>")) {
            gendererror.setIcon(icon);
            gendererror.setText(string);
        } else {
            gendererror.setIcon(null);
            gendererror.setText("");
        }
    }
    
    public void validatepassword(String pass) {
        ImageIcon icon = new ImageIcon("src/Images/erroricon.png");
        String validall1 = "Password should be of 8 digits minimum, contain upper";
        String validall2 = "and \nlower case letters and contain numbers";
        boolean len = false;
        boolean upper = false;
        boolean lower = false;
        boolean num = false;
        char c;
        int length = pass.length();
        for (int i = 0; i < length; i++) {
            c = pass.charAt(i);
            if (length >= 8) {
                len = true;
            }
            if (Character.isUpperCase(c)) {
                upper = true;
            }
            if (Character.isLowerCase(c)) {
                lower = true;
            }
            if (Character.isDigit(c)) {
                num = true;
            }
            if (len == false || upper == false || lower == false || num == false) {
                passworderror.setIcon(icon);
                passworderror.setText(validall1);
                passworderror2.setText(validall2);
            } else {
                passworderror.setIcon(null);
                passworderror.setText("");
                passworderror2.setText("");
            }
        }
    }
    
    public boolean validateEmailbool(String email){
        String validemail="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailvalid=Pattern.compile(validemail, Pattern.CASE_INSENSITIVE);
        Matcher m=emailvalid.matcher(email);
        return m.find();
    }
    public void validateEmail(String email){
        ImageIcon icon = new ImageIcon("src/Images/erroricon.png");
        if(email.isEmpty()){
            emailerror.setIcon(icon);
            emailerror.setText("Missing Field!!!");
        }      else  
        if(validateEmailbool(email)==false){
            emailerror.setIcon(icon);
            emailerror.setText("Wrong Email Format");
        }else{
            emailerror.setIcon(null);
            emailerror.setText("");
        }
    }
    
    
    public void reset() {
        String reset = "";
        nametb.setText(reset);
        usernametb.setText(reset);
        passwordtb.setText(reset);
        emailtb.setText(reset);
        nationalitytb.setText(reset);
        agetb.setText(reset);
        gendercombo.setSelectedIndex(0);
        typecb.setSelectedIndex(0);
        
        nameerror.setText(reset);
        usernameerror.setText(reset);
        passworderror.setText(reset);
        passworderror2.setText(reset);
        emailerror.setText(reset);
        nationalityerror.setText(reset);
        ageerror.setText(reset);
        gendererror.setText(reset);
        
        nameerror.setIcon(null);
        usernameerror.setIcon(null);
        passworderror.setIcon(null);
        emailerror.setIcon(null);
        nationalityerror.setIcon(null);
        ageerror.setIcon(null);
        gendererror.setIcon(null);
    }


    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resetbtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        nametb = new javax.swing.JTextField();
        usernametb = new javax.swing.JTextField();
        emailtb = new javax.swing.JTextField();
        nationalitytb = new javax.swing.JTextField();
        agetb = new javax.swing.JTextField();
        addaccountbtn = new javax.swing.JButton();
        gendercombo = new javax.swing.JComboBox<>();
        nameerror = new javax.swing.JLabel();
        gendererror = new javax.swing.JLabel();
        usernameerror = new javax.swing.JLabel();
        passworderror2 = new javax.swing.JLabel();
        emailerror = new javax.swing.JLabel();
        nationalityerror = new javax.swing.JLabel();
        ageerror = new javax.swing.JLabel();
        showpasswordcb = new javax.swing.JCheckBox();
        passwordtb = new javax.swing.JPasswordField();
        passworderror = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        typecb = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Go-back-icon-edited.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Add Admin Account");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Type: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 70, 36));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Username:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Email: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 246, 120, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 177, 120, 36));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Age: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, 36));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Gender:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 120, 36));

        resetbtn.setBackground(new java.awt.Color(51, 0, 102));
        resetbtn.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(204, 255, 255));
        resetbtn.setText("reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("Nationality:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 36));

        nametb.setBackground(new java.awt.Color(204, 255, 255));
        nametb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nametb.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(nametb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 270, 30));

        usernametb.setBackground(new java.awt.Color(204, 255, 255));
        usernametb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usernametb.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(usernametb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 270, 30));

        emailtb.setBackground(new java.awt.Color(204, 255, 255));
        emailtb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailtb.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(emailtb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 270, 30));

        nationalitytb.setBackground(new java.awt.Color(204, 255, 255));
        nationalitytb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nationalitytb.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(nationalitytb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 270, 30));

        agetb.setBackground(new java.awt.Color(204, 255, 255));
        agetb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        agetb.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(agetb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 270, 30));

        addaccountbtn.setBackground(new java.awt.Color(51, 0, 102));
        addaccountbtn.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        addaccountbtn.setForeground(new java.awt.Color(204, 255, 255));
        addaccountbtn.setText("Add Account");
        addaccountbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addaccountbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addaccountbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        gendercombo.setBackground(new java.awt.Color(0, 0, 102));
        gendercombo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gendercombo.setForeground(new java.awt.Color(204, 255, 255));
        gendercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                     <<SELECT>>", "Male", "Female", "Other", " " }));
        jPanel1.add(gendercombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 270, 30));

        nameerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(nameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 105, 140, 20));

        gendererror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(gendererror, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 140, 20));

        usernameerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(usernameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 145, 140, 20));

        passworderror2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(passworderror2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 390, 20));

        emailerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(emailerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 140, 20));

        nationalityerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(nationalityerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 140, 20));

        ageerror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(ageerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 140, 20));

        showpasswordcb.setBackground(new java.awt.Color(0, 51, 153));
        showpasswordcb.setForeground(new java.awt.Color(204, 255, 255));
        showpasswordcb.setText("Show Password");
        showpasswordcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordcbActionPerformed(evt);
            }
        });
        jPanel1.add(showpasswordcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 140, -1));

        passwordtb.setBackground(new java.awt.Color(204, 255, 255));
        passwordtb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passwordtb.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(passwordtb, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 270, 30));

        passworderror.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(passworderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 390, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PhotoshopEditedSELogoResized.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 90, 110));

        typecb.setBackground(new java.awt.Color(0, 0, 102));
        typecb.setForeground(new java.awt.Color(204, 255, 255));
        typecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "           <<SELECT>>", "Admin", "Manager", "Company", "Employee", "Blog Author", "User" }));
        jPanel1.add(typecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 150, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 255));
        jLabel12.setText("Name: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminAddAccount.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

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

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new ChooseUser().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void addaccountbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addaccountbtnActionPerformed
        checkmissingdata();
        validatepassword(passwordtb.getText());
        validateEmail(emailtb.getText());
        if(!(usernametb.getText().isEmpty())&&!(passwordtb.getText().isEmpty()) && !(emailtb.getText().isEmpty())&& !(nametb.getText().isEmpty()) && !(nationalitytb.getText().isEmpty()) && !(agetb.getText().isEmpty())
                && !(gendercombo.getSelectedItem().equals("                     <<SELECT>>"))){
        if(typecb.getSelectedItem().toString().equals("           <<SELECT>>")){
            JOptionPane.showMessageDialog(this, "Enter Type");
        }
        }

    }//GEN-LAST:event_addaccountbtnActionPerformed

    private void showpasswordcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordcbActionPerformed
        showpassword();
    }//GEN-LAST:event_showpasswordcbActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        reset();

    }//GEN-LAST:event_resetbtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addaccountbtn;
    private javax.swing.JLabel ageerror;
    private javax.swing.JTextField agetb;
    private javax.swing.JLabel emailerror;
    private javax.swing.JTextField emailtb;
    private javax.swing.JComboBox<String> gendercombo;
    private javax.swing.JLabel gendererror;
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
    private javax.swing.JLabel nameerror;
    private javax.swing.JTextField nametb;
    private javax.swing.JLabel nationalityerror;
    private javax.swing.JTextField nationalitytb;
    private javax.swing.JLabel passworderror;
    private javax.swing.JLabel passworderror2;
    private javax.swing.JPasswordField passwordtb;
    private javax.swing.JButton resetbtn;
    private javax.swing.JCheckBox showpasswordcb;
    private javax.swing.JComboBox<String> typecb;
    private javax.swing.JLabel usernameerror;
    private javax.swing.JTextField usernametb;
    // End of variables declaration//GEN-END:variables
}
