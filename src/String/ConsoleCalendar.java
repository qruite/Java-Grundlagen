package String;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ConsoleCalendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] monthDefinition = {"Januar","Februar","März","April","Mai","Juni","Juli","August","September","Oktober","November","December"};
        System.out.print("Jahr eingeben: ");
        int selectedYear = scanner.nextInt();

        System.out.print("Monat eingeben: ");
        int selectedMonth = scanner.nextInt() - 1;

        GregorianCalendar gCal = new GregorianCalendar(selectedYear, selectedMonth, 1);
        int days = gCal.getActualMaximum(Calendar.DATE);
        int startInWeek = gCal.get(Calendar.DAY_OF_WEEK);
        int totalWeeks = gCal.getActualMaximum(Calendar.WEEK_OF_MONTH);

        gCal = new GregorianCalendar(selectedYear, selectedMonth, days);

        int count = 1;

        System.out.println();
        System.out.println("Monat:" + monthDefinition[selectedMonth] + " " +  "Jahr:" + selectedYear);
        System.out.println();
        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");

        for (int i = 1; i <= totalWeeks; i++){
            for (int j = 1; j<= 7; j++){

                if (count < startInWeek - 1 || (count - startInWeek + 2) > 31 ){
                    System.out.print("| --");
                    System.out.print(" ");
                } else {
                    if((count - startInWeek + 2) < 10){
                        System.out.print("| " + 0 + "" + (count - startInWeek + 2 ));
                        System.out.print(" ");

                    } else {
                        System.out.print("| " + (count - startInWeek + 2 ));
                        System.out.print(" ");
                    }
                }
                count++;
            }
            System.out.println("|");
        }
    }
}
