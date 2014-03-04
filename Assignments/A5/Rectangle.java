/**
 * An ideal shape -- the width and height of a rectangle
 *
 * @author Mark Young (A00000000)
 * @author Arsum Iqbal (A00351433)
 * @version 1.0
 */
public class Rectangle implements Measurable
{
    private double width;
    private double height;

    public Rectangle(double w, double h)
    {
        if (w >= 0.0)
            width = w;
        if (h >= 0.0)
            height = h;
    }

    public Rectangle()
    {
        // make this rectangle with width and height of 0.0
        this(0.0, 0.0);
    }

    public void setWidth(double w)
    {
        if (w >= 0.0)
            width = w;
    }

    public void setHeight(double h)
    {
        if (h >= 0.0)
            height = h;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return 2 * (width + height);
    }

    public double getDiagonal()
    {
        return Math.sqrt(width * width + height * height);
    }
    public int compareTo(Object r)
    {
        if(r instanceof Measurable)
        {
            Measurable c = (Measurable) r;
            if(this.getArea() < c.getArea())            
                return -1;            
            else if(c.getArea() < this.getArea())            
                return 1;            
        }
       return 0; 
    }
}

