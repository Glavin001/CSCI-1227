import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

/**
 * A program that reads and sorts
 *
 * @author Mark Young(A00000000)
 * @author Arsum B. Iqbal -- A00351433
 * @version 2.0
 */
public class ReadAndSort 
{
    public static final int MAX = 100;
    public static final int PER_LINE = 5;

    public static void main(String[] args)
        throws FileNotFoundException 
    {
        Scanner kbd = new Scanner(System.in);
        
        // introduce yourself
        System.out.print("\n\n"
           + "A program to illustrate preventing overflow of an array \n"
           + "(and avoiding reading too many numbers).\n\n");

        System.out.print("Enter the name of the file: ");
        String fileName=kbd.nextLine();
        File f = new File(fileName);
        Scanner reader = new Scanner(f);
        // create the array and counter variable
        int[] posInt = new int[MAX];
        int count = 0;
        
        // read until the array fills OR to a negative sentinel value
        System.out.print("Enter positive integers: ");
        for (int i = 0; i < MAX; i++)   // loop thru array
        {
            int num = reader.nextInt();         // get a number
            posInt[0]=num;
            if (!reader.hasNextInt())                   // check if number is sentinel
            {
                break;                          // and stop loop if so
            }
            posInt[count] = num;            // save that number
            count++;                        // one more number saved
        }
        //kbd.nextLine();            // clear away end-of-line
        
        // report # of #s read
        System.out.println("I read " + count + " numbers.");

        // sort the array
        Arrays.sort(posInt, 0, count);  // sorts only from 0 to count-1

        // print out the numbers, PER_LINE per line
        for (int i = 0; i < count; i++)
        {
            if (i % PER_LINE == 0)
            {
                System.out.println();
            }
            System.out.print("\t" + posInt[i]);
        }
        System.out.print("\n\n");
    }
}
