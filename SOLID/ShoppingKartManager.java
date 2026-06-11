package SOLID;

import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " - " + name + " : ₹" + price;
    }
}


// Store responsibility
class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product getProduct(int id) {
        for(Product p : products) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void showProducts() {
        System.out.println("Available Products:");
        for(Product p : products) {
            System.out.println(p);
        }
    }
}


// Cart responsibility
class Cart {
    private List<Product> cartItems = new ArrayList<>();

    public void addItem(Product product) {
        cartItems.add(product);
    }

    public void removeItem(int id) {
        cartItems.removeIf(p -> p.getId() == id);
    }

    public double calculateTotal() {
        double total = 0;

        for(Product p : cartItems) {
            total += p.getPrice();
        }

        return total;
    }

    public void showCart() {
        System.out.println("\nCart Items:");

        for(Product p : cartItems) {
            System.out.println(p);
        }

        System.out.println("Total = ₹" + calculateTotal());
    }
}


// Payment abstraction
interface PaymentService {
    void pay(double amount);
}


// Different payment methods
class UpiPayment implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println(
            "Paid ₹" + amount + " using UPI"
        );
    }
}


class CardPayment implements PaymentService {

    @Override
    public void pay(double amount) {
        System.out.println(
            "Paid ₹" + amount + " using Card"
        );
    }
}


// Manager
public class ShoppingKartManager {

    public static void main(String[] args) {

        Store store = new Store();

        // Add products to store
        store.addProduct(
            new Product(1, "Laptop", 55000)
        );

        store.addProduct(
            new Product(2, "Mouse", 800)
        );

        store.addProduct(
            new Product(3, "Keyboard", 1500)
        );


        store.showProducts();


        Cart cart = new Cart();

        // User adds products
        cart.addItem(store.getProduct(1));
        cart.addItem(store.getProduct(3));


        cart.showCart();


        // Payment
        PaymentService payment = new UpiPayment();

        payment.pay(cart.calculateTotal());
    }
}