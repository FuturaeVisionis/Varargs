package Example1;

/**
 * Created by ronald on 08/01/17.
 */
public class Smurf {

    public void village(String... names) {

        for (String smurf : names) {

            System.out.println(smurf);

        }
    }

    public static void main(String[] args) {

        Smurf smurf = new Smurf();
        smurf.village("Brainy", "Lazy", "Hefty", "Dreamy", "Timber", "Handy");

    }
}

