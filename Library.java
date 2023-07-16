import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    public void addBook (Book book) {
        catalog.add(book);

    }
    public void removeBook (Book book) {
        catalog.remove(book);
    }
    public void displayAvailableBooks() {
        for (Book book: catalog) {
            if (book.getAvailable()) {
                System.out.println("Автор книги " + book.getAuthor() + ", название книги " + book.getTitle());
            }
        }

    }
    public void searchByAuthor(String authorName) {
        for (Book book: catalog) {
            if (authorName.equals(book.getAuthor())) {
                System.out.println(book.getTitle());
            }

        }
    }
}
