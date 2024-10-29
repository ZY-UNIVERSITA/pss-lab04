package it.unibo;

public class Herbivore implements Diet {
    public boolean canEatVegetables() {
        return true;
    }

    public boolean canEat(double averageWeight, Animal a2) {
        return false;
    }
}
