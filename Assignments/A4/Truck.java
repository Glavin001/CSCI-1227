/**
 * A class that extends vehicle
 *
 * @author Arsum Iqbal (A00351433)
 * @version 1.0
 */
public class Truck extends Vehicle
{
    private double loadLimit;
    private double towLimit;

    public Truck(String initialMake, int initialNumDoors, Person initialOwner,
                 double newLoadLimit, double newTowLimit)
    {
        super(initialMake, initialNumDoors, initialOwner);
        loadLimit = newLoadLimit;
        towLimit = newTowLimit;
    }
    public double getLoadLimit()
    {
        return loadLimit;
    }

    public double getTowLimit()
    {
        return towLimit;
    }

    public void setLoadLimit(double newLoadLimit)
    {
        loadLimit = newLoadLimit;
    }
    
    public void setTowLimit(double newTowLimit)
    {
        towLimit = newTowLimit;
    }

    public boolean equals(Object a)
    {
        if(a instanceof Truck)
        {
            Truck t = (Truck)a;
            if (getMake().equals(t.getMake()) && getOwner().equals(t.getOwner())
            && getNumDoors() == t.getNumDoors() && loadLimit == t.loadLimit 
            && towLimit == t.towLimit)
            {
                return true;
            }
        }
        return false;
    }
}
