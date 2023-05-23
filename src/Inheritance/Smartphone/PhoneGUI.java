package Inheritance.Smartphone;
import java.util.Scanner;

public class PhoneGUI {
    private Phone phone;

    public PhoneGUI(Phone phone){
        this.phone = phone;
    }

    public void run(){

        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose one:");
            System.out.println("----------------------------");
            System.out.println("1. Take picture");
            System.out.println("2. Make call");
            System.out.println("3. Get all files");
            System.out.println("4. Get free space");
            System.out.println("----------------------------");

            int userPick = scanner.nextInt();

            switch(userPick){
                case 1:
                    phone.takePicture();
                    break;
                case 2:
                    phone.makeCall();
                    break;
                case 3:
                    phone.printAllFiles();
                    break;
                case 4:
                    phone.getFreeSpace();
                    break;
        }

        }
    }
}
