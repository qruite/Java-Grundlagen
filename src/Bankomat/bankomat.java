package Bankomat;
import java.io.Console;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class bankomat {

    public static int balance = 0;

    public static void main(String[] args) {
        startPage();
    }

    public static void startPage(){
        System.out.println("Selektieren Sie die gewünschte Funktion");
        System.out.println("      " + "1." + "Einzahlen");
        System.out.println("      " + "2." + "Abheben");
        System.out.println("      " + "3." + "Kontostand");
        System.out.println("      " + "4." + "Ende");
        System.out.println("");


        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        while(selection > 4) {
            System.out.println("");
            System.out.println("Wählen Sie eine Zahl zwischen 1 und 4 aus!");
            System.out.println("");

            selection = scanner.nextInt();
        }

        switch (selection) {
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                bankBalance();
                break;
            case 4:
                end();
                break;
        }
    }

    public static void bankBalance(){
        System.out.println("");
        System.out.println(balance);

        delayForStartPage();
    }

    public static void deposit(){
        System.out.println("");
        System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten:");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        float deposit = scanner.nextFloat();

        balance += deposit;

        delayForStartPage();
    }

    public static void withdraw(){
        System.out.println("");
        System.out.println("Geben Sie den Betrag ein den Sie abheben möchten:");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        float withdraw = scanner.nextFloat();

        balance -= withdraw;

        delayForStartPage();
    }

    public static void end(){
        System.out.println("");
        System.out.println("Aufwiedersehen!");
        System.out.println("");

        try
        {
            Thread.sleep( 2000 );
        }
        catch ( InterruptedException e )
        {
            e.printStackTrace();
        }

        delayForStartPage();
    }

    public static void delayForStartPage(){
        try
        {
            Thread.sleep( 500 );
            System.out.println("");
            startPage();
        }
        catch ( InterruptedException e )
        {
            e.printStackTrace();
        }
    }

}


