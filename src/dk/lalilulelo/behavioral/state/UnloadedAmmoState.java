package dk.lalilulelo.behavioral.state;

/**
 * Created by Rasmu on 2/17/2017.
 */
public class UnloadedAmmoState implements IAmmoState {

    @Override
    public void pullTrigger(SocomHandgunStateMachine shsm) {
        System.out.println("You should reload first!");
        shsm.reload();
    }
}
