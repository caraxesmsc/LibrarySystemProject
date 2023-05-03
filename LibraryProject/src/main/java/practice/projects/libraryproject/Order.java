package practice.projects.libraryproject;

import java.time.LocalDateTime;

public class Order {
    private Person person;
    private Book book;
    private LocalDateTime date;
    private static int counter;

    public Order(Person person, Book book, LocalDateTime date) {
        this.person = person;
        this.book = book;
        this.date = date;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
