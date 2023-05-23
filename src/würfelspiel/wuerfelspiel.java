package würfelspiel;
import java.util.Scanner;
import java.util.Random;

public class wuerfelspiel {

    public static int sumPlayer = 0;
    public static int sumOpponent = 0;

    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        System.out.println("----------------------------------------------");
        System.out.println("Wuerfelspiel!");
        System.out.println("----------------------------------------------");
        System.out.println("1. Start");
        System.out.println("2. End");
        System.out.println("3. Rules");
        System.out.println("----------------------------------------------");
        System.out.println("Please select:");

        int number = 0;
        int value = inputValue(number);

        switch (value) {
            case 1:
                start();
                break;
            case 2:
                end();
                break;
            case 3:
                rules();
                break;
        }
    }

    public static void start () {
        System.out.println("");
        System.out.println("You got 6 dice, the winner will be decided at the end");
        System.out.println("----------------------------------------------");
        System.out.println("1. Throw dice");
        System.out.println("2. Finish game");
        System.out.println("----------------------------------------------");
        System.out.println("Please select:");

        int number = 0;
        int value = inputValue(number);

        switch (value){
            case 1:
                throwDicePlayer();
                break;

            case 2:
                end();
                break;
        }
    }

    public static void throwDicePlayer(){
        for (int i = 0; i < 5; i++) {
            int generatedNumberPlayer = 0;
            int generatedNumberOpponent = 0;
            int remaining = 5;
            int c = remaining - i;

            generatedNumberPlayer = generateNumberPlayer(generatedNumberPlayer);
            generatedNumberOpponent = generateNumberOpponent(generatedNumberOpponent);

            System.out.println("");
            System.out.println("----------------------------------------------");
            System.out.println("dice remaining: " + c);
            System.out.println("----------------------------------------------");
            System.out.println("You got: " + generatedNumberPlayer);
            System.out.println("Your opponent got: " + generatedNumberOpponent);
            System.out.println("----------------------------------------------");
            System.out.println("1. Throw again");
            System.out.println("2. Finish");
            System.out.println("----------------------------------------------");
            System.out.println("Please select:");

            sumPlayer += generatedNumberPlayer;
            sumOpponent += generatedNumberOpponent;

            int number = 0;
            int value = inputValue(number);

            if(value == 2){
                menu();
            }
        }

        if(sumPlayer > sumOpponent){
            System.out.println("");
            System.out.println("Congratulaion you won!");
            System.out.println("----------------------------------------------");
            System.out.println("Your final result: " + sumPlayer);
            System.out.println("Opponents final result: " + sumOpponent);
        } else {
            System.out.println("");
            System.out.println("Unlucky, your opponent won, try again next time!");
            System.out.println("----------------------------------------------");
            System.out.println("Your final result: " + sumPlayer);
            System.out.println("Opponents final result: " + sumOpponent);
            System.out.println("----------------------------------------------");
        }

        System.out.println("----------------------------------------------");
        System.out.println("1. Try again");
        System.out.println("2. Finish");
        System.out.println("----------------------------------------------");
        System.out.println("Please select: ");

        int number = 0;
        int value = inputValue(number);

        switch (value) {
            case 1:
                start();
                break;

            case 2:
                menu();
                break;
        }
    }

    public static int generateNumberOpponent(int randomNumber){
        Random random = new Random();
        randomNumber = random.nextInt(1,6);
        return randomNumber;
    }

    public static int generateNumberPlayer(int randomNumber){
        Random random = new Random();
        randomNumber = random.nextInt(1,6);
        return randomNumber;
    }

    public static void end() {
        System.out.println("");
        System.out.println("Goodby my ..... back to the lobby");
        System.out.println("");
        menu();
    }

    public static void rules(){
        System.out.println("");
        System.out.println("----------------------------------------------");
        System.out.println("Rules");
        System.out.println("----------------------------------------------");
        System.out.println("There are no rules!");
        System.out.println("");

        menu();
    }

    public static int inputValue(int option){
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
        return option;
    }

}
