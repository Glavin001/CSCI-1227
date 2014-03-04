/**
 * Some information about a Movie
 *
 * @author Arsum Iqbal - A00351433
 * @version 1.0
 */
public class Movie
{
    // constants
    public static final int MAX_RATINGS = 10;

    // instance variables
    private String title;
    Rating[] ratingsArrays;
    private int ratings;
    
    // constructor
    public Movie(String t)
    {
        title = t;
        ratingsArrays=new Rating[MAX_RATINGS];
        ratings=0;      
    }
    // public methods
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    public String getTitle()
    {
        return title;
    }
    public void setRating(Rating newRating)
    {
    	if(ratings>MAX_RATINGS)
    	{
    		System.err.println("Sorry, Ratings Array is full!");
    		return ;
    	}
    	ratingsArrays[ratings]= newRating;
        ratings++;
    }
    public int getRating()
    {
    	return ratings; 
    }
    public double getAverage()
    {
    	double sum=0, average;
    	if(ratings==0)
    	{
    		return 0.0;
    	}
    	for(int i=0; i < ratings;i++)
    	{
    		sum= sum + ratingsArrays[i].RATING;
    	}
    	average= sum/ratings;
    	return average;
    }
    public void Reviews()
    {
    	for(int i=0;i<ratings;i++)
    	{
    		System.out.println((ratingsArrays[i].RATING) + " -- "+ ratingsArrays[i].REVIEW);
    	}
    }
}
