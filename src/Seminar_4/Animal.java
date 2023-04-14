package Seminar_4;

import java.util.List;

public class Animal<T extends BasicAnimal> {
    private List<T> generic;
    public List<T> info(){
        return generic;
    }

    public void setGeneric(List<T> generic) {
        this.generic = generic;
    }
}
