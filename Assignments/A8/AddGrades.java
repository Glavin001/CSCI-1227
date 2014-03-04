import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

/**
 * A program that updates gradesheet
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 *
 */
public class AddGrades  
{
    public static final int MAX_STU = 100;

    public static void main(String[] args)
        throws FileNotFoundException
    {

        Scanner kbd = new Scanner(System.in);
        System.out.println("\nAdd Grades to Students"
                         + "\n----------------------\n");
        System.out.println("Updates the grade sheet for this class."
                         + "\nby Arsum Iqbal -- A00351433");
        System.out.print("\nEnter the name of the Student data file: ");
        Student[] student = new Student[MAX_STU];
        int numStu = 0;
        String fileName = "";
        String name = ""; 
        int grades = 0 ; 
        Scanner reader = null;
        PrintWriter p = null;
        while(reader == null)
        {
            try
            {
                fileName = kbd.nextLine();
                reader = new Scanner(new File(fileName));
            }
            catch(FileNotFoundException fnfe)
            {
                System.err.println("Sorry, I can't open ../" + fileName
                                  +"\nPlease try again. ");
                System.out.print("Enter the name of the Student data file: ");
            }
        }
        for (int i = 0; i < student.length; i++)
        {
            if (!reader.hasNext())
            {
                break;
            }
  
            if (reader.hasNextLine())
            {
                student[numStu] = new Student(reader.nextLine());
            }
   
            for (int n = 1; n < student.length && reader.hasNextInt(); n++)
            {
                student[numStu].setAsgnGrade(n,reader.nextInt());
            }
        numStu++;
        reader.nextLine();
        }
        
        System.out.println("\nThe grades have been read in.");
        System.out.print("\nPress Enter key to continue...\n");
        kbd.nextLine();
        int assignment = Student.getLastPassedInAssignment();
        
        if (assignment >= Student.NUM_ASGN)
        {
            System.out.print("All grades have been submitted for this class."
                            +"\nPlease check your records and try again.");
            System.out.println("\n");           
            System.exit(0);
        }
       
        for(int i = 0; i < numStu; i++)
        {
            System.out.print("Enter the A"+ (assignment+1) +" grade for "
                            + student[i].getANumber() +" "+student[i].getName()
                            +": ");
            int newGrade = kbd.nextInt();
            if (!student[i].inGradeRange(newGrade))
            {
                System.out.print("That's not a valid grade.\nPlease try again: ");
                newGrade = kbd.nextInt();
            }
            student[i].setAsgnGrade(assignment+1,newGrade);
        }

        assignment++;
        p = new PrintWriter(fileName);

        for (int i = 0; i < numStu; i++)
        {
            p.print(student[i].getName()+"\n");
            for (int n = 1; n <= assignment; n++)
            {
                p.print(student[i].getAsgnGrade(n)+" ");
            }
        p.println();
        }
        System.out.println("\nA"+ assignment + " scores added."
                          +"\nScores stored in file "+fileName+"\n");
        p.close();
    }
}
