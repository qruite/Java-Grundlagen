package String;
import java.util.Scanner;

public class TicTacToe {

    public static int turn = 1;
    public static boolean keepPlaying = true;
    public static String winner = "";
    public static int inputAsInteger = 0;

    public static void main(String[] args){

        String[][] playGroundArray = new String[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                playGroundArray[i][j] = " ";
            }
        }

        System.out.println("********************");
        System.out.println("Welcome to TicTacToe");
        System.out.println("********************");
        printPlayGround(playGroundArray);
    }

    public static void feelTheField(String[][] field, int choice){


        if(keepPlaying){
            int row = choice / 10;
            int column = choice % 10;

            if(field[row][column] != " "){
                System.out.println("Element already chosen");
                choice = getOnlyNumber(getInput());
            }


            if(turn == 1){
                field[row][column] = "x";
                turn++;
            } else {
                field[row][column] = "o";
                turn--;
            }

            printPlayGround(field);
        } else {
            System.out.println("The winner is: " + winner);
            reset(field);
        }

    }

    public static void reset(String[][] field){
        winner = "";
        keepPlaying = true;
        turn = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = " ";
            }
        }

        printPlayGround(field);

    }

    public static void checkWinner(String[][] field){
        //check if o won
        //rows
        if(field[0][0] == "o" && field[0][1] == "o" && field[0][2] == "o"){winner = "o";};
        if(field[1][0] == "o" && field[1][1] == "o" && field[1][2] == "o"){winner = "o";};
        if(field[2][0] == "o" && field[2][1] == "o" && field[2][2] == "o"){winner = "0";};
        //columns
        if(field[0][0] == "o" && field[1][0] == "o" && field[2][0] == "o"){winner = "o";};
        if(field[0][1] == "o" && field[1][1] == "o" && field[2][1] == "o"){winner = "o";};
        if(field[0][2] == "o" && field[1][2] == "o" && field[2][2] == "o"){winner = "o";};
        //diagonal
        if(field[0][0] == "o" && field[1][1] == "o" && field[2][2] == "o"){winner = "o";};
        if(field[0][2] == "o" && field[1][1] == "o" && field[2][0] == "o"){winner = "o";};

        //check if x won
        //rows
        if(field[0][0] == "x" && field[0][1] == "x" && field[0][2] == "x"){winner = "x";};
        if(field[1][0] == "x" && field[1][1] == "x" && field[1][2] == "x"){winner = "x";};
        if(field[2][0] == "x" && field[2][1] == "x" && field[2][2] == "x"){winner = "x";};
        //columns
        if(field[0][0] == "x" && field[1][0] == "x" && field[2][0] == "x"){winner = "x";};
        if(field[0][1] == "x" && field[1][1] == "x" && field[2][1] == "x"){winner = "x";};
        if(field[0][2] == "x" && field[1][2] == "x" && field[2][2] == "x"){winner = "x";};
        //diagonal
        if(field[0][0] == "x" && field[1][1] == "x" && field[2][2] == "x"){winner = "x";};
        if(field[0][2] == "x" && field[1][1] == "x" && field[2][0] == "x"){winner = "x";};

        if(winner == "x" || winner == "o"){
            keepPlaying = false;
        }
    }


    public static void printPlayGround(String[][] field){

        checkWinner(field);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + field[i][j] + "");
            }
            System.out.println("|");
        }

        if(keepPlaying){
            String inputPlayer = getInput();
            int inputAsInteger = getOnlyNumber(inputPlayer);

            feelTheField(field, inputAsInteger);
        } else {
            feelTheField(field, inputAsInteger);
        }


    }


    public static int getOnlyNumber(String playerInput){

        char[] inputInChar = playerInput.toCharArray();
        StringBuilder onlyNumbersString = new StringBuilder();

        for (char c : inputInChar) {
            if (47 < c && c < 58) {
                int choiceAsInteger = Character.getNumericValue(c);
                onlyNumbersString.append(Integer.toString(choiceAsInteger));
            }
        }
        return Integer.parseInt(onlyNumbersString.toString());

    }


    public static String getInput(){
        System.out.print("Enter your choice player " + turn + ": ");

        Scanner scanner = new Scanner(System.in);
        return scanner.next();

    }

}

