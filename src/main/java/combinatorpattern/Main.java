package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer faizan = new Customer("Faizan", "fmustansar@gmail.com", "49-1525-9362655", LocalDate.of(1989, 9, 12));
        System.out.println(new CustomerValidatorService().isValid(faizan));

        ValidationResult valid = isEmailValid()
                .and(isAdult())
                .and(isPhoneNumberValid()).apply(faizan);

        System.out.println(valid);

    }
}
