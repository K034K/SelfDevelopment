package app;

public class Bicycle extends Vehicle{
    Bicycle(String name){
        this.name = name;
    }

    @Override
    public String getYearOfInvention() {
        return "1817";
    }
}
