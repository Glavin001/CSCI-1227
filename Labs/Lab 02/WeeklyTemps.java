import java.util.Scanner;
/**
 * A program that calculates temps
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */
public class WeeklyTemps
{
    public static final int NUM_ITEMS = 7;

    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        // read and sum the numbers
        double[] num = new double[NUM_ITEMS];
        int sum = 0;
        System.out.println("Enter the " + NUM_ITEMS + " items below");
        for (int i = 0; i < NUM_ITEMS; i++)
        {
            num[i] = kbd.nextDouble();    // remember the #
            sum += num[i];      // add it to sum
        }

        // calculate the average
        double ave = (double)sum / (double)NUM_ITEMS;

        // print the difference from the average of each
        System.out.println("Day\tTemp\tDiff from average\n"
                           +  "---\t----\t-----------------");
        for (int i = 0; i < NUM_ITEMS; i++)
        {
            System.out.println(i + "\t" + num[i] + "\t" + (num[i] - ave));
        }
    }
}
