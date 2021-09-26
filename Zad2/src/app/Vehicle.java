package app;

public abstract class Vehicle {
    String name;

    void move() {
        System.out.println("Vehicle " + this.name + " is moving");
    }
    abstract String getYearOfInvention();
}
