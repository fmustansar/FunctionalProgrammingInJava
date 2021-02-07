package functionalinterface;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(0);
        System.out.println(increment2);

        //FM: AndThen() example.
        int multiply = multiplyByTenFunction.apply(incrementByOneFunction.apply(1)); //20
        System.out.println(multiplyByTenFunction.apply(incrementByOneFunction.apply(1)));

        int multiplyWithAndThen = incrementByOneAndMultiplyBy10Function.apply(1);
        System.out.println(multiplyWithAndThen);


        //FM: Example of BiFunctions
        int multiplyByX = multiplyByXFunction.apply(10,3);
        System.out.println(multiplyByX);
        System.out.println(multiplyByXDoubleBiFunction.applyAsDouble(10,3));

    }

    //Function<T,R>
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number+=1;
    static Function<Integer, Integer> multiplyByTenFunction =
            number -> number*=10;
    static Function<Integer, Integer> incrementByOneAndMultiplyBy10Function = incrementByOneFunction.andThen(multiplyByTenFunction);
    //BiFunction<T, U, R?
    static BiFunction<Integer, Integer, Integer> multiplyByXFunction = (number, multiplicationFactor) -> number * multiplicationFactor;
    static ToDoubleBiFunction<Integer, Integer> multiplyByXDoubleBiFunction = (number, multiplicationFactor) -> number * multiplicationFactor;



    //Rather than this, please use Function(T,R)
    static int increment(int number) {
        return number += 1;
    }


}
