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

    public Book[] getBooks() {
        return books;
    }

    public void addBook(Book book) {
        for(int i = 0; i < booksCapacity; i++) {
            if(books[i] == book) {
                break;
            } else if(books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public int getBooksCapacity() {
        return booksCapacity;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User getCurrentUser() {
        return currentUser;
    }






}
