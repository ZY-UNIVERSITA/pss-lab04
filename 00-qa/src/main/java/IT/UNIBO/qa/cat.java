package it.unibo.qa;

/**
 * Describing the cat class.
 */
public class Cat {
    // this class describes a cat
    private static final int NINE = 9;
    private static final int NUMBEROFLIVES = NINE;

    private String name, color, breed;
    private int age;

    /**
     * Class constructor list.
     * @param meow name of the meow
     */
    public Cat(final String meow, final String c, final int age, final String korat) {
        this.name = meow;
        this.color = c;
        this.age = age;
        this.breed = korat;
    }

    /**
     * This method is useful because it allows the cat to meow and introduce itself to the world in a single line of code.
     * @return string value of return
     */
     public String meow() {
        return "meow, meow, I am " + this.name + ", hear me purr, In this feline world, I'm the star, that's for sure. " 
        + "With whiskers long and fur so sleek, I'm here to share my story, so take a peek!";
    }

    public void setcolor(final String c) {
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }

    public int hasSamecolor(final Cat cat) {
        if (this.color == cat.color) {
            return 1;
        } else {
            return 0;
        }
    }

    public String name() {
        return this.name;
    }

    public String breed() {
        return this.breed;
    }

    public static void main(final String[] args) {
        Cat cat = new Cat("Kiri", "Gray", 4, "Kor" + "at");
        System.out.println(cat.meow());
    }
}