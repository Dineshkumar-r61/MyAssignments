package week1.homeassignments;

public class Library {
     String addBook(String bookTitle) {
	 System.out.println("Book added successfull");
	 return bookTitle;
	}
     void issueBook() {
     System.out.println("Book issued succesfully");
    
     }
    public static void main(String[] args) {
	 Library LibraryManagement = new Library();
	 String lm = LibraryManagement.addBook("The Love Hypothesis");
	 System.out.println("Book name -"+ " "+lm);
	 LibraryManagement.issueBook();
	 } 
    
}
