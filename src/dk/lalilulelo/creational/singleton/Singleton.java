package dk.lalilulelo.creational.singleton;

/**
 * Created by Rasmu on 2/13/2017.
 */
public class Singleton {
    private String singletonValue;

    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
        this.singletonValue = "Patriots";
    }

    public String createNewString() {
        return singletonValue;
    }

    public void setStringToCreate(String value) {
        this.singletonValue = value;
    }
}
