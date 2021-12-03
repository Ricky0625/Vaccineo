/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Personnel {
    private String id;
    private String password;
    
    public boolean personnelLogin(String username, String password) {
        boolean found = false;
        
        try {
            if(username.equals("Admin") && password.equals("OODJ")){
                found = true;
            }
        }
        catch(Exception e){
            System.out.println("An error occurred.");
        }
        return found;
    }

}
