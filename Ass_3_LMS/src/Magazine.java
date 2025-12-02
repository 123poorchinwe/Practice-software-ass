
public class Magazine extends LibraryItem{
	int issueNumber;
    String month;
    public Magazine(String title, String publisher, int year, int issueNumber, String month) {
        super(title, publisher, year);
        this.issueNumber = issueNumber;
        this.month = month;
    }
    @Override
    public void displayDetails() {
        System.out.println("Magazine Details:");
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Month: " + month);
        System.out.println();  
    }
}
