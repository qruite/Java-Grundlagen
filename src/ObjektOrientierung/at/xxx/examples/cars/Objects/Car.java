package ObjektOrientierung.at.xxx.examples.cars.Objects;

public class Car {
    private String color;
    private int maxSpeed;
    private double price;
    private double baseConsumption;
    private double consumption;
    private int mileage = 35000;
    private Producer producer;
    private Engine engine;

    public Car(String color, int maxSpeed, double price, double baseConsumption, Producer producer, Engine engine){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price - (price * (producer.getDiscount()/100));
        this.baseConsumption = baseConsumption;
        this.producer = producer;
        this.engine = engine;
    }
    
    //check consumption
    public double checkConsumption(){
        if(this.mileage > 50000){
            this.consumption = this.baseConsumption * 0.098;
        } else {
            this.consumption = this.baseConsumption;
        }
        return this.consumption;
    }
    
    //get Info
    public void getInfo(){
        System.out.println("Farbe: " + this.color);
        System.out.println("Maximale Geschwindigkeit: " + this.maxSpeed);
        System.out.println("Preis: " + this.price);
        System.out.println("Basis Verbrauch: " + this.baseConsumption);
        System.out.println("Verbrauch: " + this.consumption);
        System.out.println("Hersteller: " + producer.getName() + " Land: " + producer.getCountryOfOrigin() + " Rabat: " + getProducer().getDiscount() + "%");
    }

    //setter
    public void setConsumptions(int consumption) {
        this.consumption = consumption;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBaseConsumption(int baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    //getter
    public double getConsumption(){
        return this.consumption;
    }

    public int getMileage(){
        return this.mileage;
    }

    public String getColor() {
        return this.color;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public double getBaseConsumption() {
        return this.baseConsumption;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double getPrice() {
        return this.price;
    }

    public Producer getProducer() {
        return this.producer;
    }
}
