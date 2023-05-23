package ObjektOrientierung.at.xxx.examples.cars.Objects;
import java.lang.reflect.Type;

public class Engine {
    public enum TYPE {DIESEL, GAS};
    private int horsePower;
    private TYPE type;

    public Engine(TYPE type, int horsePower){
        this.type = type;
        this.horsePower = horsePower;
    }

    //setter
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    //getter
    public int getHorsePower() {
        return horsePower;
    }

}
