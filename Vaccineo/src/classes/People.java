package classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class People {

    private String username;
    private String password;
    private String id;
    private String name;
    private Date dob;
    private String street;
    private String state;
    private String country;
    private String postcode;
    private String address;
    private String gender;
    private String vaccinationStatus;
    private String category;
    private String data;
    private ArrayList<ArrayList<String>> peopleList;

    public People() {
        username = "";
        password = "";
        name = "";
        dob = null;
        street = "";
        state = "";
        country = "";
        postcode = "";
        address = "";
        gender = "";
        category = "";
        vaccinationStatus = "";
        data = "people.txt";
    }

    public People(String id) {
        this.id = id;
    }

    private void registerPeople() {

    }

    private void peopleLogin() {

    }

    private void modifyInfo() {

    }

    private void viewPeopleInfo() {

    }

    public void checkEligible() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDOB(String dob) throws ParseException {
        Date dobDate = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.dob = dobDate;
    }

    public String getDOB() {
        Date dobDate = dob;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDOB = formatter.format(dobDate);
        return formattedDOB;
    }
    
    public Date getDOBinDate(){
        return dob;
    }

    public int getAge() {
        int age = 0;
        Date today = new Date();
        Date birthDate = dob;

        long diff = today.getTime() - birthDate.getTime();
        int diffYears = (int) (diff / (1000l * 60 * 60 * 24 * 365));

        return diffYears;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getAddress() {
        return getStreet() + ", " + getState() + ", " + getCountry() + ", " + getPostcode();
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    /*
     * Vaccination Status 1. appointment count ic/passport == 0 means not yet
     * registered for vaccination 2. appointment count ic/passport == 1 but dose 1
     * date == "-" means registered for vaccination 3. appointment count ic/passport
     * == 1 and got dose 1 date and completed, means done 1st dose 4. appointment
     * count ic/passport == 1 and got does 1 date and not yet completed, means
     * waiting for 1st dose 5. appointment count ic/passport == 2 and got dose 2
     * date and completed, means done 2nd dose 6. appointment count ic/passport == 2
     * and got does 2 date and not yet completed, means waiting for 2nd dose
     */

    public void setVaccinationStatus(String vacStatus) {
        vaccinationStatus = vacStatus;
    }

    public String getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void generatePeopleList() throws FileNotFoundException {
        GeneralFunction gf = new GeneralFunction();
        peopleList = gf.generate2DArray(data);
    }

    public ArrayList<ArrayList<String>> getPeopleList() {
        return peopleList;
    }

    public void searchUser(ArrayList<ArrayList<String>> list, String id) {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                // System.out.println(list.get(i).get(j));
                // search using id
                String searchId = list.get(i).get(2);
                if (searchId.equals(id)) {
                    setId(list.get(i).get(2));
                    setName(list.get(i).get(3));
                    try {
                        setDOB(list.get(i).get(4));
                    } catch (ParseException ex) {
                        Logger.getLogger(People.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    setStreet(list.get(i).get(5));
                    setState(list.get(i).get(6));
                    setCountry(list.get(i).get(7));
                    setPostcode(list.get(i).get(8));
                    setGender(list.get(i).get(9));
                    setCategory(list.get(i).get(10));
                    setVaccinationStatus(list.get(i).get(11));
                }
            }
        }
    }
    
    public boolean searchUserById(ArrayList<ArrayList<String>> list, String id) {
        boolean exist = false;
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).get(2).equals(id)) {
                exist = true;
            }
        }
        return exist;
    }
    
    public int countNotRegistered() throws FileNotFoundException {
        int total = 0;
        generatePeopleList();
        for (int i = 1; i < peopleList.size(); i++) {
            if (peopleList.get(i).get(11).equals("Not Registered")) {
                total++;
            }
        }

        return total;
    }
    
    public void writeIntoPeopleFile(ArrayList<ArrayList<String>> list) throws IOException {
        GeneralFunction gf = new GeneralFunction();
        gf.writeIntoFile(list, data);
    }
    
    public int getRecordIndex(String peopleId) throws FileNotFoundException {
        generatePeopleList();
        
        int targetIndex = -1;
        for(int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i).get(2).equals(peopleId)){
                targetIndex = i;
            }
        }
        return targetIndex;
    }
}
