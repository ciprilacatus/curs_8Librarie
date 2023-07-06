import java.util.ArrayList;

public class Biography {
    private String name;
    private String birthDate;
    private String placeOfBirth;
    private ArrayList<String> education;
    private boolean isALive;


    public Biography(String name, String birthDate, String placeOfBirth, ArrayList<String> education, boolean isALive) {
        this.name = name;
        this.birthDate = birthDate;
        this.placeOfBirth = placeOfBirth;
        this.education = education;
        this.isALive = isALive;
    }

    public Biography(String name, String birthDate, boolean isAlive) {
        this.name = name;
        this.birthDate = birthDate;
        this.isALive = isAlive;
        this.placeOfBirth = "Unknown";
        this.education = null;
    }


    // SET parameters////////////////////////////////////////////
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setEducation(ArrayList<String> education) {
        this.education = education;
    }

    public void setALive(Boolean ALive) {
        isALive = ALive;
    }

    // GET parameters ////////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public Boolean getALive() {
        return isALive;
    }

    public ArrayList<String> getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return "Biography{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", education=" + education +
                ", isALive=" + isALive +
                '}';
    }
}


