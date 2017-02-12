package dk.lalilulelo.creational.builder;

/**
 * Created by Rasmu on 2/12/2017.
 */

// Concrete builder
public class BigBossBuilder extends SnakeBuilder {

    @Override
    public void setFirstName() {
        getSnake().setFirstName("Jack");
    }

    public void setCodeName() {
        getSnake().setCodeName("Naked Snake");
    }
}
