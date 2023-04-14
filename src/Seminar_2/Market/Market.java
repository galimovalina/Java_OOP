package Seminar_2.Market;

import Seminar_2.Actor.Actor;
import Seminar_2.Actor.Human;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehavior,MarketBehavior{
    Queue<Actor> queue = new LinkedList<>();
    List<Actor> actors=new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }
    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        queue.peek().setTakeOver();
    }

    @Override
    public void giveOrder() {
        queue.peek().setMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        queue.poll();
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
    }
}
