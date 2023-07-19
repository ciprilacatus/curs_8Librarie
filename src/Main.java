import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


////////////////////////////////biography///////////////////////////////////////

        Biography owensDelia = new Biography("Delia Owens",
                "1945",
                "Bucuresti",
                "unknown",
                true);

        Biography vossCriss = new Biography(
                "Cris Voss",
                "1955",
                "iasi",
                "Unknown",
                true);
        Biography liiceanuGabriel = new Biography(
                "Gabriel Liiceanu",
                "1955",
                "Brasov",
                "unknown",
                false);
        Biography andreaLages = new Biography(
                "Andrea Lages",
                "1974",
                "Canada",
                "unknown",
                true);
        Biography marcLevi = new Biography(
                "Marc Levi",
                "1972",
                "UK",
                "unknown",
                true);
        Biography dinahJefferies = new Biography(
                "Dinah Jefferies",
                "1968",
                "USA",
                "unknown",
                true);


        ////////////////////////////////////////////authors///////////////////////////////////////////

        ArrayList<Author> author = new ArrayList<>();
        Author lagesAndrea = new Author(
                "Andrea Lages",
                andreaLages,
                "novelist",
                "english");
        Author levyMarc = new Author(
                "Marc Levy",
                marcLevi,
                "novelist",
                "english");
        Author jefferiesDinah = new Author(
                "Dinah Jefferies",
                dinahJefferies,
                "novelist",
                "english");
        Author deliaOwens = new Author(
                owensDelia.getName(), owensDelia,
                "romancier",
                "romanian");
        Author crisVoss = new Author(vossCriss.getName(), vossCriss,
                "novelist",
                "spanish");
        Author gabrielLiiceanu = new Author(liiceanuGabriel.getName(), liiceanuGabriel,
                "filozof",
                "roman");

        author.add(deliaOwens);
        author.add(crisVoss);
        author.add(gabrielLiiceanu);
        author.add(lagesAndrea);
        author.add(jefferiesDinah);
        author.add(levyMarc);


////////////////////////////////books////////////////////////////////////
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Acolo unde canta racii",
                deliaOwens,
                2020,
                301,
                "novel",
                "paper",
                "romanian",
                16,
                "Curtea veche",
                105,
                true,
                200);
        Book book2 = new Book("Arta Negocierii",
                crisVoss,
                2020,
                301,
                "drama",
                "paper",
                "spanish",
                16,
                "Rao",
                63,
                true,
                200);
        Book book3 = new Book("Caiet de ricosat ganduri",
                gabrielLiiceanu,
                2019,
                345,
                "horror",
                "audio",
                "romanian",
                21,
                "Humanitas",
                125,
                true,
                32);
        Book book4 = new Book("Coaching cu NLP",
                lagesAndrea, 2006,
                306,
                "psihological",
                "paper",
                "english",
                16,
                "Biblioterapia",
                32.58,
                true,
                12);
        Book book5 = new Book("Te voi revedea",
                levyMarc,
                2005,
                296,
                "novel",
                "paper",
                "romanian",
                16,
                "Trei",
                47.5,
                false,
                0);
        Book book6 = new Book("Fiica negustorului de matase",
                jefferiesDinah,
                2018,
                392,
                "drama",
                "audio",
                "romanian",
                12,
                "Nemira",
                87.3,
                true,
                4);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);



///////////////////////////////////////library/////////////////////////////////////////////////

        Library availableBooks = new Library(author, books);


//////////////////////////////////////sout//////////////////////////////////////////////////////
        System.out.println(book4.getQuantity());
        System.out.println(availableBooks.renderBooksPrice());
        book4.priceCut(50);
        System.out.println(book4.getPrice());
        System.out.println(availableBooks.getBooksUnder(20));
//      System.out.println(availableBooks);
//      book1.priceCut(20);
//      System.out.println(availableBooks.filterWithGenre("Horror"));
//      System.out.println("These are the books available under your price selection :" + availableBooks.getBooksUnder(100));
//
//      System.out.println(availableBooks.getBooksByAuthor("Gabriel Liiceanu"));
//      System.out.println(availableBooks.getBooksByName());
//      System.out.println(availableBooks.getBooksByLanguage("romanian"));
//      System.out.println(availableBooks.getAuthorsByLiteraryCurrent("filozof"));





    }
}