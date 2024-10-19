package practice.pack.com.helloshop.order;

import practice.pack.com.helloshop.product.Product;
import practice.pack.com.helloshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
