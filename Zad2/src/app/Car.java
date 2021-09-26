package app;

public class Car extends Vehicle {
    Car(String name){
        this.name = name;
    }
    @Override
    public String getYearOfInvention() {
        return "1886";
    }
}
