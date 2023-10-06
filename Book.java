public class Book {
    private final String title;
    private final String author;
    private final String barcode;
    private boolean isCheckedOut;

    /**
     */
    public Book( String title, String author, String barcode ) {
        this.title = title;
        this.author = author;
        this.barcode = barcode;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getBarcode() {
        return barcode;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut( boolean checkedOut ) {
        isCheckedOut = checkedOut;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ",author='" + author + '\'' + ",barcode='" + barcode + '\'' + ",isCheckedOut=" + isCheckedOut + '}';
    }
}