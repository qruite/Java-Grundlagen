package Inheritance.Camera;
import java.util.Scanner;

public class CameraGUI {
    private Camera camera;

    public CameraGUI(Camera camera){
        this.camera = camera;
    }

    public void run(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Take picture");
            System.out.println("2. remaining capacity");
            System.out.println("3. ignore it");
            int input = scanner.nextInt();

            if (input == 1){
                Photo picture = this.camera.takePicture();
                if(camera.getStorage().getRemainingCapacity() >= picture.getSize()){
                    camera.getStorage().savePhotos(picture);
                } else if(camera.getStorage().getRemainingCapacity() == 0){
                    System.out.println("you cant take any picture. Your storage is full, please change the SDCard");
                }else {
                    System.out.println("not enough capacity");
                    System.out.println("remaining capacity: " + camera.getStorage().getRemainingCapacity());
                    System.out.println("if remaining capacity is smaller then 2gb then change the sdcard");
                }
            } else if(input == 2){
                System.out.println(camera.getStorage().getRemainingCapacity());
            } else if (input == 3){

            } else {
                System.out.println("wrong input, try again:");
            }
        }
    }
}
