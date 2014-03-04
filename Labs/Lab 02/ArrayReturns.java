import java.util.Scanner;
/**
 * A program to shows dice rolls
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */
public class ArrayReturns
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = kbd.nextInt();
        kbd.nextLine();
        int[] rolled = dice(num);
        int[] counter = new int[6];
        System.out.println("Here are some dice I rolled:");
        for (int i = 0; i < rolled.length; i++)
        {
            System.out.println(i + ":\t" + rolled[i]);
            if(rolled[i]==1)
            {
                counter[rolled[i]-1]++;
            }
            if(rolled[i]==2)
            {
                counter[rolled[i]-1]++;
            } 
            if(rolled[i]==3)
            {
                counter[rolled[i]-1]++;
            } 
            if(rolled[i]==4)
            {
                counter[rolled[i]-1]++;
            } 
            if(rolled[i]==5)
            {
                counter[rolled[i]-1]++;
            } 
            if(rolled[i]==6)
            {
                counter[rolled[i]-1]++;
            }    
        }
        System.out.println("There were: ");
        System.out.println("\t1\t"+counter[0]+"s");
        System.out.println("\t2\t"+counter[1]+"s");
        System.out.println("\t3\t"+counter[2]+"s");
        System.out.println("\t4\t"+counter[3]+"s");
        System.out.println("\t5\t"+counter[4]+"s");
        System.out.println("\t6\t"+counter[5]+"s");
    }

    public static int[] dice(int howMany)
    {
        int[] results = new int[howMany];
        for (int i = 0; i < howMany; i++)
        {
            results[i] = (int)(1 + 6 * Math.random());
        }
        return results;
    }
}
