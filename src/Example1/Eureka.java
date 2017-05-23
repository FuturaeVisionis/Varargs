package Example1;


/**
 * Created by ronald on 08/01/17.
 */
public class Eureka {

    public int toolbox(int... tools) {

        int hammer = 0;

        for (int screwdriver : tools)
            hammer = hammer + screwdriver;
        System.out.println("I have " + hammer + " tools in my toolbox.");

        return hammer / tools.length;
    }

    public static void main(String[] args) {

        Eureka eureka = new Eureka();
        System.out.println(eureka.toolbox(10, 20, 30));

    }
}
