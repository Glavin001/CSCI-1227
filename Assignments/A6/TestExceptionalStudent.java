import java.util.Scanner;

/**
Add four exception classes
    NoSuchAssignmentException
        -- client asks for an assignment that simply does not exist
    NotPassedInException
        -- client asks for a grade on an assignment that's not passed in yet
    InvalidGradeException
        -- client tries to assign an invalid grade to an assignment
    NoBasisForEvaluationException
        -- client tries to calculate grade of Student before ANY assignments have been passed in
Revise Student.java to throw them when they should
Revise a sample driver program to accept them???
*/
public class TestExceptionalStudent
{
    public static void main(String[] args)
        
    {
        Scanner kbd = new Scanner(System.in);
        Student s = new Student("Xavier Luis Ng");
        
        System.out.println("\n\n"
            + "A Program to Test Exceptional Students\n"
            + "--------------------------------------\n\n"
            + "by Mark Young (A00000000)\n\n"
            + "If you modified Student.java properly, "
            + "then this program will compile "
            + "and\nyou'll get output similar to the sample output.\n\n");
        
        try
        {
            System.out.println("How are they doing so far?");
            System.out.println("So far, " + s + " has a " + s.getPctGrade());
            System.out.println("So that's how they're doing so far.");
        }
        catch (NoBasisForEvaluationException nbfe)
        {
            System.out.println(nbfe.getMessage());
        }
        System.out.println();
        
        try
        {
            System.out.println("How'd they do on A3?");
            System.out.println("Their grade on A3 is " 
                + s.getAsgnGrade(3));
        }
        catch (NoSuchAssignmentException nsa)
        {
            System.out.println(nsa.getMessage());
        }
        catch (NotPassedInException npi)
        {
            System.out.println(npi.getMessage());
        }
        System.out.println();
            
        for (int i = 0; i <= Student.NUM_ASGN; i++)
        {
            try
            {
                System.out.print("Enter their A" + i + " grade: ");
                int g = kbd.nextInt();  kbd.nextLine();
                s.setAsgnGrade(i, g);
                System.out.println("So far, " + s 
                    + " has a " + s.getLetterGrade());
            }
            catch (NoSuchAssignmentException nsa)
            {
                System.out.println(nsa.getMessage());
            }
            catch (InvalidGradeException ig)
            {
                System.out.println(ig.getMessage());
            }
            catch (NoBasisForEvaluationException nbfe)
            {
                System.out.println(nbfe.getMessage());
            }
            System.out.println();
        }
    }
}
