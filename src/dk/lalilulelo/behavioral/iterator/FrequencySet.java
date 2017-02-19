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
            it = frequencySet.frequencies.iterator();
            next();
        }

        public void next() {
            try {
                // Prevent catching exception by checking first
                if(hasNext()) current = (Integer) it.next();
                else current = null;
            } catch(NoSuchElementException ex) {
                System.out.println("No such element was found: " + ex);
                current = null;
            }
        }

        public boolean hasNext() {
            return it.hasNext();
        }

        public boolean isDone() {
            return current == null;
        }

        public int currentItem() {
            return current;
        }
    }
}