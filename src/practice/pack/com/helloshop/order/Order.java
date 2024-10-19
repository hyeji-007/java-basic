package practice.pack.com.helloshop.order;

import practice.pack.com.helloshop.product.Product;
import practice.pack.com.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
