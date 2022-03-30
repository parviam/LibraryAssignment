/**
 * Class of LibraryAssignment representing a Textbook,
 * Child of Book Class
 */
public class TextBook extends Book
{
   private String subject;  //instance variable representing the textbook's subject
   private int editionYr;        //instance variable representing the year this edition was published

    /**
     * Constructor for objects of class TextBook
     */
    public TextBook(String title, String author, String subject, int editionYr)
    {
        super(title, author);  
        this.subject = subject;
        this.editionYr = editionYr;
    }

    /**
     * validates if a Textbook
     * object has been created on or after the year sent to it (will return true, if it was an edition written prior to the parameter year
     * sent, it will return false).
     */
    public boolean currentText(int year)  {return year >= this.editionYr;}
    
    /**
     * Accessor for subject instance variable
     */
    public String getSubject()  {return subject;}
    /**
     * Accessor for year instance variable
     */
    public int getEditionYr()  {return editionYr;}
    
    /**
     * Mutator for subject instance variable
     */
    public void setSubject(String subject)  {this.subject = subject;}
    /**
     * Mutator for year instance variable
     */
    public void setEditionYear(int editionYr)  {this.editionYr = editionYr;}
    /**
     * toString method for printing
     */
    public String toString()
    {
        return super.getTitle() + " Textbook, " + subject + ", " + editionYr;
    }
}
