package IteratorDP;

import FactoryMethodDP.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This is the "collection" class for the vihicles. It contains an internal "iterator" class. Clients can
 * create an iterator with the createIterator() method and
 * use the first(), isDone(), next(), and currentItem() protocol of the iterator.
 */
public class VehicleList {
    private List<Vehicle> list = new ArrayList();

    //An internal "iterator" class for the "collection" class
    public static class Iterator {
        private VehicleList vlist;
        private java.util.Iterator iterator;
        private Vehicle current;

        public Iterator(VehicleList vl) {
            vlist = vl;
        }

        public void first() {
            iterator = vlist.list.iterator();
            next();
        }

        public boolean isDone() {
            return current == null;
        }

        public Vehicle currentItem() {
            return current;
        }

        public void next() {
            try {
                current = (Vehicle) iterator.next();
            } catch (NoSuchElementException ex) {
                current =  null;
            }
        }
    }
    public void add(Vehicle v) {
        list.add(v);
    }

    public Iterator createIterator()  {
        return new Iterator(this);
    }



}
