package dk.lalilulelo.creational.builder;

/**
 * Created by Rasmu on 2/12/2017.
 */

// Concrete builder
public class SolidSnakeBuilder extends SnakeBuilder {
    @Override
    public void setFirstName() {
        getSnake().setFirstName("David");
    }

    public void setCodeName() {
        getSnake().setCodeName("Solid Snake");
    }
}