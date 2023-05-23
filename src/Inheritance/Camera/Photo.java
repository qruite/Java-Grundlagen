package Inheritance.Camera;

public class Photo {
    private String name;
    private String date;
    private double size;

    public Photo(String name, String date, double size){
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
