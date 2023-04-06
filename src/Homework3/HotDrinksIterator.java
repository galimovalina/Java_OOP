package Homework3;

import java.util.Iterator;
import java.util.List;

public class HotDrinksIterator implements Iterator<HotDrink> {
    private int counter;
    private List<HotDrink> drinks;

    public HotDrinksIterator(List<HotDrink> drinks) {
        this.counter = 0;
        this.drinks = drinks;
    }

    @Override
    public boolean hasNext() {
        return counter< drinks.size();
    }

    @Override
    public HotDrink next() {
        if(!hasNext()){
            return null;
        }
        return drinks.get(counter++);
    }
}
