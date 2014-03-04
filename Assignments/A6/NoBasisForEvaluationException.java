import java.util.Scanner;
/**
 * exception for no assignment passed in 
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */

public class NoBasisForEvaluationException extends Exception
{
    public NoBasisForEvaluationException()
    {
        this("Cannot evaluate Student because no assignments "
            +"have been passed in! ");
    }
    public NoBasisForEvaluationException(String message)
    {
        super(message);
    }
}
