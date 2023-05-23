package Quersumme;
import java.util.Scanner;
import java.util.Random;

public class task4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl eingeben: ");
        int inputNumber = scanner.nextInt();

        String numberAsString = Integer.toString(inputNumber);
        char[] numberAsArray = numberAsString.toCharArray();

        int sum = 0;

        for (int i = 0; i<numberAsArray.length; i++){
            sum = sum + Character.getNumericValue(numberAsArray[i]);
        }

        int digit = 9;

        while (sum > digit){
            String sumAsString = Integer.toString(sum);
            numberAsArray = sumAsString.toCharArray();

            int cache = 0;

            for (int i = 0; i<numberAsArray.length; i++){
                cache = cache + Character.getNumericValue(numberAsArray[i]);
            }

            sum = cache;
        }

        System.out.println(sum);

    }
}
