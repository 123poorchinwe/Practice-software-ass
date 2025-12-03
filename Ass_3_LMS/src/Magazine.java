
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
        System.out.println("Magazine's Title: " + title);
        System.out.println("Magazine's Publisher: " + publisher);
        System.out.println("Publish Year: " + year);
        System.out.println("IssueNumber: " + issueNumber);
        System.out.println("Month: " + month);
        System.out.println("---------------------------");  
    }
}
