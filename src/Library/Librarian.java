package Library;

public class Librarian extends User {
    private String employeeNumber;

    public Librarian(String name, String contactInfo) {
        super(name, contactInfo);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Welcome to Library Manager");
        System.out.println("Name : " + getName());
        System.out.println("Contact Info : " + getContactInfo());
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return false;
    }

    void addNewBook(Book book) {

    }
    void removeBook(Book book) {

    }
}
