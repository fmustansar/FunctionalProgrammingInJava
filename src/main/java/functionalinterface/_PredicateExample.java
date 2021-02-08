package functionalinterface;

import java.util.function.Predicate;

public class _PredicateExample {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("+49-3123-4133770"));
        System.out.println(isPhoneNumberValid("+49-3123-41337700"));
        System.out.println(isPhoneNumberValid("+92-3123-4133770"));


    }

    static boolean isPhoneNumberValid(String phNumber) {
        return phNumber.startsWith("+49") && phNumber.length() == 16;
    }
}
