package dk.lalilulelo.behavioral.observer;

/**
 * Created by Rasmu on 2/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        Subject snake = new Subject();

        SnakeHealthObserver sho = new SnakeHealthObserver(snake);
        RelaxedSnakeHealthObserver rsho = new RelaxedSnakeHealthObserver(snake);

        snake.setHealth(30);
        snake.setHealth(60);
        snake.setHealth(20);

        System.out.println("DETACHING ****************************************");
        sho.detach();

        snake.setHealth(100);


    }
}
