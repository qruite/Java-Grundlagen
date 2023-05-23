package Inheritance.Smartphone;

public class Camera {
    private int resolution;
    public int fileNumber = 1;

    public Camera(int resolution){
        this.resolution = resolution;
    }

    public PhoneFile takePicture(){
        PhoneFile file = new PhoneFile(0.2, "fileNr" + this.fileNumber, "png");
        this.fileNumber++;
        return file;
    }

    public int getFileNumber() {
        return fileNumber;
    }

    public int getResolution() {
        return resolution;
    }

    public void setFileNumber(int fileNumber) {
        this.fileNumber = fileNumber;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
}
