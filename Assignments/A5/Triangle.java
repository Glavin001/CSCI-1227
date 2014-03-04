/**
 * An ideal shape -- the width and height of a right triangle
 *
 * @author Mark Young (A00000000)
 * @author Arsum Iqbal (A00351433)
 * @version 1.0
 */
public class Triangle implements Measurable
{
    private double width;
    private double height;

    public Triangle(double w, double h)
    {
        if (w >= 0) width = w;
        if (h >= 0) height = h;
    }

    public Triangle()
    {
        // make this rectangle with width and height of 0.0
        this(0.0, 0.0);
    }

    public void setWidth(double w)
    {
        if (w >= 0) width = w;
    }

    public void setHeight(double h)
    {
        if (h >= 0) height = h;
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
        return width * height / 2;
    }

    public double getPerimeter()
    {
        return width + height + getHypotenuse();
    }

    public double getHypotenuse()
    {
        return Math.sqrt(height * height + width * width);
    }
    public int compareTo(Object t)
    {
        if(t instanceof Measurable)
        {
            Measurable d = (Measurable) t;
            if(this.getArea() < d.getArea())            
                return -1;            
            else if(d.getArea() < this.getArea())            
                return 1;            
        }
       return 0; 
    }
}

