package domein;

public class DomeinController {

    private Thermometer thermometer;
    private int stef;

    public void initialiseerThermometer() {
        setThermometer(new Thermometer());
    }

    public double bepaalTemp(int eenheid) {
        return thermometer.geefTemp(eenheid);
    }

    private void setThermometer(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

}
