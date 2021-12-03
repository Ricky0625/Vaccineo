
package classes;

import javax.swing.JOptionPane;

public class Citizen extends People {
    private int peopleIC;
    
    public boolean checkFormat(String id){
        if(id.length()==12){
            return true;
        } else {
            return false;
        } 
    }
    
    public void setIC(int id){
        peopleIC = id;
    }
    
    public int getIC(){
        return peopleIC;
    }
}
