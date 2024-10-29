package it.unibo;

public class Onnivore implements Diet {
    public boolean canEatVegetables() {
        return true;
    }

    public boolean canEat(double averageWeight, Animal a2) {
        return averageWeight > a2.averageWeight();
    }
}
