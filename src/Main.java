import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        Author author = new Author(1, "Edgar Allan Poe", LocalDate.of(1809, 1, 19));
        Author author2 = new Author(2, "H. P. Lovecraft", LocalDate.of(1890, 8, 20));

        library.addAuthor(author);
        library.addAuthor(author2);

        Book book1 = new Book(1, "The Tell-Tale Heart", author, true, LocalDate.of(1843, 1, 29), LocalDate.of(2021, 9, 1));
        Book book2 = new Book(2, "The Call of Cthulhu", author2, true, LocalDate.of(1928, 2, 1), LocalDate.of(2021, 9, 1));

        library.addBook(book1);
        library.addBook(book2);

        while (true) {
            System.out.println("1. List books");
            System.out.println("2. List authors");
            System.out.println("3. Loan a book");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    library.getBooks().forEach(System.out::println);
                    break;
                case 2:
                    library.getAuthors().forEach(System.out::println);
                    break;
                case 3:
                    if (library.getBooks().isEmpty()) {
                        System.out.println("There are no books to loan");
                        break;
                    } else {
                        System.out.println("Select a book to loan:");
                        library.getBooks().forEach(System.out::println);
                        int bookId = scanner.nextInt();
                        Book book = library.getBooks().stream().filter(b -> b.getId() == bookId).findFirst().orElse(null);

                        assert book != null;
                        if (!book.isAvailable()) {
                            System.out.println("Book is not available");
                            break;
                        }

                        Client client = new Client();
                        System.out.println("Enter client name:");
                        client.setName(scanner.next());

                        int id = library.getLoans().size() + 1;

                        Loan loan = new Loan(id, book, client, LocalDate.now(), LocalDate.now().plusDays(7));
                        library.addLoan(loan);
                        book.setAvailable(false);
                        System.out.println("Book loaned successfully");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}