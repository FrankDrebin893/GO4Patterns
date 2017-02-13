package dk.lalilulelo.creational.singleton;

/**
 * Created by Rasmu on 2/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        String value = instance.createNewString();
        System.out.println("Value: " + value);
        secondInstance.setStringToCreate("La li lu le lo");
        value = instance.createNewString();
        System.out.println("Value: " + value);
    }
}
