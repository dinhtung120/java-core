import java.util.Arrays;

public class Book {
    private int id;
    private String title;
    private String[] category;
    private String company;

    public Book(int id, String title, String[] category, String company) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;

    }

    @Override
    public String toString() {
        return id + " - " + title + " - "
                + Arrays.toString(category) + " - " + company;
    }
}
