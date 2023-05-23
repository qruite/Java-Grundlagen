package ObjektOrientierung.TaskOne.Objects;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private Tank tank;
    private String color;
    private String serialNumber;
    private List<RearMirror> mirrors;

    //Constructor
    public Car(Engine engine, String color, String serialNumber, Tank tank) {
        this.color = color;
        this.serialNumber = serialNumber;
        this.mirrors = new ArrayList<>();
    }

    //methods
    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.print("Tuuut, ");
        }
    }

    public void getRemainingRange(int fuelAmount){
        double remaining = fuelAmount / this.getTank().getFuelConsumption() * 100;
        System.out.println("Rest-Reichweite des Autos beträgt: " + remaining);
    }


    //setter
    public void setColor(String color) {

        this.color = color;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    //getter
    public Engine getEngine(){
        return engine;
    }

    public Tank getTank() {
        return tank;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
