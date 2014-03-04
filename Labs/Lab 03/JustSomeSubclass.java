/**
 * a program that extends JustSomeClass
 *
 * @author Arsum Iqbal -- A00351433
 * @version 1.0
 */
public class JustSomeSubclass extends JustSomeClass
{
    private String name;
    private int number;

    public void print()
    {
        System.out.println("I'm a subclass object.");
        System.out.println(" -- My name is " + getName() + ".");
        System.out.println(" -- My number is " + number + ".");
    }

    public void setNumber(int newNumber)
    {
        number = newNumber;
    }

    public int getNumber()
    {
        return number;
    }
}
