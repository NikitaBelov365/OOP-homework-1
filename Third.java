

public class Third {
    public static void main(String[] args) {
        Library myLib = new Library();
        Book b1 = new Book("Tit", "Igor");
        Book b2 = new Book("Приключения Игоря", "Igor");
        Book b3 = new Book("Квест", "Akunin");
        myLib.addBook(b1);
        myLib.addBook(b2);
        myLib.addBook(b3);
        myLib.removeBook(b1);
        myLib.displayAvailableBooks();
        myLib.searchByAuthor("Igor");



    }
}
