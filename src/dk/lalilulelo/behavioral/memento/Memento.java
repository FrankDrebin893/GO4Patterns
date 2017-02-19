package dk.lalilulelo.behavioral.memento;

/**
 * Created by Rasmu on 2/19/2017.
 */
public class Memento {
    private String state;

    public Memento(String state) { this.state = state; }
    public String getSavedState() { return state; }
}
