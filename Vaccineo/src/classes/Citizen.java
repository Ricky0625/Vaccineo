
package classes;

public class Citizen extends People {
    private int peopleIC;
    
    public void setIC(int ic){
        peopleIC = ic;
    }
    
    public int getIC(){
        return peopleIC;
    }
}
