package classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
    private String value;
    private String oldaddress;
    private ArrayList<ArrayList<String>> peopleList;

    public People() {
        username = "";
        password = "";
        id = "";
        name = "";
        dob = null;
        street = "-";
        state = "-";
        country = "";
        postcode = "-";
        address = "-";
        gender = "";
        category = "";
        vaccinationStatus = "";
        oldaddress = "-";
        data = "people.txt";
    }

    public People(String id) {
        this.id = id;
    }

    public boolean validatePass(String password) {
        if (password.length() > 7) {
            if (checkPass(password)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean checkPass(String password) {
        boolean hasNum = false;
        boolean hasCap = false;
        boolean hasLow = false;
        char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasNum = true;
            } else if (Character.isUpperCase(c)) {
                hasCap = true;
            } else if (Character.isLowerCase(c)) {
                hasLow = true;
            }
            if (hasNum && hasCap && hasLow) {
                return true;
            }
        }
        return false;
    }

    private static Scanner x;

    public void registerPeople(String username, String name, String id, String address, String state, String country,
            String postcode,
            String password, String gender, String category, String dob) {
        boolean found = false;

        try {
            x = new Scanner(new File(data));
            x.useDelimiter("[;]");

            while (x.hasNext() && !found) {
                String icpass = x.next();

                if (id.equals(icpass)) {
                    found = true;
                }
            }
            if (found) {
                JOptionPane.showMessageDialog(null, "Existing IC numbers");
            } else {
              if(username.equals("Admin") || username.equals("admin")){
                  JOptionPane.showMessageDialog(null, "Unable to use this Username, please change your Username.");
              } else {
                    try {
                        String vaccinestatus = "Not Registered";
                        BufferedWriter bw = new BufferedWriter(new FileWriter(data, true));
                        PrintWriter pw = new PrintWriter(bw);
                        pw.println("" + username + ";" + password + ";" + id + ";" + name + ";" + dob + ";" + address + ";"
                                + state + ";" + country + ";" + postcode + ";" + gender + ";" + category + ";"
                                + vaccinestatus);
                        pw.flush();
                        pw.close();
                        bw.close();
                        JOptionPane.showMessageDialog(null, "Account Registered Successfully");
                    } catch (IOException e) {
                        System.out.println("Fail to register your account");
                    }
              }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    private static Scanner y;

    public void registerPeopleNon(String username, String name, String id, String address,
            String password, String gender, String category, String dob) {
        boolean found = false;

        try {
            y = new Scanner(new File(data));
            y.useDelimiter("[;]");

            while (y.hasNext() && !found) {
                String icpass = y.next();

                if (id.equals(icpass)) {
                    found = true;
                }
            }
            if (found) {
                JOptionPane.showMessageDialog(null, "Existing IC numbers");
            } else {
                if(username.equals("Admin") || username.equals("admin")){
                  JOptionPane.showMessageDialog(null, "Unable to use this Username, please change your Username.");
                } else {
                    try {
                        String vaccinestatus = "Not Registered";
                        BufferedWriter bw = new BufferedWriter(new FileWriter(data, true));
                        PrintWriter pw = new PrintWriter(bw);
                        pw.println("" + username + ";" + password + ";" + id + ";" + name + ";" + dob + ";" + oldaddress
                                + ";" + state + ";" + address + ";" + postcode + ";" + gender + ";" + category + ";"
                                + vaccinestatus);
                        pw.flush();
                        pw.close();
                        bw.close();
                        JOptionPane.showMessageDialog(null, "Account Registered Successfully");
                    } catch (IOException e) {
                        System.out.println("Fail to register your account");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public boolean peopleLogin(String username, String password) {
        boolean found = false;
        File file = new File(data);

        try {
            Scanner readfile = new Scanner(file);

            while (readfile.hasNext()) {
                String line = readfile.nextLine();
                String[] values = line.split(";");

                if (values[0].equals(username)) {
                    if (values[1].equals(password)) {
                        found = true;
                        String id = values[2];
                        setId(id);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return found;
    }

    public void modifyInfo(String value, String username, String address, String state, String country,
            String postcode) {
        boolean found = false;
        ArrayList<String> tempArray = new ArrayList<>();
        try {
            try (FileReader fr = new FileReader(data)) {
                Scanner reader = new Scanner(fr);
                String line;
                String[] lineArr;
                while ((line = reader.nextLine()) != null) {
                    lineArr = line.split(";");

                    if (lineArr[2].equals(value)) {
                        found = true;
                        tempArray.add(
                                username + ";"
                                        + lineArr[1] + ";"
                                        + lineArr[2] + ";"
                                        + lineArr[3] + ";"
                                        + lineArr[4] + ";"
                                        + address + ";"
                                        + state + ";"
                                        + country + ";"
                                        + postcode + ";"
                                        + lineArr[9] + ";"
                                        + lineArr[10] + ";"
                                        + lineArr[11]);
                        JOptionPane.showMessageDialog(null, "Edit Profile Successfully");

                    } else {
                        tempArray.add(line);
                    }
                }
                fr.close();
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }
        try {
            try (PrintWriter pr = new PrintWriter("people.txt")) {
                for (String str : tempArray) {
                    pr.println(str);
                }
                pr.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void viewPeopleInfo(String value) {
    }

    public void peopleDeclaration(String name, String id, String q1, String q2, String q3, String q4,
            String q5, String q6, String q7, String q8) {

        String declafile = "declaration.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(declafile, true));
            PrintWriter pw = new PrintWriter(bw);
            pw.println("" + id + ";" + name + ";" + q1 + ";" + q2 + ";" + q3 + ";" + q4 + ";" + q5 + ";" + q6 + ";" + q7
                    + ";" + q8);
            pw.flush();
            pw.close();
            bw.close();
            JOptionPane.showMessageDialog(null, "Vaccine Register Successfully");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public void updateNewStatus(String id, String newVacStatus) {
        boolean found = false;
        ArrayList<String> tempArray = new ArrayList<>();
        try {
            try (FileReader fr = new FileReader(data)) {
                Scanner reader = new Scanner(fr);
                String line;
                String[] lineArr;
                while ((line = reader.nextLine()) != null) {
                    lineArr = line.split(";");

                    if (lineArr[2].equals(id)) {
                        found = true;
                        tempArray.add(
                                lineArr[0] + ";"
                                        + lineArr[1] + ";"
                                        + lineArr[2] + ";"
                                        + lineArr[3] + ";"
                                        + lineArr[4] + ";"
                                        + lineArr[5] + ";"
                                        + lineArr[6] + ";"
                                        + lineArr[7] + ";"
                                        + lineArr[8] + ";"
                                        + lineArr[9] + ";"
                                        + lineArr[10] + ";"
                                        + newVacStatus);
                        System.out.println("Status Update Successfully");
                    } else {
                        tempArray.add(line);
                    }
                }
                fr.close();
            } catch (Exception e) {

            }
        } catch (Exception e) {

        }
        try {
            try (PrintWriter pr = new PrintWriter("people.txt")) {
                for (String str : tempArray) {
                    pr.println(str);
                }
                pr.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
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

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.name = password;
    }

    public String getPassword() {
        return password;
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

    public Date getDOBinDate() {
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
                    setUsername(list.get(i).get(0));
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
            if (list.get(i).get(2).equals(id)) {
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
        for (int i = 0; i < peopleList.size(); i++) {
            if (peopleList.get(i).get(2).equals(peopleId)) {
                targetIndex = i;
            }
        }
        return targetIndex;
    }
}
