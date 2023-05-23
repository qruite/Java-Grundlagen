package Inheritance.AufgabeRechner;
import java.util.*;
import Inheritance.AufgabeRechner.Objects.*;

public class Main {
    public static void main(String[] args){
        Calculator grundRechner = new Calculator();
        SinCosCalculator sinCosCalculator = new SinCosCalculator();
        RadicalCalculator radicalCalculator = new RadicalCalculator();

        double addition = grundRechner.addieren(14, 16);
        System.out.println("Summe: " + addition);

        double sinus = sinCosCalculator.sinus(45);
        System.out.println("Sinus: " + sinus);

        double wurzel = radicalCalculator.wurzel(4);
        System.out.println("wurzel: " + wurzel);
    }

}
