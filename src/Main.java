import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> genre = new ArrayList<>();
        genre.add("triller");
        genre.add("drama");
        genre.add("adventure");
        genre.add("documentar");
        genre.add("crime");

        ArrayList<String> format = new ArrayList<>();
        format.add("audio");
        format.add("paper");

        ArrayList<String> editorialAgency = new ArrayList<>();
        editorialAgency.add("SteleVerzi");
        editorialAgency.add("Curtea Veche");
        editorialAgency.add("Rao");

        ArrayList<String> language = new ArrayList<>();
        language.add("romanian");
        language.add("english");

        ArrayList<String> education = new ArrayList<>();
        education.add("High school");


        Book book1 = new Book("America de peste pogrom", 2020, 301, genre, format, language.get(0), 26,
                editorialAgency, 21, true, 300);
        Book book2 = new Book("Acolo unde canta racii", 2020, 301,
                genre, format, language.get(1), 16, editorialAgency, 61, true, 200);
        Book book3 = new Book("Un colac", 2020, 301,
                genre, format, language.get(1), 16, editorialAgency, 61, true, 200);
        System.out.println(genre.get(0));


    }

}