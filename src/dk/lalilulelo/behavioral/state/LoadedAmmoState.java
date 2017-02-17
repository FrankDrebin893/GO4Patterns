package dk.lalilulelo.behavioral.state;

/**
 * Created by Rasmu on 2/17/2017.
 */
public class LoadedAmmoState implements IAmmoState {
    @Override
    public void pullTrigger(SocomHandgunStateMachine shsm) {
        System.out.println("Shots fired. Enemy fast asleep");
        shsm.setLoadedState(new UnloadedAmmoState());
    }
}
