import java.util.ArrayList;

public class Library {

    private int booksCapacity;
    private ArrayList<User> users;
    private Book[] books;
    private User currentUser;

    public Library() {
        this.booksCapacity = 100;
        this.users = new ArrayList<>();
        this.books = new Book[this.booksCapacity];
        this.currentUser = null;
    }

    public Library(int booksCapacity) {
        this.booksCapacity = booksCapacity;
        this.users = new ArrayList<>();
        this.books = new Book[this.booksCapacity];
        this.currentUser = null;
    }




}
