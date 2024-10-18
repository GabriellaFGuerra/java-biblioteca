import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Loan> loans;

    public Library() {
        this.authors = new ArrayList<>();
        this.books = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void removeAuthor(Author author) {
        authors.remove(author);
    }

    public List<Book> getBooksByAuthor(Author author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Book> getBooksByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    public List<Book> getBooksByAvailability(boolean available) {
        return books.stream()
                .filter(book -> book.isAvailable() == available)
                .collect(Collectors.toList());
    }

    public List<Book> getBooksByRegisterDate(LocalDate registerDate) {
        return books.stream()
                .filter(book -> book.getRegisterDate().equals(registerDate))
                .collect(Collectors.toList());
    }

    public List<Book> getBooksByUpdatedAt(LocalDate updatedAt) {
        return books.stream()
                .filter(book -> book.getUpdatedAt().equals(updatedAt))
                .collect(Collectors.toList());
    }

    public List<Author> getAuthorsByBirthDate(LocalDate birthDate) {
        return authors.stream()
                .filter(author -> author.getBirthDate().equals(birthDate))
                .collect(Collectors.toList());
    }

    public List<Author> getAuthorsByName(String name) {
        return authors.stream()
                .filter(author -> author.getName().equals(name))
                .collect(Collectors.toList());
    }
}
