package Inheritance.Camera;

public class Main {

    public static void main(String[] args){
        Lense lense = new Lense("Canon", 4);
        SDCard sdCard = new SDCard(16);
        Producer producer = new Producer("Canon", "Germany");

        Camera camera = new Camera("1920", 1, "black", producer,lense,sdCard);

        CameraGUI cameraGUI = new CameraGUI(camera);
        cameraGUI.run();
    }

}
