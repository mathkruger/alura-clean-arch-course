package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.listar.ListarAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosMemoria;

public class MatricularAlunoPorLinhaDeComando {
    private static RepositorioDeAlunosMemoria repositorio = new RepositorioDeAlunosMemoria();

    public static void main(String[] args) {
        String nome = "Matheus Kruger";
        String cpf = "468.284.438-94";
        String email = "ms-kruger@hotmail.com";

        MatricularAluno matriculador = new MatricularAluno(repositorio);
        matriculador.executar(new MatricularAlunoDto(nome, cpf, email));
        matriculador.executar(new MatricularAlunoDto(nome, cpf, email));
        matriculador.executar(new MatricularAlunoDto(nome, cpf, email));
        matriculador.executar(new MatricularAlunoDto(nome, cpf, email));

        ListarAluno listador = new ListarAluno(repositorio);
        for (Aluno aluno : listador.executar()) {
            System.out.println(aluno.getCpf() + " - " + aluno.getNome() + " - " + aluno.getEmail());
        }
    }
}