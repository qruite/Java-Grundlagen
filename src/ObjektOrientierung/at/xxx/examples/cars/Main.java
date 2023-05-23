package ObjektOrientierung.at.xxx.examples.cars;

import ObjektOrientierung.at.xxx.examples.cars.Objects.*;

public class Main {

    public static void main(String[] args){
        Engine e1 = new Engine(Engine.TYPE.DIESEL, 105);
        Engine e2 = new Engine(Engine.TYPE.GAS, 200);

        Producer p1 = new Producer("BMW", "Deutschland", 10);
        Producer p2 = new Producer("Lamborghini", "Italy", 5);

        Car c1 = new Car("Black", 150, 150000, 8, p1, e1);
        Car c2 = new Car("White", 250, 100000, 5, p2, e2);

        c1.getInfo();
        System.out.println("");
        c2.getInfo();
    }
}
