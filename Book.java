public class Book {
    private String title;
    private String author;
    private Boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
    public void displayInfo() {
        String formattedString = String.format("Title = %s, author = %s, available = %b", getTitle(), getAuthor(), getAvailable());
        System.out.println(formattedString);
    }
}
