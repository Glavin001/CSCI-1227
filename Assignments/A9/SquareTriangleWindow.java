/**
 * A program to generate a window with a square triangle in it.
 *
 * @author Mark Young
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */

import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class SquareTriangleWindow extends JFrame
{
    public static final int TITLE_BAR_HEIGHT = 20;

    // here is the program
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        // identify self
        System.out.println("\n\n"
                + "Square-Triangle Drawing Program\n"
                + "-------------------------------\n\n");

        // get window information
        System.out.print("How big should the window be? ");
        int width = kbd.nextInt(); kbd.nextLine();
        // reasonable defaults for unreasonable users!
        if (width <= 0) width = 800;

        // make and show the window
        SquareTriangleWindow win = new SquareTriangleWindow(width);
        win.setVisible(true);
        
        // NOTE: program will end when the window closes
    }

    // ***** and here is the class ***** //

    // instance variables
    private Graphics canvas;
    private int fullSize;

    // constructor
    public SquareTriangleWindow(int w)
    {
        // set window title, size and background colour
        super("A Square Triangle by Arsum B. Iqbal");
        setSize(w, w + TITLE_BAR_HEIGHT);
        setBackground(Color.WHITE);
        
        // make the program end when the window's closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // save size information -- so we can re-draw as required
        fullSize = w;
    }

    /** method to draw in the window */
    public void paint(Graphics g) 
    {
        canvas = g;
        drawSquareTriangle(0, TITLE_BAR_HEIGHT, fullSize/2, Color.RED);
    }

    // method for drawing the image

    public void drawSquareTriangle(int l, int t, int s, Color c) 
    {   
        fillRect(l, t, s, s, c);

        if(s>1)
        {   
            //squares on the right
            drawSquareTriangle(l+s,t,s/2,bluer(c));   
            //squares below
            drawSquareTriangle(l,t+s,s/2,greener(c));           
        }
        
    }

    // draw a filled rectangle at x,y with size w,h and colour c
    public void fillRect(int x, int y, int w, int h, Color c) 
    {
        canvas.setColor(c);
        canvas.fillRect(x, y, w, h);
    }

    // make a greener colour
    public Color greener(Color c) 
    {
        return new Color(less(c.getRed()), more(c.getGreen()), c.getBlue());
    }

    // make a bluer colour
    public Color bluer(Color c) 
    {
        return new Color(less(c.getRed()), c.getGreen(), more(c.getBlue()));
    }

    // make a smaller number (0..255)
    public int less(int n) 
    {
        // about 28% closer to 0
        return 5 * n / 7;
    }

    // make a larger number (0..255)
    public int more(int n) 
    {
        // about 28% closer to 255
        return 255 - less(255-n);
    }
}
