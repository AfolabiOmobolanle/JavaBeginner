import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookManager {

    // Book class definition
    static class Book {
        private String title;
        private String author;
        private String isbn;

        // Constructor
        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        // Getters
        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getIsbn() { return isbn; }

        // To string method for printing
        @Override
        public String toString() {
            return "\"" + title + "\" by " + author + " (ISBN: " + isbn + ")";
        }
    }

    // Collection to store books
    private static List<Book> bookCollection = new ArrayList<>();

    // Method to add a book
    public static void addBook(Book book) {
        bookCollection.add(book);
        System.out.println("Book added: " + book);
    }

    // Method to remove a book by ISBN
    public static void removeBookByIsbn(String isbn) {
        Iterator<Book> iterator = bookCollection.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Book b = iterator.next();
            if (b.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("Book removed: " + b);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("No book found with ISBN: " + isbn);
        }
    }

    // Display all books
    public static void displayBooks() {
        System.out.println("\nCurrent Book Collection:");
        if (bookCollection.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            for (Book b : bookCollection) {
                System.out.println(b);
            }
        }
    }

    // Main method to test functionality
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", "James Clear", "1234567890");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "0987654321");

        addBook(book1);
        addBook(book2);

        displayBooks();

        removeBookByIsbn("1234567890");

        displayBooks();
    }
}
