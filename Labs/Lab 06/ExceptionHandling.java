import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;
/**
 * A program that handles exceptions
 *
 * @author Arsum Iqbal - A00351433
 * @version 1.0
 */
public class ExceptionHandling
{
    public static final int NUM_ARRAY_ITEMS = 10;
    public static final int NUM_ITERATIONS = 3;
    
    public static void main (String ar[])
    {
        int index=0;
        String v[] = new String[NUM_ARRAY_ITEMS];
        Scanner kb = new Scanner(System.in);
        for(int i = 0;i<NUM_ITERATIONS;i++)
        {
            System.out.print("Enter the array index and new value:  ");
            try
            {
                index = kb.nextInt();
            }
            catch(InputMismatchException ime)
            {
                System.err.println("Sorry, the first thing you type must be a number.");
                System.exit(1);
            }
            try
            {
                v[index] = kb.nextLine();
                System.out.println("Array location " + index + " set to "
                    + v[index]);
            }
            catch(ArrayIndexOutOfBoundsException aioob)
            {
                System.err.println("Index out of bounds -- there is no array element #" + aioob.getMessage());                
            }            
        }
    }
}
