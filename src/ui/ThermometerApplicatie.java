package ui;

import domein.DomeinController;

public class ThermometerApplicatie {

    private DomeinController dc = new DomeinController();

    public static void main(String[] args) {
        new ThermometerApplicatie().run();
    }

    public void run() {

        dc.initialiseerThermometer();

        System.out.printf("De huidige temperatuur: %.2f graden Celcius%n", dc.bepaalTemp(1));
        System.out.printf("De huidige temperatuur: %.2f graden Fahrenheit%n", dc.bepaalTemp(2));
        System.out.printf("De huidige temperatuur: %.2f Kelvin%n", dc.bepaalTemp(3));

        System.out.println("Test Liesbeth na wijziging Sonia");
        System.out.println("Test Liesbeth");
        System.out.println("Test Liesbeth2");

        System.out.println("Test Liesbeth3test");
        System.out.println("Test Liesbeth4");
        System.out.println("Test Liesbeth5");
        System.out.println("Test Liesbeth6");
        System.out.println("Test Liesbeth7");

    }
    public void test(){
        String test = null;
        test = new String();
    }
}
