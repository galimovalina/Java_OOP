package Seminar_3.AnimalShelter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AnimalShelter {

    private List<Animal> animals;

    public AnimalShelter() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void print(){
        for(Animal animal:animals){
            System.out.println(animal);
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
    public void sort(AnimalComparator comparator){
        Collections.sort(animals,comparator);
    }
}
