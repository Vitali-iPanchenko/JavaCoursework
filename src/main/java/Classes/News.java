package Classes;
import Interfaces.NewsInterface;
import java.util.UUID;

public class News {
    public String name;
    public String content;
    public String date;
    public String category;
    public UUID id;

    public News(String name, String content, String category, String date) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.content = content;
        this.category = category;
        this.date = date;
    }
}
