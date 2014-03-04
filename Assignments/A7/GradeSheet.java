import java.util.Scanner;
import java.io.*;

/**
 * a class to create a grade sheet using an array of Students
 *
 * @author A00000000 YOUNG, Mark
 * @author Arsum B. Iqbal -- A00351433
 * @version 3.0
 */
public class GradeSheet
{
    public static final int MAX_STU = 100;
    
    public static void main(String[] args)
        throws FileNotFoundException 
    {
        Scanner kbd = new Scanner(System.in);

        // Introduce yourself
        System.out.print("\n\n"
           + "Array of Students\n"
           + "-----------------\n"
           + "\n"
           + "Prints the latest grade sheets for this class\n\n");

        // Create the Student array and counter
        Student[] student = new Student[MAX_STU];
        int numStu = 0;
        
        System.out.print("Enter the name of the Student data file: ");
        String fileName = "";
        String name = ""; 
        int grades = 0 ;  
        Scanner reader = null;

        while(reader==null)
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
                System.out.print("\nEnter the name of the Student data file: ");
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
        reader.close();
                 
        // Pause before printing report
        System.out.print("\n\n" + "Press Enter key to see report...");
        kbd.nextLine();
        
        // Print the grade sheet header
        int numAsgn = Student.getLastPassedInAssignment();
        System.out.print("\n\n"
            + "Here are your students:\n\n"
            + "Student ID  Name       ");
        for (int a = 1; a <= numAsgn; a++)
        {
            System.out.print(" A" + a + " ");
        }
        System.out.print(" Average  Letter");
        System.out.print("\n"
            + "----------  ---------- ");
        for (int a = 1; a <= numAsgn; a++)
        {
            System.out.print("----");
        }
        System.out.println(" -------  ------");

        // Print the id, name and grades for each student
        for (int s = 0; s < numStu; s++)
        {
            System.out.printf("%-10s  %-10s", 
                student[s].getANumber(), student[s].getName());
            for (int a = 1; a <= numAsgn; a++)
            {
                System.out.printf("%4d", student[s].getAsgnGrade(a));
            }
            System.out.printf(" %7d     %s\n",
                student[s].getPctGrade(), student[s].getLetterGrade());
        }

        // get and print the class average
        int sum = 0;
        for (int s = 0; s < numStu; s++)
        {
            sum += student[s].getPctGrade();
        }
        double avg = (double)sum / (double)numStu;

        System.out.printf("\n\n"
           + "Class Average: %.1f (%s)\n\n", 
                            avg, 
                            Student.letterFromPercent((int)Math.round(avg)));
    }
}
