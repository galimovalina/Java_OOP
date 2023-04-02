package Seminar_2.Actor;

public class Human extends Actor{

    @Override
    public void setMakeOrder() {
        makeOrder=true;
    }

    @Override
    public void setTakeOver() {
        takeOrder=true;
    }

    @Override
    public String getName() {
        return name;
    }
}
