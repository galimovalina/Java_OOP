package Seminar_1.VendingMachine;

public class waterBottle extends Product {
    private int volume;

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
    public String toString() {
        return "waterBottle{" +
                "name='" + super.getName() + '\'' +
                "volume='" + this.volume + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }

    @Override
    public void goodProd() {
        System.out.println("Im a good water!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof waterBottle)) {
            return false;
        }

        waterBottle that = (waterBottle) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && getVolume() == that.getVolume();
    }
}
