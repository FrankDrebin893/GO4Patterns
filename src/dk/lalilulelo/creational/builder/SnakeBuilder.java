package dk.lalilulelo.creational.builder;

/**
 * Created by Rasmu on 2/12/2017.
 */

// Abstract builder
public abstract class SnakeBuilder {
    protected Snake snake;

    public Snake getSnake() {
        return snake;
    }

    public void buildNewSnake() {
        snake = new Snake();
    }

    public abstract void setFirstName ();
    public abstract void setCodeName ();
}
