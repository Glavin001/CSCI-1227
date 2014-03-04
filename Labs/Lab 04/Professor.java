/**
* a program that extends person
*
* @author Arsum Iqbal -- A00351433
* @version 1.0
*/
public class Professor extends Person
{
    // instance variables
    String department;


    // constructors
    public Professor(String initialName, String initialDept)
    {
        super(initialName);
        department=initialDept;
    }
    public Professor(String initialName)
    {
        super(initialName);
        department="Administration";
    }
    // setter
    public void setDepartment(String newDepartment)
    {
        department=newDepartment;
    }

    //getter
    public String getDepartment()
    {
        return department;
    }
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Department: " + department);
    }
    public String toString()
    {
        return getName()+" ("+department+")";
    }
}
