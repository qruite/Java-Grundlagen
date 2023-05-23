package ObjektOrientierung.AufgabeLampe.Objects;

public class GlowElements {
    private String name;
    private String color;
    private double powerConsumption;
    private boolean Status;

    public GlowElements(String name, String color, double powerConsumption){
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
    }

    public void turnOn(){
        if(this.Status == true){
            System.out.println("Mein Name ist " + this.name + ". Ich bin bereits eingeschalte");
        } else {
            this.Status = true;
            this.powerConsumption = this.powerConsumption + 5;
        }
    }

    public void turnOff(){
        if(this.Status == false){
            System.out.println("Mein Name ist XXX. Ich bin bereits ausgeschaltet");
        } else {
            this.Status = false;
        }
    }




    //getter
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public boolean isStatus() {
        return Status;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
}

