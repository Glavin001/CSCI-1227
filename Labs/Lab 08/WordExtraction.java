import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

/**
 * A program that prints out the hidden message
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */
public class WordExtraction
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
  
        Scanner kbd = new Scanner(System.in);
        System.out.print("\nEnter a name of a File: ");
        String fileName = "";
        Scanner s = null;
        try
        {
            fileName= kbd.nextLine();
            File f = new File (fileName);
            s = new Scanner(f);
        }
        catch(FileNotFoundException fnfe)
        {
            System.err.println("\nFile Not Found!...\n");
            System.exit(0);
        }
        System.out.println("");
        while(s.hasNext())
        {
            String line= s.nextLine();
            String[] a = line.split("\\s+");
            int temp;
            temp = Integer.parseInt(a[0]);
            System.out.print(a[temp] + " ");
            
        }   
        System.out.println("\n");    
       
    }
}
