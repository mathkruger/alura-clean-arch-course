package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosMemoria;

public class MatricularAlunoTest {
    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosMemoria repositorio = new RepositorioDeAlunosMemoria();
        MatricularAluno matriculador = new MatricularAluno(repositorio);
        MatricularAlunoDto dados = new MatricularAlunoDto("Matheus", "111.111.111-11", "ms-kruger@hotmail.com");
        matriculador.executar(dados);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF("111.111.111-11"));

        assertNotNull(encontrado);
        assertEquals("111.111.111-11", encontrado.getCpf());
        assertEquals("Matheus", encontrado.getNome());
        assertEquals("ms-kruger@hotmail.com", encontrado.getEmail());
    }
}