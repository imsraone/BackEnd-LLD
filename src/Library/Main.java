package Library;

public class Main {
    public static void main(String[] args) {
        var b1 = new NovelBook("Book1","Java Basics", "Oracle Inc", "Tech");
        var b2 = new TextBook("Book2", "C# Basics", "Microsoft Inc", "Tech", 3);
        var b3 = new TextBook("Book3", "LLD", "InterviewBit", "Tech", 1);
        var b4 = new TextBook("Book4", "HLD", "InterviewBit", "Tech", 1);
        var b5 = new TextBook("Book5", "DSA", "InterviewBit", "Tech", 1);

        var user1 = new Member("Student 1","Bangalore");
        var user2 = new Member("Student 2","Bangalore");
        var user3 = new Librarian("Library Assistant", "Bengaluru", "12345");

        var lib = new LibraryManagementSystem();
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.addBook(b4);
        lib.addBook(b5);
        lib.registerUser(user1);
        lib.registerUser(user2);
        lib.registerUser(user3);

        // Search Functionality
        var searchData = LibraryManagementSystem.searchBooks("basics");
        var searchData2 = LibraryManagementSystem.searchBooks("mac", BookType.TextBook.toString());

        // Access All Books
        lib.displayAllBooks();

        // Access All Users
        lib.displayAllUsers();

        System.out.println("Available Books Step 1: "+LibraryManagementSystem.books.stream().filter(Book::isAvailable).count());
        b1.lend(user1);
        b2.lend(user1);
        System.out.println("Available Books Step 2: "+LibraryManagementSystem.books.stream().filter(Book::isAvailable).count());
        b3.lend(user1);
        System.out.println("Available Books Step 3: "+LibraryManagementSystem.books.stream().filter(Book::isAvailable).count());
        b1.returnBook(user1);
        System.out.println("Available Books Step 4: "+LibraryManagementSystem.books.stream().filter(Book::isAvailable).count());
        b1.lend(user2);
        System.out.println("Available Books Step 5: "+LibraryManagementSystem.books.stream().filter(Book::isAvailable).count());
    }
}


