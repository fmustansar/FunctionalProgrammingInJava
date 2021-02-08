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
