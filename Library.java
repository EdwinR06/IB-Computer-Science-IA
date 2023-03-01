import java.lang.reflect.Array;
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

    public void addUser(User user) {
        boolean inUsers = false;
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i) == user) {
                inUsers = true;
                break;
            } 
        }
        if(!inUsers) {
            users.add(user);
        }
    }

    public void createStudent(String username) {
        if(currentUser instanceof Teacher) {
            boolean exists = false;
            for(int i = 0; i < users.size(); i++) {
                if(users.get(i).getUsername() == username) {
                    exists = true;
                }
            }

            if(!exists) {
                addUser(new Student(username));
            }
        }
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void loginTeacher(String username, String password) {
        if(currentUser == null){
            for(int i = 0; i < users.size(); i++) {
                if(users.get(i) instanceof Teacher){
                    if(users.get(i).getUsername() == username &&  ((Teacher) users.get(i)).getPassword() == password) {
                        currentUser = users.get(i);
                    }
                }
            }
        }
    }

    public void loginStudent(String username) {
        if(currentUser == null){
            for(int i = 0; i < users.size(); i++) {
                if(users.get(i).getUsername() == username) {
                    currentUser = users.get(i);
                }
            }
        }
    }
    
    public void logout() {
        if(currentUser != null) {
            currentUser = null;
        }
    }

    public void checkoutBook(Book book) {
        for(int i = 0; i < booksCapacity; i++) {
            if(books[i] == book && books[i].getIsCheckedOut() == false && currentUser instanceof Student) {
                ((Student) currentUser).checkoutBook(book);
                break;
            }
        }
    }

    public Book getBookByTitle(String title) {
        Book bookTitle = null;
        for(int i = 0; i < booksCapacity; i++) {
            if(books[i].getTitle() == title) {
                bookTitle = books[i];
            }
        }
        return bookTitle;
    }

    public ArrayList<Book> getBooksByAuthor(String author) {
        ArrayList<Book> booksAuthor = new ArrayList<>();
        for(int i = 0; i < booksCapacity; i++) {
            if(books[i].getAuthor() == author) {
                booksAuthor.add(books[i]);
            }
        }
        return booksAuthor;
    }

    public ArrayList<Book> getBooksByGenre(String genre) {
        ArrayList<Book> booksGenre = new ArrayList<>();
        for(int i = 0; i < booksCapacity; i++) {
            if(books[i].getAuthor() == genre) {
                booksGenre.add(books[i]);
            }
        }
        return booksGenre;
    }

}
