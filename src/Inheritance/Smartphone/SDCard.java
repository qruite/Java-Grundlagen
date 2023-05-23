package Inheritance.Smartphone;
import Inheritance.Smartphone.PhoneFile;

import java.util.List;
import java.util.ArrayList;

public class SDCard {
    private List<PhoneFile> files;
    private double capacity;
    private double remainingCapacity;

    public SDCard(double capacity){
        this.files = new ArrayList<>();
        this.capacity = capacity;
        this.remainingCapacity = this.capacity;
    }

     public void saveFile(PhoneFile phoneFile){
        this.files.add(phoneFile);
        double fileSize = phoneFile.getSize();
        this.remainingCapacity = this.remainingCapacity - fileSize;
     }

     public void getAllFiles(){
         for (PhoneFile file : this.files) {
             System.out.println("Name: " + file.getName() + " : " + "Size: " + file.getSize() + " : " + "Extension: " + file.getExtension());
         }
     }

     public void getFreeSpace(){
         System.out.println("SD Card capacity: " + this.capacity + "GB");
         System.out.println("ramining capacity: " + this.remainingCapacity + "GB");
     }

    public double getCapacity() {
        return capacity;
    }

    public double getRemainingCapacity() {
        return remainingCapacity;
    }

    public List<PhoneFile> getFiles() {
        return files;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setFiles(List<PhoneFile> files) {
        this.files = files;
    }

    public void setRemainingCapacity(double remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
    }
}
