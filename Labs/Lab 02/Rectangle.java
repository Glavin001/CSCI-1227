public class Rectangle 
    // you can ignore the following line for now -- but don't delete it!
    implements Comparable<Rectangle>
{
    // instance variables
    private int width;
    private int height;

    // constructor
    public Rectangle(int w, int h)
    {
        if (w < 1) w = 1;
        if (h < 1) h = 1;
        width = w;
        height = h;
    }

    // drawing methods
    public void draw(char ch)
    {
        System.out.println();
        for (int h = 0; h < height; h++)
        {
            for (int w = 0; w < width; w++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void draw()
    {
        draw('*');
    }

    // You can ignore this method for now -- but don't delete it!
    public int compareTo(Rectangle other)
    {
        if (this.width == other.width)
            return this.height - other.height;
        else
            return this.width - other.width;
    }
}
