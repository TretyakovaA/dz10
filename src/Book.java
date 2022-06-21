import java.util.Objects;

public class Book {
    private int page;
    private static int year;
    private Author author;

    public Book (Author author, int page, int year) {
        this.author = author;
        this.page = page;
        this.year =year;


    }

    public String getAuthor() {
        return author.getFirstName()+ author.getLastName();
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return this.page;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return author.toString()+ year+" "+ page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return page == book.page && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, year, author);
    }
}

