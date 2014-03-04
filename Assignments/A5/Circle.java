/**
 * An ideal circle -- just a radius
 *
 * @author Mark Young (A00000000)
 * @author Arsum Iqbal (A00351433)
 * @version 1.0
 */

public class Circle implements Measurable
{
    private double radius;

    public Circle(double r)
    {
        if (r >= 0)
            radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getDiameter()
    {
        return 2.0 * radius;
    }

    public double getCircumference()
    {
        return 2.0 * Math.PI * radius;
    }

    public double getWidth()
    {
        return getDiameter();
    }
    public double getHeight()
    {
        return getDiameter();
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double getPerimeter()
    {
        return getCircumference();
    }
    public int compareTo(Object c)
    {
        if(c instanceof Measurable)
        {
            Measurable a = (Measurable) c;
            if(this.getArea()< a.getArea())
                return -1;
            else if(a.getArea() < this.getArea())
                return 1;
        }
       return 0; 
    }
}

