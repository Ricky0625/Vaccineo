package classes;

import java.io.FileNotFoundException;

public class UM extends Centre {

    public UM() {
        super();
        super.setCentreName("Universiti Malaya");
    }

    public void fetchCentreInfo() throws FileNotFoundException {
        super.generateCentreList();
        super.searchCentre(super.getCentreName());
    }
}
