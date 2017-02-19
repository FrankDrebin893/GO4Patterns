package dk.lalilulelo.behavioral.mediator;

/**
 * Created by Rasmu on 2/12/2017.
 */
public class Main { // TODO: 2/19/2017 Figure out if Colleagues are supposed to maintain their own instance of the chat or if it's in line with the pattern to have a static chat room
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueB peter = new ConcreteColleagueB(mediator);
        ConcreteColleagueA george = new ConcreteColleagueA(mediator);
        ConcreteColleagueA john = new ConcreteColleagueA(mediator);
        peter.setName("Peter");
        george.setName("George");
        john.setName("John");

        peter.send("Hello everyone!");
        george.send("Hi Peter!");
        john.send("Hey guys, how's your day?");



    }
}
