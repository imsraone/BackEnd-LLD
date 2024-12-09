package Library;

public class Member extends User {
    private int borrowedBooksCount;
    private final static int MAX_BORROW_LIMIT = 2;
    public Member(){
        super();
        borrowedBooksCount = 0;
    }
    public Member(String name, String contactInfo){
        super(name, contactInfo);
        borrowedBooksCount = 0;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Welcome to Library Member Dashboard");
        System.out.println("Name : " + getName());
        System.out.println("Contact Info : " + getContactInfo());
        System.out.println("Books Borrowed " + borrowedBooksCount + " books");
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    void returnBook() {
        borrowedBooksCount--;
    }

    @Override
    public void borrowBook() {
        borrowedBooksCount++;
    }
}
