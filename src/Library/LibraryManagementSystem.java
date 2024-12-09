package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryManagementSystem {
    public static List<Book> books;
    public static List<User> registeredUsers;
    public LibraryManagementSystem() {
        books = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public static List<Book> searchBooks(String criteria) {
        return books.stream()
                .filter(item -> (item.getTitle().contains(criteria) || item.getAuthor().contains(criteria)) && item.isAvailable())
                .collect(Collectors.toList());
    }

    public static List<Book> searchBooks(String criteria, String type) {
        return books.stream()
                .filter(item -> (item.getTitle().contains(criteria) || item.getAuthor().contains(criteria))
                        && item.getClass().getName().contains(type) && item.isAvailable())
                .collect(Collectors.toList());
    }

    public void displayAllBooks() {
        for(var book : books){
            System.out.println("Book Title : "+book.getTitle());
        }
    }

    public void displayAllUsers() {
        for(var user : registeredUsers){
            System.out.println("User : "+user.getName());
        }
    }
}
