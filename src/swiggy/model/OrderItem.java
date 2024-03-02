package swiggy.model;

public class OrderItem {

    Product product;
    private int qty;
    private int price;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public OrderItem(String product, int qty, int price) {
        this.product = product;
        this.qty = qty;
        this.price = price;

    }
}




