public class JustSomeClass
{
    private String name;

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    public void print()
    {
        System.out.println("I'm a class object.");
        System.out.println(" -- My name is " + name + ".");
    }
}
