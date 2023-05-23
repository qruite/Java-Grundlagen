package Test;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber1 = random.nextInt(0, 1000);
        int randomNumber2 = random.nextInt(0, 1000);

        if (randomNumber1 > randomNumber2) {
            int c = randomNumber1;
            randomNumber1 = randomNumber2;
            randomNumber2 = c;
        }

        for (int a = randomNumber2; a > randomNumber1; a--) {
            System.out.println(a);
        }
    }
}


