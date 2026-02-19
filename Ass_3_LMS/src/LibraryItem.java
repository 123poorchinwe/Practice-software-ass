//abstract class a general library item
public abstract class LibraryItem {
	String title;
    String publisher;
    int year;
    public LibraryItem(String title,String publisher,int year) {
        this.title=title;
        this.publisher=publisher;
        this.year=year;
    }

    public abstract void displayDetails();
    public boolean isPublishedBefore(int year) {
        return this.year<year;
    }
}
