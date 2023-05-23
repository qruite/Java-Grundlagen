package Loops;

public class Aufgabe_2 {
    public static void main(String[] args) {

        //Zähle die geraden Ziffern zwischen 1 und 1000 zusammen - Tip: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2

        int a = 0;
        for (int i = 2; i < 1000; i += 2) {
            a += i;
            System.out.println(a);
        }
    }
}
