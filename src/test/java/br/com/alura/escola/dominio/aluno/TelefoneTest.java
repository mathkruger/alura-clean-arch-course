package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TelefoneTest {
    @Test
    void naoDeveCriarTelefoneInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "333"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "86521-2153"));
    }

    @Test
    void deveCriarTelefoneValido() {
        assertDoesNotThrow(() -> new Telefone("11", "96521-2153"));
        assertDoesNotThrow(() -> new Telefone("11", "965212153"));
        assertDoesNotThrow(() -> new Telefone("11", "40132536"));
    }
}