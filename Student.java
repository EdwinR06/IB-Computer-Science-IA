import java.util.ArrayList;

public class Student extends User {
    
    private Book checkedOutBook;
    private ArrayList<Book> pastCheckedOutBooks;

    public Student(String username) {
        super(username);
        this.checkedOutBook = null;
        this.pastCheckedOutBooks = new ArrayList<Book>();
    }

    
}
