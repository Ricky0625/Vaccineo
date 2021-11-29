package classes;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Appointment {

    private String id; // people's id
    private Date appDate;
    private String appTime;
    private String venue;
    private String appStatus; // appointment schedule status
    private String vacName;
    private int dose;
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
        dose = 0;
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

    private void searchAppointment() {

    }

    private void showEligibleVaccine() {

    }

    public String getData() {
        return data;
    }

    public void checkAppointmentExist(String id) {
        GeneralFunction gf = new GeneralFunction();
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
}
