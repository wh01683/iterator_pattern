package testing;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by robert on 3/14/2015.
 */
public class GeorgiaStateStudents implements PersonIterator{

    ArrayList<Person> stateStudents = new ArrayList<Person>(20);

    public GeorgiaStateStudents(int size){

        this.stateStudents = new ArrayList<Person>(size);

        for (int i = 0; i<size; i++){
           stateStudents.add(new Person());
        }
}

    @Override
    public Iterator createIterator() {
        return this.stateStudents.iterator();
    }
}
