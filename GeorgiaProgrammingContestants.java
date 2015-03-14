package testing;

import java.util.Iterator;

/**
 * Created by robert on 3/14/2015.
 */
public class GeorgiaProgrammingContestants {

    GeorgiaSouthernStudents georgiaSouthernStudents = new GeorgiaSouthernStudents(20);
    GeorgiaStateStudents georgiaStateStudents = new GeorgiaStateStudents(20);
    GeorgiaTechStudents georgiaTechStudents = new GeorgiaTechStudents(20);

    PersonIterator southernPersonIterator = georgiaSouthernStudents;
    PersonIterator gaStatePersonIterator = georgiaStateStudents;
    PersonIterator gaTechPersonIterator = georgiaTechStudents;

    public GeorgiaProgrammingContestants(int size){

        this.southernPersonIterator = new GeorgiaSouthernStudents(size);
        this.gaStatePersonIterator = new GeorgiaStateStudents(size);
        this.gaTechPersonIterator = new GeorgiaTechStudents(size);

        this.southernPersonIterator = georgiaSouthernStudents;
        this.gaStatePersonIterator = georgiaStateStudents;
        this.gaTechPersonIterator = georgiaTechStudents;

    }

    public void listGeorgiaContestants(){

        Iterator gaTechStudents = this.gaTechPersonIterator.createIterator();
        Iterator gaStateStudents = this.gaStatePersonIterator.createIterator();
        Iterator GEORGIA_SOUTHERN_STUDENTS_WOOO = this.southernPersonIterator.createIterator();

        System.out.println("\n\nGeorgia Southern Contestants:");
        printContestants(GEORGIA_SOUTHERN_STUDENTS_WOOO);
        System.out.println("\n\nGeorgia State Contestants:");
        printContestants(gaStateStudents);
        System.out.println("\n\nGeorgia Tech Contestants");
        printContestants(gaTechStudents);

    }

    public void printContestants(Iterator iterator){

        while(iterator.hasNext()){
            Person person = (Person)iterator.next();
            System.out.println(person.getInfo());
        }
    }

}
