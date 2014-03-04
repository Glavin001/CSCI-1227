/**
 * Able to be measured -- in particular, having a width, height, area and
 * perimeter.
 *
 * @author Mark Young (A00000000)
 * @author Arsum Iqbal (A00351433)
 * @version 1.0
 */
public interface Measurable extends Comparable
{
    public double getWidth();
    public double getHeight();
    public double getArea();
    public double getPerimeter();
}

