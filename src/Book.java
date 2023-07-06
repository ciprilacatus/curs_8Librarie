import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Book {

    private String title;
    private int yearPublished;
    private int numberOfPages;
    private ArrayList<String> genre;
    private ArrayList<String> format;
    private String language;
    private int ageRecommandation;
    private ArrayList<String> editorialAgency;
    private double price;
    private boolean isInStock;
    private int quantity;


    public Book(String title, int yearPublished, int numberOfPages,
                ArrayList<String> genre, ArrayList<String> format,
                String language, int ageRecommandation, ArrayList<String> editorialAgency,
                double price, boolean isInStock, int quantity) {
        this.title = title;
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

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    public ArrayList<String> getFormat() {
        return format;
    }

    public void setFormat(ArrayList<String> format) {
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

    public ArrayList<String> getEditorialAgency() {
        return editorialAgency;
    }

    public void setEditorialAgency(ArrayList<String> editorialAgency) {
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


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
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


















