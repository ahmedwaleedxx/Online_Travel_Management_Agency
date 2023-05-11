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
public class Admin extends Person {

    private Complaint complaint;
    
    
    //Constructor 
    public Admin(int ID, String FullName, String username, String password, String email, String nationality, int age, String gender) {
        super(ID, FullName, username, password, email, nationality, age, gender);

    }

    public Admin() {
    }

    //Add Account Methods
    public void AddAdminAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality) {
    
    }

    public void AddCustomerAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone, float balance) {

    }

    public void AddManagerAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone) {

    }

    public void AddCompanyAccount(String fullName, String username, String password, String email, String nationality, int phone, float balance) {

    }

    public void AddBlogAuthorAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone) {

    }

    //Update Account Methods
    public void UpdateCustomerAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone, float balance) {

    }

    public void UpdateManagerAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone) {

    }

    public void UpdateCompanyAccount(String fullName, String username, String password, String email, String nationality, int phone, float balance) {

    }

    public void UpdateBlogAuthorAccount(String fullName, String Username, String Password, String Email, int Age, String Gender, String Nationality, int phone) {

    }

    //Delete Account Methods
    public void DeleteCustomerAccount(int id) {

    }

    public void DeleteManagerAccount(int id) {

    }

    public void DeleteCompanyAccount(int id) {

    }

    public void DeleteBlogAuthorAccount(int id) {

    }
    
    //View Complaint Method
    public void ViewComplaints(){
        
    }
    //Reply A Complaint Method
    public void ReplyComplaint(){
        
    }
    
   

}
