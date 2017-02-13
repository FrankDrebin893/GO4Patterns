package dk.lalilulelo.creational.prototype;

import java.util.Hashtable;

/**
 * Created by Rasmu on 2/13/2017.
 */
public class PrototypeCache {

    private static Hashtable<String, Snake> snakeTable = new Hashtable<>();

    public static Snake findSnake(String snakeId) {
        Snake cachedSnake = snakeTable.get(snakeId);
        return (Snake) cachedSnake.clone();
    }

    public void initCache() {
        BigBoss bigBoss = new BigBoss();
        bigBoss.setId("BB");
        snakeTable.put(bigBoss.getId(), bigBoss);

        SolidSnake solidSnake = new SolidSnake();
        solidSnake.setId("SS");
        snakeTable.put(solidSnake.getId(), solidSnake);
    }
}
