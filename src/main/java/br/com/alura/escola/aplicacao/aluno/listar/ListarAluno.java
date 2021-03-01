package br.com.alura.escola.aplicacao.aluno.listar;

import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class ListarAluno {
    private final RepositorioDeAlunos repositorio;

    public ListarAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public List<Aluno> executar() {
        return repositorio.listarTodosAlunosMatriculados();
    }
}