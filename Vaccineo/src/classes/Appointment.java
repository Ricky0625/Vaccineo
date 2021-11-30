package classes;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Appointment {

    private String id; // people's id
    private Date appDate;
    private String appTime;
    private String venue;
    private String appStatus; // appointment schedule status
    private String vacName;
    private String dose;
    private String completed; // yes or no
    private String vacSerialNo;
    private String data;
    private ArrayList<ArrayList<String>> appointmentList;

    public Appointment() {
        id = "";
        appDate = null;
        appTime = "";
        venue = "";
        appStatus = "";
        vacName = "";
        dose = "";
        completed = "";
        vacSerialNo = "";
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
    
    public void setPeopleId(String id) {
        this.id = id;
    }
    
    public String getPeopleId() {
        return id;
    }
    
    public void setAppointmentDate(String appDate) throws ParseException {
        Date formattedDate = new SimpleDateFormat("dd/MM/yyyy").parse(appDate);
        this.appDate = formattedDate;
    }
    
    public String getAppointmentDate() {
        Date oriAppDate = appDate;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(oriAppDate);
        return formattedDate;
    }
    
    public Date getAppointmentDateInDate() {
        return appDate;
    }
    
    /*time setter and getter*/
    
    public void setVenue(String venue) {
        this.venue = venue;
    }
    
    public String getVenue() {
        return venue;
    }
       //ic/passport;date;time;centre;status;vaccine;dose;complete;serial_number
    public void setAppointmentStatus(String appStatus) {
        this.appStatus = appStatus;
    }
    
    public String getAppointmentStatus() {
        return appStatus;
    }
    
    public void setVaccine(String vacName) {
        this.vacName = vacName;
    }
    
    public String getVaccine() {
        return vacName;
    }
    
    public void setDose(String dose) {
        this.dose = dose;
    }
    
    public String getDose() {
        return dose;
    }
    
    public void setCompleted(String completed) {
        this.completed = completed;
    }
    
    public String getCompleted() {
        return completed;
    }
    
    public void setVacSerialNo(String vacSN) {
        vacSerialNo = vacSN;
    }
    
    public String getVacSerialNo() {
        return vacSerialNo;
    }

    public String getData() {
        return data;
    }

    public void checkAppointmentExist(String id) {
        GeneralFunction gf = new GeneralFunction();
    }
    
    public boolean checkDose(int doseNum, String id) throws FileNotFoundException, ParseException {
        boolean exist = false;
        generateAppointmentList();
        
        for (int i = 1; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).get(0).equals(id) && appointmentList.get(i).get(6).equals(Integer.toString(doseNum))) {
                exist = true;
                for(int j = 0; j < appointmentList.get(i).size(); j++) {
                    // ic/passport;date;time;centre;status;vaccine;dose;complete;serial_number
                    setPeopleId(appointmentList.get(i).get(0));
                    setAppointmentDate(appointmentList.get(i).get(1));
                    setVenue(appointmentList.get(i).get(3));
                    setAppointmentStatus(appointmentList.get(i).get(4));
                    setVaccine(appointmentList.get(i).get(5));
                    setDose(appointmentList.get(i).get(6));
                    setCompleted(appointmentList.get(i).get(7));
                    setVacSerialNo(appointmentList.get(i).get(8));
                }
            }
        }
        
        return exist;
    }

    /*
    Vaccination Status
    1. appointment count ic/passport == 0 means not yet registered for vaccination
    2. appointment count ic/passport == 1 but dose 1 date == "-" means registered for vaccination
    3. appointment count ic/passport == 1 and got dose 1 date and completed, means done 1st dose
    4. appointment count ic/passport == 1 and got does 1 date and not yet completed, means waiting for 1st dose
    5. appointment count ic/passport == 2 and got dose 2 date and completed, means done 2nd dose
    6. appointment count ic/passport == 2 and got does 2 date and not yet completed, means waiting for 2nd dose
     */
    public void searchAppointment(ArrayList<ArrayList<String>> list, int searchIndex, String condition) {
        int count = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).get(searchIndex).equals(condition)) {
                int doseNo;
                String doseCompleted;
                doseNo = Integer.parseInt(list.get(i).get(6));
                doseCompleted = list.get(i).get(7);
                //System.out.println(doseNo);
                //System.out.println(doseCompleted);
            } else {
                // System.out.println("Not found");
            }
        }

        // return count;
    }

    public void generateAppointmentList() throws FileNotFoundException {
        GeneralFunction gf = new GeneralFunction();
        appointmentList = gf.generate2DArray(data);
    }

    public ArrayList<ArrayList<String>> getAppointmentList() {
        return appointmentList;
    }
    
    public int countNotRegistered() throws FileNotFoundException {
        int total = 0;
        generateAppointmentList();
        for(int i = 1; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).get(6).equals("-")) {
                total++;
            }
        }
        
        return total;
    }
    
    public int countTotalAppointment() throws FileNotFoundException {
        int total = 0;
        generateAppointmentList();
        for(int i = 1; i < appointmentList.size(); i++) {
            if (!"-".equals(appointmentList.get(i).get(6))) {
                total++;
            }
        }
        
        return total;
    }
    
    public int countDoseCompleted(int doseNum) throws FileNotFoundException {
        int total = 0;
        generateAppointmentList();
        for(int i = 1; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).get(6).equals(Integer.toString(doseNum)) && appointmentList.get(i).get(7).equals("Yes")) {
                total++;
            }
        }
        
        return total;
    }
    
    public int countTotalAppointmentByCentre(String centreName) throws FileNotFoundException {
        int total = 0;
        generateAppointmentList();
        
        for (int i = 1; i < appointmentList.size(); i++) {
            if (appointmentList.get(i).get(3).equals(centreName)) {
                total++;
            }
        }
        
        return total;
    }
}
