package classes;

import java.io.FileNotFoundException;

public class KLCC extends Centre {

    public KLCC() {
        super();
        super.setCentreName("Kuala Lumpur Convention Centre");
    }

    public void fetchCentreInfo() throws FileNotFoundException {
        super.generateCentreList();
        super.searchCentre(super.getCentreName());
    }
}
