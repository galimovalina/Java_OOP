package Homework1.HotDrinks;

public class Coffee extends HotDrink{
    private int temperature;

    public Coffee(String name, Double cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
