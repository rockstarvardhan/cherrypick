package swiggy.model;

public class Product {
    private String type;
    private int price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Product(String type, int price) {
        this.type = type;
        this.price = price;

    }
}


