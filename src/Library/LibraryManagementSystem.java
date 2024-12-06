package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryManagementSystem {
    static List<Book> books;
    static List<User> registeredUsers;
    public LibraryManagementSystem() {
        books = new ArrayList<Book>();
        registeredUsers = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    static List<Book> searchBooks(String criteria) {
        return books.stream()
                .filter(item -> item.getTitle().contains(criteria) || item.getAuthor().contains(criteria))
                .collect(Collectors.toList());
    }

    static List<Book> searchBooks(String criteria, String type) {
        return books.stream()
                .filter(item -> item.getTitle().contains(criteria) || item.getAuthor().contains(criteria))
                .collect(Collectors.toList());
    }
}
