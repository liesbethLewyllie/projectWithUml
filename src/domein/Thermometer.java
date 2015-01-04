package domein;

public class Thermometer {

    private double aantalGraden;

    public Thermometer() {

        setAantalGraden(25);
    }

    public void setAantalGraden(double aantalGraden) {
        this.aantalGraden = aantalGraden;
    }

    public double geefTemp(int eenheid) {

        switch (eenheid) {
            case 2:
                return aantalGraden * 1.8 + 32;
            case 3:
                return aantalGraden + 273.15;
            case 1: default:
                return aantalGraden;
        }
    }

}
