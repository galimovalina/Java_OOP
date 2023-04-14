package Homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HotDrinksMachine implements VendingMachine,Iterable<HotDrink> {

    private List<HotDrink> drinks= new ArrayList<>();
    @Override
    public Product getProduct(String name) {
        for (Product item: drinks) {
            if (item.getName().equalsIgnoreCase(name))
                return item;
        }
        return null;
    }

    public Product getProduct(String name, int volume) {
        for (Product item: drinks) {
            if (item.getName().equalsIgnoreCase(name)&&((HotDrink)(item)).getVolume()==volume)
                return item;
        }
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (Product item: drinks) {
            if (item.getName().equalsIgnoreCase(name)&&((HotDrink)(item)).getVolume()==volume
                    &&((Coffee)(item)).getTemperature()==temperature)
                return item;
        }
        return null;
    }

    public void addToHotDrinkMachine(HotDrink drink){
        drinks.add(drink);
    }

    @Override
    public Iterator<HotDrink> iterator() {
        return new HotDrinksIterator(drinks);
    }
}
