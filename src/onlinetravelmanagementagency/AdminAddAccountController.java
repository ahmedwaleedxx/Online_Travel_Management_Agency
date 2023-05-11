/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinetravelmanagementagency;

/**
 *
 * @author ahmed
 */
public class AdminAddAccountController {
    
    private static final Admin admin = new Admin();
    
    public static void VerifyAddAdminAccount(String fullname, String username, String password, String email, int age, String gender, String nationality) {
        admin.AddAdminAccount(fullname, username, password, email, age, gender, nationality);
    }
    
    public void AddCustomerAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone, float balance) {
        admin.AddCustomerAccount(fullName, Username, Password, Email, Age, Gender, Nationality, phone, balance);
    }
    
    public void AddManagerAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone) {
        admin.AddManagerAccount(fullName, Username, Password, Email, Age, Gender, Nationality, phone);
    }
    
    public void AddCompanyAccount(String fullName, String username, String password, String email, String nationality, int phone, float balance) {
        admin.AddCompanyAccount(fullName, username, password, email, nationality, phone, balance);
    }
    
    public void AddBlogAuthorAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone) {
        admin.AddBlogAuthorAccount(fullName, Username, Password, Email, Age, Gender, Nationality, phone);
    }
    
}
