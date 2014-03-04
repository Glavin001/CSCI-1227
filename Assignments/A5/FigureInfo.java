import java.util.Scanner;
import java.util.Arrays;

/**
 * A program to print information on various Measurable objects
 *
 * @author Mark Young (A00000000)
 * @author Arsum Iqbal (A00351433)
 * @version 1.0
 */
public class FigureInfo
{
    public static final int NUM_SHAPES = 4;
    public static final int FIGS_PER_SHAPE = 3;
    public static final int TOTAL_FIGS = NUM_SHAPES * FIGS_PER_SHAPE;

    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        // introduce yourself
        System.out.print("\n\n"
            + "Sorted Figure Info\n"
            + "------------------\n\n"
            + "This program reads in the sizes of several shapes "
            + "then prints out\ninformation about them "
            + "in order from smallest to largest.\n\n"
            + "by Mark Young (A00000000) and Arsum Iqbal (A00351433)\n\n");

        // declare variables
        double width;   // width of various figures
        double height;  // height of various figures

        Measurable[] holdingArray = new Measurable[TOTAL_FIGS];
        
        for(int i = 0; i < FIGS_PER_SHAPE; i++)
        {
            System.out.print("Enter the width and height of a rectangle: ");
            width = kbd.nextDouble();
            height = kbd.nextDouble();
            kbd.nextLine();
            Rectangle r = new Rectangle(width, height);
            holdingArray[i] = r;
        }
       
        for(int j = 0; j < FIGS_PER_SHAPE; j++)
        {
            System.out.print("Enter the width and height of an oval: ");
            width = kbd.nextDouble();
            height = kbd.nextDouble();
            kbd.nextLine();
            Oval o = new Oval(width, height);
            //start from the 4th index so previous doesnt get overwritten
            holdingArray[j+FIGS_PER_SHAPE] = o;
        }
        
        for(int k = 0; k < FIGS_PER_SHAPE; k++)
        {
            System.out.print("Enter the width and height of a triangle: ");
            width = kbd.nextDouble();
            height = kbd.nextDouble();
            kbd.nextLine();
            Triangle t = new Triangle(width, height);
            //start from the 7th index so previous doesnt get overwritten
            holdingArray[k+2*FIGS_PER_SHAPE] = t;
        }
        
        for(int l = 0; l < FIGS_PER_SHAPE; l++)
        {
            System.out.print("Enter the diameter of a circle: ");
            width = kbd.nextDouble();
            kbd.nextLine();
            Circle c = new Circle(width/2.0);
            //start from the 10th index so previous doesnt get overwritten
            holdingArray[l+3*FIGS_PER_SHAPE] = c;
        }
            
        Arrays.sort(holdingArray);
                
        System.out.println();
        System.out.println(figureInfoHeader());
        for(int m = 0; m < TOTAL_FIGS ; m++)
        { 
            System.out.println(className(holdingArray[m]) 
                             + figureInfo(holdingArray[m]));
        }
        System.out.println();
        
    }

    // Create the header for the shape information table
    public static String figureInfoHeader()
    {
        return String.format("%-10s%10s%10s%20s%20s",
                                "Type", 
                                "Width", "Height", 
                                "Area", "Perimeter")
             + "\n"
             + String.format("%-10s%10s%10s%20s%20s",
                                "----------", 
                                "-----", "------", 
                                "---------", "---------");
    }
    
    // Create the data values for one row of the shape information table
    public static String figureInfo(Measurable m)
    {
        return String.format("%10.1f%10.1f%20.1f%20.1f", 
                                m.getWidth(), m.getHeight(), 
                                m.getArea(), m.getPerimeter());
    }
    
    // get the object's class name as a 10+ character wide String
    // (for the left column of the shape information table)
    public static String className(Object o)
    {
        return String.format("%-10s", o.getClass().getName());
    }
}
