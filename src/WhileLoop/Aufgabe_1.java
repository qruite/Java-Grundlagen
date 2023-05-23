package WhileLoop;

import java.util.Random;

public class Aufgabe_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt (10, 30);
        int a = 0;

        while ((randomNumber != 15) && (randomNumber !=25)) {
            randomNumber = random.nextInt (10, 30);
            a += randomNumber;
            System.out.println(a);
        }

    }
}
