package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);


        int increment2 = incrementByOneFunction.apply(0);
        System.out.println(increment2);

    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number+=1;


    //Rather than this, please use Function(T,R)
    static int increment(int number) {
        return number += 1;
    }


}
