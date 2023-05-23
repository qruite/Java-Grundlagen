package String;
import java.util.Random;
import java.util.Scanner;

public class WordGuessing {
    public static String wordAsString = "";

    public static void main(String[] args){
        String[] wordsToPick = {"laptop", "programm", "strand", "tier", "nase", "erde"};

        wordAsString = pickedWord(wordsToPick);
        String[] playGround = new String[wordAsString.length()];

        printTheField(playGround);
    }

    static String pickedWord (String wordsList[]){
        Random random = new Random();
        int randomNumber = random.nextInt(0, wordsList.length);

        return wordsList[randomNumber];
    }

    static void printTheField(String[] playGround){
        if(checkIfGeussed(playGround)) {
            System.out.println("Gongratulation you guessed the word!");
            reset();
        }else{
            for (int i = 0; i < playGround.length; i++) {
                if(playGround[i] != "-"){
                    System.out.println(playGround[i]);
                } else {
                    playGround[i] = "-";
                    System.out.print(playGround[i]);
                }

            }
            System.out.println(" ");

            String letter = pickeTheLetter();
            findPickedLetter(letter, playGround);
        }
    }
    public static void reset(){
        return;
    }

    public static void findPickedLetter(String g, String[] playGround){
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < g.length(); i++) {
            for (int j = i + 1; j < g.length(); j++) {
                if (g.charAt(i) == g.charAt(j)) {
                    index1 = i;
                    index2 = j;
                }
            }
        }

        playGround[index1 & index2] = g;
        printTheField(playGround);
    }

    public static String pickeTheLetter(){
        Scanner scanner = new Scanner(System.in);
        String pickedLetter = scanner.next();

        return pickedLetter;
    }

    static boolean checkIfGeussed(String[] playGround){
        String geussingWord = "";
        for (int i = 0; i < playGround.length; i++) {
            geussingWord = geussingWord + playGround[i];
        }

        if(geussingWord == wordAsString){
            return true;
        } else{
            return false;
        }
    }
}
