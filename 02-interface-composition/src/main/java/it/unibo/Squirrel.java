package it.unibo;

public class Squirrel implements Animal {
    private final double averageWeight;
    private final Diet diet;

    public double averageWeight() {
        return this.averageWeight;
    }

    public boolean canEatVegetables() {
        return this.diet.canEatVegetables();
    }

    public boolean canEat(Animal a) {
        return this.diet.canEat(averageWeight, a);
    }

    public Squirrel() {
        this.averageWeight = 25;
        this.diet = new Herbivore();
    }
}
