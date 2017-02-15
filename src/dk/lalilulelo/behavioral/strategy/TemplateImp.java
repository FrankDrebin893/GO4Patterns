package dk.lalilulelo.behavioral.strategy;

/**
 * Created by Rasmu on 2/15/2017.
 */
public class TemplateImp extends Template {
    private int sneakingIncrement = 10;

    @Override
    protected void beginSneaking(int startPoint, int endPoint) {
        int currentPoint = startPoint;
        System.out.println("Start point is: " + startPoint);
        System.out.println("End point is: " + endPoint);
        while(currentPoint <= endPoint) {
            System.out.println("Currently at " + currentPoint);
            currentPoint += sneakingIncrement;
        }
        stopSneaking();
    }

    @Override
    protected void stopSneaking() {
        System.out.println("Stopped sneaking");
    }
}
