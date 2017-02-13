package dk.lalilulelo.creational.prototype;

/**
 * Created by Rasmu on 2/13/2017.
 */
public class BigBoss extends Snake {

    public BigBoss() {
        type = "BigBoss";
    }
    @Override
    void smoke() {
        System.out.println("Cigar!");
    }
}
