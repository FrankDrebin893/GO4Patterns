package dk.lalilulelo.creational.builder;

/**
 * Created by Rasmu on 2/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        SolidSnakeBuilder ssb = new SolidSnakeBuilder();
        BigBossBuilder bbb = new BigBossBuilder();

        SnakeDirector director = new SnakeDirector();
        System.out.println("Solid snake builder: ");
        director.setSnakeBuilder(ssb);
        director.constructSnake();

        System.out.println("Big boss builder: ");
        director.setSnakeBuilder(bbb);
        director.constructSnake();




    }
}
