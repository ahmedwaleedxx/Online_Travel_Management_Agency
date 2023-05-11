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
public class AdminUpdateAccountController {

    private static final Admin admin = new Admin();
    
    public static void UpdateCustomerAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone, float balance) {
        admin.UpdateCustomerAccount(fullName, Username, Password, Email, Age, Gender, Nationality, phone, balance);
    }
    
    public static void UpdateManagerAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone) {
        admin.UpdateManagerAccount(fullName, Username, Password, Email, Age, Gender, Nationality, phone);
    }
    
    public static void UpdateCompanyAccount(String fullName, String username, String password, String email, String nationality, int phone, float balance) {
        admin.UpdateCompanyAccount(fullName, username, password, email, nationality, phone, balance);
    }
    
    public static void UpdateBlogAuthorAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone) {
        admin.UpdateBlogAuthorAccount(fullName, Username, Password, Email, Age, Gender, Nationality, phone);
    }
    
}
