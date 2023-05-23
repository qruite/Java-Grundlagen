package ObjektOrientierung.TaskOne.Objects;

public class Tank {
    private double fuelConsumption;
    private double tankCapacity;

    public Tank(double fuelConsumption, double tankCapacity){
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }


    //setter
    public void setFuelConsumption(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    //getter
    public double getFuelConsumption(){
        return fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
