package dk.lalilulelo.behavioral.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeSet;

/**
 * Created by Rasmus on 2/19/2017.
 */

public class FrequencySet {
    private TreeSet<Integer> frequencies = new TreeSet<Integer>();

    public void add(int in) {
        frequencies.add(in);
    }

    public FrequencyIterator createIterator() {
        return new FrequencyIterator(this);
    }

    public class FrequencyIterator {
        private FrequencySet frequencySet;
        private Iterator it;
        private Integer current;

        public FrequencyIterator(FrequencySet frequencySet) {
            this.frequencySet = frequencySet;
        }

        public void first() {
            this.it = this.frequencySet.frequencies.iterator();
            next();
        }

        public void next() {
            try {
                this.current = (Integer) this.it.next();
            } catch(NoSuchElementException ex) {
                System.out.println("No such element was found: " + ex);
                current = null;
            }
        }
        public boolean isDone() {
            return current == null;
        }
        public int currentItem() {
            return current;
        }
    }
}