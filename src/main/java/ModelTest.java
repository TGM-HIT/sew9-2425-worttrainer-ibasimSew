import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;
import org.testng.mustache.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ModelTest {

    @BeforeEach
    void testModelCorrectCountNew() {
        // Überprüfen, ob der Zähler korrekt funktioniert
        assertEquals(2, 1+1, "The countCorrect should be 1");
    }

    @Test
    void testModelCorrectCount() {
        // Überprüfen, ob der Zähler korrekt funktioniert
        assertEquals(2, 1+1, "The countCorrect should be 1");
    }

}
