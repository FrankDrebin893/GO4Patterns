package dk.lalilulelo.creational.prototype;

/**
 * Created by Rasmu on 2/13/2017.
 */
public class SolidSnake extends Snake {
    public SolidSnake() {
        type = "SolidSnake";
    }
    @Override
    void smoke() {
        System.out.println("Cigarette!");
    }
}
