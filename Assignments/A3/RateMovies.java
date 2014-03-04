import java.util.Scanner;
import java.util.Arrays;

/**
 * let users rate various movies
 *
 * @author Arsum Iqbal - A00351433
 * @version 1.0
 */
public class RateMovies
{
    public static final int NUM_MOVIES = 5;
    
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);

        System.out.print("\n\n"
            + "Movie Ratings Program\n"
            + "---------------------\n\n"
            + "by Arsum Iqbal (A00351433)\n"
            + "and Mark Young (A00000000)\n\n"
            + "Find out which movies you and your friends like most.\n\n");

        
        Movie[] movieList=new Movie[NUM_MOVIES];
        
        for(int i=0; i < movieList.length; i++)
        {
        	System.out.print("Enter the title of a movie: ");
        	String movieTitle=kbd.nextLine();
        	movieList[i]= new Movie(movieTitle);
            
        }
        // get the number of raters
        System.out.print("\n\n"
            + "How many people will be rating the movies today? ");
        int numRaters = kbd.nextInt();  kbd.nextLine();

        // for each rater
        for (int r = 1; r <= numRaters; r++)
        {
            // ask and wait for rater to get to the computer
            System.out.print("\n\n"
                + "Have rater #" + r + " come to the computer "
                + "and press the Enter key...");
            kbd.nextLine();
            System.out.println();
            
            for(int i=0; i < movieList.length;i++)
            {
                if (raterSaysYes("Have you seen " + movieList[i].getTitle()+" ? "))
                {
                    // read a rating
                    Rating rate = Rating.readRating(movieList[i].getTitle()); 
                    movieList[i].setRating(rate);     
                }
            } // end "for each movie"
        } // end "for each rater"

        // pause before showing average rankings
        System.out.print("\n\n"
            + "OK, that's all the raters done!\n\n"
            + "Press Enter to see the movies' ratings...");
        kbd.nextLine();
        System.out.println();

        // show average ratings, recording which one is highest rated
        double highestAverageRating = 0.0;
        int highestMovieRating = 0;
        for(int i=0; i < movieList.length;i++)
        {
            System.out.println(movieList[i].getTitle()+" got an average rating of "+movieList[i].getAverage());
            if(movieList[i].getAverage() > highestAverageRating)
            {
                highestMovieRating=i;
            }
        }

        // pause before big reveal
        System.out.print("\n\n"
            + "Press Enter to see the best movie's ratings...");
        kbd.nextLine();
        // show the best movie and its reviews
        System.out.print("\n\n"
            + "The highest rated movie is "
            + movieList[highestMovieRating].getTitle()+ "!\n\n"
            + "Here's what the raters had to say about it:\n");
        movieList[highestMovieRating].Reviews();
        // Say farewell
        System.out.print("\n\n"
            + "Thank-you for using our program!\n"
            + "Enjoy your nite at the movies!\n\n");
    }
    /**
     * ask the user a question; get a YES/NO answer; 
     *
     * @param question the question to ask the user
     * @return whether the answer was YES
     */
    public static boolean raterSaysYes(String question)
    {
        // we'll need our own Scanner
        Scanner kbd = new Scanner(System.in);

        // ask question and get initial response
        System.out.print(question);
        char response = kbd.next().toUpperCase().charAt(0);
        kbd.nextLine();
  
       //System.out.print(response);

        // repeat until get a valid response
        while (response != 'Y' && response != 'N')
        {
            System.out.println("Please answer with a YES or a NO.");
            System.out.print(question);
            response = kbd.next().toUpperCase().charAt(0);
            kbd.nextLine();
        }
        
        // anything that starts with Y considered a YES
        return response == 'Y';
    }
}
