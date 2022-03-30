/**
 * Superclass of LibraryAssignment representing a Book,
 * Parent of Textbook, Novel Classes
 */
public class Book
{
    private String title;       //instance variable representing title of book
    private String author;      //instance variable representing author of book

    /**
     * Constructor for objects of class Book
     */
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    
    /**
     * Accessor for title instance variable
     */
    public String getTitle() {return title;}
    /**
     * Accessor for author instance variable
     */
    public String getAuthor()  {return author;}
    
    /**
     * Mutator for title instance variable
     */
    public void setTitle(String title)  {this.title = title;}
    /**
     * Mutator for author instance variable
     */
    public void setAuthor(String author)  {this.author = author;}

}
