package testing;

/**
 * Created by robert on 3/14/2015.
 */
public class SouthEasternICPC {

    GeorgiaProgrammingContestants georgiaProgrammingContestants = new GeorgiaProgrammingContestants(20);

    public SouthEasternICPC(int size){

        this.georgiaProgrammingContestants = new GeorgiaProgrammingContestants(size);

    }

    public void listGeorgiaICPCContestants(){

        this.georgiaProgrammingContestants.listGeorgiaContestants();
    }

}
