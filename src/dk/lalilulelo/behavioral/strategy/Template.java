package dk.lalilulelo.behavioral.strategy;
import dk.lalilulelo.behavioral.strategy.ISneakingStrategy;

/**
 * Created by Rasmu on 2/15/2017.
 */

public abstract class Template implements ISneakingStrategy {

    @Override
    public void sneak(int startPoint, int endPoint) {
        beginSneaking(startPoint, endPoint);
    }

    protected abstract void beginSneaking(int startPoint, int endPoint);
    protected abstract void stopSneaking();
}
