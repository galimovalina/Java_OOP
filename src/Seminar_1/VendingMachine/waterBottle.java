package Seminar_1.VendingMachine;

public class waterBottle extends Product {
    private Integer volume;
    public waterBottle(String name, Double cost) {
        super(name, cost);
    }

    public waterBottle(String name, Double cost, Integer volume) {
        super(name, cost);
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public void goodProd() {
        System.out.println("Im a good water!");
    }
}
