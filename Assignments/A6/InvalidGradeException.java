import java.util.Scanner;
/**
 * exception for invalid grade
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */

public class InvalidGradeException extends Exception
{
    public InvalidGradeException()
    {
        this("Invalid Grade! ");
    }
    public InvalidGradeException(String message)
    {
        super(message);
    }
}
