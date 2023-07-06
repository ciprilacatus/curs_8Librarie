import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.SplittableRandom;
import java.util.stream.BaseStream;


public class Library extends Book {
    private ArrayList<Author> autors;
    private ArrayList<Book> books;


    public Library(String title, int yearPublished, int numberOfPages,
                   ArrayList<String> genre, ArrayList<String> format,
                   String language, int ageRecommandation,
                   ArrayList<String> editorialAgency, double price,
                   boolean isInStock, int quantity, ArrayList<Author> autors, ArrayList<Book> books
    ) {


        super(title, yearPublished, numberOfPages,
                genre, format, language, ageRecommandation,
                editorialAgency, price, isInStock,
                quantity);


        this.autors = autors;
        this.books = books;


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
                "title='" + getTitle() + '\'' +
                ", yearPublished=" + getYearPublished() +
                ", numberOfPages=" + getNumberOfPages() +
                ", genre=" + getGenre() +
                ", format=" + getFormat() +
                ", language='" + getLanguage() + '\'' +
                ", ageRecommandation=" + getAgeRecommandation() +
                ", editorialAgency=" + getEditorialAgency() +
                ", price=" + getPrice() +
                ", isInStock=" + isInStock() +
                ", quantity=" + getQuantity() +
                "autors=" + autors +
                ", books=" + books +
                '}';
    }
}