package Seminar_3.Iterators;

import Seminar_3.Iterators.Cat;
import Seminar_3.Iterators.CatShelter;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatShelter cats = new CatShelter(List.of(new Cat("name1")));
        Iterator<Cat> iterator = cats.iterator();
        cats.getSize();
        if (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
