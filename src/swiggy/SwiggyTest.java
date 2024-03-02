package swiggy;

import swiggy.model.Order;
import swiggy.model.OrderItem;
import swiggy.model.PhonePayService;
import swiggy.model.Product;

public class SwiggyTest {
    public static void main(String[] args) {
        PhonePayService phonePayService = new PhonePayService();
        OrderItem orderItem = new OrderItem("biriyani", 2, 250);
        Product product = new Product("dosa", 50);
        System.out.println("ordder is sucess");
        System.out.println("order is failed");

        Order order = new Order(250,30,25);
        String OrderItem = null;
        System.out.println("tip amount is given " + OrderItem);

        



        



    }

}
