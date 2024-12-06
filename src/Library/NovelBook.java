package Library;

public class NovelBook extends Book{
    private final String genre;
    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    void displayBookDetails() {
        System.out.println("Book "+ getTitle() + "Author :" + getAuthor());
        System.out.println("Genre "+ genre);
    }
}
