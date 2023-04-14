package Seminar_4;

import Seminar_3.AnimalShelter.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> strings=new ArrayList();
        strings.add("ghjkl");
        strings.add(7);
        strings.add(true);


        Animal<Dog> dogAnimal=new Animal<>();
        dogAnimal.setGeneric(List.of(new Dog("-",5,12)));

    }
}
