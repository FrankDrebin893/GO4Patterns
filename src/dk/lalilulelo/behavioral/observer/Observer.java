package dk.lalilulelo.behavioral.observer;

/**
 * Created by Rasmu on 2/19/2017.
 */
public abstract class Observer {
    protected Subject subject;

    public Observer() {

    }

    public Observer(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public abstract void update();

    public void detach() {
        subject.detach(this);
    }
}
