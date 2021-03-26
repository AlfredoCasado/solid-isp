import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExportsFlatsActionShould {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void export_all_flats() {
        FlatRepository repository = new FlatRepository();
        repository.save(new Flat("piso bonito", "con tres habitaciones", 100));
        repository.save(new Flat("piso feo", "un trastero", 1000));

        ExportFlatsAction exportFlatsAction = new ExportFlatsAction(repository);
        exportFlatsAction.execute();

        assertTrue(outputStreamCaptor.toString().contains("piso bonito"));
        assertTrue(outputStreamCaptor.toString().contains("piso feo"));
    }
}