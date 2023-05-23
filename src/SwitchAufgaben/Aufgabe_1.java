package SwitchAufgaben;

import java.util.Random;

public class Aufgabe_1 {
    public static void main(String[] args) {

        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNumber = random.nextInt(5,10);
        System.out.println(randomNumber);

        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.
        switch (randomNumber) {
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 1:
                System.out.println("One");
                break;
            case 0:
                System.out.println("Zero");
                break;
        }
        //test1


    }
}
