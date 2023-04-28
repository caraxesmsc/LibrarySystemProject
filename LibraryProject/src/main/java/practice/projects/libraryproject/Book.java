package practice.projects.libraryproject;

public class Book {
    private int id;
    private String Title;
    private String Author;

    public Book(int id, String title, String author) {
        this.id = id;
        Title = title;
        Author = author;
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
}
