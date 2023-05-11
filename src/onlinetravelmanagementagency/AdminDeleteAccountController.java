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
public class AdminDeleteAccountController {

    Admin admin = new Admin();
    
    public void DeleteCustomerAccount(int id) {
        admin.DeleteCustomerAccount(id);
    }
    
    public void DeleteManagerAccount(int id) {
        admin.DeleteManagerAccount(id);
    }
    
    public void DeleteCompanyAccount(int id) {
        admin.DeleteCompanyAccount(id);
    }
    
    public void DeleteBlogAuthorAccount(int id) {
        admin.DeleteBlogAuthorAccount(id);
    }
    
}
