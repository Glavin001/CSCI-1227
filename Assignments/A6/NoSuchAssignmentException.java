import java.util.Scanner;
/**
 * exception for no assignment
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */

public class NoSuchAssignmentException extends Exception
{
    public NoSuchAssignmentException()
    {
        this("There is no such assignment! ");
    }
    public NoSuchAssignmentException(String message)
    {
        super(message);
    }
}
