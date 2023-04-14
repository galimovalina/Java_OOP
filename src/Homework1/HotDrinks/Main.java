package Homework1.HotDrinks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink drink1=new HotDrink("black tea",70.50, 2);
        HotDrink drink2=new Coffee("latte",60.30, 1,90);
        HotDrink drink3=new HotDrink("green tea",100.99, 1);
        HotDrink drink4=new HotDrink("hot chocolate",130.10, 3);
        HotDrink drink5=new Coffee("frappe",85.25,2,10);
        List<HotDrink> drinks=new ArrayList<>();
        drinks.add(drink1);
        drinks.add(drink2);
        drinks.add(drink3);
        drinks.add(drink4);
        drinks.add(drink5);
        HotDrinksMachine drinksMachine=new HotDrinksMachine(drinks);
        System.out.println(drinksMachine.getProduct("latte"));
        System.out.println(drinksMachine.getProduct("frappe", 2, 10));
        System.out.println(drinksMachine.getProduct("green tea", 1));


    }
}
