
package practice.projects.libraryproject;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
//Array List
//default capacity is 10, you can write the number desired between prenthesis after the constructor (100)
//.add("") adds the value given to the end of the arraylist
//.add(1,"") adds the value given in the index given (overloaded method)
//.set(1,"") sets the value given at the index given
//overloaded add inserts the value at the given index and pushes the rest of the data,
//but .set replaces the value at index with the new value
//.get(1) returns the value of the slot number 1
//.size() returns the size of the arraylist
//System.out.println(ArrayListName); prints all values


public class Library {
//sds
    static ArrayList<Book> booksList = new ArrayList();
    static ArrayList<Person> membersList = new ArrayList();
    static ArrayList<Order> bookOrderList = new ArrayList();


    public Library(ArrayList<Book> booksList, ArrayList<Person> membersList, ArrayList<Order> bookOrderList) {
        this.booksList = booksList;
        this.membersList = membersList;
        this.bookOrderList = bookOrderList; //admin view of all orders

    }

    public Library(ArrayList<Book> booksList) {
        this.booksList = booksList;
    }

    void addBook(Book book){
        booksList.add(book);
    }

    void removeBook(Book book){
        booksList.remove(book);
    }

    void addMember(Person person){
        membersList.add(person);
    }

    void removeMember(Person person){
        membersList.remove(person);
    }

    static public Book searchBooks(String name)
    {

        for(int i=0;i<booksList.size();i++)
        {
            if(booksList.get(i).getTitle().equals(name))
            {
                System.out.println("The book "+ booksList.get(i).getTitle()+"is found");
                return booksList.get(i);

            }
        }
        System.out.println("the book you are searching for is not found");
        return null;
    }
    static public int searchMember(String name )
    {

        for(int i=0;i<membersList.size();i++)
        {
            if(membersList.get(i).getFirstName().equals(name))
            {
                System.out.println(membersList.get(i).getFirstName() +" is found");
                return i;
            }
        }
        System.out.println("the person you are searching for is not found");
        return -1;
    }
   static public void addUserToBookOrderList(Person user,String title )
   {
       Book b1 = searchBooks(title);
       LocalDateTime now = LocalDateTime.now();
       if (b1 != null) {
           user.mybookOrderList.add(b1);
           Order o1 = new Order(user,b1,now);
           bookOrderList.add(o1);
           System.out.println("Order made Successfully Order no."+Order.getCounter());
        }
   }
}



