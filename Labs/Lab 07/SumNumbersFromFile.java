import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * A program that counts by certain number and prints in a new file
 *
 * @author Mark Young (A00000000)
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */

public class SumNumbersFromFile 
{
    public static void main(String[] args) 
    {
        System.out.print("\n\n"
            + "SumNumbersFromFile\n"
            + "------------------\n"
            + "\n"
            + "This program adds up all the numbers "
            + "in a file chosen by the user.\n\n");

        Scanner kbd = new Scanner(System.in);
        System.out.print("What file shall I sum up? ");
        String fileName = kbd.nextLine();

        File f = new File(fileName);
        try 
        {
            Scanner numbersFile = new Scanner(f);
            int sum = 0;
            while (numbersFile.hasNextDouble()) 
            {
                sum += numbersFile.nextDouble();
            }
            numbersFile.close();

            System.out.println("\n\n"
               + "The sum of the numbers in " + fileName 
               + " is " + sum);
            System.out.println();
        }
        catch(FileNotFoundException e) 
        {
            System.err.println("Could not find file '" + fileName + "'");
        }
    }
}
