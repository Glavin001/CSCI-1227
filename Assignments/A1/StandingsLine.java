import java.util.Scanner;
import java.util.Arrays;

/**
 * A program that shows football statistics
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */
public class StandingsLine
{
    private static int wins;
    private static int losses;
    private static int ties;
    private static int occurence;
    private static int streakCounter;

    public static void main(String[] args)
    {
        printIdentification();
        System.out.println("As a check, here is the data you entered:");
        printArray(args);
        System.out.println("...and here it is changed to upper case:");
        makeUpper(args);
        System.out.println("\nYour won-lost(-tied) record is "+ getRecord(args));
        System.out.println("\nThe number of points for that record is "+ getPoints(args));
        System.out.println("\nThe last ten of those elements: "+ (Arrays.toString(getLast(10,args))).toUpperCase());
        String[] lastTen= new String[9];
        lastTen = getLast(10,args);
        System.out.println("\nYour won-lost(-tied) record for the last 10 games is " + getRecord(lastTen));
        System.out.println("\nYour streak is "+ getStreak(args));

    }
    public static void printIdentification()
    {
        System.out.println("\nStandings Line Generator\n" +
                           "------------------------\n" +
                           "By: Arsum Iqbal -- A00351433\n" +
                           "\nThis program prints out some stuff that " +
                           "might be useful if you're printing out\n" +
                           "standings charts for some sports league.\n");
    }
    public static void printArray(String[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();

    }
    public static void makeUpper(String[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i].toUpperCase());
        }
        System.out.println();
    }
    public static String getRecord(String[] a)
    {
        wins = 0;
        losses=0;
        ties = 0;

        for (int i=0; i< a.length; i++)
        {
            if (a[i].equalsIgnoreCase("w"))
            {
                wins= wins + 1;
            }
        }

        for (int i=0; i< a.length; i++)
        {
            if (a[i].equalsIgnoreCase("l"))
            {
                losses= losses + 1;
            }
        }

        for (int i=0; i <a.length; i++)
        {
            if (a[i].equalsIgnoreCase("t"))
            {
                ties= ties + 1;
            }
        }
        if (ties==0)
        {
            return wins + "-" + losses;
        }
        else
        {
            return wins + "-" + losses + "-" + ties + ".";
        }
    }
    public static int count(String item, String[] a)
    {
        occurence=0;
        for (int i=0; i< a.length; i++)
        {
            if (a[i].equalsIgnoreCase(item))
            {
                occurence= occurence + 1;
            }
        }
        return occurence;
    }
    public static int getPoints(String[] a)
    {

        return (count("w",a)*2 )+ count("t",a);
    }
    public static String[] getLast(int num, String[] a)
    {
        String[] result= new String[num];
        if (a.length < num)
        {
            return a;
        }
        int counter = 0;
        for (int i=a.length-num; i<a.length; i++)
        {
            result[counter] = a[i];
            counter++;
        }
        return result;
    }
    public static String getStreak(String[] a)
    {
        wins = 0;
        losses=0;
        ties = 0;
        for (int i =a.length; i>0; i--)
        {         
            if(a[i-1].equalsIgnoreCase("w"))
            {
                 wins=wins+1;
            }
            else
            {
                return "W-"+wins;
            }                     
        }
        return "n/a";
    }
}
