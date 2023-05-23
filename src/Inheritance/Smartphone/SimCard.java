package Inheritance.Smartphone;
import java.util.Scanner;

public class SimCard {
    private int id;
    private String phoneNumber;

    public SimCard(int id, String phoneNumber){
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public void doCall(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type in number that you want to call?");
        String number = input.next();
        System.out.println("This number is getting call : " + number);
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
