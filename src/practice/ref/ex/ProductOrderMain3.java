package practice.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for(int i = 0; i < orders.length; i++) {
            System.out.println((n+1) + "번쩨 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount1 = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount1);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {

        ProductOrder order1 = new ProductOrder();
        order1.productName = productName;
        order1.price = price;
        order1.quantity = quantity;
        return order1;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);

        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount1 = 0;
        for (ProductOrder order : orders) {
            totalAmount1 += order.price * order.quantity;
        }
        return totalAmount1;
    }
}