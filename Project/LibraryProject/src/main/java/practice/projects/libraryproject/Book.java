package practice.projects.libraryproject;

import java.util.Date;

public class Book {
    private int id;
    private String Title;
    private String Author;
    private boolean isReturned;
    private Person rentedBy;
    private Date returnDate;

    public void setRentedBy(Person rentedBy) {
        this.rentedBy = rentedBy;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public Person getRentedBy() {
        return rentedBy;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public boolean getIsReturned() {
        return isReturned;
    }

    public Book(int id, String title, String author) {
        this.id = id;
        Title = title;
        Author = author;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + Title + '\'' +
                ", author='" + Author + '\'' +
                '}';
    }
}
