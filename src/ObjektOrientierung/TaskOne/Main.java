package ObjektOrientierung.TaskOne;
import ObjektOrientierung.TaskOne.Objects.*;

public class Main {
    public static void main (String[] args){

        Engine e1 = new Engine(120, Engine.TYPE.DIESEL, 100);
        Tank t1 = new Tank(5, 100);
        Car c1 = new Car(e1, "black", "M1234", t1);
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(150, -10);

        c1.addMirror(r1);
        c1.addMirror(r2);


    }
}
