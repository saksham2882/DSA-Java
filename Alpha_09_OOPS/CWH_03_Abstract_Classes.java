package Alpha_09_OOPS;

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
        System.out.println("Animal Constructor.");
    }
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor.");
    }
    void changeColor() {
        color = "Dark Brown";
    }
    void walk() {
        System.out.println("Walk on 4 legs.");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Chicken Constructor.");
    }
    void changeColor() { 
        color = "Yellow";
    }
    void walk() {
        System.out.println("Walks on 2 legs.");
    }
}

public class CWH_03_Abstract_Classes {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal();             // It show an error. Because we don't create a object of abstract class.

    }
}
