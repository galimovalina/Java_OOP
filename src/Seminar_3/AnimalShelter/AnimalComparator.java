package Seminar_3.AnimalShelter;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getWeight().compareTo(o1.getWeight());
    }
}
