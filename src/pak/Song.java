package pak;

public class Song {
    private String title;
    private String author;
    private StringBuilder text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public StringBuilder getText() {
        return text;
    }

    public void setText(StringBuilder text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
