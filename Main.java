import java.util.*; //import for arrayList
/**
 * Driver class for LibraryAssignment
 */
public class Main
{
    /**
     * Driver method following directions for LibraryAssignment
     */
    public static void main()
    {
        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new Novel("To Kill A Mockingbird", "Harper Lee", "Fiction", 281));
        library.add(new TextBook("Calculus", "James Stewart", "Mathematics", 2015));
        library.add(new Novel("Of Mice and Men", "John Steinbeck", "Fiction", 107));
        library.add(new TextBook("America: A Narrative History", "David Emory Shi", "History", 2018));
        library.add(new TextBook("Java: A Beginner's Guide", "Herbert Schidt", "Computer Science", 2020));
        library.add(new Novel("Maus", "Art Spiegelman", "Graphic", 296));
        
        for(Book book: library)
            System.out.println(book);
            
        System.out.println(bookCount(library, 2018, 150)); //4
        System.out.println(averagePage(library)); //228.0
        
    }
    /**
     * Returns the average amount of pages of novels in the library
     */
    public static double averagePage(ArrayList<Book> library)
    {
        int totalPages = 0;
        int novels = 0;
        for(Book book: library){
            if(book instanceof Novel)
            {
                novels++; 
                Novel n = (Novel)book;
                totalPages += (n.getPages());
            }
        }
        return (double)totalPages/novels;
    }
    /**
     * Returns the total count of books where Textbooks were editions at or after year 
     * or the Novel page count was greater than or equal to pages.
     */
    public static int bookCount(ArrayList<Book> library, int year, int pages)
    {
        int count = 0;
        for(Book book : library){
            if(book instanceof Novel){
                Novel n = (Novel) book;
                if(n.getPages() > pages)
                    count++;
            }
            else if(book instanceof TextBook){
                TextBook t = (TextBook) book;
                if(t.getEditionYr() >= year)
                    count++;
            }
        }
        return count;
    }
}
