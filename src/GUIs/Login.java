/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import com.sun.webkit.perf.WCFontPerfLogger;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import onlinetravelmanagementagency.Admin;
import onlinetravelmanagementagency.Person;

/**
 *
 * @author ahmed
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public Login() {
        initComponents();
        makealltransparent();
    }

    public void makealltransparent() {
        showpassword.setOpaque(false);
        loginbtn.setOpaque(false);
        resetbtn.setOpaque(false);
        cancelbtn.setOpaque(false);
        adminradio.setOpaque(false);
        managerradio.setOpaque(false);
        companyradio.setOpaque(false);
        blogauthorradio.setOpaque(false);
        customerradio.setOpaque(false);
        jPanel2.setVisible(false);

    }

    public void reset() {
        usernametb.setText("Enter Username");
        passwordtb.setText("Enter Password");
        passwordtb.setEchoChar((char) 0);
        usernametb.setForeground(placeholdercolor);
        passwordtb.setForeground(placeholdercolor);
        PersonType.clearSelection();
        usernameerror.setIcon(null);
        usernameerror.setText("");
        passworderror.setIcon(null);
        passworderror.setText("");
        jPanel2.setVisible(false);
        Color c = new Color(255, 0, 255);
        adminradio.setForeground(c);
        managerradio.setForeground(c);
        companyradio.setForeground(c);
        blogauthorradio.setForeground(c);
        customerradio.setForeground(c);
    }

    public void showPassword() {
        if (showpassword.isSelected()) {
            passwordtb.setEchoChar((char) 0);
        } else if(!(passwordtb.getText().equals("Enter Password"))) {
            passwordtb.setEchoChar('*');
        }

    }

    public void validateEmptyFields() {
        ImageIcon icon = new ImageIcon("src/Images/erroricon.png");
        if (usernametb.getText().equals("Enter Username") || usernametb.getText().isEmpty()) {
            usernameerror.setIcon(icon);
            usernameerror.setText("Missing Field!!!");
        } else {
            usernameerror.setIcon(null);
            usernameerror.setText("");
        }
        if (passwordtb.getText().isEmpty() || passwordtb.getText().equals("Enter Password")) {

            passworderror.setIcon(icon);
            passworderror.setText("Missing Field!!!");
        } else {
            passworderror.setIcon(null);
            passworderror.setText("");
        }
    }

    String type;

    public void validatePerson() {
//htb2a if adminradio or managerradio or companyradio or blogauthorradio or customerradio.isSelected()  + person.login(username, password, type)
if(!(usernametb.getText().equals("") || (usernametb.getText().equals("Enter Username")) ||passwordtb.getText().equals("") || passwordtb.getText().equals("Enter Password") ))
{
    if (adminradio.isSelected()) {
            type = "Admin";

        } else if (managerradio.isSelected()) {
            type = "Manager";
        } else if (companyradio.isSelected()) {

        } else if (blogauthorradio.isSelected()) {

        } else if (customerradio.isSelected()) {

        } else {
            jPanel2.setVisible(true);

            jPanel2.setBackground(Color.red);
            adminradio.setForeground(Color.WHITE);
            managerradio.setForeground(Color.WHITE);
            companyradio.setForeground(Color.WHITE);
            blogauthorradio.setForeground(Color.WHITE);
            customerradio.setForeground(Color.WHITE);
            JOptionPane.showMessageDialog(this, "Please seclet category to login", "Warning !!!", 0);

        }
}
else{
    JOptionPane.showMessageDialog(this, "Please seclet category to login \nAnd Check Missing Fields", "Warning !!!", 0);
}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        PersonType = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernametb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordtb = new javax.swing.JPasswordField();
        showpassword = new javax.swing.JCheckBox();
        cancelbtn = new javax.swing.JButton();
        loginbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        adminradio = new javax.swing.JRadioButton();
        companyradio = new javax.swing.JRadioButton();
        managerradio = new javax.swing.JRadioButton();
        blogauthorradio = new javax.swing.JRadioButton();
        customerradio = new javax.swing.JRadioButton();
        usernameerror = new javax.swing.JLabel();
        passworderror = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Login...");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 239, 59));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Username: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 133, -1, 37));

        jLabel3.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 222, -1, 37));

        usernametb.setBackground(new java.awt.Color(204, 255, 255));
        usernametb.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        usernametb.setForeground(new java.awt.Color(153, 153, 153));
        usernametb.setText("Enter Username");
        usernametb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        usernametb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernametbFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernametbFocusLost(evt);
            }
        });
        usernametb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametbActionPerformed(evt);
            }
        });
        jPanel1.add(usernametb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 137, 308, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Go-back-icon-edited.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        passwordtb.setBackground(new java.awt.Color(204, 255, 255));
        passwordtb.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        passwordtb.setForeground(new java.awt.Color(153, 153, 153));
        passwordtb.setText("Enter Password");
        passwordtb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        passwordtb.setEchoChar('\u0000');
        passwordtb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordtbFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordtbFocusLost(evt);
            }
        });
        passwordtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtbActionPerformed(evt);
            }
        });
        jPanel1.add(passwordtb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 310, 40));

        showpassword.setBackground(new java.awt.Color(102, 0, 102));
        showpassword.setForeground(new java.awt.Color(255, 255, 255));
        showpassword.setText("SHOW PASSWORD");
        showpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(showpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 267, 160, -1));

        cancelbtn.setBackground(new java.awt.Color(102, 0, 102));
        cancelbtn.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 0, 0));
        cancelbtn.setText("cancel");
        cancelbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), null, null));
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 110, 30));

        loginbtn.setBackground(new java.awt.Color(102, 0, 102));
        loginbtn.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(204, 255, 255));
        loginbtn.setText("Login");
        loginbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), null, null));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 190, 50));

        resetbtn.setBackground(new java.awt.Color(102, 0, 102));
        resetbtn.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(204, 255, 255));
        resetbtn.setText("reset");
        resetbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), null, null));
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 190, 50));

        adminradio.setBackground(new java.awt.Color(102, 0, 102));
        PersonType.add(adminradio);
        adminradio.setFont(new java.awt.Font("Engravers MT", 0, 11)); // NOI18N
        adminradio.setForeground(new java.awt.Color(255, 0, 255));
        adminradio.setText("Admin");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, adminradio, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), adminradio, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        adminradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminradioActionPerformed(evt);
            }
        });
        jPanel1.add(adminradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, -1));

        companyradio.setBackground(new java.awt.Color(102, 0, 102));
        PersonType.add(companyradio);
        companyradio.setFont(new java.awt.Font("Engravers MT", 0, 11)); // NOI18N
        companyradio.setForeground(new java.awt.Color(255, 0, 255));
        companyradio.setText("Company");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, companyradio, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), companyradio, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        companyradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyradioActionPerformed(evt);
            }
        });
        jPanel1.add(companyradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        managerradio.setBackground(new java.awt.Color(102, 0, 102));
        PersonType.add(managerradio);
        managerradio.setFont(new java.awt.Font("Engravers MT", 0, 11)); // NOI18N
        managerradio.setForeground(new java.awt.Color(255, 0, 255));
        managerradio.setText("Manager");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, managerradio, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), managerradio, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        managerradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerradioActionPerformed(evt);
            }
        });
        jPanel1.add(managerradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        blogauthorradio.setBackground(new java.awt.Color(102, 0, 102));
        PersonType.add(blogauthorradio);
        blogauthorradio.setFont(new java.awt.Font("Engravers MT", 0, 11)); // NOI18N
        blogauthorradio.setForeground(new java.awt.Color(255, 0, 255));
        blogauthorradio.setText("Blog Author");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, blogauthorradio, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), blogauthorradio, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        blogauthorradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogauthorradioActionPerformed(evt);
            }
        });
        jPanel1.add(blogauthorradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, -1, -1));

        customerradio.setBackground(new java.awt.Color(102, 0, 102));
        PersonType.add(customerradio);
        customerradio.setFont(new java.awt.Font("Engravers MT", 0, 11)); // NOI18N
        customerradio.setForeground(new java.awt.Color(255, 0, 255));
        customerradio.setText("Customer");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, customerradio, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), customerradio, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        customerradio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerradioActionPerformed(evt);
            }
        });
        jPanel1.add(customerradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        usernameerror.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(usernameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 190, 20));

        passworderror.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(passworderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 190, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 140, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PhotoshopEditedSELogoResized.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 90, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdminLoginBG Edited.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

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

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new ChooseUser().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void passwordtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtbActionPerformed

    private void showpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordActionPerformed
        showPassword();
    }//GEN-LAST:event_showpasswordActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        reset();
    }//GEN-LAST:event_resetbtnActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        Admin a = new Admin();
        String username = usernametb.getText();
        String password = passwordtb.getText();
        validateEmptyFields();
        validatePerson();
        a.login(username, password, type);

    }//GEN-LAST:event_loginbtnActionPerformed

    private void adminradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminradioActionPerformed
        if (adminradio.isSelected()) {
            jPanel2.setVisible(false);
            Color c = new Color(255, 0, 255);
            adminradio.setForeground(c);
            managerradio.setForeground(c);
            companyradio.setForeground(c);
            blogauthorradio.setForeground(c);
            customerradio.setForeground(c);
        }
    }//GEN-LAST:event_adminradioActionPerformed

    private void managerradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerradioActionPerformed
        if (managerradio.isSelected()) {
            Color c = new Color(255, 0, 255);
            adminradio.setForeground(c);
            managerradio.setForeground(c);
            companyradio.setForeground(c);
            blogauthorradio.setForeground(c);
            customerradio.setForeground(c);
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_managerradioActionPerformed

    private void companyradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyradioActionPerformed
        if (companyradio.isSelected()) {
            Color c = new Color(255, 0, 255);
            adminradio.setForeground(c);
            managerradio.setForeground(c);
            companyradio.setForeground(c);
            blogauthorradio.setForeground(c);
            customerradio.setForeground(c);
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_companyradioActionPerformed

    private void blogauthorradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogauthorradioActionPerformed
        if (blogauthorradio.isSelected()) {
            Color c = new Color(255, 0, 255);
            adminradio.setForeground(c);
            managerradio.setForeground(c);
            companyradio.setForeground(c);
            blogauthorradio.setForeground(c);
            customerradio.setForeground(c);
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_blogauthorradioActionPerformed

    private void customerradioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerradioActionPerformed
        if (customerradio.isSelected()) {
            Color c = new Color(255, 0, 255);
            adminradio.setForeground(c);
            managerradio.setForeground(c);
            companyradio.setForeground(c);
            blogauthorradio.setForeground(c);
            customerradio.setForeground(c);
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_customerradioActionPerformed

    private void usernametbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametbActionPerformed

    }//GEN-LAST:event_usernametbActionPerformed

    Color placeholdercolor = new Color(153, 153, 153);
    Color txtColor = new Color(51, 51, 51);

    private void usernametbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernametbFocusGained
        if (usernametb.getText().equals("Enter Username")) {
            usernametb.setText("");
            //usernametb.requestFocus();
            usernametb.setForeground(txtColor);
            usernameerror.setText("");
            usernameerror.setIcon(null);
        }
    }//GEN-LAST:event_usernametbFocusGained

    private void usernametbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernametbFocusLost
     ImageIcon icon = new ImageIcon("src/Images/erroricon.png");
        if (usernametb.getText().equals("")) {
            usernametb.setText("Enter Username");
            //usernametb.requestFocus();
            usernametb.setForeground(placeholdercolor);
            usernameerror.setText("Missing Field!!!");
            usernameerror.setIcon(icon);
        }
    }//GEN-LAST:event_usernametbFocusLost

    private void passwordtbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordtbFocusGained
        if (passwordtb.getText().equals("Enter Password")) {
            passwordtb.setText("");
            passwordtb.setForeground(txtColor);
            passwordtb.setEchoChar('*');
            passworderror.setText("");
            passworderror.setIcon(null);
        }
    }//GEN-LAST:event_passwordtbFocusGained

    private void passwordtbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordtbFocusLost
        ImageIcon icon = new ImageIcon("src/Images/erroricon.png");
        if (passwordtb.getText().equals("")) {
            passwordtb.setText("Enter Password");
            passwordtb.setForeground(placeholdercolor);
            passwordtb.setEchoChar((char) 0);
            passworderror.setText("Missing Field!!!");
            passworderror.setIcon(icon);
        }
    }//GEN-LAST:event_passwordtbFocusLost

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup PersonType;
    private javax.swing.JRadioButton adminradio;
    private javax.swing.JRadioButton blogauthorradio;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JRadioButton companyradio;
    private javax.swing.JRadioButton customerradio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JRadioButton managerradio;
    private javax.swing.JLabel passworderror;
    private javax.swing.JPasswordField passwordtb;
    private javax.swing.JButton resetbtn;
    private javax.swing.JCheckBox showpassword;
    private javax.swing.JLabel usernameerror;
    private javax.swing.JTextField usernametb;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
