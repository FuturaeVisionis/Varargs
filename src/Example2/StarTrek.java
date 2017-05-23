package Example2;

/**
 * Created by ronald on 08/01/17.
 */
public class StarTrek {

    static void beam(String...person){
        System.out.println("Who should we beam up?");

        for(String enterprise : person){
            System.out.println(enterprise);
        }
    }

    public static void main(String[] args) {

        beam("James T.Kirk", "Spock", "Hikaru Sulu", "Leonard McCoy", "Pavel Chekov");
        }
    }
