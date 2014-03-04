/**
 * a program that works with WritePoem.java
 *
 * @author Arsum Iqbal -- A00351433
 * @version 1.0
 */
public class Poem
{
    public static final int MAX_LINES = 20;

    private String title;
    private String[] lines;
    private int numLines;

    public Poem(String t)
    {
        title = t;
        lines = new String[MAX_LINES];
        numLines=0;
    }

    public void addLine(String l)
    {
        if (numLines < lines.length)
        {
            lines[numLines] = l;
            numLines++;
        }
    }

    public void print()
    {
        // print title
        System.out.println();
        printUnderlined(title);
        System.out.println();
        for (int i=0; i < numLines; i++)
        {
            System.out.println(lines[i]);
        }
    }

    private void printUnderlined(String t)
    {
        System.out.println(t);
        for (int i = 0; i < t.length(); i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
}
