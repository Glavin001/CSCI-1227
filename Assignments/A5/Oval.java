/**
 * An ideal shape -- the width and height of an oval
 *
 * @author Mark Young (A00000000)
 * @author Arsum Iqbal (A00351433)
 * @version 1.0
 */
public class Oval implements Measurable
{
    private double width;
    private double height;

    public Oval(double w, double h)
    {
        if (w >= 0.0)
            width = w;
        if (h >= 0.0)
            height = h;
    }

    public Oval()
    {
        // make this oval with width and height of 0.0
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
        return Math.PI * width * height / 4;
    }

    public double getPerimeter()
    {
        return Math.PI * (width + height) / 2;
    }

    public double getCircumference()
    {
        return getPerimeter();
    }
    public int compareTo(Object o)
    {
        if(o instanceof Measurable)
        {
            Measurable b = (Measurable) o;
            if(this.getArea() < b.getArea())            
                return -1;            
            else if(b.getArea()< this.getArea())           
                return 1;            
        }
       return 0; 
    }
}

