import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public void save(Book book) {
        books.add(book);
    }

    public void print() {
        for (book : books) {
            System.out.println(books);
        }
    }
}
