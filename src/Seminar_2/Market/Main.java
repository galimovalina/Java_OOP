package Seminar_2.Market;

import Seminar_2.Actor.Actor;
import Seminar_2.Actor.Human;

public class Main {
    public static void main(String[] args) {
        Actor human=new Human();
        Market market=new Market();
        market.acceptToMarket(human);
        market.takeInQueue(human);
        market.takeOrders();
        market.giveOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
    }
}
