/**
 * Class of LibraryAssignment representing a Novel,
 * Child of Book Class
 */
public class Novel extends Book
{
    private String genre;       //instance variable representing the genre of the novel
    private int pages;      //instance variable representing number of pages in the novel
    /**
     * Constructor for objects of class Novel
     */
    public Novel(String title, String author, String genre, int pages)
    {
        super(title, author);
        this.genre = genre;
        this.pages = pages;
    }

    /**
     * Accessor for genre instance variable
     */
    public String getGenre()  {return genre;}
    /**
     * Accessor for pages instance variable
     */
    public int getPages()  {return pages;}
    
    /**
     * Mutator for genre instance variable
     */
    public void setGenre(String genre)  {this.genre = genre;}
    /**
     * Mutator for pages instance variable
     */
    public void setPages(int pages)  {this.pages = pages;}
    
    /**
     * toString method for printing
     */
    public String toString()
    {
        return super.getTitle() + " by " + super.getAuthor() + ", " + genre + " Novel, " + pages + " pages";
    }
}
