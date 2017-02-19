package dk.lalilulelo.behavioral.observer;

/**
 * Created by Rasmu on 2/19/2017.
 */
public class RelaxedSnakeHealthObserver extends Observer {
    public RelaxedSnakeHealthObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        if(subject.getHealth() > 100) System.out.println("Woah dude, you're doing great!");
        else if(subject.getHealth() > 40) System.out.println("It's okay, take it easy man");
        else if(subject.getHealth() < 40) System.out.println("This isn't good man. Maybe you should eat a tree frog or something");
    }
/*
    public void detach() {
        subject.detach(this);
    }
    */
}
