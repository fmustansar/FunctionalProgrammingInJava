package declarative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
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
        plants
                .stream()
                .filter(plant -> PlantType.VEGETABLE.equals(plant.plantType))
                .collect(Collectors.toList())
                .forEach(System.out::println);

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
