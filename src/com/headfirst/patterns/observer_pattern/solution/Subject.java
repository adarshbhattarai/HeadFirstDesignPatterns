package com.headfirst.patterns.observer_pattern.solution;

/**
 * Created by adarshbhattarai on 3/25/19.
 */
public interface Subject {

    void registerObserver(Observers observers);
    void removeObserver(Observers observers);
    void notifyObservers();
}
