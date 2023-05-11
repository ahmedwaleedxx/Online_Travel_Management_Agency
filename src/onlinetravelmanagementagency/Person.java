/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinetravelmanagementagency;

import GUIs.AdminMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class Person {

    private int ID;
    String FullName;
    private String username;
    private String password;
    private String email;
    private String nationality;
    private int age;
    private String gender;
    Connection con;// = javaconnect.connectdb();
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Person(int ID, String FullName, String username, String password, String email, String nationality, int age, String gender) {
        this.ID = ID;
        this.FullName = FullName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.nationality = nationality;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void login(String username, String password, String type) {
        this.username = username;
        this.password = password;
        
        if(username.equals(this.username) && password.equals(this.password)){
            JOptionPane.showMessageDialog(null, "Wrong");
        }else{
            System.out.println("login");
        }
        
        
        
      //  String AdminLogin = "SELECT * FROM Admin WHERE username=? AND password=?";
        
        
//        try {

                //            ps = con.prepareStatement(AdminLogin);
//            ps.setString(1, username);
//            ps.setString(2, password);
//            rs = ps.executeQuery();
//            if (rs.next()) {
//                JOptionPane.showMessageDialog(null, "Login Successfully...  \n Welcome  " + FullName);
//            }

//        switch (type) {
//            case "Admin":
//                JOptionPane.showMessageDialog(null, "Admin Welcome msg");
//                break;
//            case "Manager":
//                JOptionPane.showMessageDialog(null, "Manager Welcome msg");
//                break;
//            case "Company":
//                JOptionPane.showMessageDialog(null, "Company Welcome msg");
//                break;
//            case "Blog Author":
//                JOptionPane.showMessageDialog(null, "Author Welcome msg");
//                break;
//            case "Customer":
//                JOptionPane.showMessageDialog(null, "Customer Welcome msg");
//                break;
//        }
            }
//         catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//        }
    }


