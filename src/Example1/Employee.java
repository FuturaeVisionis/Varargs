package Example1;

/**
 * Created by ronald on 14/09/16.
 */
public class Employee {

    public int daysOffWork(int... days) {

        int daysOff = 0;

        for (int i = 0; i < days.length; i++)
            daysOff += days[i]; // <-- it's iterating and adding all your saved vacation days.

        System.out.println("I have saved " + daysOff + " days off work!");
        return daysOff;
    }

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.daysOffWork(10,88,99);


        System.out.println(employee.daysOffWork(10,55,88,99));

    }
}