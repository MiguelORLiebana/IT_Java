package n1exercici3;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest extends TestCase {
    @Test
    void exceptionTest() {
        Cotxe aux = new Cotxe();
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> aux.llançarException());

        String expectedMessage = "Exepció: ArrayIndexOutOfBoundsException";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}