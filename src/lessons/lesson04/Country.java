package lessons.lesson04;

public class Country {
    String title;

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    int zipCode;
    public static String capitalise(String string){
        return string.toUpperCase();

    }

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
