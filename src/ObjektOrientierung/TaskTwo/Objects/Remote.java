package ObjektOrientierung.TaskTwo.Objects;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> battery;

    public Remote() {
        this.battery = new ArrayList<>();
    }


    public void addBattery(Battery battery){
        this.battery.add(battery);
    }

    public void getStatus(){
        double a = battery.get(0).getChargingStatus();
        double b = battery.get(1).getChargingStatus();
        double average = (a+b)/2;

        System.out.println("Ladestatus " + average);
        System.out.println("");
    }

    public void turnOn(){
        double a = battery.get(0).getChargingStatus();
        double b = battery.get(1).getChargingStatus();

        double batteryOneNewChargingStatus = a -(a*0.05);
        double batteryTwoNewChargingStatus = b -(b*0.05);

        battery.get(0).setChargingStatus(batteryOneNewChargingStatus);
        battery.get(1).setChargingStatus(batteryTwoNewChargingStatus);

        System.out.println("Batterie 1: Verbraucher angeschlossen");
        System.out.println("Ladestatus: " + battery.get(0).getChargingStatus());
        System.out.println("Batterie 2: Verbraucher angeschlossen");
        System.out.println("Ladestatus: " + battery.get(1).getChargingStatus());
        System.out.println("");
    }

    public void turnOff(){
        System.out.println("Batterie 1: Kein Verbraucher angeschlossen");
        System.out.println("Batterie 2: Kein Verbraucher angeschlossen");
    }

}
