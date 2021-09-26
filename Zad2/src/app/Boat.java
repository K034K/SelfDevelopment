package app;

public class Boat extends Vehicle{
    Boat(String name){
        this.name = name;
    }
    @Override
    public String getYearOfInvention() {
        return "6 B.C.";
    }
}
