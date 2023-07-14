import java.util.*;


public class Library {
    private ArrayList<Author> autors;
    private ArrayList<Book> books;


    public Library(ArrayList<Author> autors, ArrayList<Book> books) {


        this.autors = autors;
        this.books = books;


    }

    public void filterWithGenre(String genre) {


//        Scanner sc = new Scanner(System.in);
//        System.out.print("please input genre");
//        String findGenre = sc.nextLine();
//        if(books.contains(findGenre)) {
//            System.out.println(this.autors);
//        } else {
//            System.out.println("Sory ! no books with "  + " here are our genre "+ genre);
//        }

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