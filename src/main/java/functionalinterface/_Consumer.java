package functionalinterface;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("FAIZAN", "+49-312-4133770"));
    }

    static void greetCustomer(Customer c) {
        System.out.println("Hello "+ c.customerName + ", thanks for registering ->"+ c.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
