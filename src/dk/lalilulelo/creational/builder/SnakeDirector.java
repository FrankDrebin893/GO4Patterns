package dk.lalilulelo.creational.builder;

/**
 * Created by Rasmu on 2/12/2017.
 */

// Director
public class SnakeDirector {
    private SnakeBuilder snakeBuilder;

    public void setSnakeBuilder(SnakeBuilder snakeBuilder) { this.snakeBuilder = snakeBuilder; }
    public Snake getSnake() { return this.snakeBuilder.getSnake(); }

    public void constructSnake() {
        snakeBuilder.buildNewSnake();
        snakeBuilder.setFirstName();
        snakeBuilder.setCodeName();
        System.out.println(snakeBuilder.getSnake().getFirstName() + ", " + snakeBuilder.getSnake().getCodeName());
    }
}
