import java.util.Scanner;

/**
 * A program that is used with Rating.java
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */
public class GetRatings
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println("\nThis program creates an array of ratings... ");
        System.out.println("by Arsum Iqbal -- A00351433\n");
        Rating[] ratingsArray = new Rating[10];
        for (int i=0; i< ratingsArray.length; i++)
        {
            ratingsArray[i].readRating();
        }
        System.out.println("");   
    }
}

