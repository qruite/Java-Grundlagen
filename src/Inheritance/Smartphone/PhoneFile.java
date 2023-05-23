package Inheritance.Smartphone;

public class PhoneFile {
    private String extension;
    private double size;
    private String name;

    public PhoneFile(double size, String name, String extension){
        this.name = name;
        this.size = size;
        this.extension = extension;
    }

    public void getInfo(){
        System.out.println(this.name + ":" + this.extension + ":" + this.name);
    }
    
    public String getExtension() {
        return extension;
    }

    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }
}
