package Inheritance.Smartphone;

public class Phone {
    private Camera camera;
    private SDCard sdCard;
    private SimCard simCard;
    private String color;

    public Phone(Camera camera, SDCard sdCard, SimCard simCard, String color){
        this.camera = camera;
        this.sdCard = sdCard;
        this.simCard = simCard;
        this.color = color;
    }

    public void takePicture(){
        sdCard.saveFile(camera.takePicture());
    }

    public void makeCall(){
        simCard.doCall();
    }

    public void getFreeSpace(){
        sdCard.getFreeSpace();
    }

    public void printAllFiles(){
        sdCard.getAllFiles();
    }

    public String getColor(){
        return color;
    }

    public Camera getCamera() {
        return camera;
    }

    public SDCard getMemoryCard() {
        return sdCard;
    }

    public SimCard getSDCard() {
        return simCard;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void setMemoryCard(SDCard SDCard) {
        this.sdCard = SDCard;
    }

    public void setSDCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public void setColor(String color){
        this.color = color;
    }
}
