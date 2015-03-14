package testing;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by robert on 3/14/2015.
 */
public class GeorgiaSouthernStudents implements PersonIterator {

    Person[] gsuArray = new Person[20];

    public GeorgiaSouthernStudents(int size) {
        this.gsuArray = new Person[size];

        for (int i = 0; i < size; i++) {
            this.gsuArray[i] = new Person();
        }

    }


    @Override
    public Iterator createIterator() {
        return Arrays.asList(gsuArray).iterator();
    }

}