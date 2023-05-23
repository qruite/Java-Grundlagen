package Test;

import java.util.Random;

public class aufgabe2 {

    public static void main (String[] args) {
        Random random = new Random();
        int randomNumber1 = random.nextInt(0, 10);

        int c = 0;

        while (randomNumber1 != 5) {

            c += randomNumber1;
            System.out.println(c);
            randomNumber1 = random.nextInt(0, 10);
        }

    }

}

