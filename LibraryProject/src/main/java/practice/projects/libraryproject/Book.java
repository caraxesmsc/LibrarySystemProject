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
