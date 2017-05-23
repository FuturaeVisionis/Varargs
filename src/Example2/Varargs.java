package Example2;

/**
 * Created by ronald on 08/01/17.
 */
public class Varargs {

    public int sumVarags(int...intArrays){

        int sum = 0; // <-- remember, no void means you need a local variable

        for( int i = 0; i < intArrays.length; i++){
            sum = sum  + intArrays[i]; // <-- what's this? This intArrays[i] means what you give up as an array!

        }
        return sum; // we use return to exit fro a method
    }

    public static void main(String[] args) {
        Varargs varargs = new Varargs();

        int sum = varargs.sumVarags(10,20,50); // --> not void! So you can do this!
        System.out.println("The sum of the numbers is: " + sum);
    }
}
