import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlatRepository {

    Map<String, Flat> flats = new HashMap<>();

    public Flat get(String id) {
        return flats.get(id);
    }

    public void save(Flat flat) {
        flats.put(flat.id, flat);
    }

    public List<Flat> all() {
       return new ArrayList(flats.values());
    }

}
