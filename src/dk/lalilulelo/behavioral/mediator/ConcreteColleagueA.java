package dk.lalilulelo.behavioral.mediator;

/**
 * Created by Rasmus on 2/19/2017.
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.showMessage(this, message);
    }

    @Override
    public void receive() {

    }
}
