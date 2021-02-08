package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _PredicateExample {
    public static void main(String[] args) {
        System.out.println("-------------- OLDER Way ---------------------");
        System.out.println(isPhoneNumberValid("+49-3123-4133770"));
        System.out.println(isPhoneNumberValid("+49-3123-41337700"));
        System.out.println(isPhoneNumberValid("+92-3123-4133770"));

        System.out.println("------------------ Predicates Way ---------------------");
        System.out.println(isPhoneNumberValidPredicate.test("+49-3123-4133770"));
        System.out.println(isPhoneNumberValidPredicate.test("+49-3123-41337700"));
        System.out.println(isPhoneNumberValidPredicate.test("+92-3123-4133770"));

        System.out.println("------------------ Predicates Chaining Way ---------------------");
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberAGermanPhNumber).test("+49-3123-4133770"));
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberAGermanPhNumber).test("+49-3123-41337700"));
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberAGermanPhNumber).test("+92-3123-4133770"));
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberAGermanPhNumber.or(isPhoneNumberAPakistaniPhNumber)).test("+92-3123-4133770"));
        System.out.println("------------------ Bi Predicates Way ---------------------");
        System.out.println(isPhoneNumberValidForWhichCountry.test("+92-3123-4133770", "+92"));
        System.out.println(isPhoneNumberValidForWhichCountry.test("+49-3123-4133770", "+49"));
        System.out.println(isPhoneNumberValidForWhichCountry.test("+49-3123-4133770", "+92"));


    }

    static Predicate<String> isPhoneNumberValidPredicate = phNumber ->phNumber.startsWith("+") && phNumber.length() == 16;
    static Predicate<String> isPhoneNumberAGermanPhNumber = phNumber ->phNumber.startsWith("+49");
    static Predicate<String> isPhoneNumberAPakistaniPhNumber = phNumber ->phNumber.startsWith("+92");

    //FM: Bi-Predicate example
    static BiPredicate<String, String> isPhoneNumberValidForWhichCountry =
            (phNumber, countryPhoneCode) ->  phNumber.startsWith("+") && phNumber.length() == 16 && phNumber.startsWith(countryPhoneCode);

    static boolean isPhoneNumberValid(String phNumber) {
        return phNumber.startsWith("+") && phNumber.length() == 16;
    }
}
