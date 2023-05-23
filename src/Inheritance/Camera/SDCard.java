package Inheritance.Camera;
import java.util.List;
import java.util.ArrayList;

public class SDCard {
    private double capacity;
    private List<Photo> photos;
    private double remainingCapacity;

    public SDCard(double capacity){
        this.capacity = capacity;
        this.photos = new ArrayList<>();
        this.remainingCapacity = capacity;
    }

    public void savePhotos(Photo photo){
        this.photos.add(photo);
        System.out.println("The picture was saved succesfully");
        this.remainingCapacity -= photo.getSize();
    }

    public double getCapacity() {
        return capacity;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public double getRemainingCapacity() {
        return remainingCapacity;
    }

    public void setRemainingCapacity(double remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
    }
}
