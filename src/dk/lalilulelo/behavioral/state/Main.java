package dk.lalilulelo.behavioral.state;

/**
 * Created by Rasmu on 2/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        SocomHandgunStateMachine shsm = new SocomHandgunStateMachine();

        shsm.pullTrigger();
        shsm.pullTrigger();
        shsm.pullTrigger();
        shsm.pullTrigger();
    }
}
