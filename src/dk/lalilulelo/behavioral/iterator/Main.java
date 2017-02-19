package dk.lalilulelo.behavioral.iterator;

/**
 * Created by Rasmu on 2/12/2017.
 */
public class Main {
    public static void main(String[] args) {
        FrequencySet fs  = new FrequencySet();

        for(int i = 9; i > 0; --i) {
            fs.add(i);
        }

        FrequencySet.FrequencyIterator itA = fs.createIterator();
        FrequencySet.FrequencyIterator itB = fs.createIterator();

        for(itA.first(); !itA.isDone(); itA.next()) {
            System.out.println(itA.currentItem());
        }

        System.out.println("----------------------");

        for(itA.first(), itB.first(); !itA.isDone(); itA.next(), itB.next()){
            System.out.println(itA.currentItem() + ", " + itB.currentItem() + " ");

        }
        System.out.println();

    }
}
