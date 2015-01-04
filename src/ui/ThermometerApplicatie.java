package ui;

import domein.DomeinController;

public class ThermometerApplicatie {
 
    public static void main(String[] args){
        
        DomeinController dc = new DomeinController();

        dc.initialiseerThermometer();
        
        System.out.printf("De huidige temperatuur: %.2f graden Celcius%n", dc.bepaalTemp(1));
        System.out.printf("De huidige temperatuur: %.2f graden Fahrenheit%n", dc.bepaalTemp(2));
        System.out.printf("De huidige temperatuur: %.2f Kelvin%n", dc.bepaalTemp(3));
        
    }
}
