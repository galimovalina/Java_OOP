package Seminar_1.VendingMachine;

import java.util.List;

public class WaterMachine implements Machine {
    private final List<Product> products;

    public WaterMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProductByName(String serchName, Integer volume){

        for (Product item: products)
            if((item.getName().equalsIgnoreCase(serchName))&&((waterBottle)(item).getVolume))
                return item;
        return null;
    }
}
