
package classes;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Appointment {
    private Date appDate;
    private String appTime;
    private String venue;
    private String location;
    private String data;
    private ArrayList<ArrayList<String>> appointmentList;
    
    public Appointment() {
        appDate = null;
        appTime = null;
        venue = null;
        location = null;
        data = "appointment.txt";
    }
    
    public void registerForVaccination() {
        
    }
    
    private void acceptAppointment() {
        
    }
    
    private void editAppointment() {
        
    }
    
    private void showAllAppointment() {
        
    }
    
    private void cancelAppointment() {
        
    }
    
    private void searchAppointment() {
        
    }
    
    private void showEligibleVaccine() {
        
    }
    
    public String getData() {
        return data;
    }
    
    public void generateAppointmentList() throws FileNotFoundException {
        GeneralFunction gf = new GeneralFunction();
        appointmentList = gf.generate2DArray(data);
    }
    
    public ArrayList<ArrayList<String>> getAppointmentList() {
        return appointmentList;
    }
}
