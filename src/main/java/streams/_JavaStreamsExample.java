package streams;

import declarativeVsimperative.ImperativeMain;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _JavaStreamsExample {
    public static void main(String[] args) {
        List<Plant> plants = List.of(
                new Plant("Brocoli", PlantType.VEGETABLE),
                new Plant("Apple", PlantType.FRUIT),
                new Plant("Banana", PlantType.FRUIT),
                new Plant("Potato", PlantType.VEGETABLE),
                new Plant("Tomato", PlantType.VEGETABLE)
        );

        //Problem is to get the distinct plant types from the plants list.
        plants
                .stream()//FM: Entring the abstract mode.
                .map(plant-> plant.plantType)//FM: mapping equation
                .collect(Collectors.toList())//Converting to a list
                .forEach(System.out::println);// Looping over it
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
