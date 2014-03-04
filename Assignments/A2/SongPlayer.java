import java.util.Scanner;
import java.util.Arrays;

/**
 * A program to be used with song.java
 *
 * @author Arsum B. Iqbal -- A00351433
 * @version 1.0
 */
public class SongPlayer
{
    public static final int MAX_SONGS=20;
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println("\nSong Player");
        System.out.println("-----------");
        System.out.println("\nby Arsum Iqbal - A00351433");
        System.out.println("\nThis Player can hold up to 20 songs, and plays "
                           +"them in a random order. \n\nEnter the song titles " 
                           +"and lengths below. Leave the title blank to "
                           +"end early.\n");  
        Song[] songArray=new Song[MAX_SONGS];
        int counter=0;
        for(int i=0;i < songArray.length;i++)
        {
            System.out.print("Enter song title: "); 
            String songTitle=kbd.nextLine();
            if(songTitle.equals(""))
            {
                break;
            }  
            System.out.print("Enter song length (e.g. 3:07): ");
            String length=kbd.nextLine();           
            songArray[i]=new Song(songTitle,length);
            System.out.println("The song "+songTitle+" ("+length+") has been added."); 
            System.out.println("");
            counter++;    
        }     
        int[] songOrder = new int[counter] ;
        Song[] newSongArray = new Song[counter];
        songOrder= makeShuffleOrder(counter);
        for(int i=0;i<songOrder.length;i++)
        {
            int p = songOrder[i];
            newSongArray[i] = songArray[p];
            newSongArray[i].play();
        }
        System.out.println("\n\nDone.\n\n");
    }
    public static int[] makeShuffleOrder(int howMany)
    {
        int[] ShuffledArray=new int[howMany];

        for(int i=0; i < howMany; i++)
        {
            ShuffledArray[i]=i;
        }       
        for(int i=0;i<howMany;i++)
        {         
            int swapLoc = (int)(howMany * Math.random());
            int remember=ShuffledArray[swapLoc];        
            ShuffledArray[swapLoc]=ShuffledArray[i];
            ShuffledArray[i]=remember;    
        }
        return ShuffledArray;
    }
}
