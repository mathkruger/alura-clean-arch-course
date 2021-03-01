package escola;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CPFTest {
    @Test
    void naoDeveCriarCPFInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("1111"));
    }

    @Test
    void deveCriarCPFValido() {
        assertDoesNotThrow(() -> new CPF("468.284.498-94"));
        assertDoesNotThrow(() -> new CPF("111.111.111-11"));
    }
}