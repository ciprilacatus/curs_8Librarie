import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Author{
    private Biography biography;
    // modificator de acces +
    private String literaryCurrent;

    //   TODO Arraylist<Book> writtenBooks;
    private ArrayList<Book> writtenBooks;
    private String language;


    //TODO Add parameter for biography and written books.
    public Author(Biography biography, String literaryCurrent, String language) {
//        super(biography.getName(), biography.getBirthDate(),
//                biography.getPlaceOfBirth(),,true)));
        this.biography = biography;
        this.literaryCurrent = literaryCurrent;
        this.language = language;

    }

    public String getLiteraryCurrent() {
        return this.literaryCurrent;
    }

    public void setLanguage(String language) {
        this.language = language;
        biography.getName();
    }


    @Override
    public String toString() {
        return "Author{" +
                "literaryCurrent='" + literaryCurrent + '\'' +
                ", language='" + language + '\'' +
                '}';
    }


}
