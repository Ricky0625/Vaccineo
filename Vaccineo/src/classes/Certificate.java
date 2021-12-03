
package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Certificate {
    private String certId;
    private String certDose1;
    private String certDoes2;
    private String data;
    private String id;
    private String date;
    private String time;
    private String centre;
    private String status;
    private String vaccine;
    private String dose;
    private String complete;
    private String serial_number;
    private ArrayList<ArrayList<String>> certificate;
    
    public Certificate() {
        data = "appointment.txt";
        id = "";
        date = null;
        time = "";
        centre = "";
        status = "";
        vaccine = "";
        dose = "";
        complete = "";
        serial_number = "";
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
    
    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
    
    public void setCentre(String centre) {
        this.centre = centre;
    }

    public String getCentre() {
        return centre;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public String getVaccine() {
        return vaccine;
    }
    
    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getDose() {
        return dose;
    }
    
    public void setComplete(String complete) {
        this.complete = complete;
    }

    public String getComplete() {
        return complete;
    }
    
    public void setSerialNumber(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getSerialNumber() {
        return serial_number;
    }

    public void viewCertificate() throws FileNotFoundException {
        GeneralFunction gf = new GeneralFunction();
        certificate = gf.generate2DArray(data);
    }

    public ArrayList<ArrayList<String>> getCertificate() {
        return certificate;
    }
    
    public void searchCertificate(ArrayList<ArrayList<String>> list, String id) {
        for (int i = 2; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                // System.out.println(list.get(i).get(j));
                // search using id
                String searchId = list.get(i).get(0);
                if (searchId.equals(id)) {
                    setId(list.get(i).get(0));
                    setDate(list.get(i).get(1));
                    setTime(list.get(i).get(2));
                    setCentre(list.get(i).get(3));
                    setStatus(list.get(i).get(4));
                    setVaccine(list.get(i).get(5));
                    setDose(list.get(i).get(6));
                    setComplete(list.get(i).get(7));
                    setSerialNumber(list.get(i).get(8));
                }
            }
        }
    }
    
    public boolean showCertificate(String id, String dose) {
        boolean found = false;
        File file = new File(data);
        
        try {
            Scanner readfile = new Scanner(file);
            
            while(readfile.hasNext()){
                String line = readfile.nextLine();
                String[] values = line.split(";");
                
                if(values[0].equals(id)){
                    if(values[6].equals(dose)){
                        found = true;
                        setId(values[0]);
                        setDate(values[1]);
                        setTime(values[2]);
                        setCentre(values[3]);
                        setStatus(values[4]);
                        setVaccine(values[5]);
                        setDose(values[6]);
                        setComplete(values[7]);
                        setSerialNumber(values[8]);                     
                    } 
                } 
            }
        }
        catch(FileNotFoundException e){
            System.out.println("An error occurred.");
        }
        return found;
    }
    
    public boolean showCertificate1(String id, String doses) {
        boolean found = false;
        File file = new File(data);
        
        try {
            Scanner readfile = new Scanner(file);
            
            while(readfile.hasNext()){
                String line = readfile.nextLine();
                String[] values = line.split(";");
                
                if(values[0].equals(id)){
                    if(values[6].equals(doses)){
                        found = true;
                        setId(values[0]);
                        setDate(values[1]);
                        setTime(values[2]);
                        setCentre(values[3]);
                        setStatus(values[4]);
                        setVaccine(values[5]);
                        setDose(values[6]);
                        setComplete(values[7]);
                        setSerialNumber(values[8]);                     
                    } 
                } 
            }
        }
        catch(FileNotFoundException e){
            System.out.println("An error occurred.");
        }
        return found;
    }
}
