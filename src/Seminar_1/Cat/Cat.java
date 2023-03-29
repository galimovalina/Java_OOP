package Seminar_1.Cat;

import Seminar_1.CatMover.CatInterface;
import Seminar_1.CatMover.CatMover;

public class Cat extends CatMover implements CatInterface {
    private String name;
    private int age;    //поля

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void saySomething() {
        System.out.println("MEOW");
    }

    @Override
    public void sayWithInterface() {
        System.out.println("meow with interface");
    }
}
