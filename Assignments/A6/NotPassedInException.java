import java.util.Scanner;
/**
 * exception for assignment not being passed in 
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */

public class NotPassedInException extends Exception
{
    public NotPassedInException()
    {
        this("Assignment has not been passed in! ");
    }
    public NotPassedInException(String message)
    {
        super(message);
    }
}
