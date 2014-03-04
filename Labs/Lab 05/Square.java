import java.util.Scanner;

/**
 * A class that implements measurable and works with MeasurableDemo.java
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */
public class Square implements Measurable
{
    private double myHeightAndWidth;

    public Square(double HeightAndWidth)
    {
        myHeightAndWidth = HeightAndWidth;
    }
    /** Returns the greatest height */
    public double getHeight()
    {
        return myHeightAndWidth;
    }
    /** Returns the greatest width */
    public double getWidth()
    {
        return myHeightAndWidth;
    }
    /** Returns the perimeter. */
    public double getPerimeter()
    {
        return 4 * edgeLength();
    }
    /** Returns the area. */
    public double getArea()
    {
        return Math.pow(edgeLength(),2);
    }
    public double edgeLength()
    {
        return myHeightAndWidth;
    }
    public boolean equals(Object obj)
    {
        if(obj instanceof Square)
        {
            Square a = (Square) obj;
            return this.edgeLength() == a.edgeLength();
        }
        return false;
    }

}

