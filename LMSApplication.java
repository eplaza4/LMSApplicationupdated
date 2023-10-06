import java.util.Scanner;

public class LMSApplication {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        Library library=new Library();
        //TODO: Read from the file and add books to the library
        // Print the initial database
        library.printDatabase();
        // Ask the user for a barcode to remove
        System.out.print("Enter a barcode to remove:");
        String barcodeToRemove=scanner.nextLine();
        library.removeBookByBarcode(barcodeToRemove);
        library.printDatabase();
        //Ask the user for a title to remove
        System.out.print("Enter a title to remove:");
        String titleToRemove = scanner.nextLine();
        library.removeBookByTitle(titleToRemove);
        library.printDatabase();
        //Ask the user for a title to check out
        System.out.print("Enter a title to check out:");
        String titleToCheckout=scanner.nextLine();
        library.checkoutBook(titleToCheckout);
        library.printDatabase();
        //Ask the user for a title to check in
        System.out.print("Enter a title to check in:");
        String titleToCheckin=scanner.nextLine();
        library.checkinBook(titleToCheckin);
        library.printDatabase();
    }
}