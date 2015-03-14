package testing;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by robert on 3/14/2015.
 */
public class GeorgiaTechStudents implements PersonIterator{

    Hashtable<Integer,Person> gtStudents = new Hashtable<Integer, Person>(20);

    public GeorgiaTechStudents(int size){
        this.gtStudents = new Hashtable<Integer, Person>(size*2);

        Integer hashKey = 0;

        for(int i = 0; i < size; i++){
            gtStudents.put(hashKey, new Person());
            hashKey++;
        }

    }

    @Override
    public Iterator createIterator() {
        return gtStudents.values().iterator();
    }
}
