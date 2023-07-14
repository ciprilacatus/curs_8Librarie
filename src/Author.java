import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Author  {
    private Biography biography;
    // modificator de acces +
    private String literaryCurrent;

    //   TODO Arraylist<Book> writtenBooks;
    private Book writtenBooks;
    private String language;


    //TODO Add parameter for biography and written books.
    public Author(Biography biography, String literaryCurrent, String language,Book writtenBooks) {
        this.biography = biography;
        this.literaryCurrent = literaryCurrent;
        this.language = language;
        this.writtenBooks = writtenBooks;

    }

    public String getLiteraryCurrent() {
        return this.literaryCurrent;
    }

    public void setLanguage(String language) {
        this.language = language;
        biography.getName();
    }
    public void writtenBooksByAuthor(Book writtenBooks) {

    }

    public Biography getBiography() {
        return biography;
    }

    public void setBiography(Biography biography) {
        this.biography = biography;
    }

    public void setLiteraryCurrent(String literaryCurrent) {
        this.literaryCurrent = literaryCurrent;
    }

    public Book getWrittenBooks() {
        return writtenBooks;
    }

    public void setWrittenBooks(Book writtenBooks) {
        this.writtenBooks = writtenBooks;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Author{" +
                "literaryCurrent='" + literaryCurrent + '\'' +
                ", language='" + language + '\'' +
                '}';
    }


}
