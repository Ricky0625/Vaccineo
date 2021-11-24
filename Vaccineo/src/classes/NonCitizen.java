
package classes;

public class NonCitizen extends People{
    private String peoplePassport;
    
    public void setIC(String pass){
        peoplePassport = pass;
    }
    
    public String getIC(){
        return peoplePassport;
    }
}
