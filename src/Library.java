import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.BaseStream;


public class Library{
    private ArrayList<Author> autors;
    private ArrayList<Book> books;


    public Library(ArrayList<Author> autors, ArrayList<Book> books) {


        this.autors = autors;
        this.books = books;


    }

    public void filterWithGenre(String genre) {

    }

    public void getBooksUnder(double price) {

    }

    public void getBooksByAuthor(String authorName) {


    }

    public void getBooksByName(String bookName) {

    }

    public void getBooksByLanguage(String language) {

    }

    public void getAuthorsByLiteraryCurrent(String current) {

    }


    public ArrayList<Author> getAutors() {
        return autors;
    }

    public void setAutors(ArrayList<Author> autors) {
        this.autors = autors;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "autors=" + autors +
                ", books=" + books +
                '}';
    }
}