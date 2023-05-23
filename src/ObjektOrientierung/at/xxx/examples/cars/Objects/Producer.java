package ObjektOrientierung.at.xxx.examples.cars.Objects;

public class Producer {
    private String name;
    private String countryOfOrigin;
    private double discount;

    public Producer(String name, String countryOfOrigin, int discount){
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.discount = discount;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public double getDiscount() {
        return discount;
    }
}
