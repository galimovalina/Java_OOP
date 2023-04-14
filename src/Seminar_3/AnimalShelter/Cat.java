package Seminar_3.AnimalShelter;

public class Cat extends Animal{


    public Cat(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
