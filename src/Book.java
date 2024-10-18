import java.time.LocalDate;

public class Book {
    private int id;
    private String title;
    private Author author;
    private boolean available;
    private LocalDate registerDate;
    private LocalDate updatedAt;

    public Book(int id, String title, Author author, boolean available, LocalDate registerDate, LocalDate updatedAt) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
        this.registerDate = registerDate;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", available=" + available +
                ", registerDate=" + registerDate +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
