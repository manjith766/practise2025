package com.neoteric.ecommerce;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        try {
            LoginService loginService = new LoginService();
            Login login = new Login("user123", "pass123");
            if (loginService.authenticate(login)) {
                System.out.println(" Login successful!\n");
            }


            Cart cart = new Cart();
            cart.addProduct(new Product("Laptop", 25000));
            cart.addProduct(new Product("Mouse", 1000));
            cart.addProduct(new Product("Keyboard", 2000));

            System.out.println(" Cart Total: ₹" + cart.getTotalPrice());

            Order order = new Order("ORD123", "Manjith", cart.getProductList(), cart.getTotalPrice());


            Payment payment = new Payment("MERCHANT001", LocalDateTime.now(), order, order.getPrice());

            PaymentService paymentService = new PaymentService();
            paymentService.makePayment(payment);

        } catch (InvalidLoginException e) {
            System.out.println("Login failed: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(" Payment failed: " + e.getMessage());
        }
    }
}
