import java.util.*;


public class Library {
    private ArrayList<Author> author;
    private ArrayList<Book> books;


    public Library(ArrayList<Author> autors, ArrayList<Book> books) {


        this.author = autors;
        this.books = books;


    }

    public ArrayList<Double> renderBooksPrice() {
        ArrayList<Double> renderPrice = new ArrayList<>();
        for (Book book : books) {
            renderPrice.add(book.getPrice());
        }
        return renderPrice;
    }

    public ArrayList<String> filterWithGenre(String genre) {
        ArrayList<String> bookTitlesWithGenre = new ArrayList<>();
        for (Book book : books) {
            if (Objects.equals(book.getGenre().toLowerCase(), genre.toLowerCase())) {
                bookTitlesWithGenre.add(book.getTitle());
            }
        }
        return bookTitlesWithGenre;
    }

    // TODO: 7/16/2023 all methods similar with filterWithGenre 
    public ArrayList<String> getBooksUnder(double price) {
        ArrayList<String> bookTitlesUnderPrice = new ArrayList<>();
        for (Book book : books) {
            if (book.getPrice() < price) {
                bookTitlesUnderPrice.add(book.getTitle());
            }
        }
        return bookTitlesUnderPrice;

    }

    public ArrayList<String> getBooksByAuthor(String authorName) {
        ArrayList<String> bookAuthorName = new ArrayList<>();
        for (Book book : books) {
            if (Objects.equals(book.getAuthor().getName().toLowerCase(), authorName.toLowerCase())) {
                bookAuthorName.add(book.getTitle());
            }
        }
        return bookAuthorName;
    }

    public ArrayList<String> getBooksByName() {
        ArrayList<String> bookByTitle = new ArrayList<>();
        for (Book book : books) {
            bookByTitle.add(book.getTitle());
        }
        return bookByTitle;

    }

    public ArrayList<String> getBooksByLanguage(String language) {
        ArrayList<String> languageOfBook = new ArrayList<>();
        for(Book book : books) {
            if (Objects.equals(book.getLanguage().toLowerCase(),language.toLowerCase())) {
                languageOfBook.add(book.getTitle());
            }
        }return languageOfBook;
    }

    public ArrayList<String> getAuthorsByLiteraryCurrent(String current) {
        ArrayList<String> authorLiteraryCurrent = new ArrayList<>();
        for(Author authors : author) {
            if (Objects.equals(authors.getLiteraryCurrent().toLowerCase(),current.toLowerCase())) {
                authorLiteraryCurrent.add(authors.getName());
            }
        }return authorLiteraryCurrent;
    }


    public ArrayList<Author> getAutors() {
        return author;
    }

    public void setAutors(ArrayList<Author> autors) {
        this.author = autors;
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
                "autors=" + author +
                ", books=" + books +
                '}';
    }
}