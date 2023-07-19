import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Author  {
    private String name;
    private Biography biography;
    // modificator de acces +
    private String literaryCurrent;

    //   TODO Arraylist<Book> writtenBooks;
    private String language;


    public Author(String name,Biography biography, String literaryCurrent, String language) {
        this.name = name;
        this.biography = biography;
        this.literaryCurrent = literaryCurrent;
        this.language = language;
    }

    public String getLiteraryCurrent() {
        return this.literaryCurrent;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Biography getBiography() {
        return biography;
    }

    public void setBiography(Biography biography) {
        this.biography = biography;
    }

    public void setLiteraryCurrent(String literaryCurrent) {
        this.literaryCurrent = literaryCurrent;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", biography=" + biography +
                ", literaryCurrent='" + literaryCurrent + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
