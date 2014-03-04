import java.util.Scanner;

/**
 * Exception class that goes with TestException.java
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */
public class NotEnufApplesException extends Exception
{
    public NotEnufApplesException()
    {
        this("Not enuf Apples!");
    }

    public NotEnufApplesException(String message)
    {
        super(message);
    }
}

