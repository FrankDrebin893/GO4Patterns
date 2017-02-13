package dk.lalilulelo.creational.prototype;

/**
 * Created by Rasmu on 2/13/2017.
 */
public class Main {
    public static void main(String[] args) {
        PrototypeCache cache = new PrototypeCache();
        cache.initCache();

        Snake snake = (Snake) cache.findSnake("BB");
        snake.smoke();

        snake = (Snake) cache.findSnake("SS");
        snake.smoke();
    }
}
