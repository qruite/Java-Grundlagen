package ObjektOrientierung.TaskOne.Objects;

import java.lang.reflect.Type;

public class Engine {
    public enum TYPE {DIESEL, GAS};
    private int horsePower;
    private TYPE type;

    public Engine(int horsePower, TYPE type, int maxSpeed){
        this.horsePower = horsePower;
        this.type = type;
    }

    //methods
    public void drive(int speed) {
        if(speed > 100){
            System.out.println("maximale Geschwindigkeit erreicht :" + speed + "km/h");
        } else {
            System.out.println("ihre aktuelle Geschwindigkeit beträgt: " + speed);
        }
    }

    public void Break() {
        System.out.println("Ich bremse");
    }

    //getter
    public int getHorsePower(){
        return horsePower;
    }

    public TYPE getType(){
        return type;
    }

}
