package Homework3;

import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HotDrinksMachine drinksMachine = new HotDrinksMachine();
        drinksMachine.addToHotDrinkMachine(new HotDrink("black tea",70.50, 2));
        drinksMachine.addToHotDrinkMachine(new Coffee("latte",60.30, 1,90));
        drinksMachine.addToHotDrinkMachine(new HotDrink("green tea",100.99, 1));
        drinksMachine.addToHotDrinkMachine(new HotDrink("hot chocolate",130.10, 3));
        drinksMachine.addToHotDrinkMachine(new HotDrink("frappe",85.25,2));

        //Использование компаратора
        Comparator<Product> pcomp=new ProductComparator();
        System.out.println(pcomp.compare(drinksMachine.getProduct("latte"),drinksMachine.getProduct("hot chocolate")));

        //Использование итератора, вывод всего списка
        Iterator<HotDrink> iter= drinksMachine.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //Использование итератора, вывод всего списка
        System.out.println();
        for (HotDrink drink: drinksMachine){
            System.out.println(drink);
        }
    }
}
