package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _ConsumerExample {
    public static void main(String[] args) {
        //FM: The non functional way, normal java function
        Customer faizan = new Customer("FAIZAN", "+49-312-4133770");
        Product sonyV41D = new Product("SonySoundSystem", 50000);

        greetCustomer(faizan);
        //FM: By using the Consumer functional interface
        greetCustomerConsumer.accept(faizan);

        //FM: By using the BiConsumer functional interface
        buyProductByCustomerBiConsumer.accept(faizan, sonyV41D);
    }

    //FM: By using the Consumer functional interface
    static Consumer<Customer> greetCustomerConsumer = c -> System.out.println("Hello "+ c.customerName + ", thanks for registering ->"+ c.customerPhoneNumber);

    //FM: By using the BiConsumer functional interface
    static BiConsumer<Customer, Product> buyProductByCustomerBiConsumer =
            (c, p) -> System.out.println("Hello "+ c.customerName + ", thanks for buying ->"+ p.productName+" in "+p.productPrice+"/- PKR");


    //FM: The non functional way, normal java function
    static void greetCustomer(Customer c) {
        System.out.println("Hello "+ c.customerName + ", thanks for registering ->"+ c.customerPhoneNumber);
    }

    //FM: Same for both functional and non functional way of programming
    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
    //FM: Same for both functional and non functional way of programming
    static class Product {
        private final String productName;
        private final int productPrice;

        Product(String productName, int productPrice) {
            this.productName = productName;
            this.productPrice = productPrice;
        }
    }
}
