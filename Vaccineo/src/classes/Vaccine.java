/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class Vaccine {

    private String id;
    protected String batchId;
    public String name;
    public String manufacturer;
    private Date manuDate;
    private Date expiryDate;
    private int batchSize;
    private double size;
    private int dose;
    private int expiryDuration;
    private final String remainingData;
    private final String vaccineData;
    ArrayList<ArrayList<String>> vaccineRemainingList;
    ArrayList<ArrayList<String>> vaccineList;

    public Vaccine() {
        id = "";
        batchId = "";
        name = "";
        manufacturer = "";
        manuDate = null;
        expiryDate = null;
        batchSize = 0;
        size = 0;
        dose = 0;
        remainingData = "vaccine_quantity.txt";
        vaccineData = "vaccine.txt";
    }

    public void setVacId(String id) {
        this.id = id;
    }

    public String getVacId() {
        return id;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setVacName(String vacName) {
        name = vacName;
    }

    public String getVacName() {
        return name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setBatchSize(int size) {
        this.batchSize = size;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setDoseNeeded(int dose) {
        this.dose = dose;
    }

    public int getDoseNeeded() {
        return dose;
    }

    public void setDuration(int duration) {
        expiryDuration = duration;
    }

    public int getDuration() {
        return expiryDuration;
    }

    public void generateRemainingVaccineList() throws FileNotFoundException {
        GeneralFunction gf = new GeneralFunction();
        vaccineRemainingList = gf.generate2DArray(remainingData);
    }

    public ArrayList<ArrayList<String>> getRemainingVaccineList() {
        return vaccineRemainingList;
    }

    public void generateVaccineList() throws FileNotFoundException {
        GeneralFunction gf = new GeneralFunction();
        vaccineList = gf.generate2DArray(vaccineData);
    }

    public ArrayList<ArrayList<String>> getVaccineList() {
        return vaccineList;
    }

    public String generateCode() {
        String saltchars = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rdm = new Random();
        while (salt.length() < 8) {
            int index = (int) (rdm.nextFloat() * saltchars.length());
            salt.append(saltchars.charAt(index));

        }
        String saltStr = salt.toString();
        
        return saltStr;
    }

    public int countTotalVaccineRemainingByCentre(String centreId) throws FileNotFoundException {
        int total = 0;
        generateRemainingVaccineList();

        for (int i = 1; i < vaccineRemainingList.size(); i++) {
            if (vaccineRemainingList.get(i).get(3).equals(centreId)) {
                total++;
            }
        }

        return total;
    }
    
    public void searchVaccineById(ArrayList<ArrayList<String>> list, String vacId) {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                // Id;Vaccine Name;Manufacturer;Batch Quantity;Size;Dose Needed;Expiry Duration
                // search using vac name
                String searchId = list.get(i).get(0);
                if (searchId.equals(vacId)) {
                    setVacId(list.get(i).get(0));
                    setVacName(list.get(i).get(1));
                    setManufacturer(list.get(i).get(2));
                    setBatchSize(Integer.valueOf(list.get(i).get(3)));
                    setSize(Double.valueOf(list.get(i).get(4)));
                    setDoseNeeded(Integer.valueOf(list.get(i).get(5)));
                    setDuration(Integer.valueOf(list.get(i).get(6)));
                }
            }
        }
    }

    public void searchVaccineByName(ArrayList<ArrayList<String>> list, String vacName) {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                // Id;Vaccine Name;Manufacturer;Batch Quantity;Size;Dose Needed;Expiry Duration
                // search using vac name
                String searchId = list.get(i).get(1);
                if (searchId.equals(vacName)) {
                    setVacId(list.get(i).get(0));
                    setVacName(list.get(i).get(1));
                    setManufacturer(list.get(i).get(2));
                    setBatchSize(Integer.valueOf(list.get(i).get(3)));
                    setSize(Double.valueOf(list.get(i).get(4)));
                    setDoseNeeded(Integer.valueOf(list.get(i).get(5)));
                    setDuration(Integer.valueOf(list.get(i).get(6)));
                }
            }
        }
    }
    
    public Object[] getAllVaccineName() throws FileNotFoundException {
        generateVaccineList();
        Object allCentreName[] = new Object[vaccineList.size() - 1];
        for(int i = 1; i < vaccineList.size(); i++) {
            allCentreName[i - 1] = vaccineList.get(i).get(1);
        }
        
        return allCentreName;
    }
    
    public void writeIntoVaccineFile(ArrayList<ArrayList<String>> list) throws IOException {
        GeneralFunction gf = new GeneralFunction();
        gf.writeIntoFile(list, vaccineData);
    }
    
    public void writeIntoVaccineQuanFile(ArrayList<ArrayList<String>> list) throws IOException {
        GeneralFunction gf = new GeneralFunction();
        gf.writeIntoFile(list, remainingData);
    }
}
