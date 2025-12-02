
public class Book extends LibraryItem {
	String author;
    int numPages;
    public Book(String title, String publisher, int year, String author, int numPages) {
        super(title, publisher, year);
        this.author = author;
        this.numPages = numPages;
    }
    @Override
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages);
        System.out.println(); 
    }
}

