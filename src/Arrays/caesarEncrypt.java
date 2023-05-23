package Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class caesarEncrypt {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("geben Sie text ein den sie verschlüsseln möchten");
        String textInput = scanner.next();

        System.out.println("um wie viele stellen soll verschoben werden?");
        int shiftKey = scanner.nextInt();

        char string[] = textInput.toCharArray();

        for(int i = 0; i<string.length; i++){
            char letter = string[i];
            letter += shiftKey;
            string[i] = letter;

        }
        System.out.println(string);

    }
}

