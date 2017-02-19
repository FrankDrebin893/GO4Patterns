package dk.lalilulelo.behavioral.memento;

import java.util.ArrayList;

/**
 * Created by Rasmu on 2/19/2017.
 */
public class Caretaker {
    private ArrayList<Memento> savedStates = new ArrayList<Memento>();

    public void addMemento(Memento m) { savedStates.add(m); }
    public Memento getMemento(int index) { return savedStates.get(index); }
}
