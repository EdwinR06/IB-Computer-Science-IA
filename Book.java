public class Book {

    private String title;
    private String author;
    private String genre;
    private int pages;
    private boolean isCheckedOut;

    public Book(String title, String author, String genre, int pages) {
        this.title = title;
        this.genre = genre; 
        this.author = author;
        this.pages = pages;
        this.isCheckedOut = false;
    }
    
}
