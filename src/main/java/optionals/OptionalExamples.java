package optionals;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        System.out.println("\n");
        //FM: 1 Using orElseGet which uses a supplier
        System.out.println("USING orElse Get and following is the outpul");
        System.out.println(Optional.ofNullable(null).orElseGet(()->"default value"));
        System.out.println(Optional.ofNullable("Hello").orElseGet(()->"default value"));

        System.out.println("\n\n");
        //FM: 2 using orElseThrow
        System.out.println("USING orElseThrow & following is the outpul");
        try {
            Optional.ofNullable(null).orElseThrow(()-> new IllegalArgumentException("There is an exception"));
            System.out.println("Exception not thrown");
        } catch (Exception e) {
            System.out.println("Exception got thrown");
        }
        try {
            Optional.ofNullable("Not Null").orElseThrow(()-> new IllegalArgumentException("There is an exception"));
            System.out.println("Exception not thrown");
        } catch (Exception e) {
            System.out.println("Exception got thrown");
        }

        System.out.println("\n\n");
        //FM: 3 ifPresent
        Optional.ofNullable("fmustansar@gmail.com").ifPresent(email -> System.out.println("The email address is ->"+email));
        Optional.ofNullable(null).ifPresent(email -> System.out.println("The email address is ->"+email));


        System.out.println("\n\n");
        //FM: 4 ifPresentOrElse
        Optional.ofNullable(null).ifPresentOrElse(
                email -> System.out.println("The email address is ->"+email),
                () -> System.out.println("There was no email provided")
        );
        Optional.ofNullable("fmustansar@gmail.com").ifPresentOrElse(
                email -> System.out.println("The email address is ->"+email),
                () -> System.out.println("There was no email provided")
        );

    }
}
