import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Book {


    private String title;
    private Author author;
    private int yearPublished;
    private int numberOfPages;
    private String genre;
    private String format;
    private String language;
    private int ageRecommandation;
    private String editorialAgency;
    private double price;
    private boolean isInStock;
    private int quantity;


    public Book(String title, Author author, int yearPublished, int numberOfPages,
                String genre, String format,
                String language, int ageRecommandation, String editorialAgency,
                double price, boolean isInStock, int quantity) {

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.format = format;
        this.language = language;
        this.ageRecommandation = ageRecommandation;
        this.editorialAgency = editorialAgency;
        this.price = price;
        this.isInStock = isInStock;
        this.quantity = quantity;
    }


    public void translation(String language) {
        this.language = language;
    }

    public void changeAgeRecommandation(int changeAge) {
        this.ageRecommandation = changeAge;
    }

    public void checkStock(Boolean stockAvailable) {
        this.isInStock = stockAvailable;
    }

    public int getQuantity(int quantity) {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void priceCut(double percentage) {
        this.price = price - (price * percentage / 100);
    }

    public void priceIncrease(double percentage) {
        this.price = price + (price * percentage / 100);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAgeRecommandation() {
        return ageRecommandation;
    }

    public void setAgeRecommandation(int ageRecommandation) {
        this.ageRecommandation = ageRecommandation;
    }

    public String getEditorialAgency() {
        return editorialAgency;
    }

    public void setEditorialAgency(String editorialAgency) {
        this.editorialAgency = editorialAgency;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +

                ",title='" + title + '\'' +
                ",author=" + author +
                ", yearPublished=" + yearPublished +
                ", numberOfPages=" + numberOfPages +
                ", genre=" + genre +
                ", format=" + format +
                ", language='" + language + '\'' +
                ", ageRecommandation=" + ageRecommandation +
                ", editorialAgency=" + editorialAgency +
                ", price=" + price +
                ", isInStock=" + isInStock +
                ", quantity=" + quantity +
                '}';
    }
}


















