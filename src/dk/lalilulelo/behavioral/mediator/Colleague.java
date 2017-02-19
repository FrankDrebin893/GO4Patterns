package dk.lalilulelo.behavioral.mediator;

/**
 * Created by Rasmus on 2/19/2017.
 */
public abstract class Colleague {
    protected Mediator mediator;
    private String name;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void send(String message);
    public abstract void receive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
