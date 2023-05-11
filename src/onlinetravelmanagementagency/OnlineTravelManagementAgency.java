/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinetravelmanagementagency;

import GUIs.ChooseUser;
import GUIs.SplashScreen;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author ahmed
 */
public class OnlineTravelManagementAgency {

    /**
     * @param args the command line arguments
     */
    static void welcome() {
        // this is to lunch the gui by the splash :-
        SplashScreen welcome = new SplashScreen();
        welcome.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                welcome.percentagelbl.setText(i + " %");
                welcome.progressbar.setValue(i);
                if (i >= 0 && i <= 40) {
                    welcome.loadinglbl.setText("LOADING.....");
                }
                if (i > 40 && i <= 90) {
                    welcome.loadinglbl.setText("CONNECTING...");
                }
                if (i > 90 && i < 100) {
                    welcome.loadinglbl.setText("HI !!!");
                }
                if (i == 100) {
                    String[] okbutton = {"LOGIN", "SIGNUP", "CANCEL"};
                    ImageIcon icon = new ImageIcon("src/Images/smileresized.png");
                    int choice = JOptionPane.showOptionDialog(null, "                      WELCOME TO \n ONLINE TRAVEL MANAGEMENT AGENCY", "Welcome", JOptionPane.OK_OPTION, JOptionPane.YES_NO_CANCEL_OPTION, icon, okbutton, 0);
                    if (choice == 0) {
                        new ChooseUser().setVisible(true);
                    } else if (choice == 1) {
                        
                        //new SignUp().setVisible(true);
                        
                    } else if (choice == 2) {
                        System.exit(0);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        welcome.dispose();
    }
    public static void main(String[] args) {
        
        welcome();
        int i, age;
        String name, username, password, mail, national, sex;
Admin p1;
        p1 = new Admin(2, "ahmedwaleed", "wello", "Ahmed1234", "ahmed@gmail.com", "Egyptian",  20 , "Male");
        
        
        

    }
    
}
