package Alpha_09_OOPS;

class Vehicle {
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle {
    void print() {
        System.out.println("Derived class(Car)");
    }

    void print1() {
        System.out.println("This is new Print.");
    }
}

public class CWH_06_Practice_2 {
    public static void main(String[] args) {
        
        Vehicle ob1 = new Car();
        ob1.print();
        // ob1.print1();               // Give an error because print1 method not print in Vehicle.

        Vehicle ob2 = new Vehicle();
        ob2.print();
    }
}
