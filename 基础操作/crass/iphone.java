package crass;

public class iphone {
    private String brand;
    private int price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public iphone() {
    }

    public iphone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}
