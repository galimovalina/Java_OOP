package Seminar_2.Market;

import Seminar_2.Actor.Actor;

public interface QueueBehavior {
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrder();
    void releaseFromQueue();
}
