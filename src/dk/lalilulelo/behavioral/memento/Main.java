package dk.lalilulelo.behavioral.memento;

/**
 * Created by Rasmu on 2/12/2017.
 */

// Memento pattern can be combined with the State pattern to remember all state changes
public class Main {
    public static void main(String[] args) {
        Originator origin = new Originator();

        origin.setState("State 2");
        origin.setState("State 3");
        origin.setState("State 4");
        origin.restoreFromMemento(origin.getCaretaker().getMemento(2));


    }
}
