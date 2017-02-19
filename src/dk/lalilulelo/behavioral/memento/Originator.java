package dk.lalilulelo.behavioral.memento;

/**
 * Created by Rasmu on 2/19/2017.
 */
public class Originator {
    private String currentState;
    private Caretaker caretaker;

    public Originator () {
        caretaker = new Caretaker();
        currentState = "Start state";
    }

    public void printState() {
        System.out.println("Current state is " + currentState);
    }

    public void setState(String state) {
        caretaker.addMemento(this.saveAsMemento());
        this.currentState = state;
        printState();
    }

    public Memento saveAsMemento() {
        return new Memento(currentState);
    }

    public void restoreFromMemento(Memento memento) {
        currentState = memento.getSavedState();
        printState();
    }

    public Caretaker getCaretaker() {
        return this.caretaker;
    }
}
