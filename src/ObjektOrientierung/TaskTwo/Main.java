package ObjektOrientierung.TaskTwo;
import ObjektOrientierung.TaskTwo.Objects.*;

public class Main {

    public static void main(String[] args){
        Battery b1 = new Battery(100);
        Battery b2 = new Battery(50);
        Remote remote = new Remote();

        remote.addBattery(b1);
        remote.addBattery(b2);

        remote.getStatus();
        remote.turnOn();
        remote.turnOff();


    }
}
