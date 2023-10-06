import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    /**
     *
     */
    private final List<Book> books;
    public Library() {
        this.books = new ArrayList<>();
    }

    public void removeBookByBarcode( String barcode ) {
        boolean finished = false;
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBarcode().equals(barcode)) {
                iterator.remove();
                System.out.println("Book with barcode" + barcode + "removed");
                finished = true;
                break;
            }
        }
        if (!finished) {
            System.out.println("No book found within the given barcode.");
        }
    }

    public void removeBookByTitle( String title ) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                System.out.println("Book with title" + title + "removed.");
                return;
            }
        }
        System.out.println("No book found with the given title.");
    }

    public void checkoutBook( String title ) {
        boolean finished = false;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (!book.isCheckedOut()) {
                    book.setCheckedOut(true);
                    System.out.println("Book checked out:" + book);
                } else {
                    System.out.println("Book is already checked out.");
                }
                finished = true;
                break;
            }
        }
        if (!finished) {
            System.out.println("No book found with the given title.");
        }
    }

    public void checkinBook( String title ) {
        boolean finished = false;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (book.isCheckedOut()) {
                    book.setCheckedOut(false);
                    System.out.println("Book checked in:" + book);
                } else {
                    System.out.println("Book is not checked out.");
                }
                finished = true;
                break;
            }
        }
        if (!finished) {
            System.out.println("No book found with the given title.");
        }
    }

    /**
     *
     */
    public void printDatabase() {
        System.out.println("Printing database...");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}