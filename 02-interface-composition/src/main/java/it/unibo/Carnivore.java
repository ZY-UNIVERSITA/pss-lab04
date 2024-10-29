package it.unibo;

public class Carnivore implements Diet {
    public boolean canEatVegetables() {
        return false;
    }

    public boolean canEat(double a1Weight, Animal a2) {
        return a1Weight > a2.averageWeight();
    }
}
