package Seminar_3.AnimalShelter;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter=new CatShelter();
        for (int i=0;i<5;i++){
            if(i%2==0){
                shelter.addAnimal(new Cat("cat"+i,i*2,i*3));
            }
            else
                shelter.addAnimal(new Dog("dog"+i,i*4,i*3));
        }
        shelter.print();
        shelter.sort(new AnimalComparator());
        shelter.print();
    }
}
