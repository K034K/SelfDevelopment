package app;

public class Motorcycle extends Vehicle{
    Motorcycle(String name){
        this.name = name;
    }
    @Override
    public String getYearOfInvention() {
        return "1885";
    }
}
