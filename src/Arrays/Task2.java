package Arrays;

import java.util.Random;

public class Task2 {

        public static void main(String[] args){

            int[] numbers = new int[50];
            int sum = 0;

            for (int i = 0; i < 50; i++){

                Random random = new Random();
                int randomNumber = random.nextInt(0,100);

                numbers[i] = randomNumber;
                System.out.println(i + ". Zahl: " + numbers[i]);
                sum += numbers[i];

            }

            System.out.println("Die Summe: " + sum);

        }
}
