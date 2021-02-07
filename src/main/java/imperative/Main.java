package imperative;

import java.util.ArrayList;
import java.util.List;

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

        //Imperative approach:
        List<Plant> vegies = new ArrayList<>();
        for(Plant plant: plants) {
            if(PlantType.VEGETABLE.equals(plant.plantType)) {
                vegies.add(plant);
            }
        }
        for(Plant vegitable: vegies) {
            System.out.println(vegitable);
        }


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
