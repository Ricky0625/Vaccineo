package classes;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Centre {
    private String id;
    private String name;
    private String street;
    private String state;
    private String country;
    private int postcode;
    private String data;
    private ArrayList<ArrayList<String>> centreList;
    
    public Centre() {
        id = "";
        name = "";
        street = "";
        country = "";
        state = "";
        postcode = 0;
        data = "centre.txt";
    }
    
    public void setCentreId(String id) {
        this.id = id;
    }

    public String getCentreId() {
        return id;
    }
    
    public void setCentreName(String name) {
        this.name = name;
    }

    public String getCentreName() {
        return name;
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

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
    
    public String getAddress() {
        return getStreet() + ", " + getState() + ", " + getCountry() + ", " + getPostcode();
    }
    
    public void generateCentreList() throws FileNotFoundException {
        GeneralFunction gf = new GeneralFunction();
        centreList = gf.generate2DArray(data);
    }
    
    public ArrayList<ArrayList<String>> getCentreList() {
        return centreList;
    }
    
    public void searchCentre(String centreName) {
        for (int i = 1; i < centreList.size(); i++) {
            if (centreList.get(i).get(1).equals(centreName)) {
                id = centreList.get(i).get(0);
                name = centreList.get(i).get(1);
                street = centreList.get(i).get(2);
                state = centreList.get(i).get(3);
                postcode = Integer.valueOf(centreList.get(i).get(4));
                country = centreList.get(i).get(5);
            }
        }
    }
    
    public void searchCentreById(String id) {
        for (int i = 1; i < centreList.size(); i++) {
            if (centreList.get(i).get(0).equals(id)) {
                id = centreList.get(i).get(0);
                name = centreList.get(i).get(1);
                street = centreList.get(i).get(2);
                state = centreList.get(i).get(3);
                postcode = Integer.valueOf(centreList.get(i).get(4));
                country = centreList.get(i).get(5);
            }
        }
    }
    
    public String getCentreIdByName(String centreName) {
        String centreId = "";
        for (int i = 1; i< centreList.size(); i++) {
            if (centreList.get(i).get(1).equals(centreName)) {
                centreId = centreList.get(i).get(0);
            }
        }
        return centreId;
    }
    
    public Object[] getAllCentreName() throws FileNotFoundException {
        generateCentreList();
        Object allCentreName[] = new Object[centreList.size() - 1];
        for(int i = 1; i < centreList.size(); i++) {
            allCentreName[i - 1] = centreList.get(i).get(1);
        }
        
        return allCentreName;
    }
}
