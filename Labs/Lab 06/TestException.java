import java.util.Scanner;
import java.util.*;

/**
 * A test class for Exception class 
 *
 * @author Arsum Iqbal -- A00351433
 * @version 2.0
 */

public class TestException 
{
    public static void main(String[] args) 
    {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int numCookies = kbd.nextInt(); kbd.nextLine();

        try
        {
            if(numCookies<1)
            {
                throw new Exception();
            }
        }
        catch(Exception e)
        {
            System.err.println("Oh no! No cookies!");
            System.err.println("Go buy some cookies.");
        }

        System.out.println("End of Activity 2.");
        System.out.println();

        System.out.print("Enter number of apples: ");
        int numApples = kbd.nextInt();   kbd.nextLine();
        System.out.print("Enter number of children: ");
        int numChildren = kbd.nextInt(); kbd.nextLine();
        
        try
        {           
            checkEnufApples(numApples,numChildren);
        }
        
        catch(NotEnufApplesException neae)
        {            
            System.out.println(neae.getMessage());
            System.out.println("Go buy some apples.");
        }
        System.out.println("End of Activity 3.");
    }

    public static void checkEnufApples(int numApples, int numChildren)
        throws NotEnufApplesException
    {
        System.out.println("From checkEnufApples()");
        if(numApples < numChildren)
        {
            throw new NotEnufApplesException("Not enuf Apples!");
        }
        
    }
}
