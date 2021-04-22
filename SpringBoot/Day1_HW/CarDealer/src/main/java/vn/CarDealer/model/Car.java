package vn.CarDealer.model;

public class Car {
    private int id;
    private String brandName;
    private  String manufacturer;
    private int price;
    private String photo;

    public Car(int id, String brandName, String manufacturer, int price, String photo) {
        this.id = id;
        this.brandName = brandName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
