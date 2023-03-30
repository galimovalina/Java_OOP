package Homework1.HotDrinks;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMachine {
    public HotDrinksMachine(List<Product> products) {
        this.products = products;
    }

    List<Product> products=new ArrayList<>();
    @Override
    public Product getProduct(String name) {
        for (Product item: products) {
            if (item.getName().equalsIgnoreCase(name))
                return item;
        }
        return null;
    }

    public Product getProduct(String name, int volume) {
        for (Product item: products) {
            if (item.getName().equalsIgnoreCase(name)&&((HotDrink)(item)).getVolume()==volume)
                return item;
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product item: products) {
            if (item.getName().equalsIgnoreCase(name)&&((HotDrink)(item)).getVolume()==volume
                    &&((Coffee)(item)).getTemperature()==temperature)
                return item;
        }
        return null;
    }
}
