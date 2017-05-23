package Example2;

/**
 * Created by ronald on 08/01/17.
 */
public class swappMe {

    public static void noSwap() {
        System.out.println("Before swap a = " + a + " and b = " + b);

    }

    static int a = 30;
    static int b = 45;


    public static void swap(int first, int second) {
        int c = first;
        first = second;
        second = c;
        System.out.println("After swap a = " + first + " and b = " + second);
    }

    public static void main(String[] args) {
        noSwap();
        swap(a, b);
    }
}
