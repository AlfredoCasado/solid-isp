import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangePriceActionShould {

    @Test
    public void change_the_price_of_a_flat() {
        Flat flat = new Flat("piso bonito", "con tres habitaciones", 100);
        FlatRepository repository = new FlatRepository();
        repository.save(flat);

        ChangePriceAction changePriceAction = new ChangePriceAction(repository);
        changePriceAction.execute(flat.id, 200);

        assertEquals(flat.price, 200);
    }
}