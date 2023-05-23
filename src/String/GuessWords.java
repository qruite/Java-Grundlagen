package String;
import java.util.Random;
import java.util.Scanner;

public class GuessWords {

    public static void main(String[] args){
        Random random = new Random();


        String[] words = {"pizza", "rraum", "haare", "diskussion", "campning"};

        int randomNumber = random.nextInt(0,5);
        String wordToGuess = words[randomNumber];
        String[] playGround = new String[wordToGuess.length()];

        emptyTheField(playGround);
        checkTheGuess(playGround, wordToGuess);



    }

    static void emptyTheField(String[] playGround){
        for (int i = 0; i < playGround.length; i++) {
            playGround[i] = "-";
            System.out.print(playGround[i]);
        }
    }

    static String getUserInput(){

        System.out.println("Guess a letter: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        return userInput;
    }

    static void checkTheGuess(String[] playGround, String wordToGuess){
        int posOfInput = wordToGuess.indexOf(getUserInput());

        if (posOfInput > 0){
            playGround[posOfInput - 1] = getUserInput();
        } else {
            System.out.println("wrong guess, try another one");
            getUserInput();
            checkTheGuess(playGround, wordToGuess);
        }
    }

}
