package MyBook;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private List<String> paragraphs;
    private String image;
    private String table;

    /**
     *
     */
    public Book(String title) {
        // TODO Auto-generated constructor stub
        this.title = title;
        this.paragraphs = new ArrayList<>();
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the paragraphs
     */
    public List<String> getParagraphs() {
        return paragraphs;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @return the table
     */
    public String getTable() {
        return table;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param paragraphs the paragraphs to set
     */
    public void setParagraphs(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @param table the table to set
     */
    public void setTable(String table) {
        this.table = table;
    }

    public void createNewParagraph(String paragraph) {
        getParagraphs().add(paragraph);
    }

    public void createNewImage(String image) {
        setImage(image);
    }

    public void createNewTable(String table) {
        setTable(table);
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", paragraphs=" + paragraphs + ", image=" + image + ", table=" + table + "]";
    }

    public String print() {
        return toString();
    }
}
