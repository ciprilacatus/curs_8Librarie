import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

////////////////////////////////books////////////////////////////////////
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Acolo unde canta racii", 2020, 301,
                "triler", "paper", "romanian", 16, "Curtea veche", 61, true, 200);
        Book book2 = new Book("Un colac", 2020, 301,
                "novel", "paper", "spanish", 16, "Rao", 61, true, 200);
        Book book3 = new Book(
                "Caiet de ricosat ganduri", 2019, 345, "horror", "audio", "romana", 21,
                "Paparude", 125, true, 32);

        books.add(book1);
        books.add(book2);
        books.add(book3);



        ////////////////////////////////biography///////////////////////////////////////

        Biography gabrielLiiceanu = new Biography("Gabriel Liiceanu",
                "1945",
                "Bucuresti",
                "unknown",
                true);

        Biography vasilescuIon = new Biography(
                "Vasilescu Ion",
                "1955",
                "iasi",
                "Unknown",
                true);
        Biography dinescuIon = new Biography(
                "Dinescu Ion",
                "1955",
                "Brasov",
                "unknown",
                false);

////////////////////////////////////////////authors///////////////////////////////////////////
        ArrayList<Author> authors = new ArrayList<>();
        Author ionDinescu = new Author(
                dinescuIon,
                "romancier",
                "roman",
                book1);
        Author ionVasilescu = new Author(
                vasilescuIon,
                "novelist",
                "romanian",
                book2);
        Author liiceanuGabriel = new Author(
                gabrielLiiceanu,
                "filozof",
                "roman",
                book3);

///////////////////////////////////////library/////////////////////////////////////////////////


        ArrayList<Library> inLibrary = new ArrayList<>();
        Library instock = new Library(authors,books);





        instock.filterWithGenre("drama");
        System.out.println(instock);
        System.out.println();


        book1.priceCut(20);



        System.out.println();

    }

}