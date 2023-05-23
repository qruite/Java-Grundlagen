package Inheritance.Camera;

public class Lense {
    private String lenseProducer;
    private int focalLength;

    public Lense(String lenseProducer, int focalLength){
        this.lenseProducer = lenseProducer;
        this.focalLength = focalLength;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }

    public void setLenseProducer(String lenseProducer) {
        this.lenseProducer = lenseProducer;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public String getLenseProducer() {
        return lenseProducer;
    }
}
