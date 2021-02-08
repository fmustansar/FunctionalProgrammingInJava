package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //FM: The non functional way, normal java function
        greetCustomer(new Customer("FAIZAN", "+49-312-4133770"));
        //FM: By using the Consumer functional interface
        greetCustomerConsumer.accept(new Customer("FAIZAN", "+49-312-4133770"));
    }

    //FM: By using the Consumer functional interface
    static Consumer<Customer> greetCustomerConsumer = c -> System.out.println("Hello "+ c.customerName + ", thanks for registering ->"+ c.customerPhoneNumber);

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
}
