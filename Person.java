package testing;

/**
 * Created by robert on 3/13/2015.
 */
public class Person {

    private RandomGenerator r = new RandomGenerator();
    private String name;
    private int age;
    private int birthYear;

    public Person(){
        this.name = r.nameGen(r.getInts(2,5), r.getInts(10,15));
        this.age = r.getInts(0,120);
        this.birthYear = r.getInts(1000, 1350);

    }

    public String getInfo(){

        return String.format("Name: %-25s Age: %-3d Birthyear: %-5d", this.name, this.age, this.birthYear);
    }

}
