package dk.lalilulelo.behavioral.observer;

/**
 * Created by Rasmu on 2/19/2017.
 */
public class SnakeHealthObserver extends Observer {
    public SnakeHealthObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        if(subject.getHealth() > 100) System.out.println("You're doing fine!");
        else System.out.println("Oh man oh god oh man, what's going on with you?!?");

    }
}
