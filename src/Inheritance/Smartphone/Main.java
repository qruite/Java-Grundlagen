package Inheritance.Smartphone;

public class Main {


    public static void main(String[] args){
        Camera camera = new Camera(1920);
        SDCard SDCard = new SDCard(128);
        SimCard simCard = new SimCard(1, "6791230");

        Phone phone = new Phone(camera, SDCard, simCard, "black");

        PhoneGUI gui = new PhoneGUI(phone);
        gui.run();

    }


}
