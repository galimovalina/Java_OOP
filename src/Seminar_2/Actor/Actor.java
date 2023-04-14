package Seminar_2.Actor;

public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;

    @Override
    public boolean isMakeOrder(){
        return makeOrder;
    }

    @Override
    public boolean isTakeOver(){
        return takeOrder;
    }

    public abstract String getName();
}
