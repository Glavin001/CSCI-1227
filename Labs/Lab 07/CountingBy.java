import java.util.Scanner;
import java.io.*;

/**
 * A program that counts by certain number and prints in a new file
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */

public class CountingBy
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        Scanner kbd = new Scanner(System.in);
        String fileName="";
        System.out.print("\nWhat shall I count by? ");
        int countBy = kbd.nextInt();
        kbd.nextLine();
        System.out.print("What shall I count to? ");
        int maxNumber = kbd.nextInt();
        kbd.nextLine();
        System.out.print("What file shall I save the numbers in? ");       
        fileName = kbd.nextLine();
        File f = new File(fileName);        
        PrintWriter printer = new PrintWriter(f);
  
        for(int i=countBy; i<= maxNumber;i+=countBy)
        {
            printer.print(i+ " ");
        }  
        printer.close();
        System.out.println("\nThe file "+fileName+" has been created.");
        kbd.nextLine(); 
    }
}

