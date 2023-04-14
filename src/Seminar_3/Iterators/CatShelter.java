package Seminar_3.Iterators;

import Seminar_3.Iterators.Cat;
import Seminar_3.Iterators.CatIterator;

import java.util.Iterator;
import java.util.List;

public class CatShelter implements Iterable<Cat>{
    private List<Cat> cats;
    public CatShelter(List<Cat> cats){
        this.cats=cats;
    }
    public void getSize(){
        System.out.println(cats.size());
    }

    @Override
    public Iterator<Cat> iterator() {
        return new CatIterator(cats);
    }
}
