package practice.projects.libraryproject;

import java.time.LocalDateTime;

public class Order {
    private Person person;
    private Book book;
    private LocalDateTime dateOrdered;
    private LocalDateTime dateReturned;


    private static int counter;

    public Order(Person person, Book book, LocalDateTime date,boolean isReturn) {
        this.person = person;
        this.book = book;
        if (isReturn) {
            this.dateReturned = date;
            counter--;
        } else {
            this.dateOrdered = date;
            counter++;
        }
    }
    public static int getCounter() {
        return counter;
    }
}
