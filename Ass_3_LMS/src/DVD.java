
public class DVD extends LibraryItem {
	int duration;  
    String director;
	public DVD(String title, String publisher, int year, int duration, String director) {
		super(title, publisher, year);
		this.duration = duration;
        this.director = director;
	}
	
   
    @Override
    public void displayDetails() {
        System.out.println("DVD's Title: " + title);
        System.out.println("DVD's Publisher: " + publisher);
        System.out.println("Publish Year: " + year);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("This DVD's Director: " + director);
        System.out.println("---------------------------"); 
    }
}
