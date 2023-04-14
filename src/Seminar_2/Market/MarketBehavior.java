package Seminar_2.Market;

import Seminar_2.Actor.Actor;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(Actor actor);
}
