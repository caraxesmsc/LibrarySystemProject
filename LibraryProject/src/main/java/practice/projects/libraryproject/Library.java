
package practice.projects.libraryproject;
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
    ArrayList<Book> booksList = new ArrayList();
    ArrayList<Person> membersList = new ArrayList();
    ArrayList<Person> bookOrderList = new ArrayList();
    ArrayList<Person> mybookOrderList = new ArrayList();

    public Library(ArrayList<Book> booksList, ArrayList<Person> membersList, ArrayList<Person> bookOrderList, ArrayList<Person> mybookOrderList) {
        this.booksList = booksList;
        this.membersList = membersList;
        this.bookOrderList = bookOrderList;
        this.mybookOrderList = mybookOrderList;
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

    public ArrayList<Book> searchBooks(Object searchItem)
    {
        ArrayList<Book> resultList = new ArrayList();
        for(Book searchVector:booksList) {

            if (searchVector.getTitle().contains((String)searchItem) ||
                    Integer.valueOf(searchVector.getId()).equals((Integer)searchItem) ||
                    searchVector.getAuthor().contains((String)searchItem)
            ) {
                    resultList.add(searchVector);
            }

        }
        if(resultList.size()==0)
        {
            System.out.println(searchItem+" Not found");
        }
        else{
            System.out.println(resultList);
        }
        return resultList;
    }



}
