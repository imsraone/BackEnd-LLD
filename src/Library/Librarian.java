package Library;

public class Librarian extends User {
    private final String employeeNumber;

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Welcome to Library Dashboard");
        System.out.println("Name : " + getName());
        System.out.println("Contact Info : " + getContactInfo());
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book) {
        System.out.println("New book added");
    }
    public void removeBook(Book book) {
        System.out.println("Book removed");
    }

    @Override
    void returnBook() {
        System.out.println("Book returned");
    }
}
