package Inheritance.AufgabeRechner.Objects;

public class SinCosCalculator extends Calculator{

    public double sinus(double winkel){
        return Math.sin(Math.toRadians(winkel));
    }

    public double cosinus(double winkel){
        return Math.cos(Math.toRadians(winkel));
    }

    public double tangens(double winkel){
        return Math.tan(Math.toRadians(winkel));
    }


}
