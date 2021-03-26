import java.util.UUID;

public class Flat {

    public String id;
    public String name;
    public String description;
    public int price;

    public Flat(String name, String description, int price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
