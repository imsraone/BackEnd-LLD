package Library;

public abstract class Book implements Lendable{
    private String isbn;
    private String author;
    private String title;
    private boolean isAvailable;

    public Book(){
        this.isAvailable = true;
    }

    public Book(String isbn, String author, String title) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.isAvailable = true;
    }

    public Book(Book book){
        this.isbn = book.isbn;
        this.author = book.author;
        this.title = book.title;
        this.isAvailable = true;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean lend(User user) {
        if(!isAvailable){
            System.out.println("Book not available");
        }else if(!user.canBorrowBooks()){
            System.out.println("User exceeded books limit");
        }else{
            isAvailable = false;
            user.borrowBook();
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        if(isAvailable){
            System.out.println("Book already returned");
        }else{
            isAvailable = true;
            user.returnBook();
            System.out.println("Book returned successfully");
        }
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    abstract void displayBookDetails();
}
