package ObjektOrientierung.TaskTwo.Objects;

public class Battery {
    private double chargingStatus;

    public Battery(int chargingStatus){
        this.chargingStatus = chargingStatus;
    }

    public double getChargingStatus(){
        return this.chargingStatus;
    }

    public void setChargingStatus(double chargingStatus) {
        this.chargingStatus = chargingStatus;
    }
}

