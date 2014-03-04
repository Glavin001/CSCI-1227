import java.util.Scanner;
import java.io.*;

/**
 * A program that draws * into a file
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */
public class Grapher
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println("\nGrapher" + "\n-------");
        System.out.print("\nEnter the name of the output file: ");
        String fileName = kbd.nextLine();
        File barFile = new File(fileName);
        PrintWriter fileWriter = new PrintWriter(barFile);
        System.out.print("Enter the title of the graph: ");
        String fileTitle = kbd.nextLine();
        
        //Start of fileTitle writer
        fileWriter.print("\n");
        fileWriter.println(fileTitle);        
        for(int k = 0 ; k < fileTitle.length();k++)
        {
            fileWriter.print("-");
        }
        fileWriter.println("\n");
        //End of fileTitle writer

        System.out.println("\nEnter a negative number to end input.");
        
        ///Start of Bars writer
        System.out.print("\nHow long is the first bar? ");
        int numBars = kbd.nextInt();
        for(int i = 0; i < numBars; i++)
        {
            fileWriter.print("*");
        }
        fileWriter.print("\n");
        
        while(numBars > 0)
        {
            System.out.print("How long is the next bar? ");
            numBars = kbd.nextInt();
            for(int n = 0; n < numBars ; n++)
            {
                fileWriter.print("*");
            }
            if(numBars > 0)
            {
                fileWriter.print("\n");
            }
        }
        ///End of Bars writer
        fileWriter.close();
        System.out.println("\n"+fileName+" has been created.\n");
    }
}
