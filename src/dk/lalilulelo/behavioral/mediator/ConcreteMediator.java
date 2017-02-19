package dk.lalilulelo.behavioral.mediator;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Rasmus on 2/19/2017.
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;
    private ArrayList<Colleague> colleagues = new ArrayList<>();

    @Override
    public void showMessage(Colleague colleague, String message) {
        System.out.println(new Date().toString() + " [" + colleague.getName() + "] : " + message);
    }
}
