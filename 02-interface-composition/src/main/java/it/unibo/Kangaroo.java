package it.unibo;

public class Kangaroo implements Animal {
    private final double averageWeight;
    private final Diet diet;

    public double averageWeight() {
        return this.averageWeight;
    }

    public boolean canEatVegetables() {
        return this.diet.canEatVegetables();
    }

    public boolean canEat(Animal a) {
        return this.diet.canEat(this.averageWeight, a);
    }

    public Kangaroo() {
        this.averageWeight = 150;
        this.diet = new Herbivore();
    }
}
