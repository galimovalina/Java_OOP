package Homework1.HotDrinks;

public class HotDrink extends Product {
    private int volume;

    public HotDrink(String name, Double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return super.toString()+", volume: "+volume;
    }
}
