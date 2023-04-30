
package practice.projects.libraryproject;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryProject {

    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        Book b1 = new Book(212,"Java for begginers","Mahmoud Khalil");
        Book b2 = new Book(111,"C++ for begginers","Mahmoud Khalil");

        ArrayList<Book> list1 = new ArrayList();

        Library lib1 = new Library(list1);

        lib1.addBook(b1);
        lib1.addBook(b2);

        ArrayList<Book> searchResults = Library.searchBooks();

    }
    
    
}
