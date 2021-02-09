package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;

import static streams._JavaStreamsExample.PlantType.*;

public class _JavaStreamsExample {
    public static void main(String[] args) {
        List<Plant> plants = List.of(
                new Plant("Brocoli", VEGETABLE),
                new Plant("Apple", FRUIT),
                new Plant("Banana", FRUIT),
                new Plant("Potato", VEGETABLE),
                new Plant("Tomato", VEGETABLE),
                new Plant("Spinach", GREEN)
        );

        //Problem is to get the distinct plant types from the plants list.
        Function<Plant, String> plantStringFunction = plant -> plant.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;
        plants
                .stream()//FM: Entring the abstract mode.
                .map(plantStringFunction)//FM: mapping condition - transformation
                .mapToInt(length)//Converting to a list
                .forEach(println);// Looping over it
    }

    static class Plant {
        private final String name;
        private final PlantType plantType;

        Plant(String name, PlantType plantType) {
            this.name = name;
            this.plantType = plantType;
        }

        @Override
        public String toString() {
            return "Plant{" +
                    "name='" + name + '\'' +
                    ", plantType=" + plantType +
                    '}';
        }
    }
    enum PlantType {
        FRUIT, VEGETABLE, GREEN
    }
}
