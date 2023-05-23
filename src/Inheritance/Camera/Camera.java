package Inheritance.Camera;
import java.util.Scanner;

public class Camera {
    private String pixel;
    private int weight;
    private String color;
    private Producer producer;
    private Lense lense;
    private SDCard storage;

    public Camera(String pixel, int weight, String color, Producer producer, Lense lense, SDCard storage){
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.lense = lense;
        this.storage = storage;
    }

    public Photo takePicture(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wähle die Auflösung aus: ");
        System.out.println("1. klein");
        System.out.println("2. mittel");
        System.out.println("3. groß");
        int number = scanner.nextInt();
        double resolution = 2;

        switch (number){
            case 1:
                resolution = 2;

                break;
            case 2:
                resolution = 4;
                break;
            case 3:
                resolution = 6;
                break;
        }

        Photo photo = new Photo("Photo", "05.05.2023", resolution);
        return photo;

    }

    public int getWeight() {
        return weight;
    }

    public Lense getLense() {
        return lense;
    }

    public Producer getProducer() {
        return producer;
    }

    public SDCard getStorage() {
        return storage;
    }

    public String getColor() {
        return color;
    }

    public String getPixel() {
        return pixel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLense(Lense lense) {
        this.lense = lense;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void setStorage(SDCard storage) {
        this.storage = storage;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
