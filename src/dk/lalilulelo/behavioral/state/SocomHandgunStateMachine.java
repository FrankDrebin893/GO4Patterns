package dk.lalilulelo.behavioral.state;

/**
 * Created by Rasmu on 2/17/2017.
 */
public class SocomHandgunStateMachine {
    private IAmmoState currentState;

    public SocomHandgunStateMachine() {
        currentState = new LoadedAmmoState();
    }

    public void pullTrigger() {
        System.out.println("Trying to pull trigger");
        currentState.pullTrigger(this);
    }

    public void reload() {
        currentState = new LoadedAmmoState();
        System.out.println("Reloading!");
    }

    public void setLoadedState(IAmmoState state) {
        this.currentState = state;
    };
}
