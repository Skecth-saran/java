import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> bookcollection = new ArrayList<Book>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public static void addBook(Book book) {
        bookcollection.add(book);
    }

    public static void removeBook(Book book) {
        bookcollection.remove(book);
    }

    public static ArrayList<Book> getBookcollection() {
        return bookcollection;
    }
}

public class Book_details {
    public static void main(String[] args) {
        Book book1 = new Book("The C programming", "xyz", "234567899543");
        Book book2 = new Book("The core JAVA", "ygvc", "876486323945676564");
        Book.addBook(book1);
        Book.addBook(book2);
        ArrayList<Book> bookcollection = Book.getBookcollection();
        System.out.println("List of books:");
        for (Book book : bookcollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " ISBN: " + book.getISBN());
        }
        Book.removeBook(book1);
        System.out.println("After removing" + book1.getTitle() + ":");
        for (Book book : bookcollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " ISBN: " + book.getISBN());
        }
    }
}
