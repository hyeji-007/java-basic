package practice.extends1.ex;

public class Book {
    private String author;
    private String isbn;

    public Book (String author, String isbn) {
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
