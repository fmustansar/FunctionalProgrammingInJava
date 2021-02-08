package declarativeVsimperative;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DeclarativeMain {
    public static void main(String[] args) {
        List<Plant> plants = List.of(
            new Plant("Brocoli", PlantType.VEGETABLE),
            new Plant("Apple", PlantType.FRUIT),
            new Plant("Banana", PlantType.FRUIT),
            new Plant("Potato", PlantType.VEGETABLE),
            new Plant("Tomato", PlantType.VEGETABLE)
        );

        /******************************************************
         Problem statement: Find the vegies from the plants list
         ******************************************************/

        //Declarative approach: using streams and collections

        /* Using predicates.*/
        // so the following predicate accepts Plant and returns true or false on the basis of the rightmost condition in the following statement.
        Predicate<Plant> plantPredicate = plant -> PlantType.VEGETABLE.equals(plant.plantType);

        plants
                .stream() //FM: Opens abstract mode where we can tell what we want
                .filter(plantPredicate) // filters on our condition
                .collect(Collectors.toList()) // collects the response in List, in our case
                .forEach(System.out::println); // simply a loop

        //FM: WOW


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
        FRUIT, VEGETABLE
    }
}
