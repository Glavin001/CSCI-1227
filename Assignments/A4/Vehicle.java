/**
 * A class that works with TruckDriver.java
 *
 * @author Arsum Iqbal (A00351433)
 * @version 1.0
 */
public class Vehicle
{
    private Person owner;
    private int numDoors;
    private String make;

    public Vehicle(String initialMake,int initialNumDoors, Person initialOwner)
    {
        make = initialMake;
        owner = initialOwner;
        numDoors = initialNumDoors;
    }

    public Person getOwner()
    {
        return owner;
    }

    public String getMake()
    {
        return make;
    }

    public int getNumDoors()
    {
        return numDoors;
    }
 
    public void setOwner(Person newOwner)
    {
        owner = newOwner;
    }

    public void setMake(String newMake)
    {
        make = newMake;
    }

    public void setNumDoors(int newDoors)
    {
        if (numDoors>0)
        {
            numDoors = newDoors;
        }
    }

    public String toString()
    {
        return owner.getName() + "'s " + numDoors + "-door " + make;
    }
}
