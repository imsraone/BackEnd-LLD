package Library;

public class TextBook extends Book {
    private final String subject;
    private final int edition;
    public TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, author, title);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    void displayBookDetails() {
        System.out.println("Subject "+ subject);
        System.out.println("Edition "+ edition);
    }
}
