package app;

public class Tank extends Vehicle{
    Tank(String name){
        this.name = name;
    }
    @Override
    public String getYearOfInvention() {
        return "1915";
    }
}
