package dk.lalilulelo.behavioral.observer;

import java.util.ArrayList;

/**
 * Created by Rasmu on 2/19/2017.
 */
public class Subject {
    private int health;
    private ArrayList<Observer> observers = new ArrayList();

    public Subject() {
        health = 20;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer:observers) {
            observer.update();
        }
    }

    public int getHealth() { return health; }

    public void setHealth(int health) { this.health = health; notifyObservers(); }
}
