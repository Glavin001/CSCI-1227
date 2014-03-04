import java.util.Scanner;
import java.util.Arrays;

/**
 * A program to use with rectangle.java
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */
public class RectangleSorter
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        Rectangle[] rs = new Rectangle[5];
        int width,height;
        System.out.println("Enter the width and height for 5 rectangles. \n");
        for(int i= 0; i < rs.length; i++)
        {            
            System.out.print("Enter width and height:");
            width=kbd.nextInt(); height=kbd.nextInt();
            rs[i]=new Rectangle(width,height);
        }
        System.out.println("Here are your rectangles, sorted by size: ");
        Arrays.sort(rs);
        for(int i =0;i<rs.length;i++)
        {
            rs[i].draw();
        }
    }
}

